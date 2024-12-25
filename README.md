# Laba5
Давайте розберемо кожен рядок і кожен символ коду в обох алгоритмах сортування — **Сортування вставкою (Insertion Sort)** та **Сортування бульбашкою (Bubble Sort)**. Я поясню їх покроково.

### 1. **Сортування вставкою (Insertion Sort)**

#### Клас `InsertionSortAscending`:

```java
public class InsertionSortAscending { // Оголошення класу InsertionSortAscending
    public static void insertionSortAscending(short[] array) { // Оголошення методу для сортування
        if (array == null) { // Перевірка, чи масив не є null
            throw new NullPointerException("Масив не може бути null"); // Якщо масив null, кидаємо виключення
        }
        for (int i = 1; i < array.length; i++) { // Починаємо з другого елемента (індекс 1)
            short key = array[i]; // Беремо елемент, який будемо вставляти в відсортовану частину
            int j = i - 1; // Індекс попереднього елемента
            // Вставляємо елемент у відсортовану частину масиву, зменшуючи індекс
            while (j >= 0 && array[j] > key) { // Поки індекс не вийде за межі або поки поточний елемент більший за ключ
                array[j + 1] = array[j]; // Переміщаємо елемент на одну позицію вправо
                j = j - 1; // Зменшуємо індекс для порівняння з попереднім елементом
            }
            array[j + 1] = key; // Вставляємо ключ на його правильне місце
        }
    }

    public static void main(String[] args) { // Головний метод
        short[] array = {5, 3, 1, 4, 2}; // Масив для сортування
        insertionSortAscending(array); // Викликаємо метод сортування
        for (short num : array) { // Перебираємо відсортований масив
            System.out.print(num + " "); // Виводимо кожен елемент масиву через пробіл
        }
    }
}
```

#### Пояснення коду:

1. **`public class InsertionSortAscending`**:
   - Це оголошення класу з іменем `InsertionSortAscending`.
   - Клас визначає структуру для нашого алгоритму сортування вставкою.

2. **`public static void insertionSortAscending(short[] array)`**:
   - Оголошуємо статичний метод `insertionSortAscending`, який приймає масив цілих чисел типу `short` (масив чисел, які мають тип `short`).
   - Метод не повертає жодного значення (`void`).

3. **`if (array == null)`**:
   - Перевіряємо, чи не є масив порожнім (null). Якщо так, кидаємо виключення `NullPointerException`.

4. **`for (int i = 1; i < array.length; i++)`**:
   - Цикл, який перебирає масив, починаючи з другого елемента (індекс 1), оскільки перший елемент вже вважається відсортованим.

5. **`short key = array[i];`**:
   - Зберігаємо поточний елемент масиву в змінну `key`, який ми будемо вставляти у відсортовану частину масиву.

6. **`int j = i - 1;`**:
   - Визначаємо індекс елемента, з яким будемо порівнювати поточний елемент (ключ).

7. **`while (j >= 0 && array[j] > key)`**:
   - Поки індекс не вийшов за межі масиву і поточний елемент більший за ключ, ми переміщаємо елементи вправо, щоб зробити місце для вставки.

8. **`array[j + 1] = array[j];`**:
   - Переміщаємо елемент праворуч, щоб зробити місце для ключа.

9. **`j = j - 1;`**:
   - Зменшуємо індекс для порівняння з попереднім елементом.

10. **`array[j + 1] = key;`**:
    - Вставляємо ключ (поточний елемент) на його правильне місце в відсортованій частині масиву.

11. **`public static void main(String[] args)`**:
    - Головний метод програми, з якого починається виконання.

12. **`short[] array = {5, 3, 1, 4, 2};`**:
    - Оголошуємо масив для сортування.

13. **`insertionSortAscending(array);`**:
    - Викликаємо метод сортування для масиву `array`.

14. **`for (short num : array)`**:
    - Перебираємо кожен елемент відсортованого масиву.

15. **`System.out.print(num + " ");`**:
    - Виводимо елемент масиву через пробіл.

---

### 2. **Сортування бульбашкою (Bubble Sort)**

#### Клас `BubbleSortAscending`:

```java
public class BubbleSortAscending { // Оголошення класу BubbleSortAscending
    public static void bubbleSortAscending(short[] array) { // Оголошення методу сортування бульбашкою
        if (array == null) { // Перевірка на null
            throw new NullPointerException("Масив не може бути null"); // Якщо масив null, кидаємо виключення
        }
        for (int i = 0; i < array.length - 1; i++) { // Зовнішній цикл для проходу по всіх елементах
            for (int j = 0; j < array.length - i - 1; j++) { // Внутрішній цикл для порівняння сусідніх елементів
                if (array[j] > array[j + 1]) { // Якщо поточний елемент більший за наступний
                    // Обмін елементів
                    short temp = array[j]; // Зберігаємо поточний елемент
                    array[j] = array[j + 1]; // Переміщаємо наступний елемент на місце поточного
                    array[j + 1] = temp; // Переміщаємо збережений елемент на місце наступного
                }
            }
        }
    }

    public static void main(String[] args) { // Головний метод
        short[] array = {5, 3, 1, 4, 2}; // Масив для сортування
        bubbleSortAscending(array); // Викликаємо метод сортування
        for (short num : array) { // Перебираємо відсортований масив
            System.out.print(num + " "); // Виводимо кожен елемент масиву через пробіл
        }
    }
}
```

#### Пояснення коду:

1. **`public class BubbleSortAscending`**:
   - Оголошуємо клас `BubbleSortAscending`.

2. **`public static void bubbleSortAscending(short[] array)`**:
   - Оголошуємо метод для сортування масиву бульбашкою.

3. **`if (array == null)`**:
   - Перевіряємо, чи масив не є null. Якщо так, кидаємо виключення.

4. **`for (int i = 0; i < array.length - 1; i++)`**:
   - Зовнішній цикл, який проходить по всіх елементах масиву, крім останнього.

5. **`for (int j = 0; j < array.length - i - 1; j++)`**:
   - Внутрішній цикл для порівняння сусідніх елементів і виконання обміну.

6. **`if (array[j] > array[j + 1])`**:
   - Якщо поточний елемент більший за наступний, виконуємо обмін.

7. **`short temp = array[j];`**:
   - Зберігаємо поточний елемент в тимчасовій змінній.

8. **`array[j] = array[j + 1];`**:
   - Поміщаємо наступний елемент на місце поточного.

9. **`array[j + 1] = temp;`**:
   - Поміщаємо збережений елемент на місце наступного.

10. **`public static void main(String[] args)`**:
    - Головний метод програми.

11. **`short[] array = {5, 3, 1, 4, 2};`**:
    - Масив

 для сортування.

12. **`bubbleSortAscending(array);`**:
    - Викликаємо метод для сортування масиву.

13. **`for (short num : array)`**:
    - Перебираємо відсортований масив.

14. **`System.out.print(num + " ");`**:
    - Виводимо кожен елемент масиву через пробіл.

---

