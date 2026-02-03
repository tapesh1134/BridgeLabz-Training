
public class LibraryUser implements Observer {

    private String name;

    LibraryUser(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + " notified → " + msg);
    }
}
