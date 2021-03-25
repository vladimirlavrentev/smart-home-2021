package ru.sbt.mipt.oop;
import static java.lang.System.out;

public class Signalizaiton {
    private int state;
    private final int homeID;
    private final int points[];
    private final String activationCode;


    Signalizaiton() {
        this.state = 0; //по умолчанию сигнализация выключена
        this.homeID = 0;
        this.points = new int[0];
        this.activationCode = "";
        this.code = 0;
    }

    Signalizaiton(int homeNumber, int[] points, String activationCode) {
        this.state = 0; //по умолчанию сигнализация выключена
        this.homeID = homeNumber;
        this.points = points;
        this.activationCode = activationCode;
    }

    void activate() {
        this.state = 1;
    }

    void deactivate(String code) {
        if (this.activationCode == code) {
            this.state = 0;
        }
        if (this.activationCode != code) {
            this.alarm();
        }
    }

    void alarm() {
        this.state = 2;
        System.out(“Sending sms”);
    }

    public int getState() {
        return this.state;
    }

}
