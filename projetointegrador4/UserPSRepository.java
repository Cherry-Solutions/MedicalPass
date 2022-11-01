package com.example.springprojeto.projetointegrador4;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPSRepository extends MongoRepository<UserPlanoDeSaude, Integer> {
    UserPlanoDeSaude findByNumeroRegistro(Long numeroRegistro);
}
