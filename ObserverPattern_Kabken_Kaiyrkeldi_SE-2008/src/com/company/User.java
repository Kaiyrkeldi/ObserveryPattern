package com.company;

import java.util.List;

public class User implements Observer{

    private String login;

    public User(String login){
        this.login = login;
    }

    @Override
    public void update(List<String> commits) {
        System.out.println("Dear " + login + "\nWe have some changes: \n"+ commits + "\n");
    }
}
