package com.example.springprojeto.projetointegrador4;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
