package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class customerDTO {

    //below are added validation annotations
    @NotEmpty(message = "name cannot be empty")
    @Size(min = 5, max = 30, message = "size of name should be in between 5 and 30")
    private String name;

    @NotEmpty(message = "email cannot be empty")
    @Email(message = "please give email in proper email format")
    private String email;

    @Pattern(regexp = "^($|[0-9]{10})", message = "mobile number should be 10 digits")
    private String mobileNumber;

    private accountsDTO accountsDTO;
}
