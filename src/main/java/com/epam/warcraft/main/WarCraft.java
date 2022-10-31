package com.epam.warcraft.main;


import com.epam.warcraft.entity.*;


public class WarCraft {
    public static void main(String[] args) {
        Humans humans1 =new Humans(123,10,5);
        Humans humans2 =new Humans(124,10,5);
        Humans humans3 =new Humans(125,10,5);
        Humans humans4 =new Humans(126,10,5);
        Humans humans5 =new Humans(127,10,5);
        NightElfs nightElfs1=new NightElfs(221,12,6);
        NightElfs nightElfs2=new NightElfs(221,12,6);
        NightElfs nightElfs3=new NightElfs(221,12,6);
        NightElfs nightElfs4=new NightElfs(221,12,6);
        Orcs orc1=new Orcs(331,14,4);
        Orcs orc2=new Orcs(331,14,4);
        Orcs orc3=new Orcs(331,14,4);
        Orcs orc4=new Orcs(331,14,4);
        Undead undead1=new Undead(441,7,5);
        Undead undead2=new Undead(441,7,5);
        Undead undead3=new Undead(441,7,5);
        Undead undead4=new Undead(441,7,5);
        Humans anduinLotar=new Humans(111,20,10);
        NightElfs illidan=new NightElfs(222,15,17);
        Orcs thrall=new Orcs(333,25,7);
        Undead archimond=new Undead(444,18,14);
        UnitComposite humansArmy=new UnitComposite();
        UnitComposite orcsArmy=new UnitComposite();
        UnitComposite nightElfsArmy=new UnitComposite();
        UnitComposite undeadArmy=new UnitComposite();
        humansArmy.add(humans1);
        humansArmy.add(humans2);
        humansArmy.add(humans3);
        humansArmy.add(humans4);
        humansArmy.add(humans5);
        nightElfsArmy.add(nightElfs1);
        nightElfsArmy.add(nightElfs2);
        nightElfsArmy.add(nightElfs3);
        nightElfsArmy.add(nightElfs4);
        orcsArmy.add(orc1);
        orcsArmy.add(orc2);
        orcsArmy.add(orc3);
        orcsArmy.add(orc4);
        undeadArmy.add(undead1);
        undeadArmy.add(undead2);
        undeadArmy.add(undead3);
        undeadArmy.add(undead4);
        UnitComposite alliance=new UnitComposite();
        UnitComposite scourge=new UnitComposite();
        alliance.add(humansArmy);
        alliance.add(nightElfsArmy);
        scourge.add(orcsArmy);
        scourge.add(undeadArmy);
        scourge.attack(alliance);
        System.out.println(alliance);










    }
}
