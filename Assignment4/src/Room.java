public class Room
{
    private static int roomNumber;

    RoomType roomType;
    private static boolean isAvailable;
    private static int occupants;

    public static int getRoomNumber() {
        return Room.roomNumber;
    }

    public static void setRoomNumber(int roomNumber) {
        Room.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public static boolean isIsAvailable() {
        return isAvailable;
    }

    public static void setIsAvailable(boolean isAvailable) {
        Room.isAvailable = isAvailable;
    }

    public static int getOccupants() {
        return occupants;
    }

    public static void setOccupants(int occupants) {
        Room.occupants = occupants;
    }

    public Room(int roomNumber, RoomType roomType, boolean isAvailable, int occupants)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.occupants = occupants;
    }


}
