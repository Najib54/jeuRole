package com.company;

public class Main {

    public static void main(String[] args) {

        Joueurs player1 = new Joueurs("Joe", 38, 540);
        Joueurs player2 = new Joueurs("Donald", 10, 375);

        System.out.println("Name : " + player1.getName());
        System.out.println("Health : " + player1.getHealth());

        System.out.println("Name : " + player2.getName());
        System.out.println("Health : " + player2.getHealth());

        while (player2.getHealth() > player1.getPower() && player1.getHealth() > player2.getPower()) {
            System.out.println(player1.maMethodeAttack(player2));
            System.out.println("Health : " + player2.health);

            System.out.println(player2.maMethodeAttack(player1));
            System.out.println("Health : " + player1.health);
        }


    }
}

default:
    