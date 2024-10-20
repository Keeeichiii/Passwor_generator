package example;

public class PassGenerator extends PasswordPartsGenerator {

    protected void InitializationAndAdding() {
        CharGenerator();
        IntegerGenerator();
        SpecCharGenerator();
        finalPassword.append(chars);
        finalPassword.append(ints);
        finalPassword.append(specChars);
    }

    protected void FinalGeneration() {
        InitializationAndAdding();
        char[] passwordArray = finalPassword.toString().toCharArray();


        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = ran_num.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        String shuffledPassword = new String(passwordArray);
        setShuffpass(shuffledPassword);
    }

    public void DisplayInfo() {
        PasswordLengthInput size = new PasswordLengthInput();
        size.Interface();
        setSizes(size.getSizeInts(), size.getSizeChars(), size.getSizeSpecC());
        FinalGeneration();
        GetJson json = new GetJson();
        json.setShuffpass(getShuffpass());
        json.writePassInFile();
        System.out.println("Сгенерированный пароль: " + getShuffpass() + "" +
                           "\nДлина пароля: " + getShuffpass().length());
    }
}
