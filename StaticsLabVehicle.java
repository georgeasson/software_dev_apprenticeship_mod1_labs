package statics2;

public class StaticsLabVehicle {

    private int speed;
    private int lane;
    private int distanceTravelled;
    private StaticsLabRegistrationPlate registrationPlate;

    public StaticsLabVehicle(int speed, int lane)
            throws NoRegistrationPlatesException {

        this.speed = speed;
        this.lane = lane;
        this.distanceTravelled = 0;

        registrationPlate =
                StaticsLabRegistrationPlateFactory.getNextRegistrationPlate();
    }

    public StaticsLabRegistrationPlate getRegistration() {
        return registrationPlate;
    }

    public void accelerate(int amount) {
        speed += amount;

        if (speed > 200) {
            speed = 200;
        }

        distanceTravelled += amount;
    }

    public void brake(int amount) {
        speed -= amount;

        if (speed < 0) {
            speed = 0;
        }
    }

    public String getDetails() {
        return "Speed: " + speed
                + ", Lane: " + lane
                + ", Distance travelled: " + distanceTravelled
                + ", Registration plate: " + registrationPlate.getNumber();
    }
}