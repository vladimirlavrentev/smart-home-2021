package ru.sbt.mipt.oop;

public class SensorCommand {
    private final CommandType type;
    private final String objectId;

    public SensorCommand(CommandType type, String objectId) {
        this.type = type;
        this.objectId = objectId;
    }

    public String message() {
        return "SensorCommand{" +
                "type=" + this.type +
                ", objectId='" + this.objectId + '\'' +
                '}';
    }
}
