package com.Ez.JobSearch.JobSearch.Repositories;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Ez.JobSearch.JobSearch.model.ClientCV;

@Repository
public interface ClientCVRepository extends MongoRepository<ClientCV, String>{
	
	
	
}
