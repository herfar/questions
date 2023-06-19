import Themes.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Классы по темам
        SQL sql = new SQL();
        Core2 core2 = new Core2();
        Core1 core1 = new Core1();
        Spring spring = new Spring();
        Hibernate hibernate = new Hibernate();
        MultiThreading threading = new MultiThreading();


        //--------------------------------------------------------------------------------------------------------------

        List<String> core2Questions = new ArrayList<>();

        core2Questions.add("Что такое дженерики?");
        core2Questions.add("Для чего нужны дженерики?");
        core2Questions.add("Стирание типов?");
        core2Questions.add("Что такое сырые типы?");
        core2Questions.add("Что такое вайл карты?");
        core2Questions.add("Расскажите про PECS?");
        core2Questions.add("Что такое коллекция?");
        core2Questions.add("Расскажите иерархию коллекций");
        core2Questions.add("Почему мап не колекш?");
        core2Questions.add("Разница между java.util.Collection и java.util.Collections?");
        core2Questions.add("Разница между fail-fast и fail-safe?");
        core2Questions.add("Как связаны iterable, iterator, for Each?");
        core2Questions.add("Чем отличается Iterator и Enumerator?");
        core2Questions.add("Можно ли итерируясь по листу удалить элемент? Какое вылетит исключение?");
        core2Questions.add("Как поведет себя коллекция при Iterator.remove?");
        core2Questions.add("Чем отличается Set от List?");
        core2Questions.add("Расскажите про Set?");
        core2Questions.add("Основные реализации Set?");
        core2Questions.add("Отличия ТриСет и ХэшСет?");
        core2Questions.add("Отличие LinkedHashSet от HashSet?");
        core2Questions.add("Что будет если добавлять в триСет по возрастанию?");
        core2Questions.add("Сложность основный операций HashSet?");
        core2Questions.add("Сложность основный операций LinkedHashSet?");
        core2Questions.add("Сложность основный операций TreeSet?");
        core2Questions.add("Сложность основный операций ArrayList?");
        core2Questions.add("Что такое Queue?");
        core2Questions.add("Что такое Deque чем отличниется от Кью?");
        core2Questions.add("Пример реализации Deque?");
        core2Questions.add("Какая коллекция реализует FiFo?");
        core2Questions.add("Какие реализации Мап знаете?");
        core2Questions.add("Сложность основных операций Мап?");
        core2Questions.add("Сложность основных операций ТриМап?");
        core2Questions.add("Как работает Мап? Методы гет и пут?");
        core2Questions.add("Сохранить два элемента по ключам у которых одинаковый хэшкод а икуалс = фолс?");
        core2Questions.add("Что если ложить в мап ключ у которого икуалс и хэшкод определены некорректно?");
        core2Questions.add("Почему нельзя использовать байт массив в качестве ключа в мапе?");
        core2Questions.add("Возможно ли ситуация когда мап выродится в список с ключами имеющими разные значения?");
        core2Questions.add("Будет ли работать мап если все ключи будут иметь одинаковые значения?");
        core2Questions.add("Худшее время get(key) для ключа которого нет в мапе?");
        core2Questions.add("Разница между Stack и Queue?");
        core2Questions.add("Что такое функциональный интерфейс?");
        core2Questions.add("Для чего нужна аннотация @FunctionalInterface?");
        core2Questions.add("Какие встроенные функциональные интерфейсы Вы знаете?");
        core2Questions.add("Что такое ссылка на метод?");
        core2Questions.add("Что такое лямбда и чем заменить?");
        core2Questions.add("Что такое стримы зачем нужны какие бывают?");
        core2Questions.add("Почему стримы ленивые?");
        core2Questions.add("Способы создание стрима?");
        core2Questions.add("Как создать стрим из коллекции?");
        core2Questions.add("Промежуточные операции?");
        core2Questions.add("Терминальные операции?");
        core2Questions.add("Метод Peek()?");
        core2Questions.add("Чем отличается мап и флэтмап?");
        core2Questions.add("Метод коллект()?");
        core2Questions.add("Метод reduce()?");
        core2Questions.add("Что такое Optional?");

        core2.setQuestion(core2Questions);

        //--------------------------------------------------------------------------------------------------------------

        List<String> core1Questions = new ArrayList<>();
        core1Questions.add("Основные принципы ООП?");
        core1Questions.add("Что такое инкапсуляци?");
        core1Questions.add("Что такое наследование?");
        core1Questions.add("Что такое полиморфизм?");
        core1Questions.add("Что такое ассоциация?");
        core1Questions.add("Что такое композиция?");
        core1Questions.add("Что такое агрегация?");
        core1Questions.add("Что такое ранее и позднее связывание?");
        core1Questions.add("Принципы SOLID?");
        core1Questions.add("За счет чего обеспечивается кроссплатформенность?");
        core1Questions.add("Что такое загрузчик классов?");
        core1Questions.add("Сборщик мусора виды и как работает?");
        core1Questions.add("Виды ссыолк в Джава?");
        core1Questions.add("Стак и Хип отличия ?");
        core1Questions.add("Виды примитивных типов в Джава?");
        core1Questions.add("Что такое Чар?");
        core1Questions.add("Что такое классы-обертки?");
        core1Questions.add("Что такое автоупаковка и автораспаковка, где используется?");
        core1Questions.add("Что такое явное и неявное привидение типов?");
        core1Questions.add("Что такое пул интов? Для чего?");
        core1Questions.add("Ньюансы строк какие в джава?");
        core1Questions.add("Пул Строк что такое?");
        core1Questions.add("Метод intern()?");
        core1Questions.add("Почему не рекомендуется изменять строки в цикле?");
        core1Questions.add("Почему строки не рекомендуется использовать для хранения паролей?");
        core1Questions.add("Почему стринг неизменяемый и финализированный класс?");
        core1Questions.add("Почему строка является популярным ключом в хэммап?");
        core1Questions.add("Можно ли использовать строки в конструкции Switch?");
        core1Questions.add("Разница между стринг, Стрингбилдер, стрингБаффер?");
        core1Questions.add("Существуют ли в джава многомерные массивы?");
        core1Questions.add("Что такое сигнатура метода?");
        core1Questions.add("Какие образом переменные передаются в методы?");
        core1Questions.add("Какие виды классов есть в джава?");
        core1Questions.add("Расскажите про вложенные классы в каких случаях применяются?");
        core1Questions.add("Что такое локкальный класс и какие особенности?");
        core1Questions.add("Что такое анонимный класс? Его где использовать?");
        core1Questions.add("Как получить доступ из вложенного класса к полю внешнего класса?");
        core1Questions.add("Что такое перечисления?");
        core1Questions.add("Как в джава решена проблема ромбовидного наследования?");
        core1Questions.add("Могут ли быть приватные конструкторы для чего?");
        core1Questions.add("Виды конструкторов и как отличаются?");
        core1Questions.add("Модификаторы доступа в Джава?");
        core1Questions.add("Что означает статик и что может быть статик?");
        core1Questions.add("Может ли статический метод быть переопределен или перегружен?");
        core1Questions.add("Могут ли нестатические методы перегрузить статические?");
        core1Questions.add("Можно ли сузить уровень доступа в методе?");
        core1Questions.add("Что можно изменить в сигнатуре метода при переопределении?");
        core1Questions.add("Могут ли классы быть статическими?");
        core1Questions.add("Что означает модификатор файнал к чему применить его можно?");
        core1Questions.add("Что такое абстрактные классы чем отличаются от обычных?");
        core1Questions.add("Может ли быть абстрактный класс без абстрактных методов?");
        core1Questions.add("Могут ли быть конструкторы у абстрактных классов?");
        core1Questions.add("Что такое интерфейсы? Какие модификаторы доступа имеют их поля?");
        core1Questions.add("Чем интерфейс отличается от абстрактного класса?");
        core1Questions.add("Может ли один интерфейс наследовать от другого? Как?");
        core1Questions.add("Что такое дефолтные методы зачем их добавили?");
        core1Questions.add("Как решена проблема ромбовидного наследования при использовании интерфейсов?");
        core1Questions.add("Каков порядок вызова конструкторов и блоков инициализации?");
        core1Questions.add("Зачем нужны и какие бывают блоки инициализации?");
        core1Questions.add("Для чего нужны статические блоки инициализации?");
        core1Questions.add("Что произойдет если в статическом блоке инициализации вылетит ошибка?");
        core1Questions.add("Какие исключение вылетают в статических блоках инициализации?");
        core1Questions.add("Что такое Object?");
        core1Questions.add("Методы Обджект?");
        core1Questions.add("Расскажите про икуалс и хэшкод?");
        core1Questions.add("Чем отличается икуалс от == ?");
        core1Questions.add("Правила переопределения икуалс?");
        core1Questions.add("Контракт икуалс и хэшкод?");
        core1Questions.add("Для чего нужен хэшкод?");
        core1Questions.add("Правила переопределения хэшкода?");
        core1Questions.add("Может ли у разных обьектов юыть одинаковый хэшкод?");
        core1Questions.add("Что такое коллизия?");
        core1Questions.add("Чем гет класс() отличается от инстенс оф()?");
        core1Questions.add("Что такое исключения?");
        core1Questions.add("Иерархия Исключений?");
        core1Questions.add("Какие бывают исключения?");
        core1Questions.add("Можно ли обработать необрабатываемые исключения?");
        core1Questions.add("Какой оператор позволяет принудительно бросить исключение?");
        core1Questions.add("О чем говорит throws?");
        core1Questions.add("Как создать собственное исключение?");
        core1Questions.add("Расскажите про механизм обработки исключений?");
        core1Questions.add("Можно ли использовать трай файнали без кэтч?");
        core1Questions.add("Может ли кэтч обрабатывать сразу несколько исключений?");
        core1Questions.add("Всегда ли выполняется блок файнали?");
        core1Questions.add("Может ли мейн бросить исключение? Где оно вылетит?");
        core1Questions.add("В каком порядке следует обрабатывать исключения?");
        core1Questions.add("Что такое трай с ресурсами?");
        core1Questions.add("Что произойдет если вылетело исключение в кэтч а потом в файнали, какое мы увидим?");
        core1Questions.add("Что такое сериализация и десереализация и как она реализована в джава?");
        core1Questions.add("Для чего нужна десереализация?");
        core1Questions.add("Опишите процесс сериализации и десереализации с помощью сериалайзбл?");
        core1Questions.add("Как изменить стандартное поведение сериализации и десериализации?");
        core1Questions.add("Какие поля не будут сериализированы при сериализации? Будет ли сериализированно файнал поле?");
        core1Questions.add("В чем проблема сериализации сингелтон?");
        core1Questions.add("Расскажите про клонирование обьектов?");
        core1Questions.add("Отличие между поверхностным и глубоким копированием?");
        core1Questions.add("Почему clone() в обджект а не в клонебл?");
        core1Questions.add("Как создать глубокую копию обьекта?");

        core1.setQuestion(core1Questions);

        //--------------------------------------------------------------------------------------------------------------

        List<String> threadQuestionsList = new ArrayList<>();

        threadQuestionsList.add("Чем процесс отличается от потока?");
        threadQuestionsList.add("Чем Thread отличается от Runnable?");
        threadQuestionsList.add("Что такое монитор? Как он реализован в Джава?");
        threadQuestionsList.add("Что такое синхронизация? Какие способы синхронизации есть в Джава?");
        threadQuestionsList.add("Как работают методы wait(), notify(), notifyAll()?");
        threadQuestionsList.add("В каких состояниях может находится поток?");
        threadQuestionsList.add("Что такое семафор? Как он реализован в Джава?");
        threadQuestionsList.add("Что означает ключевое слово volatile? Почему операции над ней не атомарны?");
        threadQuestionsList.add("Для чего нужны Atomic типы данных? Чем отличается от валотайл?");
        threadQuestionsList.add("Что такое потоки-демоны? Как создать? Для чего нужны?");
        threadQuestionsList.add("Что такое приоритет потока? На что он влияет? Какой по-умолчанию?");
        threadQuestionsList.add("Как работает Thread.join()? Для чего он нужен?");
        threadQuestionsList.add("Чем отличаются wait() и sleep() ?");
        threadQuestionsList.add("Можно ли вызвать start() для одного потока дважды?");
        threadQuestionsList.add("Как правильно остановить поток? Для чего методы .stop(), interrupt etc.?");
        threadQuestionsList.add("Чем Runnable отличается от Callable?");
        threadQuestionsList.add("Что такое Future Task?");
        threadQuestionsList.add("Что такое deadlock?");
        threadQuestionsList.add("Что такое livelock?");
        threadQuestionsList.add("Что такое RaceCondition?");
        threadQuestionsList.add("Что такое фреймворк fork/join? Для чего нужен?");
        threadQuestionsList.add("Что означает ключевое слово synchronized? Где и для чего используется?");
        threadQuestionsList.add("Что является монитором у статического синхронайзд метода?");
        threadQuestionsList.add("Что является монитором у нестатического синхронайзд метода?");
        threadQuestionsList.add("util.Concurrent? Поверхностно");

        threading.setQuestions(threadQuestionsList);


        //--------------------------------------------------------------------------------------------------------------

        List<String> sqlQuestions = new ArrayList<>();

        sqlQuestions.add("Нюансы работы с Null в SQL?");
        sqlQuestions.add("Что такое ДДЛ? Какие операции в него входят?");
        sqlQuestions.add("Что такое ДМЛ? Какие операции в нгео входят?");
        sqlQuestions.add("Что такое ТСЛ? Какие опреции входят?");
        sqlQuestions.add("Виды join в SQL? ");
        sqlQuestions.add("Что лучше использовать джоин или подзапросы? Почему?");
        sqlQuestions.add("Что делает UNION?");
        sqlQuestions.add("Чем Where отличается от having?");
        sqlQuestions.add("Что такое order by?");
        sqlQuestions.add("Что такое distinct?");
        sqlQuestions.add("Что такое group by?");
        sqlQuestions.add("Что такое limit?");
        sqlQuestions.add("Что делает оператор merge?");
        sqlQuestions.add("Какие агрегатные функции вы знаете?");
        sqlQuestions.add("Что такое ограничения? Какие типы ограничениый вы знаете?");
        sqlQuestions.add("Что такое суррогатные ключи?");
        sqlQuestions.add("Что такое индексы какие они бывают?");
        sqlQuestions.add("Что такое view? Для чего они нужны?");
        sqlQuestions.add("Что такое временные таблицы? Зачем они?");
        sqlQuestions.add("Что такое транзакции? Расскажите про ACID?");
        sqlQuestions.add("Расскажите про уровни изоляции?");
        sqlQuestions.add("Что такое нормализация и денормализация? Расскажите про три нормальные формы?");
        sqlQuestions.add("Шифрование бд?");
        sqlQuestions.add("Explain?");
        sqlQuestions.add("Что лучше дистинк или груп бай?");
        sqlQuestions.add("Что такое триггер?");

        sql.setQuestion(sqlQuestions);

        //--------------------------------------------------------------------------------------------------------------

        List<String> hibernateQuestions = new ArrayList<>();

        hibernateQuestions.add("Что такое Hibernate? Что такое JPA? Что такое ORM?");
        hibernateQuestions.add("Что такое Entity Manager?");
        hibernateQuestions.add("Каким условиям должен удовлетворять класс, чтобы быть энтити?");
        hibernateQuestions.add("Может ли абстрактный класс быть энтити?");
        hibernateQuestions.add("Может ли энтити класс наследоваться от не энтити классов?");
        hibernateQuestions.add("Может ли наследоваться ентити от других ентити?");
        hibernateQuestions.add("Какие требования JPA устанавливает к встраиваемым классам?");
        hibernateQuestions.add("Что такое маппед суперкласс?");
        hibernateQuestions.add("Какаие три типа стратегии маппинга описаны в JPA?");
        hibernateQuestions.add("Как мапятся Enums?");
        hibernateQuestions.add("Как мапить дату?");
        hibernateQuestions.add("Как смапить коллекцию примитивов?");
        hibernateQuestions.add("Какие есть виды связей?");
        hibernateQuestions.add("Что такое владелец связи?");
        hibernateQuestions.add("Что такое каскады?");
        hibernateQuestions.add("Разница между Persist и Merge?");
        hibernateQuestions.add("Какие два типа fetch type стратегии в JPA вы знаете?");
        hibernateQuestions.add("Четыре стадии жизненного цикла ентити вы знаете?");
        hibernateQuestions.add("Для чего нужна аннотация Basic?");
        hibernateQuestions.add("Для чего аннотация Column?");
        hibernateQuestions.add("Для чего аннотация Access?");
        hibernateQuestions.add("Для чего аннотация Cacheable?");
        hibernateQuestions.add("Для чего нужна аннотация Cache?");
        hibernateQuestions.add("Как смаппить составной ключ?");
        hibernateQuestions.add("Для чего нужна аннотация Id? Какие виды GeneratedValue вы знаете?");
        hibernateQuestions.add("Расскажите про JoinColumn и JoinTable?");
        hibernateQuestions.add("Для чего нужны Order by и order column?");
        hibernateQuestions.add("Для чего нужна аннотация Transient?");
        hibernateQuestions.add("Какие шесть видом блокировок в Jpa вы знаете?");
        hibernateQuestions.add("Какие два вида кэша есть в Jpa? Зачем нужны?");
        hibernateQuestions.add("Как работать с кэшем второго уровня?");
        hibernateQuestions.add("Что такое JPQL/HQL?");
        hibernateQuestions.add("Расскажите про проблемы N + 1. Как ее решать?");

        hibernate.setQuestion(hibernateQuestions);

        //--------------------------------------------------------------------------------------------------------------

        List<String> springQuestions = new ArrayList<>();

        springQuestions.add("Что такое инверсия контроля? Как спринг реализует этот принц?");
        springQuestions.add("Что такое IoC контейнер?");
        springQuestions.add("Расскажите про ApplicationContext и BeanFactory? Чем отличаются и что лучше когда использовать?");
        springQuestions.add("Расскажите про аннотацию Bean?");
        springQuestions.add("Расскажите про анноттацию компонент?");
        springQuestions.add("Чем отличается бин и компонент?");
        springQuestions.add("Расскажите про Service и Repository?");
        springQuestions.add("Расскажите про аннотацию Autowired?");
        springQuestions.add("Расскажите про аннотацию Resource?");
        springQuestions.add("Расскажите про аннотацию Inject?");
        springQuestions.add("Расскажите про аннотацию Lookup?");
        springQuestions.add("Можно ли вставить бин в статическое поле? Почему?");
        springQuestions.add("Расскажите про аннотации @Primary и @Qualifier");
        springQuestions.add("Как заижектить примитив?");
        springQuestions.add("Как заинжектить коллекцию?");
        springQuestions.add("Расскажите про аннотацию Conditional?");
        springQuestions.add("Расскажите про аннотацию профайл?");
        springQuestions.add("Расскажите про жизненный цикл бина и аннотации PostConstruct PreDestroy?");
        springQuestions.add("Скоупы бинов?");
        springQuestions.add("ComponentScan? Что делает зачем нужна?");
        springQuestions.add("Как спринг работает с транзакциями? Расскажите про транзакшнл?");
        springQuestions.add("Отличия между Controller RestController?");
        springQuestions.add("Что такое View Resolver?");
        springQuestions.add("Чем отличаются Model, ModelMap, ModelAndView?");
        springQuestions.add("Расскажите про паттерн фронт контроллер? Как он реализован в спринг?");
        springQuestions.add("Расскажите про MVC?");
        springQuestions.add("Можно ли передать в запросе один и тот же параметр несколько раз? Как?");
        springQuestions.add("Как работает Security? Как сконфигурировать? Какие интерфейсы нужны?");
        springQuestions.add("Что такое Spring Boot? Какие у него преимущества?");

        spring.setQuestion(springQuestions);

        //--------------------------------------------------------------------------------------------------------------


        System.out.println("Введите название темы: ");

        String theme = sc.nextLine();

        System.out.println("Введите количество вопросов, на которое хотите ответить: ");
        int count = sc.nextInt();

        //Tools


        switch (theme) {
            case "MultiThreading" -> {
                System.out.println("Введите число от 0 до " + threadQuestionsList.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(threading.getQuestions(number, threadQuestionsList));
                }
            }
            case "Core2" -> {
                System.out.println("Введите число от 0 до " + core2Questions.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(core2.getQuestions(number, core2Questions));
                }
            }
            case "Core1" -> {
                System.out.println("Введите число от 0 до " + core1Questions.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(core1.getQuestions(number, core1Questions));
                }
            }
            case "SQL" -> {
                System.out.println("Введите число от 0 до " + sqlQuestions.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(sql.getQuestions(number, sqlQuestions));
                }
            }
            case "Hibernate" -> {
                System.out.println("Введите число от 0 до " + hibernateQuestions.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(hibernate.getQuestions(number, hibernateQuestions));
                }
            }
            case "Spring" -> {
                System.out.println("Введите число от 0 до " + springQuestions.size());
                for (int i = 0; i < count; i++) {
                    int number = sc.nextInt();
                    System.out.println(spring.getQuestions(number, springQuestions));
                }
            }
        }
    }
}
