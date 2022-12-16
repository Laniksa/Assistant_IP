import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int earnings = 0;//доходы
        int spendings = 0;//расходы
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

                }
            }
        }
    }
}