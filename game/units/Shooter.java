package org.game.units;

public abstract class Shooter extends BaseHero {
    int arrows;
    int accuracy;


    public Shooter(int hp, String name, int x, int y, int armor, int[] damage, String className, int arrows, int accuracy) {
        super(hp, name, x, y, armor, damage, className);
    this.arrows=arrows;
    this.accuracy=accuracy;
    }

}
