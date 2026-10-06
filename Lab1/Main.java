import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем массив типа Integer для дальнейшей сортировки чисел по возрастанию
        int[] sides = new int[4];

        // Вводим стороны четырех квадратов A, B, C, D
        sides[0] = in.nextInt();
        sides[1] = in.nextInt();
        sides[2] = in.nextInt();
        sides[3] = in.nextInt();

        // Сортируем стороны по возрастанию
        Arrays.sort(sides);

        // Создаем переменные типа Integer и записываем в них стороны квадратов
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        int d = sides[3];

        // Создаем переменную типа Int равную 0 для подсчета
        int k = 0;

        // Проверяем все возможные случаи для подмножества, состоящего из 2 элементов
        if (a == b){
            k++;
        }
        if (a == c){
            k++;
        }
        if (a == d){
            k++;
        }
        if (b == c){
            k++;
        }
        if (b == d){
            k++;
        }
        if (c == d){
            k++;
        }

        // Проверяем все возможные случаи для подмножества, состоящего из 3 элементов
        if (a == b){
            if (c == a || c == 2 * a){
                k++;
            }
        }
        if (a == b){
            if (d == a || d == 2 * a){
                k++;
            }
        }
        if (a == c){
            if (d == a || d == 2 * a){
                k++;
            }
        }
        if (b == c){
            if (d == b || d == 2 * b){
                k++;
            }
        }

        // Проверяем все возможные случаи для подмножества, состоящего из 3 элементов
        if (a == b && b == c && c == d){
            k+=2;
        } else{
            if (a == b && b == c && d == 3 * a){
                k++;
            } else{
                if (a == b && c == 2 * a && d == 3 * a) {
                    k++;
                }
            }
        }

        // Выводим на экран количество прямоугольников
        System.out.println(k);
    }
}
