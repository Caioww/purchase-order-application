package com.purchaseorder.purchaseorderapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.purchaseorder.purchaseorderapplication.document.Users;
import com.purchaseorder.purchaseorderapplication.service.UsersService;

@Controller
public class IndexController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping(value="/registro",produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView cadastro() throws Throwable {
		ModelAndView mv = new ModelAndView("cadastro");
		List<Users> usuarios = usersService.findAll();
	    ObjectMapper objectMapper = new ObjectMapper();
		mv.addObject("usuarios", objectMapper.writeValueAsString(usuarios));
		return mv;
	}
	@PostMapping("/cadastrarPessoas")
	public String salvarCadastro(Users users, String confirmPassword) {
		usersService.salvar(users.getId(), users.getName(), users.getEmail(), users.getPassword());
		return "index";
		
	}
	
}


