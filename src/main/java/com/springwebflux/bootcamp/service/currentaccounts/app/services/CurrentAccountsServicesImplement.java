package com.springwebflux.bootcamp.service.currentaccounts.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.springwebflux.bootcamp.service.currentaccounts.app.model.CurrentAccounts;
import com.springwebflux.bootcamp.service.currentaccounts.app.repository.IcurrentAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CurrentAccountsServicesImplement implements IcurrentAccountService {

	
	@Autowired
	IcurrentAccountRepository repositorio;

	@Override
	public Flux<CurrentAccounts> getCurrentAccounts()
	{
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Mono<CurrentAccounts> createCurrentAccounts(CurrentAccounts currentaccount) {
		// TODO Auto-generated method stub
		return repositorio.save(currentaccount)
				.doOnNext( element -> {
					if(element.equals(null)) {
						throw new RuntimeException("");
					} 
					
				});
	}

	@Override
	public Mono<Void> deleteCurrentAccounts(String nroAccount) {
		// TODO Auto-generated method stub
		return repositorio.deleteById(nroAccount);
	}

	@Override
	public Mono<CurrentAccounts> updateCurrentAccounts(CurrentAccounts currentaccount) {
		// TODO Auto-generated method stub
		return repositorio.save(currentaccount);
	}

	@Override
	public Mono<CurrentAccounts> getCurrentAccountsNro(String Nro) {
		// TODO Auto-generated method stub
		return repositorio.findByNroAccount(Nro);
	}
	
	 
	
}
