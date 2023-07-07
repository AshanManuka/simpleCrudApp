package com.crudStore.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/load")
public class Controller {


    @GetMapping
    public String loadMessage(){
        return "Hello world";
    }

}
