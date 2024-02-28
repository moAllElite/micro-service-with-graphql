package com.groupeisi.ms1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
 @NoArgsConstructor
@Getter
@Setter
public class TeacherDto {
    private Long id;
    private String fullName;
    private String email;
    private Long schoolId;
}
