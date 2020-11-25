package com.company;

import java.util.Random;

public class Joueurs {

    String name;
    double power;
    double health;

    Joueurs(String name, double power, double health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

/*    public void damage(double damage) {
        if (health > 0) {
            this.health = this.health - this.power;
            System.out.println(name + " a subit une attaque de " + damage + " points par " + name);
        } else {
            System.out.println(name + " est mort");
        }
    }*/

    public String maMethodeAttack(Joueurs joueur) {

        if (dodge() > 7) {
            if (joueur.health > 0) {
                joueur.health -= this.power;
                return this.name + " attaques " + joueur.name + " ||| : il reste " + joueur.health + " PV à " + joueur.name;
            } else {
                return joueur.name + " est mort";
            }
        } else {
            return "attaque esquivée";
        }
    }


    public int dodge () {
        Random rand = new Random();
        int r = rand.nextInt(10);
        return r;
    }
}
