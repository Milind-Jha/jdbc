package comparableuse;

public class MySystem {

    int a = 1;
    public int b = 2;
    protected int c = 3;
    static int d = 1;
    static public int e = 1;
    static protected int f = 1;

    void defaultmethod(){
        System.out.println("defaultmethod");
    }

    public  void publicmethod(){
        System.out.println("publicmethod");
    }
    protected  void protectedmethod(){
        System.out.println("protectedmethod");
    }
    static void sdefaultmethod(){
        System.out.println("static default");
    }

    static public  void spublicmethod(){
        System.out.println("static public");
    }
    static protected  void sprotectedmethod(){
        System.out.println("static protected");
    }
}
//                            Access, Inheritance & Overriding:-

//                                   Access (STATIC MEMBER)
//  outside package access (no extends) - public only
//  outside package access (extends)    - public , protected(ONLY DIFFRENCE) BUT not default
//  same package access (no extends)    - public, protected and default
//  same package access (extends)       - public, protected and default

//                                  Access (NON-STATIC MEMBER)
//  (NO EXTEND <-:-> NO Inheritance)
//  outside package access (no extends) - public only
//  outside package access (extends)    - public only , [[[ protected NON-STATIC method cannot be accessed
//                                                      directly but can be overriden and defined as
//                                                              {super.protectedmethod();}
//                                                      and accessed in main function via creation
//                                                      the object of child class
//                                                      i.e. not in the same packege ]]]
//  same package access (no extends)  - public, protected and default
//  same package access (extends)     - public, protected and default

                        //Inheritance  (NO EXTEND <-:-> NO Inheritance)
//   [Inherits means can use parent class variable/method when called in main method although it does not
//   have it actually inside its body]

                            // STATIC / NON STATIC (EXACTLY SAME)
//  outside package inherits (extends)   - public only
//  same package  - public, protected and default


                           // OVERRIDE (NO EXTEND <-:-> NO OVERRIDE)
// NON STATIC METHOD
//  outside package - public , protected BUT not default
//  same package  - public, protected and default

// STATIC METHOD - NONE




