package me.my.academia.digital.service.impl;

import me.my.academia.digital.entity.Matricula;
import me.my.academia.digital.entity.form.MatriculaForm;
import me.my.academia.digital.repository.AlunoRepository;
import me.my.academia.digital.repository.MatriculaRepository;
import me.my.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        } else {
            return matriculaRepository.findByAlunoBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
