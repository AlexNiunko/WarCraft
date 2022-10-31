package com.epam.warcraft.entity;

import java.util.StringJoiner;


public class Humans extends AbstractUnit implements UnitComponent {


    public Humans(int ID, int healthPoint, int damage) {
        super(ID, healthPoint, damage);
    }

    @Override
    public void attack(AbstractUnit unit) {
        unit.setHealthPoint(unit.getHealthPoint() - getDamage());
        if (unit.getHealthPoint() <= 0) {
            unit.setCondition("Dead");
        }

    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public int damage() {
        return getDamage();
    }

    @Override
    public int healthPoint() {
        return getHealthPoint();
    }

}





