package com.propensi.sikpi.model;

import java.util.List;

import jakarta.persistence.Column;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manajer extends UserModel {
    // @Column(name="list_karyawan", nullable=false)
    // private List<Karyawan> listKaryawan;

    @Column(name = "kepalaUnit", nullable = true)
    private Long kepalaUnit;
}
