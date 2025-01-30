/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Roar");
    }
}

class Voice {
    Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

