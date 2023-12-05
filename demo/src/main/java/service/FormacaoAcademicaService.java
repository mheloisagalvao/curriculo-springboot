package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.FormacaoAcademica;
import repository.FormacaoAcademicaRepository;

import java.util.List;

@Service
public class FormacaoAcademicaService {

    @Autowired
    private FormacaoAcademicaRepository formacaoAcademicaRepository;

    public List<FormacaoAcademica> getAllFormacoes() {
        return formacaoAcademicaRepository.findAll();
    }

    public FormacaoAcademica getFormacaoById(Long id) {
        return formacaoAcademicaRepository.findById(id).orElse(null);
    }

    public FormacaoAcademica addFormacao(FormacaoAcademica formacaoAcademica) {
        return formacaoAcademicaRepository.save(formacaoAcademica);
    }

    public FormacaoAcademica updateFormacao(Long id, FormacaoAcademica formacaoAcademica) {
        formacaoAcademica.setId(id);
        return formacaoAcademicaRepository.save(formacaoAcademica);
    }

    public void deleteFormacao(Long id) {
        formacaoAcademicaRepository.deleteById(id);
    }
}


