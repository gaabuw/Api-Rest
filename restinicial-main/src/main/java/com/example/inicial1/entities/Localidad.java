package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;

    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
    @ToString.Exclude // Evitar recursión infinita
    private List<Domicilio> domicilios;
}