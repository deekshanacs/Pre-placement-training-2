public class Hotel {
    static boolean[] rooms = new boolean[10]; 
    public static void bookRoom(int roomNo) {
        if (roomNo < 1 || roomNo > 10) {
            System.out.println("Invalid room number.");
            return;
        }
        if (!rooms[roomNo - 1]) {
            rooms[roomNo - 1] = true;
            System.out.println("Room " + roomNo + " booked.");
        } else {
            System.out.println("Room already booked.");
        }
    }
    public static void main(String[] args) {
        bookRoom(3);
        bookRoom(3);
    }
}
