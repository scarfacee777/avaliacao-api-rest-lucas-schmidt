package com.aluno.aluno.service;

import com.aluno.aluno.entity.Aluno;
import com.aluno.aluno.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    final private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno postAluno(Aluno aluno){
        Aluno alunoValue = Aluno.builder()
                .name(aluno.getName())
                .phone(aluno.getPhone())
                .build();

        return repository.save(alunoValue);
    }

    public aluno getAluno ()

}
