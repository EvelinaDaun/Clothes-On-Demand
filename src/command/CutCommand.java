package command;

import businessobject.Pants;
import businessobject.Skirt;
import businessobject.TShirt;
import gui.PrintGUI;

/* Klass: CutCommand
* Hantera kommadot att klippa för de olika produktsorterna.
 */
public class CutCommand implements Command {
    private Pants pants;
    private TShirt tshirt;
    private Skirt skirt;
    private String commandInput; // Valet användaren gjort

    // Tom konstruktor
    public CutCommand(){}

    // Konstruktor med Pants objekt
    public CutCommand(Pants pants, String commandInput) {
        this.pants = pants;
        this.commandInput = commandInput;
    }

    // Konstruktor med TShirt objekt
    public CutCommand(TShirt tshirt, String commandInput) {
        this.tshirt = tshirt;
        this.commandInput = commandInput;
    }

    // Konstruktor med Skirt objekt
    public CutCommand(Skirt skirt, String commandInput) {
        this.skirt = skirt;
        this.commandInput = commandInput;
    }

    // Konstruktor med allt
    public CutCommand(Pants pants, TShirt tshirt, Skirt skirt, String commandInput) {
        this.pants = pants;
        this.tshirt = tshirt;
        this.skirt = skirt;
        this.commandInput = commandInput;
    }

    // Getters & Setters
    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public TShirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    public Skirt getSkirt() {
        return skirt;
    }

    public void setSkirt(Skirt skirt) {
        this.skirt = skirt;
    }

    public String getCommandInput() {
        return commandInput;
    }

    public void setCommandInput(String commandInput) {
        this.commandInput = commandInput;
    }


    // Metod: Hantera klipp kommando baserat på produktsort.
    @Override
    public void doCommand() {
        if(pants != null){  // Om det finns ett objekt sparat
            pants.setLength(commandInput); // Ändra längden på byxorna till val från kunden
            PrintGUI.printCommandMessage("Steg 5 utförs: Klipper till önskad längd - " + commandInput); // Skicka med text till GUI att skriva ut
            pants.setInProduction(false); // Ändra status för att produkten är klar

        }else if(tshirt != null){
            tshirt.setSleeves(commandInput);
            PrintGUI.printCommandMessage("Steg 5 utförs: Klipper önskad längd - " + commandInput);
            tshirt.setInProduction(false);

        }else if(skirt != null){
            skirt.setPattern(commandInput);
            PrintGUI.printCommandMessage("Steg 5 utförs: Klipper till önskat mönster - " + commandInput);
            skirt.setInProduction(false);
        }
    }
}