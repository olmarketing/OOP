package org.game.units;

public class Farmer extends BaseHero{
    public Farmer(String name){
        super(50,name,1,6,50,new int[]{2,4}, "Крестьянин");

    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }
}
