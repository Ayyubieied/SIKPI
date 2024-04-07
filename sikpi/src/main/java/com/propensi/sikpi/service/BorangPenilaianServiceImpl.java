package com.propensi.sikpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.propensi.sikpi.model.BorangPenilaian;
import com.propensi.sikpi.model.Dokumen;
import com.propensi.sikpi.model.UserModel;
import com.propensi.sikpi.repository.BorangPenilaianDb;
import com.propensi.sikpi.repository.DokumenDb;
import com.propensi.sikpi.repository.UserDb;

@Service
public class BorangPenilaianServiceImpl implements BorangPenilaianService {

    @Autowired
    private BorangPenilaianDb borangPenilaianDb;

    @Autowired
    private UserDb userDb;

    public void handleConnection(Long idUser, Long idBorang, String borangType) {
        UserModel user = userDb.findById(idUser).get();
        BorangPenilaian borang = borangPenilaianDb.findById(idBorang).get();
        List <UserModel> listUser = userDb.findByDivisi(user.getDivisi());

        if(borangType.equals("IKI")) {
            //todo

        }
        else if(borangType.equals("IKU")) {
            //todo
        }
        else if(borangType.equals("Norma")) {
            //todo
        }
    }

}
