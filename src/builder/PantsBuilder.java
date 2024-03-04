package builder;

import businessobject.CEO;
import businessobject.Pants;

// Klass PantsBuilder - Bygga upp Pants objekt.
public class PantsBuilder {
    private Pants pants = new Pants();

    public PantsBuilder(CEO ceo) {
        this.pants.addPropertyChangeListener(ceo);
    }

    // Metod: Lägga till värde i build processen och returnera builder objektet
    public PantsBuilder addMaterial(String material){
        if(!(material.equals("Jeans") || material.equals("Bomull"))) // Extra kontroll för innehållet
            throw new BuildException("Material", material);          // Hanteras i undantagsklassen
        pants.setInProduction(true);                                 // Att produktionen är igång
        pants.setMaterial(material);                                 // Lägga till material i Pants objektet
        return this;
    }

    public PantsBuilder addSize(String size){
        if(!(size.equals("Medium") || size.equals("Large")))
            throw new BuildException("Storlek", size);
        pants.setSize(size);
        return this;
    }

    public PantsBuilder addColor(String color){
        if(!(color.equals("Grön") || color.equals("Svart")))
            throw new BuildException("Färg", color);
        pants.setColor(color);
        return this;
    }

    // Metod: Sista kontroll och returnera det färdiga objektet
    public Pants build(){
        if(pants.getMaterial() == null || pants.getSize() == null || pants.getColor() == null)
            throw new BuildException("Build process", pants);
        return pants;
    }
}