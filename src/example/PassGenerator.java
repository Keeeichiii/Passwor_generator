package example;
import java.util.Random;

class TestGenerator{
    public static void main(String[]args){
        PassGenerator meow=new PassGenerator();
        meow.CharGenerator();
        meow.IntegerGenerator();
        meow.SpecCharGenerator();
        meow.FinalGeneration();
    }
}
class PassGenerator{
    Random ran_num = new Random();
    StringBuilder chars = new StringBuilder();
    StringBuilder ints = new StringBuilder();
    StringBuilder specChars = new StringBuilder();
    StringBuilder finalPassword = new StringBuilder();
    String specialChar = "#$%^&*()!@[]{};:'\"<>,.?/\\|+-";

    public void CharGenerator() {
        for (int i = 0; i < 3; i++) {
            char rand_char = (char) (ran_num.nextInt(26) + 'a');
            chars.append(rand_char);
        }
        for (int i = 0; i < 3; i++) {
            char rand_char_upper = (char) (ran_num.nextInt(26) + 'A');
            chars.append(rand_char_upper);
        }
    }

    public void IntegerGenerator(){
        for (int i = 0; i < 3; i++) {
            int rand_integer = ran_num.nextInt(10);
            ints.append(rand_integer);
        }
    }
    public void SpecCharGenerator(){
        for (int i = 0; i < 3; i++) {
            int index = ran_num.nextInt(specialChar.length());
            char speclChar = specialChar.charAt(index);
            specChars.append(speclChar);
        }
    }
    public void FinalGeneration(){
        finalPassword.append(chars);
        finalPassword.append(ints);
        finalPassword.append(specChars);
        String password = finalPassword.toString();
        char[] passwordArray = password.toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = ran_num.nextInt(i + 1);
            char cash = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = cash;
        }
        String shuffpass = new String(passwordArray);
        System.out.println("Сгенерированный пароль: " + shuffpass);
    }

}