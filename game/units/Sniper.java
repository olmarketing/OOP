package org.game.units;

public class Sniper extends Shooter {
    public Sniper(String name){
        super(100,name,1,6,50,new int[]{6,12}, 10, 30);

    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }
}


