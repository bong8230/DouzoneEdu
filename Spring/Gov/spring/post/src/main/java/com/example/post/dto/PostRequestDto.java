package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
    Json 예시
    {
        "account" : "bongje",
        "email" : "bong@aa.a",
        "address" : "서울 송파",
        "password" : "1234",
        "phone_number" : "010-1234-5678",
        "OPT" : "8989OPT",
    }
*/
public class PostRequestDto {
    private String account;
    private String email;
    private String address;
    private String password;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("OPT")
    private String OPT;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOPT() {
        return OPT;
    }

    public void setOPT(String OPT) {
        this.OPT = OPT;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", OPT='" + OPT + '\'' +
                '}';
    }
}
