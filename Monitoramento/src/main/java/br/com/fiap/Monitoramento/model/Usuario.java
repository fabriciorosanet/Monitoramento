package br.com.fiap.Monitoramento.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "tbl_usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_USUARIOS"
    )
    @SequenceGenerator(
            name = "SEQ_USUARIOS",
            sequenceName = "SEQ_USUARIOS",
            allocationSize = 1
    )
    @Column(name = "id")
    private Long id;

    private String nome;
    private String email;
    private String senha;

}
