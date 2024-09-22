package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;

    @ManyToOne
    @JoinColumn(name = "fk_autor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "fk_persona")
    private Persona persona;
}
