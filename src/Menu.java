import TaskOne.Car;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    private ArrayList<Car> list = new ArrayList<Car>();

    public Menu() {
        list.add(new Car("BMW X6 ", "Чорний", "CE 4312 BC", 2015, "Ігор Рахмістрюк"));
        list.add(new Car("Mercedes-Benz GLS 63 GT", "Чорний", "CE 2134 AK", 2017, "Максим Нищук"));
        list.add(new Car("Lexus LX 570", "Чорний", "CE 1204 DF", 2018, "Коля Бужняк"));
        list.add(new Car("Toyota Camry", "Чорний", "CE 5632 CF", 2016, "Скуратовський Вадим"));
        list.add(new Car("BMW X5 ", "Чорний", "CE 2122 LK", 2020, "Антон Продан"));
        list.add(new Car("Lexus LX 470", "Чорний", "CE 0931 OP", 2010, "Ткачук Богдан"));
        list.add(new Car("Opel Astra", "Сірий", "CE 1111 IO", 2015, "Сушинський Михайло"));
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1.Перше завдання." + "\n" +
                    "2.Друге завдання." + "\n" +
                    "3.Вихід." + "\n" +
                    "Введіть число : ");
            int nomer = scanner.nextInt();

            switch (nomer) {
                case 1:
                    TaskOne();
                    break;
                case 2:
                    sort();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Не вірно введене число! Введіть ще раз :");
                    break;
            }
        }
    }


    /*
   Описати клас для бази зданих з інформацією про автомобілі з полями: марка, колір, номер, рік випуску, дані про власника.
    Відсортувати масив даних по марках автомобілів та вивести його на екран у формі таблиці.

    * */
    public void TaskOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nСписок машин :");
        for (Car car : list) {
            System.out.println(car);
        }
    }

    public void sort() {
        list.sort(Comparator.comparing(Car::getMarka));
        for (Car car : list) {
            System.out.println(car);
        }
    }
}
