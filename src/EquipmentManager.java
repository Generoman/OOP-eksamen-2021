import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class EquipmentManager {

    // Klasse som skal brukes som svar på Oppgave 1.


    // Fields

    private final File equipmentListFile;

    // Jeg har valgt å bruke HashSet for å vise bruk av overriding av equals() og hashCode()
    private final HashSet<Equipment> equipmentHashSet = new HashSet<>();


    // Getters/setters

    // Slik jeg tolket Oppgave 1, er denne getteren nok som besvarelse på "en public metode som kan
    // returnere objektene lest inn fra fil". Da Oppgave 3 inneholder teksten "Det er [...] forventet
    // at du benytter klassen du lagde i oppgave 1 [...]", velger jeg å gjøre det slik.
    public HashSet<Equipment> getEquipmentHashSet() {
        return equipmentHashSet;
    }


    // Constructors

    public EquipmentManager(File equipmentListFile) {
        this.equipmentListFile = equipmentListFile;
    }


    // Methods

    // Metode som leser inn data fra fil, og plasserer objekter i equipmentHashSet
    // Unntaket blir fanget i Program-klassens main()-metode
    public void makeEquipmentHashSet() throws FileNotFoundException {

        Scanner scanner = new Scanner(equipmentListFile);

        while (scanner.hasNextLine()) {
            String equipmentType = scanner.nextLine();

            if (equipmentType.equals("TableTennisRacket")) {
                TableTennisRacket tableTennisRacket = makeTableTennisRacket(scanner);
                // Linje kommentert ut da den ble brukt til testing
                // System.out.println(tableTennisRacket);
                equipmentHashSet.add(tableTennisRacket);
            }
            else if (equipmentType.equals("Ball")){
                Ball ball = makeBall(scanner);
                // Linje kommentert ut da den ble brukt til testing
                // System.out.println(ball);
                equipmentHashSet.add(ball);
            }
        }

        scanner.close();
    }


    // Helper methods

    // Hjelpemetode som returnerer et TableTennisRacket-objekt for bruk i makeEquipmentHashSet()
    public TableTennisRacket makeTableTennisRacket(Scanner scanner){

        int id = Integer.parseInt(scanner.nextLine());
        String locker = scanner.nextLine();
        boolean toBeReplaced = Boolean.parseBoolean(scanner.nextLine());
        boolean needsNewPad = Boolean.parseBoolean(scanner.nextLine());

        return new TableTennisRacket(id, locker, toBeReplaced, needsNewPad);
    }

    // Hjelpemetode som returnerer et Ball-objekt for bruk i makeEquipmentHashSet()
    public Ball makeBall(Scanner scanner){

        int id = Integer.parseInt(scanner.nextLine());
        String locker = scanner.nextLine();
        boolean toBeReplaced = Boolean.parseBoolean(scanner.nextLine());
        TypeOfBall typeOfBall = TypeOfBall.valueOf(scanner.nextLine());
        boolean needsAir = Boolean.parseBoolean(scanner.nextLine());

        return new Ball(id, locker, toBeReplaced, typeOfBall, needsAir);
    }
}
