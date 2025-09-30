package com.aluno.aluno.controller;

import com.aluno.aluno.controller.dto.AlunoDto;
import com.aluno.aluno.entity.Aluno;
import com.aluno.aluno.repository.AlunoRepository;
import com.aluno.aluno.service.AlunoService;
import com.aluno.aluno.service.mapper.AlunoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }


    @PostMapping
    public Aluno postAluno(AlunoDto alunoDto) {
        return service.postAluno(AlunoMapper.fromEntity(alunoDto));
    }



}
