/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Juet
{
    int a;
    String n;
   
    public void setAge(int age){
      a=age;  
    }
    public int getAge(){
    return a;
       
    }
    public void setName(String name){
        n=name;
    }
    public String getName()
    {return n;}
    }
   
public class Main{
    public static void main(String[] args)
    {Juet j=new Juet();
    j.setAge(18);
    j.setName("Hero");
    String m=j.getName();
   System.out.println(m);
   int l= j.getAge();
        System.out.println(l);
    }
}
