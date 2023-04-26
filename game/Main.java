package org.game;

import org.game.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch(new Random().nextInt(7 )){
                case 0:
                    heroes.add(new Sniper(getName()));
                    break;
                case 1:
                    heroes.add(new Crossbowman(getName()));
                    break;
                case 2:
                    heroes.add(new Mage(getName()));
                    break;
                case 3:
                    heroes.add(new Monk(getName()));
                    break;
                case 4:
                     heroes.add(new Spearman(getName()));
                     break;
                case 5:
                     heroes.add(new Thief(getName()));
                     break;
                default:
                     heroes.add(new Farmer(getName()));
                     break;
            }
        }


        heroes.forEach(n ->System.out.println(n.name + " " + n.getInfo()));


    }
    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}
