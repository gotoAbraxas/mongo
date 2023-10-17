package com.example.testmongo.domain.request;


import com.example.testmongo.domain.document.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String id;

    private String firstName;
    private String lastName;


    public Customer toDocument(){
        return Customer.builder()
                .firstName(firstName)
                .id(id)
                .lastName(lastName)
                .build();

    }
}
