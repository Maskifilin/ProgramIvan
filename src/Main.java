
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Human human = new Human();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Write your name: ");
            human.setName(reader.readLine());
            System.out.print("Write your surname:");
            human.setSurname(reader.readLine());
            System.out.print("Write user cache amount: ");
            human.setCacheAmount(Double.parseDouble(reader.readLine()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(human);

        boolean systemIsRun = true;

        do {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("Press: 1 - to buy bred (-10$)");
            System.out.println("Press: 2 - to buy water (-15$)");
            System.out.println("Press: 3 - to go work (+0-20$)");
            System.out.println("Press: 4 - to add overtime hours");
            String option = reader.readLine();


            switch (option) {
                case "1":
                    human.buyBred();
                    break;
                case "2":
                    human.buyWater();
                    break;
                case "3":
                    human.goWork();
                    break;
                case "4":
                    human.doOvertime();
                    break;
                default:
                    systemIsRun = false;
            }

            System.out.println(human.toString());

        } while (systemIsRun);

    }
}


