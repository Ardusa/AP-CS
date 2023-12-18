public class Customer {
    private double totalPurchases, discount;

    public Customer() {
        totalPurchases = 0;
        discount = 0;
    }

    public void makePurchase(double amount) {
        totalPurchases += amount;
        if (totalPurchases >= 100) {
            discount += 10;
            totalPurchases -= 100;
        }
    }

    public boolean discountReached() {
        return discount > 0;
    }

    public double getDiscount() {
        return discount;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Purchase: 95");
        customer.makePurchase(95);
        System.out.println("Discount reached: " + customer.discountReached());
        System.out.println("Discount: " + customer.getDiscount());
        System.out.println("Purchase: 10");
        customer.makePurchase(10);
        System.out.println("Discount reached: " + customer.discountReached());
        System.out.println("Discount: " + customer.getDiscount());
    }
}