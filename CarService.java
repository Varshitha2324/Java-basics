public class CarService{
public static void main(String[]args){
int kms=25000;
System.out.println("Car Service Status");
if(kms>20000){
System.out.println("car needs full service");
}
else if(kms>=10000 && kms<20000){
System.out.println("car needs semi service");
}
else if(kms>0 && kms <10000){
System.out.println("car need general checkup");
}
else{
System.out.println("Enter positive value for kms");
}
}
}
