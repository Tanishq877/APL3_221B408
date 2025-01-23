/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One {
    One(int x) {
        System.out.println("Constructor of One with value: " + x);
    }
}


class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Constructor of Two with value: " + x);
    }
}


public class Main {
    public static void main(String[] args) {
        One obj1 = new One(10); 
        Two obj2 = new Two(20); 
    }
}
