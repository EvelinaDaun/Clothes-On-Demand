package businessobject;

// Klass Customer - Mall för kund objekt.
public class Customer {
    private int id = 0;
    private static int lastId = 0;
    private String name;
    private String email;
    private String address;


    public Customer(){
    }

    public Customer(String name, String email, String address) {
        this.id = ++lastId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Customer.lastId = lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Kundinformation" +
                "\n * Id: " + id +
                "\n * Namn: " + name +
                "\n * Email: " + email +
                "\n * Address: " + address;
    }
}