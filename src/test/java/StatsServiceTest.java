import static org.junit.jupiter.api.Assertions.*;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    void shouldCalculateSumForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 172;

        // вызываем целевой метод:
        int actual = statsservice.sum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    void shouldCalculateAvgForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 14;

        // вызываем целевой метод:
        int actual = statsservice.avg(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    void shouldCalculateMaxForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 33;

        // вызываем целевой метод:
        int actual = statsservice.max(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    void shouldCalculateMinForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 3;

        // вызываем целевой метод:
        int actual = statsservice.min(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    void shouldCalculateLowerAvgForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 7;

        // вызываем целевой метод:
        int actual = statsservice.lower(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    void shouldCalculateHigherAvgForSales() {
        StatsService statsservice = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        int expected = 5;

        // вызываем целевой метод:
        int actual = statsservice.higher(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
