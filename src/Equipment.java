import java.util.Objects;

public abstract class Equipment {

    // Har satt klassen som abstrakt, da det ikke skal opprettes objekter av den; kun av dens subklasser.


    // Fields

    protected final int id;
    protected String locker;
    protected boolean toBeReplaced;


    // Getters/setters

    public int getId() {
        return id;
    }

    public boolean isToBeReplaced() {
        return toBeReplaced;
    }


    // Constructors

    public Equipment(int id, String locker, boolean toBeReplaced){
        this.id = id;
        this.locker = locker;
        this.toBeReplaced = toBeReplaced;
    }


    // Overridden methods

    // Overrider toString for å lettere bruke sout senere
    @Override
    public String toString() {
        return super.toString() + "\nId: " + this.id + "\nLocker: " + this.locker + "\nTo be replaced: " + toBeReplaced;
    }

    // Overrider equals() siden hashCode() også overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;
        Equipment equipment = (Equipment) o;
        return getId() == equipment.getId();
    }

    // Har kun brukt id-fieldet til override av hashCode
    // Dette er pga at alle id-er er unike
    // Dermed trenger vi ikke mer en id for å gjenkjenne et unikt objekt
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
