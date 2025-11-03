package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/item")
@RestController
public class ItemController {

    @GetMapping("/name")
    public String getname(){
        return "mobile";
    }

    @GetMapping("/number")
    public Integer getnumber(){
        return 2;
    }
}
