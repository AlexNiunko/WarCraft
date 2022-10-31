package com.epam.warcraft.entity;

import java.util.List;
import java.util.StringJoiner;

abstract class AbstractUnit {
    private int ID;
    private int healthPoint;
    private int damage;
    private String condition;

    public AbstractUnit(int ID, int healthPoint, int damage) {
        this.ID = ID;
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.condition = "Alive";
    }

    public AbstractUnit() {
    }


    public void attack(AbstractUnit unit) {

    }

    public void attack(UnitComposite units) {

    }

    public void attack(List<UnitComposite> units) {

    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AbstractUnit.this.getClass().getName().substring(25) + "[", "]")
                .add("ID=" + ID)
                .add("healthPoint=" + healthPoint)
                .add("damage=" + damage)
                .add("condition=" + condition)
                .toString();
    }
}
