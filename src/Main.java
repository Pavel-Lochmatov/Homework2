public class Main {
    public static void main(String[] args) {
        // стоимость билета
        int costTicket = 10_000;
        // количество потраченных рублей для одной бонусной милли
        int summforOneMile = 20;
        //количество бонусных миль за билет
        int countBonusMiles = costTicket / summforOneMile;
        System.out.println(countBonusMiles);
    }
}
