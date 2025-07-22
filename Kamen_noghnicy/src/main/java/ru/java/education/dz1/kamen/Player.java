package ru.java.education.dz1.kamen;

import java.util.Random;

public class Player {
    public Player(String name, Random random){
        name_ = name;

        secret_ = random.nextInt(3);
    }
    public int GetSecret()
    {
        return secret_;
    }
    public String GetName(){
        return name_;
    }
    public String GetSecretName()
    {
        switch (secret_){
            case 0: return "камень";
            case 1: return "ножницы";
            case 2: return "бумага";
            default: return "";
        }
    }

    private String name_;
    private int secret_;
}
