package com.example.testmongo.controller;


import com.example.testmongo.domain.request.CustomerRequest;
import com.example.testmongo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    @PostMapping("save")
    public void save(@RequestBody CustomerRequest customerRequest){
        testService.insert(customerRequest);

    }


    @PostMapping("save2")
    public void save2(){
        testService.insert2();
    }


}
