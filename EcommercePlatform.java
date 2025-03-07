public class EcommercePlatform {
    public static void main(String[] args) {
        FurnitureItem chair = new FurnitureItem("Chair", 5.0, 0.0, 0.0);
        FurnitureItem table = new FurnitureItem("Table", 0.0, 10.0, 0.0);
        FurnitureItem sofa = new FurnitureItem("Sofa", 0.0, 0.0, 20.0);

        ShippingCostCalculator shippingCalculator = new FurnitureShipping();
        PackagingCostCalculator packagingCalculator = new FurniturePackaging();

        double distance = 50.0; // Example distance

        System.out.println("Shipping cost for chair: ₱" + chair.accept(shippingCalculator, distance));
        System.out.println("Packaging cost for chair: ₱" + chair.accept(packagingCalculator));

        System.out.println("\nShipping cost for table: ₱" + table.accept(shippingCalculator, distance));
        System.out.println("Packaging cost for table: ₱" + table.accept(packagingCalculator));

        System.out.println("\nShipping cost for sofa: ₱" + sofa.accept(shippingCalculator, distance));
        System.out.println("Packaging cost for sofa: ₱" + sofa.accept(packagingCalculator));
    }
}
