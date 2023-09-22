package com.amigoscode.testing.utils;

import java.util.function.Predicate;

public class PhoneNumberValidator implements Predicate <String> {
     {
    }

    @Override
    public boolean test(String phoneNumber) {
         return (phoneNumber.startsWith("+47")) &&
                 phoneNumber.length() == 11;
    }
}
