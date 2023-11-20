package numberbaseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class User {

    String userNum = "";

    //TODO: 유저에게 숫자를 입력받기
    public User createUser() {
        System.out.print("번호를 입력. : ");

        Scanner sc = new Scanner(System.in);
        userNum = sc.nextLine();

        if (userNum.length() != 3) throw new IllegalArgumentException();

        return new User();
    }
}
