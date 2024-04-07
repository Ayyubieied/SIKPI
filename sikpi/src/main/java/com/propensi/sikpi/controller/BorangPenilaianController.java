package com.propensi.sikpi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.propensi.sikpi.DTO.request.BorangPenilaianDTO;
import com.propensi.sikpi.model.BorangPenilaian;
import com.propensi.sikpi.model.IndeksKinerjaIndividu;
import com.propensi.sikpi.model.KriteriaPenilaian;
import com.propensi.sikpi.repository.BorangPenilaianDb;
import com.propensi.sikpi.service.TemplateService;

@Controller
public class BorangPenilaianController {

    @Autowired
    private TemplateService templateService;

    @Autowired
    private BorangPenilaianDb borangPenilaianDb;
    
    @GetMapping("/borang/template-penilaian-iki")
    public String viewAllIki(Model model) {

        List<IndeksKinerjaIndividu> listIki = templateService.getAllIki();

        model.addAttribute("listIki", listIki);
        // model.addAttribute("idUser", getUserId());
        return "viewall-iki-borang";
    }

    @GetMapping("/borang/template-penilaian-iki/{id}")
    public String fillIki(@PathVariable Long id, Model model) {
        IndeksKinerjaIndividu iki = templateService.getIkiById(id); // Add a method in your service to get the template by ID
        for (KriteriaPenilaian kp : iki.getListKriteria()) {
            System.out.println(kp.getJudulKriteria());
        }
        System.out.println(iki.getListKriteria().size());
        model.addAttribute("ikiDTO", iki);
        model.addAttribute("existingList", iki.getListKriteria());
        // model.addAttribute("idUser", getUserId());
        return "form-borang";
    }

    @PostMapping("/borang/template-penilaian-iki/{id}")
    public String submitIki(@PathVariable Long id, @ModelAttribute BorangPenilaianDTO borangPenilaianDTO) {
        BorangPenilaian borang = new BorangPenilaian();
        borang.setKriteriaScores(borangPenilaianDTO.getKriteriaScores());
        borang.setStatus("pending");
        borangPenilaianDb.save(borang);
        System.out.println(borang.getKriteriaScores().toString());
        return "redirect:/borang/template-penilaian-iki";
    }
}
