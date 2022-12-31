package uk.snowhunter.pismo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AccountsControllerIT {

    @Autowired
    private AccountsController accountsController;

    @Test
	public void contextLoads() {
        assertNotNull(accountsController);
    }

}