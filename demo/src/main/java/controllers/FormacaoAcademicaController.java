package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.FormacaoAcademica;
import repository.FormacaoAcademicaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/formacoes")
public class FormacaoAcademicaController {

    @Autowired
    private FormacaoAcademicaRepository formacaoAcademicaRepository;

    @GetMapping
    public List<FormacaoAcademica> getAllFormacoes() {
        return formacaoAcademicaRepository.findAll();
    }

    @GetMapping("/{id}")
    public FormacaoAcademica getFormacaoById(@PathVariable Long id) {
        return formacaoAcademicaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public FormacaoAcademica addFormacao(@RequestBody FormacaoAcademica formacaoAcademica) {
        return formacaoAcademicaRepository.save(formacaoAcademica);
    }

    @PutMapping("/{id}")
    public FormacaoAcademica updateFormacao(@PathVariable Long id, @RequestBody FormacaoAcademica formacaoAcademica) {
        formacaoAcademica.setId(id);
        return formacaoAcademicaRepository.save(formacaoAcademica);
    }

    @DeleteMapping("/{id}")
    public void deleteFormacao(@PathVariable Long id) {
        formacaoAcademicaRepository.deleteById(id);
    }
}

