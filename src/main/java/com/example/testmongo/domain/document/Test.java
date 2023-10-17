package com.example.testmongo.domain.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Test  {

    @Id
    private String id;



}
