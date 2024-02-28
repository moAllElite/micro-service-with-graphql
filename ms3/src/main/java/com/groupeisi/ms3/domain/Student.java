package com.groupeisi.ms3.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "student")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

}
