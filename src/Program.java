import java.io.File;
import java.io.FileNotFoundException;

// Klasse som brukes som besvarelse på oppgave 4

public class Program {
    public static void main(String[] args) {

        // Setter opp try-catch pga filhåndtering
        try {

            // Velger fil som skal leses fra
            File file = new File("inputFiles/equipment.txt");

            // De tre neste linjene ble brukt til testing, se besvarelse av oppgave 2
            // Test test = new Test(file);
            // test.runReadFromFileTest();
            // test.runHashSetTest();

            // Oppretter et objekt av klassen som skal lese fra fil
            EquipmentManager equipmentManager = new EquipmentManager(file);

            // Leser fra fil
            equipmentManager.makeEquipmentHashSet();

            // Oppretter objekt av klassen som skal printe informasjon fra lista over utstyr
            EquipmentPrinter equipmentPrinter = new EquipmentPrinter(equipmentManager);

            // Oppretter objekt av klassen som skal håndtere meny
            MenuHandler menuHandler = new MenuHandler(equipmentPrinter);

            System.out.println("Velkommen til gymutstyrslista!");

            // Kjører meny
            menuHandler.runMenu();

        // Fanger opp unntak av type FileNotFoundException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fil ikke funnet");
        }

    }
}
