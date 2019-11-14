package com.mostafa.test.springtest.controllers;

import com.mostafa.test.springtest.entity.Test;
import com.mostafa.test.springtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Test addNewTest(@RequestBody String name){
        return testService.addNewTest(name);
    }

    @GetMapping("/{id}")
    public Test getById(@PathVariable("id") long id){
        return testService.findById(id);
    }
}
