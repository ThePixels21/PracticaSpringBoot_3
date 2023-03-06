package com.prueba.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.prueba.models.Cliente;

import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("cliente", new Cliente());
        return "form";
    }

    @PostMapping("/form")
    public String resultado(@Valid Cliente cliente, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("titulo", "Corregir formulario");
            return "form";
        }
        model.addAttribute("titulo", "Registro exitoso");
        return "resultado";
    }
}
