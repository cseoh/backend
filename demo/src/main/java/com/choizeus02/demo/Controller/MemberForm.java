package com.choizeus02.demo.Controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    private String ageGroup;
    private String gender;
}
