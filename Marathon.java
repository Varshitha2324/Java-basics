public class Marathon{
public static void main(String[]args){
int age=20;
boolean is_valid_certificate=true;
if(age>=18 && age<=45 && is_valid_certificate==true ){
System.out.println("Sunitha  can participlate in marathon");
}
else if(age <18 || age>45){
System.out.println("Participation not allowed");
}
else if(is_valid_certificate==false){
System.out.println("Participation denied");
}
else{
System.out.println(" Enter valid value");
}
}
}
 