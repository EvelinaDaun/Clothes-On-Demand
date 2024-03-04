package builder;

import businessobject.CEO;
import businessobject.Skirt;

// Klass SkirtBuilder - Bygga upp Skirt objekt.
public class SkirtBuilder {
    private Skirt skirt = new Skirt();

    public SkirtBuilder(CEO ceo) {
        this.skirt.addPropertyChangeListener(ceo);
    }

    // Metod: Lägga till värde i build processen och returnera builder objektet
    public SkirtBuilder addMaterial(String material){
        if(!(material.equals("Bomull") || material.equals("Polyester"))) // Extra kontroll för innehållet
            throw new BuildException("Material", material);              // Hanteras i undantagsklassen
        skirt.setInProduction(true);                                     // Att produktionen är igång
        skirt.setMaterial(material);                                     // Lägga till material i Skirt objektet
        return this;
    }

    public SkirtBuilder addSize(String size){
        if(!(size.equals("Small") || size.equals("Medium")))
            throw new BuildException("Storlek", size);
        skirt.setSize(size);
        return this;
    }

    public SkirtBuilder addColor(String color){
        if(!(color.equals("Blå") || color.equals("Grön")))
            throw new BuildException("Färg", color);
        skirt.setColor(color);
        return this;
    }

    // Metod: Sista kontroll och returnera det färdiga objektet
    public Skirt build(){
        if(skirt.getMaterial() == null || skirt.getSize() == null || skirt.getColor() == null)
            throw new BuildException("Build process", skirt);
        return skirt;
    }
}
