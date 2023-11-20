package numberbaseball;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IllegalArgumentException{
        BaseBallStarter starter = new BaseBallStarter();
        try {
            starter.start();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("숫자를 다시 입력해주세요.");
            System.out.println("숫자는 총 3개로 1 ~ 9 사이로 입력해야 됩니다.");
        }

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

        Scanner sc = new Scanner(System.in);
        int restart = sc.nextInt();
        while (restart != 2) {
            if(restart == 1) starter.start();
            else {
                System.out.println("잘못된 숫자 입니다. 다시 입력해주세요.");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
            }
        }
        sc.close();
    }
}