package com.interfaces;

interface Monster {
    void menace();
}

interface DangeroursMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangeroursMonster {
    public void menace() {

    }

    public void destroy() {

    }
}

interface Vampire extends DangeroursMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {

    }

    public void destroy() {

    }

    public void kill() {

    }

    public void drinkBlood() {

    }
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangeroursMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal lethal) {
        lethal.kill();
    }

    public static void main(String[] args) {
        DangeroursMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
