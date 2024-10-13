package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lessons8Solutions {

    // Створіть масив цілих чисел з 15 елементами.
    static int[] arrInt = new int[15];

    static public void main(String[] args){

        Random ran = new Random();

        // Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
        for (int index = 0; index < arrInt.length; index++ ) {
            // 8 to 16 Java
            // arrInt[index] = ran.nextInt(100) + 1;
            // from 17 +++
            arrInt[index] = ran.nextInt(1, 101);
        }
        // Виведіть початковий вигляд масиву.
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(arrInt));

        // Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
        InsertionSort.insertionSort(arrInt);

        // Виведіть відсортований масив.
        System.out.println("Відсортований масив: " + Arrays.toString(arrInt));
        // Вивід через for
//        System.out.print("Відсортований масив через for: ");
//         for (int index = 0; index < arrInt.length; index++){
//            System.out.print(arrInt[index]);
//
//            // Нема КОМИ після останнього елемента
//             if(index < arrInt.length -1){
//                 System.out.print(", ");
//             }
//        }

        // Попросіть користувача ввести число для пошуку в масиві.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int number = scanner.nextInt();

        // Використовуючи алгоритм бінарного пошуку, знайдіть і виведіть індекс введеного
        // користувачем числа у відсортованому масиві або повідомте, якщо числа немає.
        int index = BinarySearch.binarySearch(arrInt, number);

        if (index != -1) {
            System.out.println("Індекс числа " + number + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число " + number + " не знайдено у масиві.");
        }

    }

}
