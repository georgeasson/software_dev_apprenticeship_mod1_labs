package statics2;

public class StaticsLabProgram {

    public static void main(String[] args) {

        try {

            for (int i = 0; i < 12; i++) {

                StaticsLabVehicle vehicle = new StaticsLabVehicle(50, 1);
                System.out.println("Vehicle created: " + vehicle.getRegistration().getNumber()
                		
                );
            }

        } catch (NoRegistrationPlatesException e) {

            System.out.println("Unable to create vehicle: " + e.getMessage()
            
            );
        }
    }
}