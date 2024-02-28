package com.groupeisi.ms2.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullResponseSchool {

    private String name;
    private String adress;
    List<Student> students;
}
