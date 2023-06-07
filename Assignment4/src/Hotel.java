import java.util.ArrayList;

public class Hotel
{
    private static ArrayList<Room> rooms;

    public static void addRoom(ArrayList<Room> room)
    {

    }
    public static void reserveRoom(String roomNumber, int numberOfGuests)
    {

    }
    public static Room[] getAvailableRooms()
    {
        Room[] r = new Room[5];
        return r;
    }
    public static Room[] getOccupiedRooms()
    {
        Room[] r = new Room[5];
        return r;
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(Room rooms)
    {
        Hotel.rooms = rooms;
    }

    public static void main(String[] args)
    {
        int occupants = 3;
        Room rooms_0 = new Room(101, RoomType.SINGLE,true,0);
        Room rooms_1 = new Room(201, RoomType.DOUBLE,true,0);
        Room rooms_2 = new Room(301, RoomType.SUITE,false,occupants);
        setRooms(rooms_0);
        setRooms(rooms_1);
        setRooms(rooms_2);
        addRoom();
        reserveRoom("101",3);
        reserveRoom("201",3);
        reserveRoom("301",3);

    }

}
