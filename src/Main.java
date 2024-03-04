import businessobject.CEO;
import businessobject.Customer;
import gui.PrintGUI;
import singelton.OrderService;

import java.util.Scanner;

/* Klass Main
* Starta upp programmet med att skapa upp CEO, Customer och OrderService objekt.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ta emot användarens inmatningar
        CEO ceo = new CEO();                      // VD objekt för att ta emot information om förändringar
        PrintGUI.printStartLabel();               // Skriva ut en välkomsttext för användvaren.

        // Grund för att skapa upp en kund
        int step = 1;
        String inName = "";
        String inEmail = "";
        String inAdress = "";

        while(step < 4){ // Stegvis låta kunden mata in information
            PrintGUI.createCustomerMenu(step);
            if(step == 1){ // Namn
                inName = scanner.nextLine();
                step = 2;
            }else if(step == 2){ // Email
                inEmail = scanner.nextLine();
                step = 3;
            } else { // Adress
                inAdress = scanner.nextLine();
                step = 4;
            }
        }

        // Hämta en instans av Orderservice och köra metoden createOrder med en ny kund samt ett CEO objekt för att ta emot förändringar
        OrderService.getInstance().createOrder(new Customer(inName, inEmail, inAdress), ceo);
    }
}