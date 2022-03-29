import java.util.Scanner;

public class MenuHandler {

    // Klasse som brukes til å håndtere meny i Program-klassens main()-metode


    // Fields

    private boolean isRunning;
    private final EquipmentPrinter equipmentPrinter;


    // Constructors

    public MenuHandler(EquipmentPrinter equipmentPrinter){
        this.isRunning = true;
        this.equipmentPrinter = equipmentPrinter;
    }


    // Methods

    // Kjører meny i en løkke så lenge isRunning == true
    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        while (isRunning){
            printMenu();
            processChoice(scanner);
        }
        scanner.close();
    }


    // Helper methods

    // Hjelpemetode for å printe menyteksten i runMenu()
    public void printMenu(){
        System.out.println("""
                Skriv inn ditt valg og trykk enter
                1 - Se hvilke baller som trenger å pumpes opp
                2 - Se hvilket utstyr som må erstattes
                3 - Se hvilke bordtennisracketer som må skifte belegg
                4 - Avslutt""");
    }

    // Hjelpemetode for å håndtere brukervalg i runMenu()
    public void processChoice(Scanner scanner){
        String userChoice = scanner.nextLine();
        switch (userChoice){
            case "1" -> equipmentPrinter.printBallsNeedingMoreAir();
            case "2" -> equipmentPrinter.printEquipmentNeedingToBeReplaced();
            case "3" -> equipmentPrinter.printTennisRacketsNeedingNewPad();
            case "4" -> {
                System.out.println("Ha en fin dag!");
                isRunning = false;
            }
            default -> System.out.println("Vennligst skriv inn et gyldig valg");
        }
    }
}
