package com.choizeus02.demo.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Getter @Setter
public class Member {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ageGroup;
    private String gender;
    private Long totalClick;
    private Long incorrectClick;
    private Long time;



}