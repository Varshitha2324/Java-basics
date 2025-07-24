// A java program that prints respective weekday or weekend according to the day using switch case and yield keyword

public class Main{
    public static void main(String[]args){
        String wname="Tue";
        String res=switch(wname){
            case "Mon","Tue","Wed","Thu","Fri"->{
            yield "Weekdays";
            }
            case "Sat","Sun"->{
            yield "Weekend";
            }
            default->{
            yield "Enter valid day";
            }
        };
        System.out.println(res);
    }
}
