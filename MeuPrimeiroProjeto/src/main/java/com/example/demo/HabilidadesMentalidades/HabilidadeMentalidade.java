package com.example.demo.HabilidadesMentalidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping 
public class HabilidadeMentalidade {

@GetMapping 
public String Hello(){
return ("<strong>Hello World! </strong> <br>Habilidades: Precisei de muito orientação ao detalhe para codar. <br>Mentalidades: Precisei de muuuitaaaaaa persistência e responsabilidade pessoal para não desistir ");
}

}



