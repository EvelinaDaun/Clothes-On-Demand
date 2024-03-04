package businessobject;

import java.util.ArrayList;
import java.util.List;

// Klass Order - Mall för att skapa upp order objekt med produkter kunder valt
public class Order {
    private int id = 0;
    private static int lastId = 0;
    private String name = "Order";

    // Listor för de olika produkterna kunden valt att lägga till i ordern
    private List<Pants> pantsOrders = new ArrayList<>();
    private List<TShirt> tshirtOrders = new ArrayList<>();
    private List<Skirt> skirtOrders = new ArrayList<>();

    private List<ProductInformation> productInformationList = new ArrayList<>();  // Lista med produktinformation som samlas in för att kunna skapa upp produkterna


    public Order() {
        this.id = ++lastId;
    }

    public Order(int id, String name, List<Pants> pantsOrders, List<TShirt> tshirtOrders, List<Skirt> skirtOrders, List<ProductInformation> productInformationList) {
        this.id = id;
        this.name = name;
        this.pantsOrders = pantsOrders;
        this.tshirtOrders = tshirtOrders;
        this.skirtOrders = skirtOrders;
        this.productInformationList = productInformationList;
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
        Order.lastId = lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pants> getPantsOrders() {
        return pantsOrders;
    }

    public void setPantsOrders(List<Pants> pantsOrders) {
        this.pantsOrders = pantsOrders;
    }

    public List<TShirt> getTshirtOrders() {
        return tshirtOrders;
    }

    public void setTshirtOrders(List<TShirt> tshirtOrders) {
        this.tshirtOrders = tshirtOrders;
    }

    public List<Skirt> getSkirtOrders() {
        return skirtOrders;
    }

    public void setSkirtOrders(List<Skirt> skirtOrders) {
        this.skirtOrders = skirtOrders;
    }

    public List<ProductInformation> getProductInformationList() {
        return productInformationList;
    }

    public void setProductInformationList(List<ProductInformation> productInformationList) {
        this.productInformationList = productInformationList;
    }

    // Metod: Lägga till ett produktinformations objekt i listan
    public void addProductInformationList(ProductInformation productInformation) {
        this.productInformationList.add(productInformation);
    }

    // Metod: Lägga till en pants beställning i ordern
    public void addPantsToList(Pants pants){
        pantsOrders.add(pants);
    }

    // Metod: Lägga till en TShirt beställning i ordern
    public void addTShirtToList(TShirt tshirt){
        tshirtOrders.add(tshirt);
    }

    // Metod: Lägga till en Skirt beställning i ordern
    public void addSkirtToList(Skirt skirt){
        skirtOrders.add(skirt);
    }

    @Override
    public String toString() {
        String returnString = ""; // Starta upp strängen som returneras

        // Lägga ihop till sträng -  pantsOrders
        if(!pantsOrders.isEmpty()){
            for(Pants p : pantsOrders){
                returnString = returnString + " " + p.toString() + "\n";
            }
        }

        // Lägga ihop till sträng -  tshirtOrders
        if(!tshirtOrders.isEmpty()){
            for(TShirt t : tshirtOrders){
                returnString = returnString + " " + t.toString() + "\n";
            }
        }

        // Lägga ihop till sträng -  skirtOrders
        if(!skirtOrders.isEmpty()){
            for(Skirt s : skirtOrders){
                returnString = returnString + " " + s.toString() + "\n";
            }
        }

        return returnString;
    }
}