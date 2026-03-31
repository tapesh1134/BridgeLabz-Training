
public class ParcelTracker {
	private StageNode head;

	public void addStage(String stage) {
		StageNode newStage = new StageNode(stage);
		if (head == null) {
			head = newStage;
			return;
		}
		StageNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStage;
	}

	public void addCheckpointAfter(String checkPoint, String stage) {
		StageNode temp = head;
		while (temp != null && !temp.stage.equals(checkPoint)) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Stage not found");
		}
		StageNode newStage = new StageNode(stage);
		newStage.next = temp.next;
		temp.next = newStage;
	}

	public void trackParcel() {
		if (head == null) {
			System.out.println("No parcel data");
			return;
		}

		StageNode temp = head;
		while (temp.next != null) {
			System.out.print(temp.stage + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.stage);
	}

	public void deliveryStatus() {
		StageNode temp = head;
		while (temp != null) {
			if (temp.stage.equals("Delivered")) {
				System.out.println("Delivered Successfully");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Parcel is lost or not delivered");
	}
}
