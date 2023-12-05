import { Component, OnInit } from '@angular/core';
import { EtudiantService } from '../Service/etudiant';
import { Etudiant } from '../Models/etudiant';

@Component({
  selector: 'app-etudiant',
 templateUrl: './etudiant.component.html',
  styleUrls: ['./etudiant.component.css']
})
export class Entity1ListComponent implements OnInit {
  etudiants!: Etudiant[];

  constructor(private etudiantService: EtudiantService) {}

  ngOnInit() {
    this.etudiantService.getAll().subscribe(data => {
      this.etudiants = data;
    });
  }

}
