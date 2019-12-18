package com.springwebflux.bootcamp.service.currentaccounts.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springwebflux.bootcamp.service.currentaccounts.app.model.CurrentAccounts;
 
import reactor.core.publisher.Mono;

@Repository
public interface IcurrentAccountRepository extends ReactiveMongoRepository<CurrentAccounts, String> {

	Mono<CurrentAccounts> findByNroAccount(String NroAccount);
	Mono<Void> deleteByNroAccount(String NroAccount);
}
