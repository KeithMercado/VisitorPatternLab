public class FurniturePackaging implements PackagingCostCalculator {
    @Override
    public double visitFurnitureForPackagingCost(FurnitureItem furniture) {
        switch (furniture.getType()) {
            case "Chair":
                return 40.0;
            case "Table":
                return 75.0 + (furniture.getDimension() * 0.02);
            case "Sofa":
                return 180.0 + (furniture.getVolume() * 0.05);
            default:
                return 0.0;
        }
    }
}
