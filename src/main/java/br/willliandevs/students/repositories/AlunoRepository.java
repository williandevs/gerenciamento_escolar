package br.willliandevs.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.willliandevs.students.model.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Integer>{
    
}
