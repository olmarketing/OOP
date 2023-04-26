package org.game.units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name){
        super(100,name,1,6,5,new int[]{8,14},"Арбалетчик",60,25);

    }

    @Override
    public String getInfo() {
        return "Я арбалетчик";
    }
}
