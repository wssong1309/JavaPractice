package ch07.practice09;

public class Hotel {
    private class Room {
        int roomNumber;
        String customerName;

        public Room(int roomNumber, String customerName) {
            this.roomNumber = roomNumber;
            this.customerName = customerName;
        }
    }

    private Room[] rooms = new Room[10];

    public void add(int roomNumber, String customerName) {
        if (roomNumber >= 0 && roomNumber < 10 && rooms[roomNumber] == null) {
            rooms[roomNumber] = new Room(roomNumber, customerName);
        }
    }

    public void show() {
        for (Room room : rooms) {
            if (room != null) {
                System.out.println(room.roomNumber + "번 방을 " + room.customerName + "가 예약했습니다.");
            }
        }
    }
}
