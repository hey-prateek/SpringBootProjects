package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.accountsDTO;
import com.eazybytes.accounts.entity.accounts;

public class accountsMapper {
    public static accountsDTO mapToAccountsDto(accounts accounts, accountsDTO accountsDto) {

        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());

        return accountsDto;
    }

    public static accounts mapToAccounts(accountsDTO accountsDto, accounts accounts) {

        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());

        return accounts;
    }
}
