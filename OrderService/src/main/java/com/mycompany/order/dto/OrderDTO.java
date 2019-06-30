package com.mycompany.user.dto;

public class UserDTO {

    private Long id;
    private String userName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id,String userName,String password){
        this.id=id;
        this.userName=userName;
        this.password=password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}