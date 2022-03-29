public class EquipmentPrinter {

    // Klasse som skal brukes som svar på Oppgave 3


    // Fields

    private final EquipmentManager equipmentManager;


    // Constructors

    public EquipmentPrinter(EquipmentManager equipmentManager) {
        this.equipmentManager = equipmentManager;
    }


    // Methods

    public void printBallsNeedingMoreAir(){
        for (Equipment e:
                equipmentManager.getEquipmentHashSet()) {
            if (e instanceof Ball && ((Ball) e).isNeedsAir()){
                System.out.println(e);
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced(){
        for (Equipment e:
                equipmentManager.getEquipmentHashSet()) {
            if (e.isToBeReplaced()){
                System.out.println(e);
            }
        }
    }

    public void printTennisRacketsNeedingNewPad(){
        for (Equipment e:
                equipmentManager.getEquipmentHashSet()) {
            if (e instanceof TableTennisRacket && ((TableTennisRacket) e).isNeedsNewPad()){
                System.out.println(e);
            }
        }
    }
}
