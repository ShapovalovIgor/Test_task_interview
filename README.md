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
1. На какие группы можно поделить типы данных - римитивы и ссылочные
2. Примитивы это - short, byte, char, boolean, int, long, float, double
3. сылочные это - String, Integer, Boolean, Long, BigInteger, BigDecimal;
4. Какие значения по умолчанию инициализируют переменные - int = 0, boolean = false, String = null, double = 0.0 
5. Иницилизация - присвоение значения к переменной;
6. Из какихъ символов могут состоять именна переменых - с латинских букв $, _, из цифр, но не могут начинатся с цифр;
7. Сколько зарезервированно ключевых слов - 50, это приметивы, циклы, исключения, объявления, импорты, область видемости, многопоточность;
8. От какого класса наследуются все классы - Object;
9. Какие методы вы знаете класса Object - equals(), hashCode(), getClass(), wait(), clone(), notify(), notifyAll(), finalize(), toString();
10. Назовите Пародигмы ООП - Инкопсуляция, Наследование, Палиморфизм, Абстрауция, Отправка сообщений, Повторное использование;
11. Что такое JDBC спецификация - это описание способа подключения и работы с СУБД;
12. Что такое пул строк - это набор строк который хранится в памяти Java heap Пример в классе ExampleOne;
13. Как работает gc - он останавливает приложение, обходит объекты по вектору начиная с рута потока и все кто не попадает в вектор, попадает под удаление;
14. Что такое type erasure - костыль для поддержки generics всё, что программист указал в угловых скобках, оказалось утеряно и недоступно на этапе выполнения. Пример: ExampleFive Подробнее: http://blog.xapie.nz/2013/12/01/erasure/
15. Чем отличается interface от абстрактного класса - Абстрактный класс может реализовывать методы; интерфейс не может реализовывать методы;
16. Какие существуют Exception - Есть проверяемые и не проверяемые на стадии компиляции.
17. Какие вы знаете Exception - NullPointerException, Exception, SQLException, IOException, ThreadDeath, IndexOfBoundsException, ClassNotFoundException;
18. Какие модификаторы доступа вы знаете - protected, public, package, private;
19. Опишите уровни доступа - private: доступ в пределах класса, public: доступен всем, package: доступен в пределах пакета, protected: члены класса доступны внутри пакета и в классах-наследниках; 
20. Что такое рефлексия - это механизм исследования данных о программе во время её выполнения;
21. Где реализована в реальных примерах - Эти возможности во всю используются во фреймверках, таких как Spring, Hibernate, а так же всё что использует Анатации.
22. Multithreading - многопоточность, то есть паролельное выполнение кода.

**Collection**
1. Что такое ArrayList -  Ассациативный массив(список на основе массива);
2. Что такое LinkedList - Двухсвязанный список каждый элемент имеет ссылку на соседнии(абстрактно можно представить в виде железнодарожного состава у каждый вагон прицеплён к предыдущему и следующему);
3. Отличие ArrayList от LinkedList - 
4. Что лучше использовать ArrayList или LinkedList -  
 LinkedList:Если требуется много встовлять/удалять в середине списка или получать первое и последнее значение то LinkedList, дополнительные затраты на хранение связки между элементами;
 ArrayList: следует использовать при доступе по индексу так как получает элемент за константное время, нет дополнительных расходов на хранение связки между элементами;
5. Какие коллекции вы знаете - ArrayList, LinkedList, Vector, Stack, LinkSet, SortedSet, LinkedHashSet;
6. Какие интерфейсы коллекций вы знаете - List, SET, Queue, Dequeue;
5. ArrayList, LinkedList, HashSet, HashMap это интерфейсы или классы - это интерфейсы классами для них являются List, Set, Map;
6. Что такое HashMap - Это набор корзин ключь + значение. Ключь должен быть уникальным, нет сортировки;
7. Как избавится от кализий в HashMap - Если ключём у нас является кастомный объект то требуется переопределить методы equals() и hashCode() написав свою реализацию с использованием полей объекта пример в классе ExampleTwo;
8. Что такое generic - Generics позволяют абстрагировать множество типов; https://neerc.ifmo.ru/wiki/index.php?title=Generics


