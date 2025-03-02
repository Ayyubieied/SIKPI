package com.propensi.sikpi.repository;

import com.propensi.sikpi.model.IndeksKinerjaIndividu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IndeksKinerjaIndividuDb extends JpaRepository<IndeksKinerjaIndividu, Long>{
    
}
