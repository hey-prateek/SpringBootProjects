package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.customerDTO;

public interface IAccountsService {

    //new method for create account
    void createAccount(customerDTO customerdto);

    //new method for fetch account details
    customerDTO fetchAccountDetails(String mobile);

    //new method for update account
    boolean updateAccount(customerDTO customerDTO);

    //method to delete account using mobile number search
    boolean deleteAccount(String mobileNumber);
}
