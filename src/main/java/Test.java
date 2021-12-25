import ru.netology.stats.StatsService;

public class Test {
    public static void main(String[] args){
        int[] sales = {8, 10, 3, 6, 15, 33, 12, 26, 12, 9, 21, 17};
        StatsService statsservice = new StatsService();
        System.out.println("sum: " + statsservice.sum(sales));
        System.out.println("avg: " + statsservice.avg(sales));
        System.out.println("max: " + statsservice.max(sales));
        System.out.println("min: " + statsservice.min(sales));
        System.out.println("lower: " + statsservice.lower(sales));
        System.out.println("higher: " + statsservice.higher(sales));
    }
}
