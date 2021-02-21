import java.util.Objects;

public class Reservation {
    private int room;
    private String name;

    public Reservation(String n, int r){
        name = n;
        room = r;
    }

    public String toString() {
        return room + "--" + name;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return room == that.room && Objects.equals(name, that.name);
    }

}
