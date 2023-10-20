package com.example.testmongo.domain.request;


import com.example.testmongo.domain.document.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.Document;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String id;

    private String firstName;
    private String lastName;
    private Set<String> data;



    public Customer toDocument(){
        return Customer.builder()
                .firstName(firstName)
                .id(id)
                .lastName(lastName)
                .data(data)
                .build();

    }
}
