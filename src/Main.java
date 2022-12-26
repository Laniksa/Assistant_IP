import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static int earnings = 0;//доходы
    public static int spendings = 0;//расходы
    public static int taxCalculationEarningMinusSpredings(int earnings, int spendings){
        int tax = (earnings - spendings)*15/100;
        if (tax >= 0){
            return tax;
        }else{
            return 0;
        }
    }
    public static int taxCalculationEarnings(int earnings){
        int tax = earnings*6/100;
        return tax;
    }
    public static void taxBenefits(int earnings, int spendings){
        if(taxCalculationEarningMinusSpredings(earnings, spendings) <= taxCalculationEarnings(earnings)){
            System.out.println("Для вас выгоден УСН 15% \n Экономия: "+ (taxCalculationEarnings(earnings)-taxCalculationEarningMinusSpredings(earnings, spendings)));
        }else{
            System.out.println("Для вас выгоден УСН 6% \n Экономия: "+(taxCalculationEarningMinusSpredings(earnings,spendings)-taxCalculationEarnings(earnings)));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        while (true) {
            System.out.println("Выберите операцию и введите ее номер: \n 1. Добавить новый доход \n 2. Добавить новый расход \n 3. Выбрать систему налогообложения");
            String str = scan.nextLine();
            int num = Integer.parseInt(str);
            if ("end".equals(num)){
                System.out.println("Программа завершена");
                break;
            }else{
                switch(num){
                    case 1:
                        System.out.println("Введите сумму дохода");
                        String strE = scan.nextLine();
                        int inputE = Integer.parseInt(strE);
                        earnings+=inputE;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода");
                        String strS = scan.nextLine();
                        int inputS = Integer.parseInt(strS);
                        spendings+=inputS;
                        break;
                    case 3:
                        System.out.println("Выбрать систему налогооблажения");
                        taxBenefits(earnings,spendings);
                    default:
                        System.out.println("Такой операции не существует");

                }
            }
        }
    }
}