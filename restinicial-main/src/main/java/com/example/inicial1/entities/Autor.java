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
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    @ToString.Exclude // Evitar recursión infinita
    private List<Libro> libros;
}
