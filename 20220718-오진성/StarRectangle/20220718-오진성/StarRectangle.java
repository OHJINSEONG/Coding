import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        String star = "";

        if (width <= 1000 && height <= 1000) {
            for (int i = 0; i < height; i += 1) {
                for (int j = 0; j < width; j += 1) {
                    star += "*";
                }
                star += "\n";
            }
            System.out.println(star);
        }
    }
}
