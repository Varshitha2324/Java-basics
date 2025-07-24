public class main{
    public static void main(String[]args){
        String sname="Dec";
        switch(sname){
            case "Jan","Feb","Mar"->{
            System.out.println("Winter");
            }
            case "Apr","May","Jun"->{
            System.out.println("summer");
            }
            case "Jul","Aug","Sep"->{
            System.out.println("rainy");
            }
            case "Oct","Nov","Dec"->{
            System.out.println("monsoon");
            }
            default->{
                System.out.println("Enter valid Season name");
            }          
        }
    }
