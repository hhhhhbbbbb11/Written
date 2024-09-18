package com.whb.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloWorld
 * Package: com.whb.test.controller
 * Description:
 *
 * @Author NCWU202336617
 * @Create 2024/9/18 9:43
 * @Version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello(){

        return "Hello,World";
    }
}
