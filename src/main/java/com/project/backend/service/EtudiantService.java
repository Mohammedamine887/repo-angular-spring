package com.project.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.project.backend.entity.Etudiant;
import com.project.backend.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> getAllEtudiants() {return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {return etudiantRepository.findById(idEtudiant).get();
    }
    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
