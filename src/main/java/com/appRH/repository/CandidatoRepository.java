package com.appRH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.appRH.models.Vaga;
import com.appRH.models.Candidato;

public interface CandidatoRepository extends CrudRepository<Candidato, Long>{
    
    Iterable<Candidato>findByVaga(Vaga vaga);
    Candidato findByRg(String rg);
    Candidato findById(long id);
    List<Candidato>findByNomeCandidato(String nomeCandidato);
}
