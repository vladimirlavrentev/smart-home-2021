package ru.sbt.mipt.oop;

public class SensorEvent {
    private final SensorEventType type;
    private final String objectId;

    public SensorEvent(SensorEventType type, String objectId) {
        this.type = type;
        this.objectId = objectId;
    }

    public SensorEventType getType() {
        return this.type;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String message() {
        return "SensorEvent{" +
                "type=" + this.type +
                ", objectId='" + this.objectId + '\'' +
                '}';
    }
}
