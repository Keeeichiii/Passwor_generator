package example;
import java.util.Scanner;

public class PasswordLengthInput extends PasswordPartsGenerator {

    Scanner input = new Scanner(System.in);
    int length;

    public void Interface() {
        do {
            System.out.println("Введите длину пароля от 8 до 12:");
            length = input.nextInt();
            if (length < 8 || length > 12)
                System.out.println("!!!Размер пароля должен быть от 8 до 12!!!");
        } while (length < 8 || length > 12);
        choice(length);
    }

    protected void choice(int length) {
        sizeInts = length / 3;
        sizeSpecC = length / 3;
        sizeChars = length - sizeInts - sizeSpecC;

        if (length % 2 != 0) {
            sizeInts = length / 4;
            sizeSpecC = length / 3;
            sizeChars = length - sizeInts - sizeSpecC;
        }
        setSizes(sizeInts, sizeChars, sizeSpecC);
    }

    public int getSizeInts() {
        return sizeInts;
    }

    public int getSizeChars() {
        return sizeChars;
    }

    public int getSizeSpecC() {
        return sizeSpecC;
    }
}
