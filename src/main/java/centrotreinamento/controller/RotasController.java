package centrotreinamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/inicio")
    public String inicioPage() {
        return "inicio";
    }

}
