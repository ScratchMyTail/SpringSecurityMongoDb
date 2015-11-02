package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by christerhansen on 16.10.15.
 */
public interface BrukerRepository extends MongoRepository<Bruker, String> {
    public Bruker findByBrukernavn(String brukernavn);
}
