package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Curriculo;
import repository.CurriculoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoRepository curriculoRepository;

    @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Curriculo getCurriculoById(@PathVariable Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Curriculo addCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    @PutMapping("/{id}")
    public Curriculo updateCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        curriculo.setId(id);
        return curriculoRepository.save(curriculo);
    }

    @DeleteMapping("/{id}")
    public void deleteCurriculo(@PathVariable Long id) {
        curriculoRepository.deleteById(id);
    }
}

