//  Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
package app;

public class InsertionSort {
     //  Метод сортування масиву за допомогою алгоритму сортування вставками (Insertion Sort)
    public static void insertionSort(int[] arrInt) {

        for (int i = 1; i < arrInt.length; i++) {
            int key = arrInt[i];
            int j = i - 1;
            while (j >= 0 && arrInt[j] > key) {
                // Переміщення елементів, які більше за key, на одну позицію вперед
                arrInt[j + 1] = arrInt[j];
                j--;
            }
            // Вставлення key на правильну позицію у відсортованій частині масиву
            arrInt[j + 1] = key;
        }
    }
}
