package com.sifpayroll.payroll;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome to spring boot application";
    }
}
