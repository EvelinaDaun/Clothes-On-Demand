package businessobject;

import gui.PrintGUI;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/* BusinessObject.CEO / VD klass
 * CEO implementerar PropertyChangeListener och får notis två gånger:
 * 1. "plagg tillverkas" - meddelas när en kund beställer ett plagg.
 * 2. "plagg klar"       - meddelas när ett plagg är färdigt för leverans.
 */
public class CEO implements PropertyChangeListener {
    private int id = 1;
    private String name = "Wigell";

    public CEO() {
    }

    public CEO(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metod: Hantere förändringar i produkt objekt
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        PrintGUI.printMessageCEO("CEO meddelas: " + evt.getPropertyName()); // Skicka text till GUI
    }
}