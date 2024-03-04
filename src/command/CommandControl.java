package command;

import java.util.ArrayList;
import java.util.List;

/*
* Klass för att hantera kommandon.
* Innehåller en lista på kommandon samt metoder för att lägga till och köra kommandon.
 */
public class CommandControl {

    private List<Command> commandList = new ArrayList<>(); // Lista med kommandon

    public CommandControl(){}


    // Metod: Lägga till kommandon i listan
    public void addCommand(Command command){
        commandList.add(command);
    }


    // Metod: Köra och ta bort alla kommandon i listan
    public void doCommandList(){
        for(Command c : commandList){ // Gå igenom listan med kommandon och köra doCommand metoden.
            c.doCommand();
        }

        commandList.clear(); // Tömma listan för att inte göra om samma kommandon flera gånger
    }
}
