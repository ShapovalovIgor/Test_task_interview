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
1. На какие группы можно поделить типы данных - примитивы и ссылочные;
2. Примитивы это - short, byte, char, boolean, int, long, float, double;
3. сылочные это - String, Integer, Boolean, Long, BigInteger, BigDecimal;
4. Какие значения по умолчанию инициализируют переменные - int = 0, boolean = false, String = null, double = 0.0;
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
15. Чем отличается interface от абстрактного класса - Абстрактный класс можно создать как объект можно отнаследоватся, а от интерфейса нет;
16. Какие существуют Exception - Есть проверяемые и не проверяемые на стадии компиляци;
17. Какие вы знаете Exception - NullPointerException, Exception, SQLException, IOException, ThreadDeath, IndexOfBoundsException, ClassNotFoundException;
18. Какие модификаторы доступа вы знаете - protected, public, package, private;
19. Опишите уровни доступа - private: доступ в пределах класса, public: доступен всем, package: доступен в пределах пакета, protected: члены класса доступны внутри пакета и в классах-наследниках; 
20. Что такое рефлексия - это механизм исследования данных о программе во время её выполнения;
21. Где реализована в реальных примерах - Эти возможности во всю используются во фреймверках, таких как Spring, Hibernate, а так же всё что использует Анатации.
22. Multithreading - многопоточность, то есть паролельное выполнение кода. Явный пример это GUI работающий паролельно с логикой;
23. Как осуществляется доступ к переменным из разных потоков - с помощью Synchronize;
24. Как потоки порождаются - Требуется отнаследоватся от класса Thread и переопределить метод run или имплиметить интерфейс Runnable и 
реализовать метод run() или Создать объект класса Thread и реализовать метод и перелать в него класс с требумым кодом а так же в каждом способе вызвать старт;
25. Что такое synchronized - ключевое слово которое реализует взаимное исключение и видимость изменений;
26. Что такое volatile - видимость изменений плюс атомарность long и double;
27. В чем разница между volatile и synchronized - synchronized останавливает поток, volatile пишит сразу значение.
28. В чем отличия сервисов SOAP и REST - SOAP использует xml, а REST ASCII, XML, JSON. В модели SOAP уровень передачи данных
 протокола HTTP является «пассивным наблюдателем», и его роль ограничивается передачей запросов 
 SOAP от клиента серверу с использованием метода POST. Детали сервисного запроса, такие как имя 
 удаленной процедуры и входные аргументы, кодируются в теле запроса. Архитектура REST, напротив, 
 рассматривает уровень передачи данных HTTP как активного участника взаимодействия, используя 
 существующие методы НТТР, такие как GET, POST, PUT и DELETE, для обозначения типа запрашиваемого сервиса;
 В основе REST лежит концепция ресурсов, в то время как SOAP использует интерфейсы, основанные на объектах и методах. 
 Интерфейс SOAP может содержать практически неограниченное количество методов; интерфейс REST, напротив, ограничен 
 четырьмя возможными операциями, соответствующими четырем методам HTTP.
29. Что такое JDBC - Java DataBase Connectivity - стандартный Интерфейс java для связи приложения и субд;
30. Что такое спецификация JDBC - это описание стандартного интерфейса JDBC;
31. Подключение Java-программы к БД и этапы -
    - Установка связи между Java-программой и диспетчером базы данных.
    - Передача SQL-команды в базу данных с помощью объекта Statement.
    - Чтение полученных результатов из базы данных и использование их в программе.
