package org.game.units;


import java.util.ArrayList;

public class Mage extends BaseHero{
    protected int mana;

    public Mage(String name){
        super(100,name,1,6,15,new int[]{3,15});
        mana=100;
//        spellsBook.add(new Spells("Фаербол"));
//        spellsBook.add(new Spells("Увеличение брони"));
//        spellsBook.add(new Spells("Увеличение урона"));
    }

    @Override
    public String getInfo() {
        return "Маг";
    }
}
