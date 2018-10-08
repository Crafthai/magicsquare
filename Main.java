import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int magicSquare[][] = new int[3][3];
        Random numbers = new Random();
        int counter = 0;

        while (magicSquare[0][0] + magicSquare[0][1] + magicSquare[0][2] != 15 ||
                magicSquare[0][0] + magicSquare[1][0] + magicSquare[2][0] != 15 ||
                magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2] != 15 ||
                magicSquare[2][0] + magicSquare[2][1] + magicSquare[2][2] != 15 ||
                magicSquare[0][2] + magicSquare[1][2] + magicSquare[2][2] != 15 ||
                magicSquare[2][0] + magicSquare[1][1] + magicSquare[0][2] != 15 ||
                magicSquare[1][0] + magicSquare[1][1] + magicSquare[1][2] != 15 ||
                magicSquare[0][1] + magicSquare[1][1] + magicSquare[2][1] != 15) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    magicSquare[i][j] = 0;
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int insert = (numbers.nextInt(9)+1);
                    while (insert == magicSquare[0][0] || insert == magicSquare[0][1] || insert == magicSquare[0][2] ||
                            insert == magicSquare[1][0] || insert == magicSquare[1][1] || insert == magicSquare[1][2] ||
                            insert == magicSquare[2][0] || insert == magicSquare[2][1] || insert == magicSquare[2][2]) {
                        insert = (numbers.nextInt(9)+1);
                    }
                    magicSquare[i][j] = insert;
                }
            }
            System.out.println("\n" + magicSquare[0][0] + "" + magicSquare[0][1] + "" + magicSquare[0][2]
                    + "\n" + magicSquare[1][0] + magicSquare[1][1] + magicSquare[1][2]
                    + "\n" + magicSquare[2][0] + magicSquare[2][1] + magicSquare[2][2]);
            counter++;
        }
        System.out.println("\nattempts taken to get magic square: " + counter);
    }
}
