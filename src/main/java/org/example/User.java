package org.example;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    User(){

    }
    User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean userLogin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vendosni emrin e userit");
        String name= sc.next();
        System.out.println("Vendosni passwordin");
        String password= sc.next();
        if (password.equalsIgnoreCase(this.password)){
            return true;
        }return false;
    }
}
