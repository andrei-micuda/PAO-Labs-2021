package com.company;

public class Subject {
    Room room;
    int noOfStudents;
    Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = new Room(room);
        this.noOfStudents = noOfStudents;
        this.teacher = new Person(teacher);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = new Room(room);
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = new Person(teacher);
    }

    @Override
    public String toString() {
        return "Room:\n" + this.room.toString() + "\n" +
                "Number of students: " + this.noOfStudents + "\n\n" +
                "Teacher:\n" + this.teacher.toString() + "\n";
    }
}
