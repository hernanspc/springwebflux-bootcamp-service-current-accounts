package com.springwebflux.bootcamp.service.currentaccounts.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.springwebflux.bootcamp.service.currentaccounts.app.model.CurrentAccounts;
import com.springwebflux.bootcamp.service.currentaccounts.app.services.CurrentAccountsServicesImplement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class RestControllerCurrentAccounts {

@Autowired
CurrentAccountsServicesImplement implement;

	@GetMapping("/getCurrentAccounts") 
	Flux<CurrentAccounts>getCurrentAccounts()
	{
	return implement.getCurrentAccounts();
	}	
	
	@PostMapping("/createCurrentAccounts")
	Mono<CurrentAccounts> createCurrentAccounts(@RequestBody CurrentAccounts currentaccounts){		
		return implement.createCurrentAccounts(currentaccounts);		
	}
	
	@DeleteMapping("/deleteCurrentAccounts/{nroAccount}")
		Mono<Void> deleteCurrentAccounts(@PathVariable String nroAccount){		
			return implement.deleteCurrentAccounts(nroAccount);		
		}
		
	@PutMapping("/updateCurrentAccounts")
		Mono<CurrentAccounts> updateCurrentAccounts(@RequestBody CurrentAccounts currentaccounts){		
			return implement.updateCurrentAccounts(currentaccounts);	
		}
	
	@GetMapping("/getBusinessNrodoc/{nroAccount}")
		Mono<CurrentAccounts>getCurrentAccountsNro(@PathVariable String nroAccount){		
			return implement.getCurrentAccountsNro(nroAccount);		
		}
		
	@GetMapping("/txt")
		public String txt(){		
		return "Bienvenido Current Accounts";	
		}
	
}
