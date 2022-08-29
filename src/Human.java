import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Human {
    private String name;
    private String surname;
    private double cacheAmount;

    public void goWork() {
        double value = Math.random() * 20;
        double scale = Math.pow(10, 2);

        double earnedMoney = Math.ceil(value * scale) / scale;

        setCacheAmount(cacheAmount + earnedMoney);
        System.out.println(name + surname + "earned: " + earnedMoney + "$");
    }

    @Override
    public String toString() {
        return name + " " + surname + ", получил " + cacheAmount + "$";
    }

    public void buyBred() {
        if (cacheAmount - 10 > 0) {
            setCacheAmount(cacheAmount - 10);
            System.out.println("Bread was bought");
        } else {
            System.out.println("Unfortunately, you haven't enough money");
        }
    }

    public void buyWater()
    {
        if (cacheAmount - 15 > 0)
        {
            setCacheAmount(cacheAmount - 15);
            System.out.println("Water was bought");
        }
        else
        {
            System.out.println("Unfortunately, you haven't enough money");
        }
    }
    public void doOvertime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите кол.overtime");
        int hours = Integer.parseInt(reader.readLine());
        int workovertime = hours * 5; setCacheAmount(cacheAmount + workovertime);
        System.out.println(name + " "+ surname + " "+ "переработал на : " + workovertime + "$");
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public double getCacheAmount()
    {
        return cacheAmount;
    }

    public void setCacheAmount(double cacheAmount)
    {
        this.cacheAmount = cacheAmount;
    }

    private String doOvertime;
}
