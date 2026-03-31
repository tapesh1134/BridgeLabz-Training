
public class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, String transportRating, float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }

    @Override
    public String VehicleSelection() {
        if (brickQuantity <= 300) {
            return "Truck";
        } else if (brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    @Override
    public float CalculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = (float) (price * 0.3);
        float VehiclePrice;
        if (VehicleSelection().equals("Truck")) {
            VehiclePrice = 1000;
        } else if (VehicleSelection().equals("Lorry")) {
            VehiclePrice = 1700;
        } else {
            VehiclePrice = 3000;
        }
        float discountPercentage;
        if (transportRating.equals("5")) {
            discountPercentage = 20;
        } else if (transportRating.equals("3") || transportRating.equals("2")) {
            discountPercentage = 10;
        } else {
            discountPercentage = 0;
        }
        float discount = (float) (price * discountPercentage / 100);
        float totalCharge = (price + VehiclePrice + tax) - discount;
        return totalCharge;
    }
}
