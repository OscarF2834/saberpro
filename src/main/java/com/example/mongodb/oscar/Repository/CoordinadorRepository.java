package com.example.mongodb.oscar.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.oscar.Entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String>{ 
	Coordinador findByUser(String user);
}

