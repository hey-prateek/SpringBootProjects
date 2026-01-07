package com.eazybytes.accounts.Controller;

import com.eazybytes.accounts.dto.customerDTO;
import com.eazybytes.accounts.dto.responseDTO;
import com.eazybytes.accounts.service.IAccountsService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.eazybytes.accounts.constants.*;

@RestController
@RequestMapping(path="/api", produces=(MediaType.APPLICATION_JSON_VALUE))
@AllArgsConstructor
@Validated //to validate all data before processing
public class accountsController {

    private IAccountsService IAccountsService;

    //controller to create a new account
    @PostMapping("/create")
    public ResponseEntity<responseDTO> createAccount(@RequestBody @Valid customerDTO customerdto)
    {
        IAccountsService.createAccount(customerdto);

        return ResponseEntity.
                status(HttpStatus.CREATED).
                body(new responseDTO(accountsConstants.STATUS_201, accountsConstants.MESSAGE_201));
    }

    //controller to fetch account details
    @GetMapping("/fetch")
    public ResponseEntity<customerDTO> getCustomerDetailsByMobileNumber(
            @RequestParam
            @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number should be 10 digits")
            String mobileNumber) {

        customerDTO customer = IAccountsService.fetchAccountDetails(mobileNumber);

        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    //controller to update account and customer data
    @PutMapping("/update")
    public ResponseEntity<responseDTO> updateAccountData (@RequestBody @Valid customerDTO customerDTO)
    {
        boolean isUpdated = IAccountsService.updateAccount(customerDTO);

        //if account is updated, then show 200 OK
        if(isUpdated)
        {
            return ResponseEntity.
                    status(HttpStatus.OK).
                    body(new responseDTO(accountsConstants.STATUS_200, accountsConstants.MESSAGE_200));
        }
        //ele show internal server error
        else
        {
            return ResponseEntity.
                    status(HttpStatus.EXPECTATION_FAILED).
                    body(new responseDTO(accountsConstants.STATUS_417, accountsConstants.MESSAGE_417_UPDATE));
        }
    }

    //delete a customer using mobile number
    @DeleteMapping
    public ResponseEntity<responseDTO> deleteCustomer(@RequestParam
                                                          @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number should be 10 digits")
                                                          String mobileNumber)
    {
        //calling service method
        boolean isDeleted = IAccountsService.deleteAccount(mobileNumber);

        //if account and customer are deleted
        if(isDeleted)
        {
            return ResponseEntity.
                    status(HttpStatus.OK).
                    body(new responseDTO(accountsConstants.STATUS_200, accountsConstants.MESSAGE_200));
        }
        //ele show internal server error
        else
        {
            return ResponseEntity.
                    status(HttpStatus.EXPECTATION_FAILED).
                    body(new responseDTO(accountsConstants.STATUS_417, accountsConstants.MESSAGE_417_DELETE));
        }
    }
}
