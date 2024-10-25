package com.fabianamongosaberpro.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fabianamongosaberpro.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {

}
