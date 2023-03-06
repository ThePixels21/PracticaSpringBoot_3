package com.prueba.prueba.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.prueba.models.Producto;
import com.prueba.prueba.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping({ "/", "" })
    public String productos(Model model) {
        model.addAttribute("titulo", "Productos de usuario");
        model.addAttribute("usuario", new Usuario("Juan", "Perez", "juan@gmail.com", "juan123"));
        return "usuario/productos";
    }

    @ModelAttribute("productos")
    public List<Producto> getProductos() {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop Lenovo", "Buen estado", 2500000),
                new Producto("Laptop HP", "Buen estado", 1500000),
                new Producto("Laptop Samsung", "Buen estado", 2999000),
                new Producto("Laptop Asus", "Buen estado", 5600000),
                new Producto("Laptop Acer", "Buen estado", 479000));
        return productos;
    }
}
