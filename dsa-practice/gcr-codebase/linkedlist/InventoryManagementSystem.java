class Item {
	private int itemId;
	private String itemName;
	private int quantity;
	private double price;
	private Item next;

	public Item(int itemId, String itemName, int quantity, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public void setNext(Item next) {
		this.next = next;
	}

	public Item getNext() {
		return this.next;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

public class InventoryManagementSystem {
	private Item head;
	private Item tail;

	public void addAtFront(Item item) {
		item.setNext(head);
		head = item;
		if (tail == null) {
			tail = item;
		}
	}

	public void addAtLast(Item item) {
		if (tail == null) {
			addAtFront(item);
			return;
		}
		tail.setNext(item);
		tail = item;
	}

	public void addAtPosition(Item item, int position) {
		if (position <= 1 || head == null) {
			addAtFront(item);
			return;
		}

		Item temp = head;
		int count = 1;

		while (temp.getNext() != null && count < position - 1) {
			temp = temp.getNext();
			count++;
		}

		item.setNext(temp.getNext());
		temp.setNext(item);

		if (item.getNext() == null) {
			tail = item;
		}
	}

	public void removeItem(int itemId) {
		if (head == null) {
			return;
		}

		if (head.getItemId() == itemId) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
			return;
		}

		Item prev = head;
		Item curr = head.getNext();

		while (curr != null) {
			if (curr.getItemId() == itemId) {
				prev.setNext(curr.getNext());
				if (curr == tail) {
					tail = prev;
				}
				return;
			}
			prev = curr;
			curr = curr.getNext();
		}
	}

	public void updateQuantity(int itemId, int newQuantity) {
		Item item = searchById(itemId);
		if (item != null) {
			item.setQuantity(newQuantity);
		}
	}

	public Item searchById(int itemId) {
		Item temp = head;
		while (temp != null) {
			if (temp.getItemId() == itemId) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void searchByName(String name) {
		Item temp = head;
		while (temp != null) {
			if (temp.getItemName().equals(name)) {
				printItem(temp);
			}
			temp = temp.getNext();
		}
	}

	public void displayTotalValue() {
		double total = 0;
		Item temp = head;

		while (temp != null) {
			total += temp.getPrice() * temp.getQuantity();
			temp = temp.getNext();
		}

		System.out.println("Total Inventory Value: " + total);
	}

	public void sortByName(boolean ascending) {
		if (head == null) {
			return;
		}

		Item i = head;
		while (i != null) {
			Item j = i.getNext();
			while (j != null) {
				int cmp = i.getItemName().compareTo(j.getItemName());
				if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
					swapData(i, j);
				}
				j = j.getNext();
			}
			i = i.getNext();
		}
	}

	public void sortByPrice(boolean ascending) {
		if (head == null) {
			return;
		}

		Item i = head;
		while (i != null) {
			Item j = i.getNext();
			while (j != null) {
				if ((ascending && i.getPrice() > j.getPrice()) || (!ascending && i.getPrice() < j.getPrice())) {
					swapData(i, j);
				}
				j = j.getNext();
			}
			i = i.getNext();
		}
	}

	public void displayItems() {
		Item temp = head;
		while (temp != null) {
			printItem(temp);
			temp = temp.getNext();
		}
	}

	private void swapData(Item a, Item b) {
		String name = a.getItemName();
		int id = a.getItemId();
		int qty = a.getQuantity();
		double price = a.getPrice();

		a.setItemName(b.getItemName());
		a.setItemId(b.getItemId());
		a.setQuantity(b.getQuantity());
		a.setPrice(b.getPrice());

		b.setItemName(name);
		b.setItemId(id);
		b.setQuantity(qty);
		b.setPrice(price);
	}

	private void printItem(Item item) {
		System.out.println("Item ID: " + item.getItemId() + ", Name: " + item.getItemName() + ", Quantity: "
				+ item.getQuantity() + ", Price: " + item.getPrice());
	}

	public static void main(String[] args) {
		InventoryManagementSystem inventory = new InventoryManagementSystem();
		inventory.addAtFront(new Item(1, "Laptop", 5, 55000));
		inventory.addAtLast(new Item(2, "Mouse", 2, 500));
		inventory.addAtLast(new Item(3, "Keyboard", 10, 1500));
		inventory.addAtPosition(new Item(4, "Monitor", 7, 12000), 2);
		System.out.println("All Items:");
		inventory.displayItems();
		System.out.println("Updating quantity of Mouse:");
		inventory.updateQuantity(2, 15);
		inventory.displayItems();
		System.out.println("Search item");
		inventory.searchByName("Keyboard");
		System.out.println("Total Inventory Value");
		inventory.displayTotalValue();
		inventory.sortByName(true);
		inventory.displayItems();
		inventory.sortByPrice(false);
		inventory.displayItems();
		System.out.println("Removing item");
		inventory.removeItem(1);
		inventory.displayItems();
	}
}