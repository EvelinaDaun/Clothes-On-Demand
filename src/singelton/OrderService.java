package singelton;

import builder.PantsBuilder;
import builder.SkirtBuilder;
import builder.TShirtBuilder;
import businessobject.*;
import command.*;
import gui.PrintGUI;

import java.util.List;
import java.util.Scanner;

// Klass OrderService - Att skapa upp ordrar samt skicka beställningen.
public class OrderService {
    private static OrderService orderService;

    // Tom Konstruktor - Privat för att undvika instansiering utanför klassen.
    private OrderService(){
    }

    // Metod: Hämta en instans av OrderService om det inte finns så skapas en.
    public static OrderService getInstance(){
        if(orderService == null){
            orderService = new OrderService(); // Skapar upp en ny om ingen finns
        }
        return orderService;
    }

    // Metod: Bygga och hantera en order
    public void createOrder(Customer customer, CEO ceo){
        Order order = new Order();              // Skapa upp en order att bygga på
        Scanner input = new Scanner(System.in); // Skapa upp en Scanner för inmatning
        boolean runOrderServiceOne = true;      // Så länge användaren inte väljer att avsluta eller att en produkt är klar

        while(runOrderServiceOne){ // Så länge en order byggs
            boolean runOrderServiceTwo = true;    // While loop del två
            boolean runChooseProduct = true;      // Välja produkt
            int choosenProduct = 0;               // Användaren väljer produkt
            int choosenNumber;                    // Detaljval för produkt

            // Step 1 - 5
            int step = 1;
            String material = "";
            String size = "";
            String color = "";
            String commandInputOne = "";
            String commandInputTwo = "";

            PrintGUI.chooseProductMenu(); // Visa upp första menyn med olika produkter
            while(runChooseProduct){
                choosenProduct = getInput(input);
                if((choosenProduct > 0 && choosenProduct <= 4)){
                    runChooseProduct = false;
                }else{
                    PrintGUI.printErrorMessage();
                }
            }

            switch (choosenProduct){ // Beroende på vilken siffra & produkt som väljs i menyn

                case 1: { // PANTS
                    PrintGUI.printPantsMenu(step);                   // Skriva ut menyval
                    while(step == 1){                                // Steg 1 - Kunden väljer material
                        choosenNumber = getInput(input);             // Hämta en inmatning som kontrolleras att det är en int
                        if(choosenNumber > 0 && choosenNumber <= 2){ // Inmatningen kontrolleras att den är inom ramen för menyalterinativen
                            if(choosenNumber == 1){                  // Om inmatningen är lika med 1 väljs material utifrån det
                                material = "Jeans";
                            }else{
                                material = "Bomull";
                            }
                            step = 2;                                // Öka step till nästa steg för att gå vidare till nästa steg
                        }else{                                       // Om inmatningen är en siffra men inte inom ramen för menyvalen
                            PrintGUI.printErrorMessage();            // Error meddelande skrivs ut och efter börjar loopen om igen
                        }
                    }

                    PrintGUI.printPantsMenu(step); // Steg 2 - Kunden väljer storlek
                    while(step == 2){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                size = "Medium";
                            }else{
                                size = "Large";
                            }
                            step = 3;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printPantsMenu(step); // Steg 3 - Kunden väljer färg
                    while(step == 3){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                color = "Grön";
                            }else{
                                color = "Svart";
                            }
                            step = 4;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printPantsMenu(step); // Steg 4 - Kunden väljer passform
                    while(step == 4){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputOne = "Låg midja";
                            }else if(choosenNumber == 2){
                                commandInputOne = "Hög midja";
                            }else{
                                commandInputOne = "Regular-fit";
                            }
                            step = 5;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printPantsMenu(step); // Steg 5 - Kunden väljer längd
                    while(step == 5){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputTwo = "Bootcut";
                            }else if(choosenNumber == 2){
                                commandInputTwo = "Ankeljeans";
                            }else{
                                commandInputTwo = "Låga";
                            }
                            step = 6;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    // Lägga till ett nytt produktinformations objekt för att spara informationen om beställningen.
                    order.addProductInformationList(new ProductInformation("pants", material, size, color, commandInputOne, commandInputTwo));
                    break;
                }
                case 2: { // TSHIRT
                    PrintGUI.printTShirtMenu(step); // Steg 1 - Kunden väljer material
                    while(step == 1){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                material = "Bomull";
                            }else{
                                material = "Bambu";
                            }
                            step = 2;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printTShirtMenu(step); // Steg 2 - Kunden väljer storlek
                    while(step == 2){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                size = "Large";
                            }else{
                                size = "Extra Large";
                            }
                            step = 3;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printTShirtMenu(step); // Steg 3 - Kunden väljer färg
                    while(step == 3){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                color = "Lila";
                            }else{
                                color = "Blå";
                            }
                            step = 4;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printTShirtMenu(step); // Steg 4 - Kunden väljer nacke
                    while(step == 4){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputOne = "V-ringad";
                            }else if(choosenNumber == 2){
                                commandInputOne = "U-ringad";
                            }else{
                                commandInputOne = "Polo";
                            }
                            step = 5;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printTShirtMenu(step); // Steg 5 - Kunden väljer armlängd
                    while(step == 5){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputTwo = "Kort";
                            }else if(choosenNumber == 2){
                                commandInputTwo = "Mellan";
                            }else{
                                commandInputTwo = "Lång";
                            }
                            step = 6;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    order.addProductInformationList(new ProductInformation("tshirt", material, size, color, commandInputOne, commandInputTwo));
                    break;
                }
                case 3: { // SKIRT
                    PrintGUI.printSkirtMenu(step); // Steg 1 - Kunden väljer material
                    while(step == 1){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                material = "Bomull";
                            }else{
                                material = "Polyester";
                            }
                            step = 2;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printSkirtMenu(step); // Steg 2 - Kunden väljer storlek
                    while(step == 2){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                size = "Small";
                            }else{
                                size = "Medium";
                            }
                            step = 3;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printSkirtMenu(step); // Steg 3 - Kunden väljer färg
                    while(step == 3){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 2){
                            if(choosenNumber == 1){
                                color = "Blå";
                            }else{
                                color = "Grön";
                            }
                            step = 4;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printSkirtMenu(step); // Steg 4 - Kunden väljer midja
                    while(step == 4){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputOne = "Låg";
                            }else if(choosenNumber == 2){
                                commandInputOne = "Mellan";
                            }else{
                                commandInputOne = "Hög";
                            }
                            step = 5;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    PrintGUI.printSkirtMenu(step); // Steg 5 - Kunden väljer mönster
                    while(step == 5){
                        choosenNumber = getInput(input);
                        if(choosenNumber > 0 && choosenNumber <= 3){
                            if(choosenNumber == 1){
                                commandInputTwo = "Maxikjol";
                            }else if(choosenNumber == 2){
                                commandInputTwo = "Draperad";
                            }else{
                                commandInputTwo = "Byxkjol";
                            }
                            step = 6;
                        }else{
                            PrintGUI.printErrorMessage();
                        }
                    }

                    order.addProductInformationList(new ProductInformation("skirt", material, size, color, commandInputOne, commandInputTwo));
                    break;
                }
                case 4: {  // Användaren har valt att avsluta & ingen order beställs
                    PrintGUI.printEndMessage();
                    runOrderServiceTwo = false;
                    runOrderServiceOne = false;
                    break;
                }
                default: {  // Om det skulle bli fel
                    PrintGUI.printErrorMessage();
                }
            }

            while(runOrderServiceTwo){ // Så länge användaren väljer i avslutande menyn
                int number = 0;
                boolean test = true;

                PrintGUI.printEndMenu();
                while(test){ // Tills att ett menyval gjorts
                    number = getInput(input);
                    if(number > 0 && number < 3){
                        test = false;
                    }else{
                        PrintGUI.printErrorMessage();
                    }
                }

                switch (number){
                    case 1: { // Lägga till en produkt i ordern
                        runOrderServiceTwo = false;
                        break;
                    }
                    case 2: { // Lägga beställningen
                        PrintGUI.printOrderMessage();
                        createProducts(order, order.getProductInformationList(), ceo); // Skapa upp produkterna
                        PrintGUI.printOrder(order.toString(), customer.toString()); // Skriva ut kvitto/order
                        runOrderServiceTwo = false;
                        runOrderServiceOne = false;
                        break;
                    }
                    default: {
                        PrintGUI.printErrorMessage();
                    }
                }
            } // While loop två slut
        } // While Loop ett slut
    }

    // Metod: Hämta en inmatning som en int
    public int getInput(Scanner input){
        while(!input.hasNextInt()){  // Så länge inmatningen inte har ett int värde
            input.next();  // Rensa
            PrintGUI.printErrorMessage();
        }
        return input.nextInt();
    }

    // Metod: Skapa upp produkterna som sparats med ProductInformation objekt
    public void createProducts(Order order, List<ProductInformation> productInformationList, CEO ceo){
        CommandControl commandControl = new CommandControl(); // Hantera kommandon som skapas upp

        for(ProductInformation p : productInformationList){ // Gå igenom listan med ProductInformation objekt
            switch (p.getName()) {
                case "pants": {
                    PantsBuilder pantsBuilder = new PantsBuilder(ceo);
                    Pants pants = pantsBuilder.addMaterial(p.getMaterial())
                            .addSize(p.getSize())
                            .addColor(p.getColor())
                            .build();
                    commandControl.addCommand(new SewCommand(pants, p.getCommandOneInput()));
                    commandControl.addCommand(new CutCommand(pants, p.getCommandTwoInput()));
                    commandControl.doCommandList();
                    order.addPantsToList(pants);
                    break;
                }
                case "tshirt": {
                    TShirtBuilder tShirtBuilder = new TShirtBuilder(ceo);
                    TShirt tshirt = tShirtBuilder.addMaterial(p.getMaterial())
                            .addSize(p.getSize())
                            .addColor(p.getColor())
                            .build();
                    commandControl.addCommand(new SewCommand(tshirt, p.getCommandOneInput()));
                    commandControl.addCommand(new CutCommand(tshirt, p.getCommandTwoInput()));
                    commandControl.doCommandList();
                    order.addTShirtToList(tshirt);
                    break;
                }
                case "skirt": {
                    SkirtBuilder skirtBuilder = new SkirtBuilder(ceo);
                    Skirt skirt = skirtBuilder.addMaterial(p.getMaterial())
                            .addSize(p.getSize())
                            .addColor(p.getColor())
                            .build();
                    commandControl.addCommand(new SewCommand(skirt, p.getCommandOneInput()));
                    commandControl.addCommand(new CutCommand(skirt, p.getCommandTwoInput()));
                    commandControl.doCommandList();
                    order.addSkirtToList(skirt);
                    break;
                }
            }
        }
    }

}