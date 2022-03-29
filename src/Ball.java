public class Ball extends Equipment{

    // Klasse som representerer baller


    // Fields

    public boolean needsAir;

    // Valgte å ha dette som enum, istedenfor å ha fire klasser som arvet fra Ball
    public TypeOfBall typeOfBall;


    // Getters/setters

    public boolean isNeedsAir() {
        return needsAir;
    }


    // Constructors

    public Ball(int id, String lockerNumber, boolean toBeReplaced, TypeOfBall typeOfBall, boolean needsAir) {
        super(id, lockerNumber, toBeReplaced);
        this.needsAir = needsAir;
        this.typeOfBall = typeOfBall;
    }


    // Overridden methods

    // Overrider toString for å lettere bruke sout senere
    @Override
    public String toString() {
        return super.toString() + "\nBall type: " + this.typeOfBall + "\nNeeds air: " + this.needsAir + "\n";
    }
}
