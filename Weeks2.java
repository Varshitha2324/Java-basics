// A java program that prints respective weekday or weekend according to the day using switch case 

public class Main{
    public static void main(String[]args){
        String wname="Sat";
        switch(wname){
            case "Mon","Tue","Wed","Thu","Fri"->
            System.out.println("Weekdays");
            case "Sat","Sun"->
            System.out.println("Weekend");
            default->
            System.out.println("Enter valid day");
        }
    }
}

