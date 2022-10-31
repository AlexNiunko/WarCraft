package com.epam.warcraft.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class UnitComposite extends AbstractUnit implements UnitComponent {

    private List<AbstractUnit> unitComponents = new ArrayList<>();


    public void add(AbstractUnit unit) {
        unitComponents.add(unit);
    }

    public AbstractUnit getUnit(int i) {
        return unitComponents.get(i);
    }

    public List<AbstractUnit> getUnitComponents() {
        return unitComponents;
    }

    @Override
    public int count() {
        return (int) unitComponents.stream().count();
    }

    @Override
    public int damage() {
        return unitComponents.stream()
                .map(unit -> unit.getDamage())
                .reduce(0, (acc, x) -> acc + x);
    }

    @Override
    public int healthPoint() {
        return unitComponents.stream()
                .map(unit -> unit.getHealthPoint())
                .reduce(0, (acc, x) -> acc + x);
    }


    @Override
    public void attack(UnitComposite units) {
        int averageDamage = damage() / units.getUnitComponents().size();
        for (AbstractUnit unit : units.getUnitComponents()) {
            if (averageDamage > unit.getHealthPoint()) {
                unit.setHealthPoint(0);
                unit.setCondition("Dead");
                unit.setDamage(0);
            } else {
                unit.setHealthPoint(unit.getHealthPoint() - averageDamage);
            }
        }
    }

//    @Override
//    public void attack(List<UnitComposite> units) {
//        int averageDamageList=damage()/units.size();
//        for (UnitComposite list:units) {
//            int averageDamageUnit=averageDamageList/list.getUnitComponents().size();
//            for (AbstractUnit unitt: list.getUnitComponents()) {
//                if (averageDamageUnit > unitt.getHealthPoint()) {
//                    unitt.setHealthPoint(0);
//                    unitt.setCondition("Dead");
//                    unitt.setDamage(0);
//                } else {
//                    unitt.setHealthPoint(unitt.getHealthPoint() - averageDamageUnit);
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UnitComposite.class.getSimpleName() + "[", "]")
                .add("unitComponents=" + unitComponents)
                .toString();
    }
}
