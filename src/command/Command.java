package command;

/* Interface för att koppla samman alla kommandon.
* Innehåller en doCommand metod där kommandon ska utföras.
 */
public interface Command {

    // Metod: Hantera kommandon
    void doCommand();
}