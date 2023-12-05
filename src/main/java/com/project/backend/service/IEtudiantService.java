package com.project.backend.service;

import com.project.backend.entity.Etudiant;

import java.util.List;


public interface IEtudiantService {
    List<Etudiant> getAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}