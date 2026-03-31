
public abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected String transportRating;

    public GoodsTransport(String transportId, String transportDate, String transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportDate(String transportDate) {
        this.transportDate = transportDate;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public void setTransportRating(String transportRating) {
        this.transportRating = transportRating;
    }

    public String getTransportRating() {
        return transportRating;
    }

    public abstract String VehicleSelection();

    public abstract float CalculateTotalCharge();
}
