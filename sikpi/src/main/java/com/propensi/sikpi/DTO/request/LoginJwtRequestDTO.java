package com.propensi.sikpi.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginJwtRequestDTO {
    private String username;
    private String name;
}
