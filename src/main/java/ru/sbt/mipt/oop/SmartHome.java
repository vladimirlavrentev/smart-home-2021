package ru.sbt.mipt.oop;

import java.util.ArrayList;
import java.util.Collection;

public class SmartHome {
    private Collection<Room> rooms;
    private Signalizaiton signalizaiton = new Signalizaiton();

    public SmartHome() {
        rooms = new ArrayList<>();
    }

    public SmartHome(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Collection<Room> getRooms() {
        return this.rooms;
    }

    public void turnOnSignalization() {
        signalizaiton.activate();
    }

    public void turnOffSignalization() {
        signalizaiton.deactivate();
    }

    public int getSignalizationState() {
        return signalizaiton.getState();
    }

    public void alert() {
        this.signalizaiton.alarm();
    }
}
