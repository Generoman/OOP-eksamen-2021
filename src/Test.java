import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

// Klasse brukt til testing; forklart nærmere i besvarelse av oppgave 2

public class Test {
    File file;

    EquipmentManager equipmentManager;

    public Test(File file){
        this.file = file;
        this.equipmentManager = new EquipmentManager(file);
    }

    public void runHashSetTest() throws FileNotFoundException {
        equipmentManager.makeEquipmentHashSet();

        HashSet<Equipment> equipmentHashSet = equipmentManager.getEquipmentHashSet();

        for (Equipment e : equipmentHashSet){
            System.out.println(e);
        }
    }

    public void runReadFromFileTest() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }




}
