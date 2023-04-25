package org.game;

import org.game.units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes=new ArrayList<>();
        heroes.add(new Sniper("Ольга"));
        heroes.add(new Crossbowman("Алексей"));
        heroes.add(new Mage("Олег"));
        heroes.add(new Monk("Дмитрий"));
        heroes.add(new Spearman("Ярослав"));
        heroes.add(new Thief("Роман"));


        heroes.forEach(n ->System.out.println(n));
    }
}