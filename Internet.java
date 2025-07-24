import java.util.Scanner;
public class Internet{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your current plan (Basic/Standard): ");
        String current_plan = s.next();
        System.out.print("Enter your usage in GB: ");
        double usage = s.nextDouble();
        String suggested_plan = "";
        if (current_plan.equalsIgnoreCase("Basic")) {
            if (usage > 500) {
                suggested_plan = "Premium";
            } 
            else {
                suggested_plan = "Continue with Basic";
            }
        } else if (current_plan.equalsIgnoreCase("Standard")) {
            if (usage > 1000) {
                suggested_plan = "Ultra";
            } 
            else {
                suggested_plan = "Continue with Standard";
            }
        } else {
            System.out.println("Continue with same plan");
        }
        System.out.println("Current Plan: " + current_plan);
        System.out.println("Usage: " + usage + " GB");
        System.out.println("Suggested Plan: " + suggested_plan);
    }
}
