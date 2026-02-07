package com.azizos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.azizos.Models.*;

@Controller
public class HomeController {

    @GetMapping("/formation")
    public String formation() {
        return "formation"; // formation.html
    }

    @GetMapping("/profile")
    public String profile(Model md) {
    	String center="azizos";
    	String stagiaire[]= {"aziz","yasmine","taysir"};
    	md.addAttribute("centerV", center); //2 var java
    	md.addAttribute("StagiaireV",stagiaire);
        return "profile"; // profile.html
    }
    @GetMapping("/etudiants")
    public String Etudiant(Model md) {
    	String center="azizos";
    Etudiant etudiants[]=new Etudiant[3];
    etudiants[0]=new Etudiant(1,22,"akrout","aziz","aziz.akrout07@gmail.com","etudiant");
    etudiants[1]=new Etudiant(1,23,"akrout","atef","atef.akrout07@gmail.com","travailleur");
    etudiants[2]=new Etudiant(1,22,"akrout","youssef","youssef.akrout07@gmail.com","élève");
    md.addAttribute("etudiants",etudiants);
    	md.addAttribute("centerV", center); //2 var java
    
        return "Etudiant";
    }
}
