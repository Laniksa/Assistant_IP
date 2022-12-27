import java.util.Scanner;

public class Main {
    public static int earnings = 0;//доходы
    public static int spendings = 0;//расходы
    public static int taxCalculationEarningMinusSpendings(int earnings, int spendings){
        int tax = (earnings - spendings)*15/100;
        return Math.max(tax, 0);
    }
    public static int taxCalculationEarnings(int earnings){
        return earnings*6/100;
    }
    public static void taxBenefits(int earnings, int spendings){
        if(taxCalculationEarningMinusSpendings(earnings, spendings) <= taxCalculationEarnings(earnings)){
            System.out.println("Для вас выгоден УСН 15% (Доходы - Расходы)\n " +
                    "Ваш налог составляет: "+taxCalculationEarningMinusSpendings(earnings, spendings)+" руб.\n " +
                    "Сумма налога по УСН 6% (Доходы) составляет: "+taxCalculationEarnings(earnings)+" руб. \n " +
                    "Экономия: "+ (taxCalculationEarnings(earnings)-taxCalculationEarningMinusSpendings(earnings, spendings))+" руб.");
        }else{
            System.out.println("Для вас выгоден УСН 6% (Доходы)\n " +
                    "Ваш налог составляет: "+taxCalculationEarnings(earnings)+" руб.\n " +
                    "Сумма налога по УСН 15% (Доходы - Расходы) составляет: "+taxCalculationEarningMinusSpendings(earnings, spendings)+" руб. " +"\n " +
                    "Экономия: "+(taxCalculationEarningMinusSpendings(earnings,spendings)-taxCalculationEarnings(earnings))+" руб.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        while (true) {
            System.out.println("Выберите операцию и введите ее номер: \n 1. Добавить новый доход \n 2. Добавить новый расход \n 3. Выбрать систему налогообложения");
            String str = scan.nextLine();

            if ("end".equals(str)){
                System.out.println("Программа завершена");
                break;
            }else{
                int num = Integer.parseInt(str);
                switch (num) {
                    case 1 -> {
                        System.out.println("Введите сумму дохода");
                        String strE = scan.nextLine();
                        int inputE = Integer.parseInt(strE);
                        earnings += inputE;
                    }
                    case 2 -> {
                        System.out.println("Введите сумму расхода");
                        String strS = scan.nextLine();
                        int inputS = Integer.parseInt(strS);
                        spendings += inputS;
                    }
                    case 3 -> {
                        System.out.println("Выбрать систему налогооблажения");
                        taxBenefits(earnings, spendings);
                    }
                    default -> System.out.println("Такой операции не существует");
                }
            }
        }
    }
}