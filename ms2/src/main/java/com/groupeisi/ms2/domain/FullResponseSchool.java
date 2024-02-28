package com.groupeisi.ms2.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullResponseSchool {

    private String fullName;
    private String adress;
    List<Teacher> teachers;
}
