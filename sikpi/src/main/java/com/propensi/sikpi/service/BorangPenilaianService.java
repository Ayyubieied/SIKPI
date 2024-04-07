package com.propensi.sikpi.service;

import com.propensi.sikpi.model.Dokumen;
import com.propensi.sikpi.model.UserModel;

import java.util.*;

public interface BorangPenilaianService{
    void handleConnection(Long idUser, Long idBorang, String borangType);
}
