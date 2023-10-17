package com.example.testmongo.service;

import com.example.testmongo.domain.document.Customer;
import com.example.testmongo.domain.document.Test;
import com.example.testmongo.domain.request.CustomerRequest;
import com.example.testmongo.repository.TestRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    private final MongoClient mongoClient;



    public Customer findFirstName(String Name){
        return testRepository.findByFirstName(Name);
    }

    public void insert(CustomerRequest customerRequest){

        testRepository.save(customerRequest.toDocument());

    }

    public void insert2(){

        Test tst = new Test();

        Document author = new Document("_id", new ObjectId())
                .append("name", "Gabriel García Márquez")
                .append("dateOfDeath", Date.from(LocalDate.of(2014, 4, 17).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .append("novels", Arrays.asList(
                        new Document("title", "One Hundred Years of Solitude").append("yearPublished", 1967),
                        new Document("title", "Chronicle of a Death Foretold").append("yearPublished", 1981),
                        new Document("title", "Love in the Time of Cholera").append("yearPublished", 1985)));
        MongoDatabase test = mongoClient.getDatabase("test");

        MongoCollection<Document> test1 = test.getCollection("test");

        test1.insertOne(author);


    }
}
