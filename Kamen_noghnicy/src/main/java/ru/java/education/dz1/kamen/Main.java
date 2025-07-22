package ru.java.education.dz1.kamen;

import java.util.Random;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

//        0 - камень
//        1 - ножницы
//        2 - бумага

        Player player_1 = new Player("Вася", random);
        Player player_2 = new Player("Петя", random);

        System.out.println(player_1.GetName() + " загадал: " + player_1.GetSecretName());
        System.out.println(player_2.GetName() + " загадал: " + player_2.GetSecretName());

        if(player_1.GetSecret() == player_2.GetSecret())
        {
            System.out.println("Ничья");
        }
        else {
            if(abs(player_2.GetSecret() - player_1.GetSecret()) == 1){
                if(player_2.GetSecret() > player_1.GetSecret())
                {
                    System.out.println("Выиграл " + player_1.GetName());
                }
                else {
                    System.out.println("Выиграл " + player_2.GetName());
                }
            }
            if(abs(player_2.GetSecret() - player_1.GetSecret()) == 2){
                if(player_2.GetSecret() > player_1.GetSecret())
                {
                    System.out.println("Выиграл " + player_2.GetName());
                }
                else {
                    System.out.println("Выиграл " + player_1.GetName());
                }
            }
        }
    }
}