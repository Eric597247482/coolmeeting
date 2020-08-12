package org.javalad.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Eric
 * @date 2020/7/19 0019
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "hello javalad!");
        return "hello";
    }
}
