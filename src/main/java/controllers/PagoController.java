package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.EstudianteService;

@Controller
@RequestMapping
public class PagoController {

    @Autowired
    EstudianteService estudianteService;
}
