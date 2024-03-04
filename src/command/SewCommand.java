package command;

import businessobject.Pants;
import businessobject.Skirt;
import businessobject.TShirt;
import gui.PrintGUI;

/* Klass SewCommand
* Hantera kommandot att sy de olika produktsorterna.
 */
public class SewCommand implements Command {
    private Pants pants;
    private TShirt tshirt;
    private Skirt skirt;
    private String commandInput; // Valet användaren gjort

    // Tom konstruktor
    public SewCommand() {}

    // Konstruktor med Pants objekt
    public SewCommand(Pants pants, String commandInput) {
        this.pants = pants;
        this.commandInput = commandInput;
    }

    // Konstruktor med TShirt objekt
    public SewCommand(TShirt tshirt, String commandInput) {
        this.tshirt = tshirt;
        this.commandInput = commandInput;
    }

    // Konstruktor med Skirt objekt
    public SewCommand(Skirt skirt, String commandInput) {
        this.skirt = skirt;
        this.commandInput = commandInput;
    }

    // Konstruktor med allt
    public SewCommand(Pants pants, TShirt tshirt, Skirt skirt, String commandInput) {
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

    // Metod: Hantera kommando baserat på om och vad för objekt som finns sparat
    @Override
    public void doCommand() {
        if(pants != null){ // Om det finns ett objekt sparat
            pants.setFit(commandInput); // Ändra längden på byxorna till val från kunden
            PrintGUI.printCommandMessage("Steg 4 utförs: Syr till önskad passform - " + commandInput); // Skicka med text till GUI att skriva ut

        }else if(tshirt != null){
            tshirt.setNeck(commandInput);
            PrintGUI.printCommandMessage("Steg 4 utförs: Syr till önskad nacke - " + commandInput);

        }else if(skirt != null){
            skirt.setWaistline(commandInput);
            PrintGUI.printCommandMessage("Steg 4 utförs: Syr till önskad midja - " + commandInput);
        }
    }
}
