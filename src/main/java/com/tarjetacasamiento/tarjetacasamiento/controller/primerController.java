package com.tarjetacasamiento.tarjetacasamiento.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarjetacasamiento.tarjetacasamiento.modelo.Invitado;
@Controller
public class primerController {

	@GetMapping("evayluis")
	public String Casa()
	{
		return "miinvitacion";
	}
	
	@PostMapping("mandoinvitacion")
	public String FNmandoinvitacion(Invitado invitado)
	{
		return "invitacionOK";
	}
}