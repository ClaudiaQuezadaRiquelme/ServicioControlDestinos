package cl.caQuezada.controller​;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.caQuezada.model.Destino;
import cl.caQuezada.service.DestinoService;
import cl.caQuezada.service.PasajeroService;

@Controller
@RequestMapping("/destinos")
public class DestinoController​ {

	@Autowired
	private DestinoService destinoService;
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping("/crear")
	public ModelAndView crear() {
		ModelAndView modelAndView = new ModelAndView("crear-destino");
		modelAndView.addObject("destinos", destinoService.findAll());
		modelAndView.addObject("pasajeros", pasajeroService.findAll());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crear(@ModelAttribute Destino destino) { // model Attribute es porque el destino viene del formulario
		destinoService.save(destino);
		return new RedirectView("/destinos/");
	}
	
	@GetMapping("/")
	public ModelAndView destinos() {
		ModelAndView modelAndView = new ModelAndView("/destinos");
		modelAndView.addObject("destinos", destinoService.findAll() );
		return modelAndView;
	}
}
