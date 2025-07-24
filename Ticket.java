public class Ticket{
public static void main(String[]args){
boolean isWeekday=true;
boolean is_VIP_Seat=false;
System.out.println("Movie Ticket Booking");
if(isWeekday==false && is_VIP_Seat==true){
System.out.println("Ticket Price is: Rs.500");
}
else if(isWeekday==false && is_VIP_Seat==false){
System.out.println("Ticket Price is: Rs.300");
}
else if(isWeekday==true && is_VIP_Seat==true){
System.out.println("Ticket Price is: Rs.400");
}
else if(isWeekday==true && is_VIP_Seat==false){
System.out.println("Ticket Price is: Rs.200");
}
}
}