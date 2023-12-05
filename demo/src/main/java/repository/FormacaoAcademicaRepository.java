package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.FormacaoAcademica;

@Repository
public interface FormacaoAcademicaRepository extends JpaRepository<FormacaoAcademica, Long> {
}

