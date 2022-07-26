import ru.netology.sqr.SqrService;

public class Main {
    public static void main(String[] args) {


        int x = 200;
        int y = 300;
        SqrService service = new SqrService();

        System.out.println(SqrService.calcSqr(x, y));
    }
}
