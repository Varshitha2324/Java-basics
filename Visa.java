public class Visa{
public static void main(String[]args){
int age=25;
boolean valid_passport=true;
if(age>=18 && valid_passport==true){
System.out.println("visa application is accepted");
}
else if(age>=18 && valid_passport==false){
System.out.println("visa application is rejected");
}
else if(age<18 &&age>0){
System.out.println("visa not allowed");
}
else{
System.out.println("age value should be positive");
}
}
}