32. Что такое Statment - Объект Statement используется для выполнения SQL-запросов к БД(контенеры для выполнения запросов);
33. Какие Statment вы знаите -  PreparedStatement, Statement, CallableStatement;
34. Что такое Serialization - процесс перевода какой-либо структуры данных в последовательность битов;
35. Где используется Serialization - сохранение класса в файл или в БД или передача по сети;
36. Проблемы Serialization - Проблема в том что после десериализации мы получим другой объект. Таким образом, сериализация дает возможность создать Singleton еще раз, что не совсем не нужно. Конечно можно запретить сериализовать Singleton-ы, но это, фактически, уход от проблемы, а не ее решение;
37. Какие механизмы изменения стандартного механизма сериализации - Существует специальный класс Externalizable, а так же мы всегда можем перопределить методы writeObject() и readObject();
38. Модификатор transient - поля с данным модификатором не сериализуются;
39. Принципы Solid это руководства, которые могут применяться во время работы над программным обеспечением
для удаления «кода с запашком» предписывая программисту выполнять рефакторинг исходного кода, 
пока тот не станет разборчиво написанным и расширяемым. Это часть общей стратегии гибкой и адаптивной разработки;
40. Чистый код clean code - Даже плохой программный код может работать. Однако если код не является «чистым», это всегда будет мешать развитию проекта и компании-разработчика, отнимая значительные ресурсы на его поддержку и «укрощение»;
41. Пакет java.util.concurrent.*. Что в себя включает - Concurrent Collections, Executors, Atomics, Synchronizers ;
42. Что такое Concurrent Collections — набор коллекций, более эффективно работающие в многопоточной среде нежели стандартные универсальные коллекции из java.util пакета. Вместо базового враппера Collections.synchronizedList с блокированием доступа ко всей коллекции используются блокировки по сегментам данных или же оптимизируется работа для параллельного чтения данных по wait-free алгоритмам.
43. Что такое Queues — неблокирующие и блокирующие очереди с поддержкой многопоточности. Неблокирующие очереди заточены на скорость и работу без блокирования потоков. Блокирующие очереди используются, когда нужно «притормозить» потоки «Producer» или «Consumer», если не выполнены какие-либо условия, например, очередь пуста или перепонена, или же нет свободного «Consumer»'a.
44. Что такое Synchronizers — вспомогательные утилиты для синхронизации потоков. Представляют собой мощное оружие в «параллельных» вычислениях.
45. Что такое Executors — содержит в себе отличные фрейморки для создания пулов потоков, планирования работы асинхронных задач с получением результатов. 
46. Что такое Locks — представляет собой альтернативные и более гибкие механизмы синхронизации потоков по сравнению с базовыми synchronized, wait, notify, notifyAll.
47. Что такое Atomics — классы с поддержкой атомарных операций над примитивами и ссылками.
https://habrahabr.ru/company/luxoft/blog/157273/
48. Что такое утечки памяти, как бороться -  В Java может быть утечка памити только в случае говнокода тогда GC по какой то причине не удаляет объекты например на них ещё что то ссылается, а баротся можно переписав говнокод в нормальный вид;
49. Что такое дэдлоки, как бороться - Обычно достаточно согласованного между потоками порядка захвата ресурсов, при котором все потоки захватывают ресурсы в одном и том же порядке.
 С появлением семафоров (lock, tryLock()) это может реализовываться очень просто;
50. ORM понимание что такое и зачем это нужно - Object-Relational Mapping это отображение объектов какого-либо объектно-ориентированного языка в структуры реляционных баз данных;
51. По UNIT тестам. Зачем нужны - «юнит» означает, что мы тестируем не всю систему в целом, а небольшие ее части. Мы проводим тестирование с высокой гранулярностью;
53. Что позволяют контролировать UNIT тесты - Правильность логики написанную разработчиком;
52. TDD -  техника разработки программного обеспечения, которая основывается на повторении очень коротких циклов разработки:
 сначала пишется тест, покрывающий желаемое изменение, затем пишется код, который позволит пройти тест, и под конец проводится рефакторинг;
