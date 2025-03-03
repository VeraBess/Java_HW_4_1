import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test //зарегистрирован лимит не превышен
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1_000; // стоимость покупки
        boolean registered = true; // пользователь зарегистрирован
        long expected = 30; // ожидаемый результат

        long actual = service.calculate(amount, registered); // вызов целевого метода

        Assertions.assertEquals(expected, actual); //проверка соответствия ожидаемого и фактического
    }

    @Test //зарегистрирован лимит превышен
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000; // стоимость покупки
        boolean registered = true; // пользователь зарегистрирован
        long expected = 500; // ожидаемый результат

        long actual = service.calculate(amount, registered); // вызов целевого метода

        Assertions.assertEquals(expected, actual); //проверка соответствия ожидаемого и фактического

    }

    @Test //Не зарегистрирован лимит не превышен
    public void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1_000; // стоимость покупки
        boolean registered = false; // пользователь зарегистрирован
        long expected = 10; // ожидаемый результат

        long actual = service.calculate(amount, registered); // вызов целевого метода

        Assertions.assertEquals(expected, actual); //проверка соответствия ожидаемого и фактического
    }

    @Test // не зарегистрирован лимит превышен
    public void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000; // стоимость покупки
        boolean registered = false; // пользователь зарегистрирован
        long expected = 500; // ожидаемый результат

        long actual = service.calculate(amount, registered); // вызов целевого метода

        Assertions.assertEquals(expected, actual); //проверка соответствия ожидаемого и фактического
    }

}
