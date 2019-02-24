public class SelectionSort {
    public static void main(String[] args) {
        //сортировка массива методом перебора Selection sort по возрастанию
        {
            System.out.print("Исходный массив: "); //выводим комментарий на экран
            int mas[] = new int[7]; //объявляем массив
            for (int i = 0; i < mas.length; i++) //формируем массив
            {
                mas[i] = (int) (Math.random() * 10); /*заполняем массив случайным числом от 0 до 10,
                                                число с точкой округляется до целого объявлением (int)*/
                System.out.print(mas[i] + " "); //выводим поочередно элементы массива на экран
            }
            for (int i = 0; i < mas.length; i++) {
                int min = mas[i]; //приравниваем к мин значению первый элемент
                int min_i = i; //задаем положение минимума
                for (int j = i + 1; j < mas.length; j++) //ищем минимум
                {
                    if (mas[j] < min) //сравниваем текущий элемент с значением минимума
                    {
                        min = mas[j]; //если найден новый мин, то записываем его значение в переменную...
                        min_i = j; //...и запоминаем его новое положение
                    }
                }
                if (i != min_i) //обмениваем значения
                {
                    int k = mas[i];
                    mas[i] = mas[min_i];
                    mas[min_i] = k;
                }
            }
            System.out.println();
            System.out.print("Отсортированный массив: "); //выводим комментарий на экран
            for (int m = 0; m <= mas.length - 1; m++) //выводим поочередно элементы массива на экран
            {
                System.out.print(mas[m] + " ");
            }
        }
    }
}