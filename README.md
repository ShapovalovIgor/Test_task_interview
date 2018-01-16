Test task interview
=========

Prerequisites
-------------
 1)  **HelloOne** - Необходимо реализовать программу на Java, печатающую в консоль сумму всех числовых параметров командной строки. Пример строки "1fawetgdhst3gerherhetrhsdhd3dgerhge3gsh1ggg1"
 2)  **HelloTwo** - Нужно не меняя метод main сделать так чтоб печаталось Hello World!
 3)  **HelloThree** -  Необходимо реализовать на Java метод, принимающий на вход коллекцию строк и удаляющий из переданной коллекции все элементы, начинающиеся на «aaa».
                  Сигнатура необходимого метода должна иметь вид:
                  public static void filterTripleA(List<String> strings) {
                  (в примере два варианта решения один правильный, а второй не очень =) )
 4)  **HelloFour** - Написать метод возвращабщий факториал

* [Java Development Kit (JDK) 9](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)


**TOP popular interview question:**

**Java SE**
-9. На какие группы можно поделить типы данных - римитивы и ссылочные
-8. Примитивы это - short, byte, char, boolean, int, long, float, double
-7. сылочные это - String, Integer, Boolean, Long, BigInteger, BigDecimal;
-6. Какие значения по умолчанию инициализируют переменные - int = 0, boolean = false, String = null, double = 0.0 
-5. Иницилизация это присвоение значения к переменной;
-4. Из какихъ символов могут состоять именна переменых - с латинских букв $, _, из цифр, но не могут начинатся с цифр;
-3. Сколько зарезервированно ключевых слов - 50, это приметивы, циклы, исключения, объявления, импорты, область видемости, многопоточность;
-2. От какого класса наследуются все классы - Object;
-1 Какие методы вы знаете класса Object - equals(), hashCode(), getClass(), wait(), clone(), notify(), notifyAll(), finalize(), toString();
0. Назовите Пародигмы ООП - Инкопсуляция, Наследование, Палиморфизм, Абстрауция, Отправка сообщений, Повторное использование;
1. Что такое ArrayList -  Ассациативный массив(список на основе массива);
2. Что такое LinkedList - Двухсвязанный список каждый элемент имеет ссылку на соседнии(абстрактно можно представить в виде железнодарожного состава у каждый вагон прицеплён к предыдущему и следующему);
3. Отличие ArrayList от LinkedList - 
4. Что лучше использовать ArrayList или LinkedList -  
 LinkedList:Если требуется много встовлять/удалять в середине списка или получать первое и последнее значение то LinkedList, дополнительные затраты на хранение связки между элементами.
 ArrayList: следует использовать при доступе по индексу так как получает элемент за константное время, нет дополнительных расходов на хранение связки между элементами.
5. Какие коллекции вы знаете - ArrayList, LinkedList, Vector, Stack, LinkSet, SortedSet, LinkedHashSet;
6. Какие интерфейсы коллекций вы знаете - List, SET, Queue, Dequeue;
5. ArrayList, LinkedList, HashSet, HashMap это интерфейсы или классы - это интерфейсы классами для них являются List, Set, Map.
6. Что такое HashMap
11. Что такое пул строк - это набор строк который хранится в памяти Java heap Пример в классе ExampleOne;
15. Что такое JDBC - Java DataBase Connectivity - стандартный Интерфейс java для связи приложения и субд;

20. Что такое Serialization - процесс перевода какой-либо структуры данных в последовательность битов;
21. Где используется Serialization
30. Что нового в Java 9: модульность, 
31. Что нового в Java 8: 


**Hibernate**
0. Что такое Hibernate — библиотека решаящая задачи ORM;
1. Что такое ORM - связь между объектной моделью программы и реляционной моделью базы;
2.

**Java EE**
0. Что такое EJB - Enterprise Java Bean спецификация технологии написания и поддержки серверных компонентов, содержащих бизнес-логику;
1. JPA - Java Persistance Api - спецификация обеспечивающая объектно-реляционное представление java объектов;


**Spring**
0. то такое Spring - Фреймворк с открытым исходным кодом , упращает enterprise - разработку. имеет слоистую архетиктуру;
1. Какие префиксные конструкторы есть в Spring 
2. Какие сесии
**SQL**
1. Какие джойны вы знаете - 
INNER_JOIN - все совподающие (отбрасываем не совпавшие)
OUTER_JOIN - оязтельно выводит все строки одной или обеих таблиц
LEFT_JOIN - несеметричный вывод всех результатов левой таблицы при том в правой таблице если нет соответствия то NULL
RIGHT_JOIN - несеметричный вывод всех результатов правой таблицы при том в правой таблице если нет соответствия то NULL
FULL_JOIN - все результаты при этом если нет соответствия то NULL
CROSS_JOIN - декартово произведение
2. Что такое Декартовое произведение - это множество, элементами которого являются все возможные упорядоченные пары элементов исходных множеств.
3. зачем нужны View?
4. Как работают тригеры
5. Опишите иерархический запрос
6. Опишите merge



мусор:{
 Что это такое, JDBC спецификация. Подключение к БД, Statment-ы
какие интерфейсы есть у Hibernete их 3 
как работает gc?
чем отличается interface от абстрактного класса?
что такое generic?
по базам - какие индексы есть?
по базам - какие есть уровни доступа транзакций?
http://javastudy.ru/interview/list-of-question-java-interview/
https://www.youtube.com/watch?v=P6aNLWuLK18 
https://jsehelper.blogspot.ru/

1) Serialization. Что это такое, как используется, какие подводные камни и т.д. Какие механизмы изменения стандартного механизма сериализации. Модификатор transient.
2) Exception. Что такое эксепшены, чем отличаются, какой механизм обработки и т.д.
3) Reflection. Что такое рефлексия, как используется, зачем нужна, где реализована в реальных примерах.
4) Multithreading. Что это такое, как используется, как осуществляется доступ к переменным из разных потоков. Как организовать доступ к переменной из разных потоков, как потоки порождаются, немного lifecycle и т.д. Synchronized, volatile...
5) Пакет java.util.concurrent.*. Что в себя включает, как использовать Synchronizers, Executors, Locks, Atomics. Вопросы типа когда что использовать, как делать потокобезопасный инкремент, доступ к переменным, частичные локи.
6) JDBC спецификация. Подключение к БД, Statment-ы. Обработка запросов.
7) По БД. Вопрос о уровнях изоляций транзакций.
8) По распределенным системам. В чем отличия сервисов SOAP и REST.
9) По JPA/JTA что это такое, как работает, зачем нужно.
10) Что такое JIT, как используется.
11) По GC. Что такое GC, как организовано, как происходит очистка мусора. Что такое утечки памяти, как бороться. Что такое дэдлоки, как бороться.
12) Паттерны проектирования, их реализация.
13) По UNIT тестам. Зачем нужны, что позволяют контролировать. TDD. В чем отличия юнит тестов от интеграционных и перфоманс.
14) Коллекции как работает hashSet, treeSet, treeMap и т.д.
15) Spring Core
16) ORM понимание что такое и зачем это нужно
17) Принципы Solid, clean code
}
