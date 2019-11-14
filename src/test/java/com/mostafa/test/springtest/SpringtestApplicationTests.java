package com.mostafa.test.springtest;

import com.mostafa.test.springtest.entity.Test;
import com.mostafa.test.springtest.repository.TestRepository;
import com.mostafa.test.springtest.service.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringtestApplicationTests {
    @MockBean
    private TestRepository testRepository;
    @Autowired
    private TestService testService;

    @BeforeEach
    public void init() {
        when(testRepository.findById(anyLong())).thenReturn(Optional.of(new Test("test", LocalDateTime.now())));
        when(testRepository.save(any())).thenReturn(new Test("test", LocalDateTime.now()));
    }

    @org.junit.jupiter.api.Test
    void contextLoads() {
        assertEquals("test", testService.findById(10).getName());
        assertEquals("test", testService.addNewTest("mostafa").getName());
    }

}
