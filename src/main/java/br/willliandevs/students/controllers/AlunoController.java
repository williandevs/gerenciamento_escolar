package br.willliandevs.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.willliandevs.students.model.Aluno;
import br.willliandevs.students.repositories.AlunoRepository;

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    /* Criando o novo aluno aparti do formulario */
    @GetMapping("inserirAluno")
    public ModelAndView InsertAlunos(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/formAluno");
        mv.addObject("aluno", new Aluno());
        return mv;
    }


    /* Salvando os alunos do formulario no banco de dados  */
    @PostMapping("InsertAlunos")
    public ModelAndView inserirAluno(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/alunos-adicionados");
        alunoRepository.save(aluno);
        return mv;
    }

    /* Pegando a lista dos alunos no banco para mostra na tela  */
    @GetMapping("alunos-adicionados")
    public ModelAndView listagemAlunos() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/listaAlunos");
        mv.addObject("alunosList", alunoRepository.findAll());
        return mv;
    }

}
