/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.controller;

import com.mycompany.model.Estudiante;
import com.mycompany.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping
    public String listEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "estudiantes";
    }

    @GetMapping("/form")
    public String formEstudiante(@RequestParam(required = false) Integer id, Model model) {
        if (id != null) {
            model.addAttribute("estudiante", estudianteRepository.findById(id).orElse(new Estudiante()));
        } else {
            model.addAttribute("estudiante", new Estudiante());
        }
        return "estudiante_form";
    }

    @PostMapping("/save")
    public String saveEstudiante(@ModelAttribute Estudiante estudiante) {
        // Asigna un valor por defecto a usuarioId si es necesario
        if (estudiante.getUsuarioId() == null) {
            // Aquí puedes establecer un valor predeterminado si es necesario
            // estudiante.setUsuarioId(algúnValorPredeterminado);
        }
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/delete")
    public String deleteEstudiante(@RequestParam Integer id) {
        estudianteRepository.deleteById(id);
        return "redirect:/estudiantes";
    }
}
