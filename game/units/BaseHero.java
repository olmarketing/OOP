package org.game.units;

import org.game.weapons.Weapons;

public abstract class BaseHero implements GameInterface {
    public String name;
    public String className;
    protected int x;
    protected int y;
    protected int hp;
    protected int maxhp;

    protected int armor;
    protected int[] damage;

    protected Weapons weapon;
@Override
    public String toString(){
        return name+" "+hp+" "+armor+" "+weapon+" "+className;
    }

    public BaseHero(int hp, String name, int x, int y, int armor,int[] damage,String className) {
        this.hp = this.maxhp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.className = className;
    }

    protected int getInt(){
        return 1;
        }

    @Override
    public void  step(){}

    @Override
    public String getInfo() {
        return "";
    }
}


