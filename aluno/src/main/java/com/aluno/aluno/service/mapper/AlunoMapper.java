package com.aluno.aluno.service.mapper;

import com.aluno.aluno.controller.dto.AlunoDto;
import com.aluno.aluno.entity.Aluno;

public class AlunoMapper {

    public static AlunoDto fromDto(Aluno aluno) {
        if (aluno == null) {
            return null;
        }

        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setName(aluno.getName());
        alunoDto.setPhone(aluno.getPhone());
        return alunoDto;
    }


    public static Aluno fromEntity(AlunoDto alunoDto) {
        if (alunoDto == null) {
            return null;
        }
        Aluno aluno = new Aluno();
        aluno.setName(alunoDto.getName());
        aluno.setPhone(alunoDto.getPhone());
        return aluno;
    }
}
