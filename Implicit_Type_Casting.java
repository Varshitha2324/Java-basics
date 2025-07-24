// Type Casting in Java
class Implicit_Type_Casting{
    public static void main(String[]args){
        //Implicit type conversion or Widening Or Upcasting
        // conversion from smaller datatype to large data type 
        // order is : byte-> short->char->int->long->float->double
        byte a=10;
        short b=a;
        System.out.println(a);
        System.out.println(b);
        short c=1000;
        int d=c;
        System.out.println(c);
        System.out.println(d);
        char e='g';
        int f=e;
        System.out.println(e);
        System.out.println(f);
        int g=10;
        float h=g;
        System.out.println(g);
        System.out.println(h);
        float i=10.3f;
        double j=i;
        System.out.println(i);
        System.out.println(j);
        
    }
}


