package com.mycompany.repository;

import com.mycompany.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
