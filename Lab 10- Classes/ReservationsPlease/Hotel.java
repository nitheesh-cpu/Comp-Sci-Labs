import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> hotelArray;
    private ArrayList<String> waitList;
    private int size;

    public Hotel(int r){
        hotelArray = new ArrayList<>();
        waitList = new ArrayList<>();
        size = r;
    }

    public int getHotelSize() {
        return size;
    }

    public Reservation getReservation(int i){
        return hotelArray.get(i);
    }

    public Reservation requestRoom(String name){
        if(this.hotelArray.size()<this.getHotelSize()){
            Reservation r = new Reservation(name,hotelArray.size());
            hotelArray.add(r);
            return r;
        }
        else{
            waitList.add(name);
            return null;
        }
    }

    public boolean isReserved(String name){
        for(Reservation r : hotelArray){
            if (r.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean isReserved(int room){
        return hotelArray.get(room) == null;
    }

    public Reservation cancelAndReassign(Reservation r){
        for(Reservation check : hotelArray){
            if (check.equals(r)){
                int n = check.getRoom();
                hotelArray.set(n,new Reservation(waitList.get(0),n));
                waitList.remove(0);
                return r;
            }
        }return null;
    }

    public String toString() {
        String s = "Current Reservations:\n";
        for(Reservation r : hotelArray) {
            s += r.getRoom() + "--" + r.getName() +"\n";
        }
        s += "Wait List:\n";
        for(String n : waitList) {
            s += n + "\n";
        }
        return s;
    }
}
