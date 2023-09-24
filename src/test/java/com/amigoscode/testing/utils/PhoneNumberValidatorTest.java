package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator undertest;

    @BeforeEach
    void setUp() {
        undertest = new PhoneNumberValidator();
    }

    @Test
    void itShouldValidatePhoneNumber() {

        //given
        String phoneNumber = "+4791815230";

        //when
        boolean isValid = undertest.test(phoneNumber);

        //then

        assertThat(isValid).isTrue();
    }

    @Test
    void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThen13() {

        //given
        String phoneNumber = "+479181523576510";

        //when
        boolean isValid = undertest.test(phoneNumber);

        //then

        assertThat(isValid).isFalse();
    }

}

