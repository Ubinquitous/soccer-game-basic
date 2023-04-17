import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        final ArrayList<String> attacker1;
        final ArrayList<String> attacker2;

        final ArrayList<String> goalkeeper;
        Scanner sc = new Scanner(System.in);

        System.out.println("attacker1의 공을 입력해주십시오.");
        attacker1 = Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("attacker2의 공을 입력해주십시오.");
        attacker2 = Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("goalkeeper의 공을 입력해주십시오.");
        goalkeeper = new ArrayList(Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new)));

        attacker1.removeAll(goalkeeper);
        attacker2.removeAll(goalkeeper);

        if(attacker1.size() > attacker2.size()) System.out.println("attacker1이 승리하였습니다.");
        else System.out.println("attacker2이 승리하였습니다.");
    }
}
