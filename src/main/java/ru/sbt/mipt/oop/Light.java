package ru.sbt.mipt.oop;

public class Light {
    private boolean isOn;
    private final String id;

    public Light(String id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public String getLightId() {
        return this.id;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }
}
