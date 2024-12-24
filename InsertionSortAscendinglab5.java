public class InsertionSortAscendinglab5 {

    public static void insertionSortAscending(short[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        for (int i = 1; i < array.length; i++) {
            short key = array[i];
            int j = i - 1;

            // Вставляємо елемент у відсортовану частину масиву, зменшуючи індекс
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        short[] array = {5, 3, 1, 4, 2};
        insertionSortAscending(array);
        for (short num : array) {
            System.out.print(num + " "); // Виведе 1 2 3 4 5
        }
    }
}