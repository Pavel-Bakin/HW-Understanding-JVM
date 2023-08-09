public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      // 1
        Object o = new Object();        // 2
        Integer ii = 2;                 // 3
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}

// 1)int i = 1; - Объявляется переменная i типа int и инициализируется значением 1.
// Это происходит в методе main. Значение i сохраняется в стеке выполнения метода main.
//
// 2)Object o = new Object(); - Создается новый объект класса Object и ссылка на него сохраняется в переменной o.
// Эта операция создает объект в хипе и переменная o хранит ссылку на этот объект.
//
// 3)Integer ii = 2; - Создается объект типа Integer со значением 2 и ссылка на него сохраняется в переменной ii.
// Это также приводит к созданию объекта в хипе.
//
// 4)printAll(o, i, ii); - Вызывается метод printAll с аргументами o, i и ii.
// Эта операция добавляет новый фрейм в стек выполнения, в котором хранятся аргументы метода.
//
// 5)Integer uselessVar = 700; - Объявляется переменная uselessVar типа Integer и инициализируется значением 700.
// Это происходит в методе printAll и создает объект Integer в хипе, на который ссылается переменная uselessVar.
//
// 6)System.out.println(o.toString() + i + ii); - Вызывается метод toString() объекта o, после чего выполняется конкатенация результатов с переменными i и ii.
// Затем полученная строка выводится на консоль. Для выполнения этой строки создается новый фрейм на стеке.
//
// 7)System.out.println("finished"); - Вызывается метод println() для вывода строки "finished" на консоль.
// Это выполняется в фрейме метода main.
//
// Что касается областей памяти:
// 1)Стек: В стеке хранятся фреймы методов во время их выполнения.
// Каждый вызов метода добавляет новый фрейм в стек, содержащий локальные переменные метода и информацию о возврате из метода.
// 2)Хип: В хипе хранятся объекты. В данном случае, создание объектов типа Object и Integer происходит в хипе.
// 3)Метаспейс: В старых версиях JVM метаспейс использовался для хранения метаданных классов и структур данных JVM.
// Начиная с Java 8, вместо PermGen используется метаспейс.
//
// Что касается сборки мусора:
// Сборщик мусора JVM автоматически освобождает память, занятую объектами, на которые нет ссылок.
// В данном коде, объекты типа Object и Integer, созданные в хипе, будут автоматически удалены, когда на них не останется ссылок.
//
// ClassLoader'ы:
// В данном коде явным образом не используются операции с ClassLoader'ами. ClassLoader'ы в Java загружают классы в JVM во время выполнения программы.
