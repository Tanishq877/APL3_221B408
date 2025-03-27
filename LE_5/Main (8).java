/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Beverage {
    private void pour(int qty) {
        System.out.println("Pour " + qty + " ml of beverage in a glass");
    }
    
    protected abstract void addCondiment();
    
    protected void stir() {
     
    }
    
    private void serve() {
        System.out.println("Serve through waiter");
    }
    
    public void templateMethod(int qty) {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}

class Whisky extends Beverage {
    @Override
    protected void addCondiment() {
        System.out.println("Add some ice");
    }
    
    @Override
    public void stir() {
        System.out.println("Stir for 30 seconds");
    }
}

class Beer extends Beverage {
    @Override
    protected void addCondiment() {
        System.out.println("Nothing");
    }
}
class Main {
    public static void main(String[] args) {
        Beverage b = new Whisky();
        b.templateMethod(30);
        
        b = new Beer();
        b.templateMethod(200);
    }
}
