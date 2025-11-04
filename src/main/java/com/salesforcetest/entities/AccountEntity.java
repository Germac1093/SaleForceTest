package com.salesforcetest.entities;


import lombok.Data;


@Data
public class AccountEntity {
    private String accountName;
    private String phone;
    private String accountType;
    private String accountIndustry;
    private String website;
    private String description;
    private String employeesCount;
    private String newAccountName;
}
