package com.propensi.sikpi.repository;

import com.propensi.sikpi.model.TemplatePenilaian;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplatePenilaianDb extends JpaRepository<TemplatePenilaian, Long>{
    

}
