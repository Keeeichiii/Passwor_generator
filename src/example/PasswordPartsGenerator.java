package example;
import java.util.Random;

class PasswordPartsGenerator {
    protected int sizeInts;
    protected int sizeChars;
    protected int sizeSpecC;
    protected Random ran_num = new Random();
    protected StringBuilder chars = new StringBuilder();
    protected StringBuilder ints = new StringBuilder();
    protected StringBuilder specChars = new StringBuilder();
    protected StringBuilder finalPassword = new StringBuilder();
    protected String specialChar = "#$%^&*()!@[]{};:'\"<>,.?/\\|+-";
    private String shuffpass;

    protected String getShuffpass() {
        return shuffpass;
    }

    protected void setShuffpass(String shuffpass) {
        this.shuffpass = shuffpass;
    }

    protected void setSizes(int sizeInts, int sizeChars, int sizeSpecC) {
        this.sizeInts = sizeInts;
        this.sizeChars = sizeChars;
        this.sizeSpecC = sizeSpecC;
    }

    protected void CharGenerator() {
        for (int i = 0; i < sizeChars / 2; i++) {
            char randChar = (char) (ran_num.nextInt(26) + 'a');
            chars.append(randChar);
        }
        for (int i = 0; i < sizeChars / 2; i++) {
            char randCharUpper = (char) (ran_num.nextInt(26) + 'A');
            chars.append(randCharUpper);
        }
    }

    protected void IntegerGenerator() {
        for (int i = 0; i < sizeInts; i++) {
            int randInteger = ran_num.nextInt(10);
            ints.append(randInteger);
        }
    }

    protected void SpecCharGenerator() {
        for (int i = 0; i < sizeSpecC; i++) {
            int index = ran_num.nextInt(specialChar.length());
            char specChar = specialChar.charAt(inпшdex);
            specChars.append(specChar);
        }
    }
}
