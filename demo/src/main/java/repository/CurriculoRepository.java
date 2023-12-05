package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}

