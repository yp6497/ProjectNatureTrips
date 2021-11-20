package com.example.projectnaturetrips;

public class User {

    private String UsID;
    private String Email;
    private String Password;


    public User(String Email, String Password, String UsID){

        this.UsID= UsID;
        this.Email= Email;
        this.Password= Password;

    }

    public User(String emailS, String passwordS) {
    }

    //public Users(EditText Email, EditText Password) {
    //}
}