15. Что такое JDBC - Java DataBase Connectivity - стандартный Интерфейс java для связи приложения и субд;
16. Что такое спецификация JDBC - это описание стандартного интерфейса JDBC;
17. Подключение Java-программы к БД и этапы -
    - Установка связи между Java-программой и диспетчером базы данных.
    - Передача SQL-команды в базу данных с помощью объекта Statement.
    - Чтение полученных результатов из базы данных и использование их в программе.
18. Что такое Statment - Объект Statement используется для выполнения SQL-запросов к БД(контенеры для выполнения запросов);
19 Какие Statment вы знаите -  PreparedStatement, Statement, CallableStatement;
20. Что такое Serialization - процесс перевода какой-либо структуры данных в последовательность битов;
21. Где используется Serialization - сохранение класса в файл или в БД или передача по сети;
22. Проблемы Serialization - Проблема в том что после десериализации мы получим другой объект. Таким образом, сериализация дает возможность создать Singleton еще раз, что не совсем не нужно. Конечно можно запретить сериализовать Singleton-ы, но это, фактически, уход от проблемы, а не ее решение;
23. Какие механизмы изменения стандартного механизма сериализации - Существует специальный класс Externalizable, а так же мы всегда можем перопределить методы writeObject() и readObject();
24. Модификатор transient - поля с данным модификатором не сериализуются;
30. Что нового в Java 9: модульность, 
31. Что нового в Java 8: 


**Hibernate**
1. Что такое Hibernate — библиотека решаящая задачи ORM;
2. Что такое ORM - связь между объектной моделью программы и реляционной моделью базы;
3. Назовите некоторые важные интерфейсы Hibernate - SessionFactory, Session, Transaction;
 - SessionFactory (org.hibernate.SessionFactory) — неизменяемый потокобезопасный объект с компилированным маппингом для одной базы данных. Необходимо инициализировать SessionFactory всего один раз. Экземпляр SessionFactory используется для получения объектов Session, которые используются для операций с базами данных.
 - Session (org.hibernate.Session) — однопоточный короткоживущий объект, который предоставляет связь между объектами приложения и базой данных. Он оборачивает JDBC java.sql.Connection и работает как фабрика для org.hibernate.Transaction. Разработчик должен открывать сессию по необходимости и закрывать ее сразу после использования. Экземпляр Session является интерфейсом между кодом в java приложении и hibernate framework и предоставляет методы для операций CRUD.
 - Transaction (org.hibernate.Transaction) — однопоточный короткоживущий объект, используемый для атомарных операций. Это абстракция приложения от основных JDBC или JTA транзакций. org.hibernate.Session может занимать несколько org.hibernate.Transaction в определенных случаях.

**Java EE**
1. Что такое EJB - Enterprise Java Bean спецификация технологии написания и поддержки серверных компонентов, содержащих бизнес-логику;
2. JPA - Java Persistance Api - спецификация обеспечивающая объектно-реляционное представление java объектов;

**Spring**
1. Что такое Spring - Фреймворк с открытым исходным кодом , упращает enterprise - разработку. имеет слоистую архетиктуру;
2. Что такое aspect spring - Аспектно-ориентированное программирование с принципом конфигурирования зависимостей (dependency injection-DI) и абстракции сервисов (Enterprise Service Abstraction) являются основными принципами;


**SQL**
1. Какие джойны вы знаете - 
INNER_JOIN - все совподающие (отбрасываем не совпавшие)
OUTER_JOIN - оязтельно выводит все строки одной или обеих таблиц
LEFT_JOIN - несеметричный вывод всех результатов левой таблицы при том в правой таблице если нет соответствия то NULL
RIGHT_JOIN - несеметричный вывод всех результатов правой таблицы при том в правой таблице если нет соответствия то NULL
FULL_JOIN - все результаты при этом если нет соответствия то NULL
CROSS_JOIN - декартово произведение
2. Что такое Декартовое произведение - это множество, элементами которого являются все возможные упорядоченные пары элементов исходных множеств.
3. Зачем нужны View -
4. Как работают тригеры -
5. Опишите иерархический запрос -
6. Опишите merge -
7. Какие индексы есть -
8. Какие есть уровни доступа транзакций?
**Git**
1. чем отличается comit от push - comit отправка изминений в локальный репозиторий, а push в удалённый 

мусор:{
http://javastudy.ru/interview/list-of-question-java-interview/
https://www.youtube.com/watch?v=P6aNLWuLK18 
https://jsehelper.blogspot.ru/
http://javastudy.ru/interview/jee-hibernate-questions-answers/

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