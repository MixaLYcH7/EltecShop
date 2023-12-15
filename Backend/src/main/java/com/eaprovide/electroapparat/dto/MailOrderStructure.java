package com.eaprovide.electroapparat.dto;

import lombok.Data;

import java.util.List;

@Data
public class MailOrderStructure {
    private List<String> price;
    private String surname;
    private String name;
    private String nameOfOrganization;
    private String inn;
    private String email;
    private String numberOfTelephone;
    private String address;
}
