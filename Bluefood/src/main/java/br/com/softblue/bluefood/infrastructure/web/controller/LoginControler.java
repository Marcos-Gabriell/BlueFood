package br.com.softblue.bluefood.infrastructure.web.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControler {

	@GetMapping(path = { "/login", "/" })
	public String login() {
		return "login";
	}
	
	@GetMapping(path = "/login-error")
	public String loginError(Model model) {
		model.addAttribute("msg", "Credenciais inválidas");
		return "login";
	}
}

