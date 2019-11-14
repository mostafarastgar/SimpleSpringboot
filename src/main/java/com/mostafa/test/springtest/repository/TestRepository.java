package com.mostafa.test.springtest.repository;

import com.mostafa.test.springtest.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
