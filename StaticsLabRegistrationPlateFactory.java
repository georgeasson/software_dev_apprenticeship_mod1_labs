package statics2;

public class StaticsLabRegistrationPlateFactory {

    private static String[] registrationPlates = {
        "LA05 XYZ", // London
        "NG58 JKL", // Nottingham
        "MA13 HYP", // Manchester
        "BX06 TUV", // Birmingham
        "CF67 QRS", // Cardiff
        "YS09 PQR", // Yorkshire
        "WD21 NML", // Exeter area
        "KR16 FGH", // Northampton
        "SJ04 UVW", // Glasgow
        "LV22 ABC", // Liverpool
        "WX19 XYZ"  // Bristol
    };

    private static int nextPlateIndex = 0;

    public static StaticsLabRegistrationPlate getNextRegistrationPlate() throws NoRegistrationPlatesException {

        if (nextPlateIndex >= registrationPlates.length) {
        	
            throw new NoRegistrationPlatesException("No registration plates remaining");
            
        }

        String nextPlateNumber = registrationPlates[nextPlateIndex];

        StaticsLabRegistrationPlate newPlate = new StaticsLabRegistrationPlate(nextPlateNumber);

        nextPlateIndex++;

        return newPlate;
    }
}