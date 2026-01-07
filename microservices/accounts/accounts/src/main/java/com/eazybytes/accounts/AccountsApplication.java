package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl") //Enables JPA auditing and links a custom AuditorAware implementation to automatically set createdBy and modifiedBy fields.
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

//-----------body to put while creating an account, as when we stop the app, the database gets cleared---------
/*
 {
		"name": "kanye west",
		"email": "kanye@yeezy.com",
		"mobileNumber": "78424"
}
*/