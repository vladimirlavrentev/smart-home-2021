package ru.sbt.mipt.oop;

public class Door {
    private final String id;
    private boolean isOpen;

    public Door(boolean isOpen, String id) {
        this.isOpen = isOpen;
        this.id = id;
    }

    public String getDoorId() {
        return this.id;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }
}
