package com.bd.autosearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/settings")
    public static String userSetting() {
        return "/user/settings";
    }

    @GetMapping("/user/sign-in")
    public static String signIn() {
        return "/user/sign-in";
    }

    @GetMapping("/user/sign-up")
    public static String singUp() {
        return "/user/sign-up";
    }
}
