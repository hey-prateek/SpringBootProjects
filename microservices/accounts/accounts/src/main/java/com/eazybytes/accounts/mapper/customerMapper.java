package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.customerDTO;
import com.eazybytes.accounts.entity.Customer;

public class customerMapper {
    public static customerDTO mapToCustomerDto(Customer customer, customerDTO customerDto) {

        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());

        return customerDto;
    }

    public static Customer mapToCustomer(customerDTO customerDto, Customer customer) {

        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());

        return customer;
    }
}
