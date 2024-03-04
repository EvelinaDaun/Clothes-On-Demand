package builder;

import businessobject.CEO;
import businessobject.TShirt;

// Klass TShirtBuilder - Bygga upp TShirt objekt.
public class TShirtBuilder {
    private TShirt tshirt = new TShirt();

    public TShirtBuilder(CEO ceo) {
        this.tshirt.addPropertyChangeListenter(ceo);
    }

    // Metod: Lägga till värde i build processen och returnera builder objektet
    public TShirtBuilder addMaterial(String material){
        if(!(material.equals("Bomull") || material.equals("Bambu"))) // Extra kontroll för innehållet
            throw new BuildException("Material", material);          // Hanteras i undantagsklassen
        tshirt.setInProduction(true);                                // Att produktionen är igång
        tshirt.setMaterial(material);                                // Lägga till material i TShirt objektet
        return this;
    }

    public TShirtBuilder addSize(String size){
        if(!(size.equals("Large") || size.equals("Extra Large")))
            throw new BuildException("Storlek", size);
        tshirt.setSize(size);
        return this;
    }

    public TShirtBuilder addColor(String color){
        if(!(color.equals("Lila") || color.equals("Blå")))
            throw new BuildException("Färg", color);
        tshirt.setColor(color);
        return this;
    }

    // Metod: Sista kontroll och returnera det färdiga objektet
    public TShirt build(){
        if(tshirt.getMaterial() == null || tshirt.getSize() == null || tshirt.getColor() == null)
            throw new BuildException("Build process", tshirt);
        return tshirt;
    }
}