54. Паттерны проектирования - Singleton, Factory Method, Prototype, Builder, Abstract Factory, Facade;
55. Singleton - порождающий шаблон проектирования, гарантирующий, что в однопроцессном приложении будет единственный экземпляр некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляр;
56. Factory Method - делегируем процесс создания объектов классам-наследникам;
57. Prototype - клонируем объекты на основании некоторого базового объекта;
58. Builder - отделяем процесс создания комплексного объекта от его представления;
59. Abstract Factory -  описываем сущность для создания целых семейств взаимосвязанных объектов;
60. Facade - описываем унифицированный интерфейс для облегчения работы с набором подсистем;

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
9. Потоко защищённая Map - ConcurrentHashMap;
10. Как работает ArrayList - Получение значения за константное время, минимум накладных 
расходов при хранении такого списка, вставка в конец списка в среднем производится так 
же за постоянное время, вставка и удаление из середины списка за линейное время;
11. Как работает LinkedList - За постоянное время может выполнять вставку/удаление элементов в списке. 
Доступ к произвольному элементу осуществляется за линейное время (но доступ к первому и 
последнему элементу списка всегда осуществляется за константное время — ссылки постоянно 
хранятся на первый и последний, так что добавление элемента в конец списка вовсе не значит,
 что придется перебирать весь список в поисках последнего элемента
12. Предложите эффективный алгоритм удаления нескольких рядом стоящих элементов из середины списка, реализуемого ArrayList - сместить с помощью метода subList(3,7).clear() таким образом удалятся 4,5,6 элемент.
14. Как работает HashMap - Вкратце, HashMap состоит из «корзин» (bucket`ов). 
С технической точки зрения «корзины» — это элементы массива, которые хранят ссылки на списки элементов.
 При добавлении новой пары ключ-значение, вычисляет хеш-код ключа, на основании которого вычисляется номер 
 корзины (номер ячейки массива), в которую попадет новый элемент. Если корзина пустая, то в нее сохраняется 
 ссылка на вновь добавляемый элемент, если же там уже есть элемент, то происходит последовательный переход 
 по ссылкам между элементами в цепочке, в поисках последнего элемента, от которого и ставится ссылка на вновь 
 добавленный элемент. Если в списке был найден элемент с таким же ключом, то он заменяется. Добавление, поиск 
 и удаление элементов выполняется за константное время. Вроде все здорово, с одной оговоркой, хеш-функций должна
  равномерно распределять элементы по корзинам, в этом случае временная сложность для этих 3 операций будет не 
  ниже lg N, а в среднем случае как раз константное время.
15. Как работает HashSet - Неупорядочен как мапа и  ключём является само значение.
16. Как работает TreeSet - основан на красно-черном дереве. 
https://habrahabr.ru/post/162017/

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
3. JTA - API для поддержки транзакций, входящее в стандарт серверной платформы для языка программирования Java — Java EE. Определяет взаимодействие между менеджером транзакций и другими участниками распределённой транзакционной системы.
4. Что такое JIT -  технология увеличения производительности программных систем, использующих байт-код, путём компиляции байт-кода в машинный код 
непосредственно во время работы программы. Таким образом достигается высокая скорость выполнения (сравнимая с компилируемыми языками) за счёт увеличения
 потребления памяти (для хранения результатов компиляции) и затрат времени на компиляцию. JIT базируется на двух более ранних идеях, касающихся среды исполнения: компиляции байт-кода и динамической компиляции;

**Spring**
1. Что такое Spring - Фреймворк с открытым исходным кодом , упращает enterprise - разработку. имеет слоистую архетиктуру;
2. Что такое aspect spring - Аспектно-ориентированное программирование с принципом конфигурирования зависимостей (dependency injection-DI) и абстракции сервисов (Enterprise Service Abstraction) являются основными принципами;
3. Spring Core - универсальный фреймворк с открытым исходным кодом для Java-платформы;
4. Что такое Inversion of Control - это некий абстрактный принцеп набор рекомендаций для написания слабосвязанного кода;
5. Dependency Injection - одна из реализаций IOF;
6. Какие есть области видимости бинов(scope) - singleton, prototype, request, session, global-session;
7. singleton - возвращает один и тот же протатип бина на каждый запрос.
8. prototype - создаёт и возвращает новый экземпляр на каждый запрос;
9. request - создаёт и возвращает экземпляр бина на каждый http запрос и уничтожает после завершения обработки запроса;
10. session - создаёт и возвращает экземпляр бина для кавждой HTTP сессии и уничтожает, после её завершения;
11. global-session - создаёт и возвращает экземпляр бина на время существования глобальной сесии всего приложения с портлетами;
 
**SQL**
1. Какие джойны вы знаете - 
INNER_JOIN - все совподающие (отбрасываем не совпавшие)
OUTER_JOIN - оязтельно выводит все строки одной или обеих таблиц
LEFT_JOIN - несеметричный вывод всех результатов левой таблицы при том в правой таблице если нет соответствия то NULL
RIGHT_JOIN - несеметричный вывод всех результатов правой таблицы при том в правой таблице если нет соответствия то NULL
FULL_JOIN - все результаты при этом если нет соответствия то NULL
CROSS_JOIN - декартово произведение
2. Что такое Декартовое произведение - это множество, элементами которого являются все возможные упорядоченные пары элементов исходных множеств;
3. Что такое View -  виртуальная (логическая) таблица, представляющая собой запрос;
4. Зачем нужны View - уменьшают сложность, повышение безопасности, повышение удобства, переимнование стобцов таблицы, настройка данных для пользователя, защита целостности данных;
5. Как работают тригеры - Допустим в БД добавили запись в таблице с полем и с созначением ON так же у нас есть тригер на данное поле то у нас произойдёт какое то событе после добавление записи;
6. Что такое иерархический запрос - 
7. Опишите структуру иерархического запроса - SELECT
                                                FROM table
                                                START WITH field1 is null
                                                CONNECT BY PRIOR field1 = field2
8. Что такое merge - оператор языка SQL, который позволяет слиять данные одной таблицы с данными другой таблицы;
9. Опишите merge -  MERGE INTO table_name USING table_reference ON (condition)
                      WHEN MATCHED THEN
                      UPDATE SET column1 = value1 [, column2 = value2 …]
                      WHEN NOT MATCHED THEN
                      INSERT (column1 [, column2 …]) VALUES (value1 [, value2 …]);

10. Какие индексы есть - Составной, Уникальный, Покрывающий
11. Какие есть уровни доступа транзакций - Шкала уровней изолированности транзакций содержит ряд значений, 
проранжированных от наинизшего до наивысшего; более высокий уровень изолированности соответствует лучшей 
согласованности данных, но его использование может снижать количество физически параллельно выполняемых транзакций.
 И наоборот, более низкий уровень изолированности позволяет выполнять больше параллельных транзакций, но снижает точность данных. 
 Таким образом, выбирая используемый уровень изолированности транзакций, разработчик информационной системы в
  определённой мере обеспечивает выбор между скоростью работы и обеспечением гарантированной согласованности получаемых из системы данных;
12. Уровнях изоляций транзакций - Read uncommitted, Read committed, Repeatable read, Serializable;
13. Statement и PreparedStatement - Statement: используют для простых запросов без параметров, а PreparedStatement используют для запросов с параметрами так как он иньекция защищёный;
14. Что такое SQL Injection - это аттака на веб приложение при которой с помощью отправления SQL кода пытаются изменить или получить данные;
15. Что такое транзакция - транзакция это последовательность операции к базе которые выполнятся либо все либо если в одной из операции будет ошибка то не одна операция не выпонится;
16. Зачем нужны транзакции - для сохранения консистентности данных; 

**Git**
1. чем отличается comit от push - comit отправка изминений в локальный репозиторий, а push в удалённый 

**А так же:**
http://javastudy.ru/interview/list-of-question-java-interview/
https://www.youtube.com/watch?v=P6aNLWuLK18 
https://jsehelper.blogspot.ru/
http://javastudy.ru/interview/jee-hibernate-questions-answers/