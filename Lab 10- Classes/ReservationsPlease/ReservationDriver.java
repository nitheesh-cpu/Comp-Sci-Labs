import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class ReservationDriver {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("Hotel.txt"));
        int max = input.nextInt();
        Hotel hotel = new Hotel(max);
        int num = input.nextInt();
        input.nextLine();
        for(int i = 0; i < num; i++){
            hotel.requestRoom(input.nextLine());
        }
        System.out.print(hotel.toString());
        num = input.nextInt();
        Random rn = new Random(input.nextInt());
        for(int i = 0; i < num; i++){
            hotel.cancelAndReassign(hotel.getReservation(rn.nextInt(max)));
        }
        System.out.print(hotel);
    }
}
