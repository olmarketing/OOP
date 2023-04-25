package org.game.units;

import org.game.Spells;

import java.util.ArrayList;

public class Monk extends BaseHero{
    protected int mana;
    protected ArrayList<Spells> spellsBook;
    public Monk(String name){
        super(120,name,1,6,30,new int[]{5,8}, "Монах");
        mana=80;
//        spellsBook.add(new Spells("Фаербол"));
//        spellsBook.add(new Spells("Увеличение брони"));
//        spellsBook.add(new Spells("Увеличение урона"));
    }
}
