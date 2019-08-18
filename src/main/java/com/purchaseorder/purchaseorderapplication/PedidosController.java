package com.purchaseorder.purchaseorderapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.purchaseorder.purchaseorderapplication.document.Users;
import com.purchaseorder.purchaseorderapplication.service.UsersService;

@RestController
@RequestMapping("/rest/users")
public class PedidosController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		return usersService.findAll();	
		
	}

}
