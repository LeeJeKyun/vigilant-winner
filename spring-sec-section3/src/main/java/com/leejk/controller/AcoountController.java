package com.leejk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcoountController {

    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "Here are the account details from th DB";
    }

}
