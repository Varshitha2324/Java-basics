// Explicit type conversion or Narrowying or Downcasting
class Explicit_Type_Casting{
    public static void main(String[]args){
        // it is conversion of larger to smaller 
        //order is : double->float->long->int->char->short->byte
        short a=888;
        byte b=(byte)a;// here conversion will done but due to less memory data loss will happen
        System.out.println(a);
        System.out.println(b);
        int e=93;
        char f=(char)e;
        System.out.println(e);
        System.out.println(f);
        int c=88;
        char d=(char)c;
        System.out.println(c);
        System.out.println(d);
        float g=88.3f;
        char h=(char)a;
        System.out.println(g);
        System.out.println(h);
        double i=3.796758;
        int j=(int)i;
        System.out.println(i);
        System.out.println( j);
        double k=3.123456789023;
        float l=(float)k;// here the output gets only 6 digits as float range values and the next decimal rounds up
        System.out.println(k);
        System.out.println(l);
        
    }
}
