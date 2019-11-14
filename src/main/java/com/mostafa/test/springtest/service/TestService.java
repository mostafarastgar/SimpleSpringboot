package com.mostafa.test.springtest.service;

import com.mostafa.test.springtest.entity.Test;
import com.mostafa.test.springtest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public Test addNewTest(String name) {
        return testRepository.save(new Test(name, LocalDateTime.now()));
    }

    public Test findById(long id) {
        Optional<Test> test = testRepository.findById(id);
        if (test.isPresent()) {
            return test.get();
        } else {
            throw new IllegalArgumentException("id: " + id + " is not valid");
        }
    }
}
