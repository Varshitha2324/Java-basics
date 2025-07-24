// A java program that prints respective season according to the month using switch case and yield keyword(which is used to return a value)

public class Main {
    public static void main(String[] args) {
        String sname = "Dec";
        String season = switch (sname) {
            case "Jan", "Feb", "Mar" -> {
                yield "Winter";
            }
            case "Apr", "May", "Jun" -> {
                yield "Summer";
            }
            case "Jul", "Aug", "Sep" -> {
                yield "Rainy";
            }
            case "Oct", "Nov", "Dec" -> {
                yield "Monsoon";
            }
            default -> {
                yield "Enter valid Season name";
            }
        };
        System.out.println(season);
    }
}
