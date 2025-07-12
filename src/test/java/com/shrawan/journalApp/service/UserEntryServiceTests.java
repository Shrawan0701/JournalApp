package com.shrawan.journalApp.service;

import com.shrawan.journalApp.repository.UserEntryRepo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Disabled
public class UserEntryServiceTests {

    @Autowired
    private UserEntryRepo userEntryRepo;

    @Test
    public void testFindByUserName() {
        assertNotNull(userEntryRepo.findByUserName("Shrawan"));
    }

    @ParameterizedTest(name = "Test {index}: {0} + {1} = {2}")    //we can see in console which test passed or failed
    @CsvSource({
            "1,3,4",

    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }

}
