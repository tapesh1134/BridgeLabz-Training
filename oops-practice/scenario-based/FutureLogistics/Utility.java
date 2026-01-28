
public class Utility {

    public GoodsTransport parseDetails(String input) {
        String[] details = input.split(":");
        GoodsTransport transport;
        if (details[3].equals("BrickTransport")) {
            transport = new BrickTransport(details[0], details[1], details[2], Float.parseFloat(details[4]), Integer.parseInt(details[5]), Float.parseFloat(details[6]));
        } else {
            transport = new TimberTransport(details[0], details[1], details[2], Float.parseFloat(details[4]), Float.parseFloat(details[5]), details[6], Float.parseFloat(details[7]));
        }
        return transport;
    }

    public boolean validateTransportId(String transportId) {
        String REGEX_TRANSPORT_ID = "^RTS{3}+[0-9]{3}+[a-z]{1}$";
        return transportId.matches(REGEX_TRANSPORT_ID);
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        return goodsTransport.getClass().getSimpleName();
    }
}
