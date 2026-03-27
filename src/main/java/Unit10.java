import java.util.Scanner;

public class Unit10 {
    public String getTrainId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Train ID:");
        return sc.nextLine();
    }

    public String getCargoCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cargo Code:");
        return sc.nextLine();
    }

    public boolean validateTrainId(String trainId) {
        if (trainId.startsWith("TRN-") && trainId.length() == 8) {
            String digits = trainId.substring(4);
            for (char c : digits.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean validateCargoCode(String cargoCode) {
        if (cargoCode.startsWith("PET-") && cargoCode.length() == 7) {
            String letters = cargoCode.substring(4);
            for (char c : letters.toCharArray()) {
                if (!Character.isUpperCase(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void displayResult(String trainId, String cargoCode) {
        if (validateTrainId(trainId)) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Train ID is invalid: " + trainId);
        }

        if (validateCargoCode(cargoCode)) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Cargo Code is invalid: " + cargoCode);
        }
    }

    public void run() {
        String trainId = getTrainId();
        String cargoCode = getCargoCode();
        displayResult(trainId, cargoCode);
    }
}