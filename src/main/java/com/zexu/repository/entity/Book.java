package com.zexu.repository.entity;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
    private String location;
    private String status;
}
