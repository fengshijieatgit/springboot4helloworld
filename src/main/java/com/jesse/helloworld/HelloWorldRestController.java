
package com.jesse.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController("hello")
public class HelloWorldRestController {
    @GetMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("user:"+request.getParameter("user"));
        return "hello world";
    }
}
