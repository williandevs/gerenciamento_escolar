package br.willliandevs.students.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.willliandevs.students.enums.Curso;
import br.willliandevs.students.enums.Status;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    private String matricula;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String turno;

}
