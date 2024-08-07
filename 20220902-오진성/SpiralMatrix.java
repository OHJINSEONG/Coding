import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix application = new SpiralMatrix();

        System.out.print("배열의 한변의 길이 :");

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        System.out.println("나선형 배열 :");

        int[][] spiralMatrix = application.spiralMatrix(length);

        for (int i = 0; i < length; i += 1) {
            for (int j = 0; j < length; j += 1) {
                System.out.print(spiralMatrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    private int[][] spiralMatrix(int length) {
        int[][] spiralMatrix = new int[length][length];

        int arrayLength = length;

        int i = -1;
        int j = 0;
        int value = -1;
        int increment = 1;

        for (int k = 0; k < arrayLength; k += 1) {
            i += 1;
            value += 1;
            spiralMatrix[j][i] = value;
        }

        arrayLength -= 1;

        while (arrayLength != 0) {
            for (int k = 0; k < arrayLength; k += 1) {
                value += 1;
                j += increment;
                spiralMatrix[j][i] = value;
            }

            for (int k = 0; k < arrayLength; k += 1) {
                value += 1;
                i -= increment;
                spiralMatrix[j][i] = value;
            }

            arrayLength -= 1;
            increment *= -1;
        }
        return spiralMatrix;
    }
}
