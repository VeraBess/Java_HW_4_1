public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150; //ожидаемый результат
        long actual = service.calculate(5_000, true); // фактический результат
        System.out.println(expected + "==?==" + actual);
    }
}
