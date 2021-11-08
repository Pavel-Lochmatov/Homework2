public class Main2 {
    public static void main(String[] args) {
        // начальный счет
        int currentbill = 100;
        // сумма пополнения
        int replenishmentamount = 2000;
        // бонус
        int bonus;
        //общая сумма после пополнения с учетом бонуса
        int totalSumm;
        if (replenishmentamount > 1000) {
            bonus = replenishmentamount / 100;
            totalSumm = currentbill + replenishmentamount + bonus;
        } else {
            bonus = 0;
            totalSumm = currentbill + replenishmentamount;
        }
        System.out.println(totalSumm);
        System.out.println(bonus);
    }
}
