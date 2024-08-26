/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.controller;

import com.mycompany.model.Usuario;
import com.mycompany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String listUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "usuarios";
    }

    @GetMapping("/form")
    public String formUsuario(@RequestParam(required = false) Integer id, Model model) {
        if (id != null) {
            model.addAttribute("usuario", usuarioRepository.findById(id).orElse(new Usuario()));
        } else {
            model.addAttribute("usuario", new Usuario());
        }
        return "usuario_form";
    }

    @PostMapping("/save")
    public String saveUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/delete")
    public String deleteUsuario(@RequestParam Integer id) {
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios";
    }
}
