public class Datatypes{
    public static void main(String[]args){
        //Primitive data types
        byte a=127;
        System.out.println(a);
        byte b=-128;// byte ranges from -128 to 127
        System.out.println(b);
        short c=-32742;// short ranges from -32768 to 32767
        System.out.println(c);
        char ch='a';
        System.out.println(ch);
        int d=2147483647;// int ranges from -2,147,483,648 to 2,147,483,647
        System.out.println(d);
        long e=512344567898L;//long ranges beyond any value of int range 
        System.out.println(e);
        float f=3.1234567897F;// float only accepts upto 6 decimals ,7th value is rounded 
        System.out.println(f);
        double g= 10.2334589727409728D; // double accepts upto 15 decimals,15th decimal is rounded if value exceeds
        System.out.println(g);
        boolean h=false;
        System.out.println(h);
        boolean i=10>(7*2);
        System.out.println(i);
         boolean j=100>(7*2);
        System.out.println(j);
    }
}