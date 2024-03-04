package businessobject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// Kladd Skirt - Mall för att skapa upp Skirt objekt
public class Skirt {
    private int id;
    private static int lastId = 0; // För att öka id för varje skapad Skirt
    private String name = "skirt";
    private String size;
    private double price = 230.40;
    private String material;
    private String color;
    private String waistline;
    private String pattern;
    private PropertyChangeSupport propertyChangeSupport; // Support för förändirngar
    private boolean inProduction; // Produkten är - påbörjad (true) eller klar (false)


    public Skirt(){
        this.id = ++lastId;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public Skirt(int id, String name, String size, double price, String material, String color, String waistline, String pattern, PropertyChangeSupport propertyChangeSupport, boolean inProduction) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.material = material;
        this.color = color;
        this.waistline = waistline;
        this.pattern = pattern;
        this.propertyChangeSupport = propertyChangeSupport;
        this.inProduction = inProduction;
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
        Skirt.lastId = lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        this.propertyChangeSupport = propertyChangeSupport;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean production) {
        boolean oldValue = inProduction; // Spara det gamla värdet
        this.inProduction = production; // Lägga till det nya värdet

        if(inProduction){
            this.propertyChangeSupport.firePropertyChange("Produkt tillverkas", oldValue, this.inProduction);
        }else{
            this.propertyChangeSupport.firePropertyChange("Produkten är klar", oldValue, this.inProduction);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return  " Id: " + id +
                ", Produkt Namn: " + name  +
                ", Storlek: " + size  +
                ", Pris: " + price +
                ", Material: " + material +
                ", Färg: " + color +
                ", Waistline: " + waistline +
                ", Mönster: " + pattern;
    }
}