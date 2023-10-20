package com.example.testmongo.controller;


import com.example.testmongo.domain.request.CustomerRequest;
import com.example.testmongo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    @PostMapping("save")
    public void save(@RequestBody CustomerRequest customerRequest){
        testService.insert(customerRequest);

    }

    @GetMapping("save")

    public Set<String> test(){
        return testService.test();
    }


    @PostMapping("save2")
    public void save2(){
        testService.insert2();
    }


}
