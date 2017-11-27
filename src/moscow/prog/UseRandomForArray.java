package moscow.prog;

public class UseRandomForArray {
    public static void main(String[] args) {
        int[] randomArray = new int[100];

        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomInteger();
        }

    }

    private static int getRandomInteger() {
        double randomValue = Math.random() * 100;
        return (int)randomValue;
    }
}
