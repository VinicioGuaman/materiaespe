/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // nombre del archivo index.html en templates
    }
}
