package com.appRH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.appRH.models.Candidato;
import com.appRH.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, Long>{
    Vaga findByCodigo(long codigo);
}
