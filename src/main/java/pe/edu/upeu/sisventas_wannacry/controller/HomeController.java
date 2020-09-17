package pe.edu.upeu.sisventas_wannacry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String mensaje() {
        return "gaaaaaaaaaaaaaaaaaaa";
    }
}