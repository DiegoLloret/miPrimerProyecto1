package com.eep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Persona;


@Controller
@RequestMapping("/ejemplos")
public class EjemploPasoListadoController {
	final String plantillaPasoValor="ejemplopasolistado";
	@GetMapping("/ejemplo3")
	public String helloWorld(Model model) {
		Persona p1= new Persona();
		p1.setEdad(20);
		p1.setNombre("juan");
		model.addAttribute("personas",getPersonas());
		return plantillaPasoValor;
	}
	@RequestMapping(value="/ejemplo3mav", method=RequestMethod.GET)
	public ModelAndView helloworldMAV() {
	
		
	ModelAndView mav= new ModelAndView(plantillaPasoValor);
	mav.addObject("personas",getPersonas());
	return mav;
	}
	private List <Persona> getPersonas(){
		List<Persona> listaPersonas= new ArrayList<Persona>();
	listaPersonas.add(new Persona("Maria",10));
	listaPersonas.add(new Persona("Sonia",25));
	listaPersonas.add(new Persona("Manolo",50));
	listaPersonas.add(new Persona("Juan",14));
	return listaPersonas;
	}
}
