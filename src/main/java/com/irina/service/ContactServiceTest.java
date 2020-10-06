package com.irina.service;

import com.irina.entity.Address;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactServiceTest {

    /*  MethodName_ExpectedBehavior_StateUnderTest
    example: isAdult_AgeLessThan18_False*/

        @BeforeEach
        void setUp() {
            System.out.println("setUp");
        }

        @AfterEach
        void tearDown() {
            System.out.println("tearDown");
        }

        @Test
        void createContactWillBeCreatedWhenArgumentsAreValid() {

            ContactService contactService = new ContactService();
            contactService.createContact("TestName1", "Bbbbbbbbb", 1234567890L,
                    new Address("TestHouseNumber1", "TestStreet1", "TestCity1", "TestState1", 11111));
            ;
            assertEquals("TestName1", contactService.searchByFirstNameOrLastNameOrCityName("TestName1").getFirstName());
        }

        @Test
        void createContactThrowExceptionWhenAddressIsNull() {

            assertThrows(NullPointerException.class, () -> {
                new ContactService().createContact("TestName1", "Bbbbbbbbb", 1234567890L, null);
            });
        }
    }


