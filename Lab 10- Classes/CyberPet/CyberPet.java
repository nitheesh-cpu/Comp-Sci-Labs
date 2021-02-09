import static java.lang.System.*;

public class CyberPet {
    private String name, kind, size = "big";
    private boolean isSleeping, isEating, isPlaying;
    private static int allFood = 10;

    public CyberPet() {
        isEating = true;
        isSleeping = false;
        isPlaying = false;
        name = "Fido";
    }

    public CyberPet(String n) {
        name = n;
    }

    public CyberPet(String n, String k) {
        name = n;
        kind = k;
    }

    public void eat() {
        isEating = true;
        isSleeping = false;
        isPlaying = false;
        out.println(name + " is eating");
        allFood--;
    }

    public void sleep() {
        isSleeping = true;
        isEating = false;
        isPlaying = false;
        out.println(name + " is sleeping");
    }

    public void play() {
        isSleeping = false;
        isEating = false;
        isPlaying = true;
        out.println(name + " is playing");
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setKind(String k) {
        kind = k;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getState() {
        if (isSleeping == true)
            return "Sleeping";
        if (isEating == true)
            return "Eating";
        if (isPlaying == true)
            return "Playing";
        else
            return "Error in state";
    }

    public String toString() {
        return name + " is a " + kind + " animal.";
    }

    public void encounter(CyberPet other) {
        if (other.size.equals("big") && this.size.equals("big"))
            out.println("Same size; let's be friends.");
    }

    public static void checkFood() {
        if (allFood < 5)
            out.println("There is only " + allFood + " pounds; you are low on food, buy more");
    }
}
