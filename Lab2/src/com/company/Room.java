package com.company;

public class Room {
    int roomNumber;
    String roomType;
    int roomFloor;

    public Room(int roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    public Room(Room other) {
        this.roomNumber = other.roomNumber;
        this.roomType = other.roomType;
        this.roomFloor = other.roomFloor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    @Override
    public String toString() {
        return "Room number: " + this.roomNumber + "\n" +
                "Room type: " + this.roomType + "\n" +
                "Room floor: " + this.roomFloor + "\n";
    }
}
