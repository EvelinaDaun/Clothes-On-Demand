package businessobject;

/* Klass ProductInformation - Hantera information om produkter redo att beställas.
* Varje produkte som beställningen innehåller skapas upp som ett eget objekt i OrderService.
 */
public class ProductInformation {
    private int id;
    private static int lastId = 0;
    private String name;
    private String material;
    private String size;
    private String color;
    private String commandOneInput;
    private String commandTwoInput;

    public ProductInformation() {
        this.id = ++lastId;
    }

    public ProductInformation(String name, String material, String size, String color, String commandOneInput, String commandTwoInput) {
        this.id = ++lastId;
        this.name = name;
        this.material = material;
        this.size = size;
        this.color = color;
        this.commandOneInput = commandOneInput;
        this.commandTwoInput = commandTwoInput;
    }

    public ProductInformation(int id, String name, String material, String size, String color, String commandOneInput, String commandTwoInput) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.size = size;
        this.color = color;
        this.commandOneInput = commandOneInput;
        this.commandTwoInput = commandTwoInput;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCommandOneInput() {
        return commandOneInput;
    }

    public void setCommandOneInput(String commandOneInput) {
        this.commandOneInput = commandOneInput;
    }

    public String getCommandTwoInput() {
        return commandTwoInput;
    }

    public void setCommandTwoInput(String commandTwoInput) {
        this.commandTwoInput = commandTwoInput;
    }
}
