package com.example.thymeleaf.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class MemberVO {

    private int mno;
    private String mid;
    private String mpw;
    private String mname;
    private Timestamp regDate;

}
