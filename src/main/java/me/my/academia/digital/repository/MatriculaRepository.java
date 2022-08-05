package me.my.academia.digital.repository;

import me.my.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {


    List<Matricula> findByAlunoBairro(String bairro);
}
