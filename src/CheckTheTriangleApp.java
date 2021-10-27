import java.util.Scanner;

public class CheckTheTriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Validator validate = (dimA, dimB, dimC) -> {
            if (dimA > dimB && dimA > dimC) {
                if (dimA < dimB + dimC) {
                    return true;
                }
            } else if (dimB > dimA && dimB > dimC) {
                if (dimB > dimA + dimC) {
                    return true;
                }
            } else if (dimC > dimA && dimC > dimB) {
                if (dimC < dimA + dimB) {
                    return true;
                }
            } else if (dimA == dimB && dimB == dimC) {
                return true;
            }
            return false;
        };
        int decision = 1;
        do {
            System.out.println("enter triangle dimensions");
            System.out.println("dimension A");
            double dimensionA = scanner.nextDouble();
            System.out.println("dimension B");
            double dimensionB = scanner.nextDouble();
            System.out.println("dimension C");
            double dimensionC = scanner.nextDouble();

            System.out.println(validate.checkTriangle(dimensionA, dimensionB, dimensionC));
            System.out.println("close the program - press 0");
            decision = scanner.nextInt();
        } while (decision != 0);
    }
}
