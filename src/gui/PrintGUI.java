package gui;

// Klass PrintGUI - Hantera utskrifter.
public class PrintGUI {
    // Metod: Skriva ut start texten.
    public static void printStartLabel(){
        System.out.println("********************************************************");
        System.out.println("         Välkommen till Clothes-On-Demand! ");
        System.out.println(" Här kommer du kunna beställa kläder som du vill ha dem.\n Men först måste du fylla i dina uppgifter. ");
        System.out.println("********************************************************\n");
    }

    // Metod: Skriva ut meny för att skapa kund i olika steg.
    public static void createCustomerMenu(int step){
        if(step == 1){
            System.out.println("\nFyll i dina uppgifter nedan & tryck enter: ");
            System.out.print("Namn: ");
        }else if(step == 2){
            System.out.print("Email: ");
        } else if (step == 3) {
            System.out.print("Adress: ");
        }
    }

    // Metod: Första menyn där produkt väljs.
    public static void chooseProductMenu(){
        System.out.print("\nVälj produkt: \n 1. Pants \n 2. TShirt \n 3. Skirt \n 4. Avsluta programmet. \nVälj en siffra mellan 1-4 och tryck enter:  ");
    }

    // Metod: PANTS - Menyer för steg 1 till 5
    public static void printPantsMenu(int step){
        if(step == 1){ // Material
            System.out.println("\nSteg 1 - Välj matrial: ");
            System.out.println("1. Jeans \n2. Bomull ");
            System.out.print("Skriv här: ");
        }else if(step == 2){ // Storlek
            System.out.println("\nSteg 2 - Välj storlek: ");
            System.out.println("1. Medium \n2. Large  ");
            System.out.print("Skriv här: ");
        }else if(step == 3){ // Färg
            System.out.println("\nSteg 3 - Välj färg: ");
            System.out.println("1. Grön \n2. Svart ");
            System.out.print("Skriv här: ");
        }else if(step == 4){ // Passform
            System.out.println("\nSteg 4 - Välj passform: ");
            System.out.println("1. Låg midja \n2. Hög midja \n3. Regular-fit");
            System.out.print("Skriv här: ");
        }else if(step == 5){ // Längd
            System.out.println("\nSteg 5 - Välj längd: ");
            System.out.println("1. Bootcut \n2. Ankeljeans \n3. Låga");
            System.out.print("Skriv här: ");
        }
    }

    // Metod: TSHIRT - Menyer för steg 1 till 5
    public static void printTShirtMenu(int step){
        if(step == 1){ // Material
            System.out.println("\nSteg 1 - Välj matrial: ");
            System.out.println("1. Bomull \n2. Bambu ");
            System.out.print("Skriv här: ");
        }else if(step == 2){ // Storlek
            System.out.println("\nSteg 2 - Välj storlek: ");
            System.out.println("1. Large  \n2. Extra Large ");
            System.out.print("Skriv här: ");
        }else if(step == 3){ // Färg
            System.out.println("\nSteg 3 - Välj färg: ");
            System.out.println("1. Lila \n2. Blå ");
            System.out.print("Skriv här: ");
        }else if(step == 4){ // Nacke
            System.out.println("\nSteg 4 - Välj sorts nacke: ");
            System.out.println("1. V-ringad \n2. U-ringad \n3. Polo");
            System.out.print("Skriv här: ");
        }else if(step == 5){ // Armlängd
            System.out.println("\nSteg 5 - Välj armlängd:");
            System.out.println("1. Kort \n2. Mellan \n3. Lång ");
            System.out.print("Skriv här: ");
        }
    }

    // Metod: SKIRT - Menyer för steg 1 till 5
    public static void printSkirtMenu(int step){
        if(step == 1){ // Material
            System.out.println("\nSteg 1 - Välj matrial: ");
            System.out.println("1. Bomull \n2. Polyester ");
            System.out.print("Skriv här: ");
        }else if(step == 2){ // Storlek
            System.out.println("\nSteg 2 - Välj storlek: ");
            System.out.println("1. Small  \n2. Medium ");
            System.out.print("Skriv här: ");
        }else if(step == 3){ // Färg
            System.out.println("\nSteg 3 - Välj färg: ");
            System.out.println("1. Blå \n2. Grön ");
            System.out.print("Skriv här: ");
        }else if(step == 4){ // Midja
            System.out.println("\nSteg 4 - Välj midja: ");
            System.out.println("1. Låg \n2. Mellan \n3. Hög");
            System.out.print("Skriv här: ");
        }else if(step == 5){ // Mönster
            System.out.println("\nSteg 5 - Välj mönster: ");
            System.out.println("1. Maxikjol \n2. Draperad \n3. Byxkjol ");
            System.out.print("Skriv här: ");
        }
    }

    // Metod: Skriva ut ett meddelande om användaren inte matar in rätt i en meny.
    public static void printErrorMessage(){
        System.out.print("Något blev fel! Skriv in en siffra och tryck enter: ");
    }

    // Metod: Skriva ut när användaren valt att avsluta innan en order är lagd.
    public static void printEndMessage(){
        System.out.println("\n \n Nu avslutas programmet och ingen order är beställd. \n Hoppas vi syns igen!");
    }

    // Metod: Skriva ut ett meddelande om att en order är beställd.
    public static void printOrderMessage(){
        System.out.println("\n --- >  Ordern är beställd, invänta kvitto.  < ---- ");
    }

    // Metod: Skriva ut kommando meddelande.
    public static void printCommandMessage(String command){
        System.out.println("\n------------------------------------------");
        System.out.println("Meddelande: " + command);
        System.out.println("------------------------------------------");
    }

    // Metod: Skriva ut meddelande till CEO.
    public static void printMessageCEO(String message){
        System.out.println("%%%%%%  " + message + "  %%%%%% ");
    }


    // Metod: Skriva ut sista menyn för kunden. Kunden kan välja att lägga till produkter till beställningen eller visa kvitto.
    public static void printEndMenu(){
        System.out.println("\nVälj i menyn: ");
        System.out.println("1. Lägga till en produkt till beställningen. \n2. Göra beställningen och visa kvitto. ");
        System.out.print("Skriv här: ");
    }

    // Metod: Skriva ut kvitto för beställningen. Inkluderar produkt- och kundinformation.
    public static void printOrder(String orderString, String customerString){
        System.out.println("\n############################### \n \t \t \t KVITTO \n");
        System.out.println("Beställda produkter: ");
        System.out.println(orderString + "\n"); // Skriva ut produkterna som finns i beställningen
        System.out.println(customerString); // Skriva ut kundinformationen
        System.out.println("############################### \n");
    }
}