
public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, String transportRating, float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    @Override
    public String VehicleSelection() {
        float area = (float) (3.147 * timberRadius * timberLength);
        if (area <= 250) {
            return "Truck";
        } else if (area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    @Override
    public float CalculateTotalCharge() {
        float VehiclePrice;
        if (VehicleSelection().equals("Truck")) {
            VehiclePrice = 1000;
        } else if (VehicleSelection().equals("Lorry")) {
            VehiclePrice = 1700;
        } else {
            VehiclePrice = 3000;
        }
        float volume = (float) (3.147 * timberRadius * timberRadius * timberLength);
        float timberTypeDecimal = (float) 0.15;
        if (timberType.equals("Premium")) {
            timberTypeDecimal = (float) 0.25;
        }
        float price = volume * timberPrice * timberTypeDecimal;
        float tax = (float) (price * 0.3);
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
