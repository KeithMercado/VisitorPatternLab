public class FurnitureShipping implements ShippingCostCalculator {
    @Override
    public double visitFurnitureForShippingCost(FurnitureItem furniture, double distance) {
        switch (furniture.getType()) {
            case "Chair":
                return 350.0;
            case "Table":
                return 500.0 + (furniture.getDimension() * 0.05 * distance);
            case "Sofa":
                return 1250.0 + (furniture.getVolume() * 0.1 * distance);
            default:
                return 0.0;
        }
    }
}
