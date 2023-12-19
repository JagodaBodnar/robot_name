import java.util.Random;

public class RobotNameGenerator {
    private static final int minInt = 100;
    private static final int maxInt = 999;
    private static final int minAscii = 65;
    private static final int maxAscii = 90;

    public static void main(String[] args) {
        String[] robotNames = {"RX837", "BC811"};
        String generatedName;
        do {
            generatedName = RobotNameGenerator.generateName();
        }while (verifyName(robotNames, generatedName));
        System.out.printf("Robot name: %s%n", generatedName);


    }
    private static boolean verifyName(String[] robotNames, String newName){
        for(String value : robotNames){
            if(value.equals(newName)){
                return true;
            }
        }
        return false;
    }

    private static String generateName() {
        StringBuilder name = new StringBuilder();
        String letter1 = Character.toString(generateRandomNumber(minAscii, maxAscii));
        String letter2 = Character.toString(generateRandomNumber(minAscii, maxAscii));
        int number = generateRandomNumber(minInt, maxInt);
        name.append(letter1);
        name.append(letter2);
        name.append(number);
        return name.toString();
    }

    public static int generateRandomNumber(int min, int max) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(max - min + 1) + min;
    }
}


