public interface Furniture {
    double accept(ShippingCostCalculator calculator, double distance);
    double accept(PackagingCostCalculator calculator);
}
