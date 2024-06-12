package ru.netology;

public class JvmComprehension { //резервируем область памяти в metaspace

        public static void main(String[] args) { //создаем фрейм main в стеке
            int i = 1;                      //  добавляем в фрейм main
            Object o = new Object();        // добавляе объекта в кучу, и создание ссылки на объект во фрейме main, так же работает загрузчик к Bootstrap ClassLoader
            Integer ii = 2;                 // добавляем объект добавляем в фрейм main и в кучу
            printAll(o, i, ii);             // создается фрейм printAll, работает загрузчик классов Platform ClassLoader, связываем два фрейма через ссылки в куче
            System.out.println("finished"); // используется фрейм который был создан раньше, туда передается значение которое будет записано в куче
        }

        private static void printAll(Object o, int i, Integer ii) {
            Integer uselessVar = 700;                   //  добавляем во фрейм printAll
            System.out.println(o.toString() + i + ii);  // создаем еще один фрейм, куда передаем из кучи данные
        }
}

