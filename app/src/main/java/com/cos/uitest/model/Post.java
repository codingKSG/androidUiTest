package com.cos.uitest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private int id;
    private String username;
    private int myImg;
    private int postImg;
}
