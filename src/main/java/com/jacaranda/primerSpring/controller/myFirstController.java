package com.jacaranda.primerSpring.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jacaranda.primerSpring.model.Calculator;

@Controller
public class myFirstController {
	
//	@GetMapping({"/","index.html","hello.html"})
//	public String hello(Model model, @RequestParam(name="nombre",required=false, defaultValue="John") String nombreSaludo,
//			@RequestParam( required=false, defaultValue="Nieve") String apellido) {
//		model.addAttribute("nombre",nombreSaludo);
//		model.addAttribute("apellido",apellido);
//		return("hello");
//	}
//
//	
//	@GetMapping({"hello2"})
//	public String hello2(Model model, @RequestParam(name="nombre") Optional<String> nombreSaludo,
//			@RequestParam Optional<String> apellido) {
//		model.addAttribute("nombre",nombreSaludo.orElse("John"));
//		model.addAttribute("apellido",apellido.orElse("Nieve"));
//		return("hello");
//	}
//	
//	@GetMapping({"suma"})
//	public String suma(Model model) {
//		Calculator calc = new Calculator();
//		
//		model.addAttribute("calc", calc);
//		return("calculadora");
//	}
//	
//	@PostMapping({"suma/submit"})
//	public String sumaSumbit(Model model, @ModelAttribute("calc") Calculator calculadora) {
//		
//		model.addAttribute("resultado", calculadora.getNum1() + calculadora.getNum2());
//		return("resultado");
//	}
}
