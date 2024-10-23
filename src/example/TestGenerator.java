package example;

class TestGenerator {
    public static void main(String[] args) {
        //для безопасноти можно вынести этот класс за пределы пакета:)
        PassGenerator call = new PassGenerator();
        call.DisplayInfo();
    }
}