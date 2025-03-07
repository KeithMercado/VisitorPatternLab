public class FurnitureItem implements Furniture {
    private String type;
    private double weight;
    private double dimension;
    private double volume;

    public FurnitureItem(String type, double weight, double dimension, double volume) {
        this.type = type;
        this.weight = weight;
        this.dimension = dimension;
        this.volume = volume;
    }

    @Override
    public double accept(ShippingCostCalculator calculator, double distance) {
        return calculator.visitFurnitureForShippingCost(this, distance);
    }

    @Override
    public double accept(PackagingCostCalculator calculator) {
        return calculator.visitFurnitureForPackagingCost(this);
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getDimension() {
        return dimension;
    }

    public double getVolume() {
        return volume;
    }
}
