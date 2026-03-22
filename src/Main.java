//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача № 1
        System.out.println("Задача № 1   ");
        for (int i = 1; i <= 10; i++){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 2
        System.out.println("Задача № 2");
        for (int i = 10; i >= 1; i --){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 3
        System.out.println("Задача № 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 4
        System.out.println("Задача № 4");
        for (int i = 10; i <= 10 && i >= -10; i --){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 5
        System.out.println("Задача № 5");
        for (int i = 1904; i >= 1904 && i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным ");
        }

        // Задача № 6
        System.out.println("Задача № 6");
        for (int i = 7; i >= 7 && i <= 98; i = i + 7){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 7
        System.out.println("Задача № 7");
        for (int i = 1; i >= 1 && i <= 512; i = i * 2){
            System.out.println("Итерация цыкла № " + i + ", число " + i);
        }

        // Задача № 8
        System.out.println("Задача № 8 - решение 1");
        // решение, если считаем, что получил ЗП в первом месяце
        int salary = 29_000;
        int namberMonth = 1;
        int total = 0;
        for (int i = 1; i <= 12; i ++){
            total = salary + total;
            System.out.println("Месяц № " + namberMonth + ", сумма накоплений равна " + total + " рублей");
            namberMonth++;
        }

        System.out.println("Задача № 8 - решение 2");
        // решение, если считаем, что получил ЗП в первом месяце не получил
         salary = 29_000;
         namberMonth = 1;
         total = 0;
        for (int i = 1; i <= 12; i ++){
            System.out.println("Месяц № " + namberMonth + ", сумма накоплений равна " + total + " рублей");
            total = salary + total;
            namberMonth++;
        }

        System.out.println("Задача № 9");

        salary = 29_000;
        namberMonth = 1;
        double totalBank = 0D;

        for (int i = 1; i <= 12; i ++){
            totalBank = (salary + totalBank) * 1.12;
            System.out.println("Месяц № " + namberMonth + ", сумма накоплений равна " +
                    "" + String.format("%.1f", totalBank) + " рублей");
            namberMonth++;
        }

        System.out.println("Задача № 10 - вариант с умножением");
        int myIntenger = 1;
        for (int i = 1; i <= 10; i ++){
            myIntenger = i * 2;
            System.out.println("2 * " + i + " = " + myIntenger);
        }

        System.out.println("Задача № 10 - путем сложения");
        myIntenger = 1;
        for (int i = 1; i <= 10; i ++){
            myIntenger = i + i;
            System.out.println("2 * " + i + " = " + myIntenger);
        }
        System.out.println("надеюсь без ошибок :))) - спасибо, было интересно");
    }
}