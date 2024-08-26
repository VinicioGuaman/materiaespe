/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.controller;

import com.mycompany.model.Carrera;
import com.mycompany.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/carreras")
public class CarreraController {
    @Autowired
    private CarreraRepository carreraRepository;

    @GetMapping
    public String listCarreras(Model model) {
        model.addAttribute("carreras", carreraRepository.findAll());
        return "carreras";
    }

    @GetMapping("/form")
    public String formCarrera(@RequestParam(required = false) Integer id, Model model) {
        if (id != null) {
            model.addAttribute("carrera", carreraRepository.findById(id).orElse(new Carrera()));
        } else {
            model.addAttribute("carrera", new Carrera());
        }
        return "carrera_form";
    }

    @PostMapping("/save")
    public String saveCarrera(@ModelAttribute Carrera carrera) {
        carreraRepository.save(carrera);
        return "redirect:/carreras";
    }

    @GetMapping("/delete")
    public String deleteCarrera(@RequestParam Integer id) {
        carreraRepository.deleteById(id);
        return "redirect:/carreras";
    }
}
