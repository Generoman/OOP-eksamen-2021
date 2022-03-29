public class TableTennisRacket extends Equipment{

    // Klasse som representerer bortennisracketer


    // Fields

    private final boolean needsNewPad;


    // Getters/setters

    public boolean isNeedsNewPad() {
        return needsNewPad;
    }


    // Constructors

    public TableTennisRacket(int id, String lockerNumber, boolean toBeReplaced, boolean needsNewPad) {
        super(id, lockerNumber, toBeReplaced);
        this.needsNewPad = needsNewPad;
    }


    // Overridden methods

    // Overrider toString for å lettere bruke sout senere
    @Override
    public String toString() {
        return super.toString() + "\nNeeds new pad: " + this.needsNewPad + "\n";
    }


}
