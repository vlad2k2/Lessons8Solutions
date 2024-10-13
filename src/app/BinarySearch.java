package app;

public class BinarySearch {

    static public int binarySearch(int[] arrInt, int number) {
        int left = 0;
        int right = arrInt.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arrInt[mid] == number) {
                return mid; // Повертаємо індекс, якщо знайдено
            } else if (arrInt[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Повертаємо -1, якщо не знайдено
    }
}
