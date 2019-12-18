package com.springwebflux.bootcamp.service.currentaccounts.app.services;

import com.springwebflux.bootcamp.service.currentaccounts.app.model.CurrentAccounts;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IcurrentAccountService {

	Flux<CurrentAccounts>getCurrentAccounts();
	
	Mono<CurrentAccounts>createCurrentAccounts(CurrentAccounts currentaccount);
	
	Mono<Void>deleteCurrentAccounts(String nroAccount);
	
	Mono<CurrentAccounts>updateCurrentAccounts(CurrentAccounts currentaccount);
	
	Mono<CurrentAccounts>getCurrentAccountsNro(String Nro);
	
}
