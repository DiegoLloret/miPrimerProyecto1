  package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejercicio1")
public class PasoValorController {
	final String plantillaPasoValor="actividad2";
	@GetMapping("/ejemplo1")
	public String helloWorld(Model model) {
		model.addAttribute("escuela","Eep iGroup");
		return plantillaPasoValor;
	}
	@RequestMapping(value="/ejemplo1mav", method=RequestMethod.GET)
	public ModelAndView helloworldMAV() {
		
	ModelAndView mav= new ModelAndView(plantillaPasoValor);
	mav.addObject("escuela","Eep iGroup");
	return mav;
	}
}
