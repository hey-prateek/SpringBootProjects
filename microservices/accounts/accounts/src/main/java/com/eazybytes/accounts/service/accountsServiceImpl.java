package com.eazybytes.accounts.service;

import com.eazybytes.accounts.constants.accountsConstants;
import com.eazybytes.accounts.dto.accountsDTO;
import com.eazybytes.accounts.dto.customerDTO;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.entity.accounts;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazybytes.accounts.exception.ResourceNotFoundException;
import com.eazybytes.accounts.mapper.accountsMapper;
import com.eazybytes.accounts.mapper.customerMapper;
import com.eazybytes.accounts.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.autoconfigure.web.server.AccessLogCustomizer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class accountsServiceImpl implements IAccountsService{

    private accountRepository accountrepository;
    private CustomerRepository  customerrepository;

    @Override
    public void createAccount(customerDTO customerdto)
    {
        Customer customer= customerMapper.mapToCustomer(customerdto, new Customer());

        Optional<Customer> optionalCustomer=customerrepository.findBymobileNumber(customerdto.getMobileNumber());
        if(optionalCustomer.isPresent())
        {
            throw new CustomerAlreadyExistsException("the customer already exists with given mobile number, "
                    +customerdto.getMobileNumber());
        }
//commenting below 2 lines as its taken care now by spring data jpa auditor class
//        customer.setCreatedAt(LocalDateTime.now());
//        customer.setCreatedBy("anonymous");
        Customer savedCustomer=customerrepository.save(customer);
        accountrepository.save(createNewAccount(savedCustomer));
    }

    @Override
    public customerDTO fetchAccountDetails(String mobile) {

        Customer customer = customerrepository.findBymobileNumber(mobile).orElseThrow(
                () -> new ResourceNotFoundException("customer", "mobile nnumber", mobile)
        );
        accounts acc = accountrepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("account", "customer id", customer.getCustomerId().toString())
        );

        customerDTO cust = customerMapper.mapToCustomerDto(customer, new customerDTO());
        cust.setAccountsDTO(accountsMapper.mapToAccountsDto(acc, new accountsDTO()));
        return cust;
    }

    public accounts createNewAccount(Customer customer) {

        accounts newAccount = new accounts();
        //commenting below 2 lines as its taken care now by spring data jpa auditor class
//        newAccount.setCreatedAt(LocalDateTime.now());
//        newAccount.setCreatedBy("anonymous");
        newAccount.setCustomerId(customer.getCustomerId());

        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(accountsConstants.SAVINGS);
        newAccount.setBranchAddress(accountsConstants.ADDRESS);

        return newAccount;
    }

    @Override
    public boolean updateAccount(customerDTO customerDTO) {
        boolean isUpdated = false;

        //get accounts dto from customer dto
        accountsDTO accountsDTO = customerDTO.getAccountsDTO();

        //do update operation only if you find an account with these details
        if(accountsDTO != null) {
            //get account number from account dto else throw no account found exception
            accounts account = accountrepository.findById(accountsDTO.getAccountNumber()).orElseThrow(
                    () -> new ResourceNotFoundException("account", "account number", accountsDTO.getAccountNumber().toString())
            );

            //map current account dto into account
            accountsMapper.mapToAccounts(accountsDTO, account);

            //save this new account data into repo
            account = accountrepository.save(account);

            //now we have updated account details, now time for customer

            //get customer id from accounts dto
            Long customerId = account.getCustomerId();

            //get customer using this customer id
            Customer customer = customerrepository.findById(customerId).orElseThrow(
                    () -> new ResourceNotFoundException("customer", "customer id", customerId.toString())
            );

            //now update customer with new data
            customerMapper.mapToCustomer(customerDTO, customer);

            //saving new customer
            customerrepository.save(customer);

            isUpdated = true;
        }

        return isUpdated;
    }

    @Override
    public boolean deleteAccount(String mobileNumber) {

        //get customer using mobile number
        Customer customer = customerrepository.findBymobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("customer", "mobile number", mobileNumber)
        );

        //delete account, by a custom method to delete account through customer id
        accountrepository.deleteByCustomerId(customer.getCustomerId());

        //delete customer
        customerrepository.deleteById(customer.getCustomerId());

        return true;
    }
}
