
public class Tracker {
	public static void main(String[] args) {
		ParcelTracker parcelTracker = new ParcelTracker();
		parcelTracker.addStage("Ordered");
		parcelTracker.addCheckpointAfter("Ordered", "Packed");
		parcelTracker.addStage("Shipped");
		parcelTracker.addCheckpointAfter("Shipped", "On Way");
		parcelTracker.addStage("Delivered");
		parcelTracker.trackParcel();
		parcelTracker.deliveryStatus();
	}
}
