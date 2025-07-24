public class Discount{
    public static void main(String[] args) {
        double amount = 12000;
        boolean isMember = true;

        double discount = 0;

        if (isMember) {
            if (amount >= 10000) {
                discount = amount * 0.3; // 30% discount
            } else if (amount >= 5000) {
                discount = amount * 0.2; // 20% discount
            }
        } else {
            discount = amount * 0.05; // 5% discount for non-members
        }

        double finalPrice = amount - discount;

        System.out.println("Amount: " + amount);
        System.out.println("Discount amount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }
}
