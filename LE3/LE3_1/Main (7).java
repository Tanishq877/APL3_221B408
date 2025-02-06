/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav is fighting");
    }

    @Override
    void obey() {
        System.out.println("Pandav is obedient");
    }

    @Override
    void kind() {
        System.out.println("Pandav is kind");
    }
}

class Arjun extends Pandav {
}

class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Bheem is less kind");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav is fighting");
    }

    @Override
    void obey() {
        System.out.println("Kaurav is disobedient");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel");
    }
}

class Duryodhan extends Kaurav {
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn is obedient");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind");
    }
}

public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
