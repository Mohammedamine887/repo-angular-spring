package com.project.backend.controllers;

import org.springframework.ui.Model;
import com.project.backend.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.backend.service.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    public String getAllEtudiants(Model model) {
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        model.addAttribute("etudiants", etudiants);
        return "etudiant/list";
    }

    @GetMapping("/{id}")
    public String getEtudiantById(@PathVariable Long id, Model model) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(id);
        model.addAttribute("etudiant", etudiant);
        return "etudiant/view";
    }

    @GetMapping("/new")
    public String createEtudiantForm(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "etudiant/form";
    }

    @PostMapping("/new")
    public String createEtudiant(@ModelAttribute Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    @GetMapping("/edit/{id}")
    public String editEtudiantForm(@PathVariable Long id, Model model) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(id);
        model.addAttribute("etudiant", etudiant);
        return "etudiant/form";
    }

    @PostMapping("/edit/{id}")
    public String editEtudiant(@PathVariable Long id, @ModelAttribute Etudiant etudiant) {
        etudiant.setId(id);
        etudiantService.addEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    @GetMapping("/delete/{id}")
    public String deleteEtudiant(@PathVariable Long id) {
        etudiantService.removeEtudiant(id);
        return "redirect:/etudiants";
    }
}

