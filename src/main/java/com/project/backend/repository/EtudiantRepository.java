package com.project.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.project.backend.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}