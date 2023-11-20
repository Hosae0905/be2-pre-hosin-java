package NumberBaseBall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class User {

    static GameRole role = new GameRole();

    //TODO: 유저에게 숫자를 입력받기
    public ArrayList<Integer> createUser() throws IOException, IllegalArgumentException {
        ArrayList<Integer> user = new ArrayList<>();
        System.out.print("번호를 입력. : ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            char[] charArray = st.nextToken().toCharArray();

            if (charArray.length != 3) throw new IllegalArgumentException();

            for (int i = 0; user.size() < 3; i++) {
                user.add(i, (charArray[i] - '0'));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 잘못 입력하셨습니다.");
            System.out.println("숫자는 1 ~ 9까지 총 3개만 입력해주세요.");
        }

        return user;
    }

    public void clearUser(ArrayList<Integer> user) {
        user.clear();
    }
}
