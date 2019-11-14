package com.mostafa.test.springtest.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_test")
public class Test {
    @GeneratedValue
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private LocalDateTime createTime;

    public Test() {
    }

    public Test(String name, LocalDateTime createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
