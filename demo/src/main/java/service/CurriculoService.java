package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Curriculo;
import repository.CurriculoRepository;

import java.util.List;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public Curriculo getCurriculoById(Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    public Curriculo addCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public Curriculo updateCurriculo(Long id, Curriculo curriculo) {
        curriculo.setId(id);
        return curriculoRepository.save(curriculo);
    }

    public void deleteCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}



