package numberbaseball;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException{
        BaseBallStarter starter = new BaseBallStarter();
        starter.start();
    }

    /*private static void numberBall(ArrayList<Integer> user) throws IOException {

        ArrayList<Integer> computer = new ArrayList<>();
        //TODO: 컴퓨터 숫자 생성
        while (computer.size() < 3) {
            int randomNum = (int) (Math.random() * 10);
            if (!computer.contains(randomNum)) {
                computer.add(randomNum);
            }
        }

        while (strike != 3) {

            numberDiff(computer, user);     // 컴퓨터와 유저의 숫자를 비교

            if (strike == 3) {
                break;
            } else if (out == 3){
                System.out.println("낫싱");
            } else {
                System.out.printf("%d스트라이크 %d볼 %d 아웃입니다.\n", strike, ball, out);
            }

            clearData();        // 숫자 야구 데이터를 초기화 및 유저 숫자를 초기화
            createUser(user);   // 유저의 숫자를 다시 입력받기
        }

        System.out.printf("%d스트라이크 입니다.\n", strike);
    }*/

    //TODO: 숫자를 비교
    /*private static void numberDiff(ArrayList<Integer> computer, ArrayList<Integer> user) {

        for (int i = 0; i < computer.size(); i++) {
            int num1 = computer.get(i);     // 컴퓨터가 가지고 있는 숫자
            int num2 = user.get(i);         // 유저가 가지고 있는 숫자

            if (num1 == num2) {
                strike++;
            } else if (computer.contains(num2)) {
                ball++;
            } else if (!computer.contains(num2)){
                out++;
            }
        }
    }*/

    //TODO: 유저에게 숫자를 입력받기
    /*private static void createUser(ArrayList<Integer> user) throws IOException, IllegalArgumentException {
        System.out.print("번호를 입력. : ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            char[] charArray = st.nextToken().toCharArray();

            if (charArray.length > 3) throw new IllegalArgumentException();

            for (int i = 0; user.size() < 3; i++) {
                user.add(i, (charArray[i] - '0'));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 잘못 입력하셨습니다.");
            System.out.println("숫자는 1 ~ 9까지 총 3개만 입력해주세요.");
        }
    }*/

    //TODO: 숫자 데이터 초기화
    /*private static void clearData() {
        strike = 0;
        ball = 0;
        out = 0;
        user.clear();
    }*/
}