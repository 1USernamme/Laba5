public class BubbleSortAscendingLab5 {

    public static void bubbleSortAscending(short[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмін елементів
                    short temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        short[] array = {5, 3, 1, 4, 2};
        bubbleSortAscending(array);
        for (short num : array) {
            System.out.print(num + " "); // Виведе 1 2 3 4 5
        }
    }
}