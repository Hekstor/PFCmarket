import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {
        public static void main(String[] args) {
            System.out.print("Hello, World");
            System.out.println("Hello, World");
            System.out.println("\"Hello\"," + " \"Hello\"");
            double a = 5, b = 2, e = 3, i = 4;
            int c = 2;
            System.out.println(a / b);
            int d = Integer.parseInt("5");
            System.out.println(d + c);
            double result = Math.sqrt(Math.pow(e, 2) + Math.pow(i, 2));
            System.out.println("Результат: " + result);
            int number = 1000;
            while (number >= 10) {
                number /= 2;
            }
            System.out.println("Результат:" + number);
            float[] massive = new float[]{23f, 44f, 71f, 67f, 34f};
            for (int f = 0; f < massive.length; f++) {
                massive[f] /= 2;
            }
            System.out.print("Полученный при делении массив: {");
            for (int f = 0; f < massive.length; f++) {
                System.out.print(massive[f]);
                if (f < massive.length -1) {
                    System.out.print(",");
                }
            }
            System.out.println("}");

            System.out.println();

            House high_riseBuilding = new House();
            high_riseBuilding.TheHeightOfTheHouse = 18;
            high_riseBuilding.TheNumberOfFloors = 6;
            high_riseBuilding.TheNumberOfPeopleLivingThere = 90;
            System.out.println("Высотка:");
            System.out.println("высота дома - " + high_riseBuilding.TheHeightOfTheHouse);
            System.out.println("количество этажей - " + high_riseBuilding.TheNumberOfFloors);
            System.out.println("количество подъездов - " + high_riseBuilding.TheNumberOfEntrances);
            System.out.println("количество проживающих людей - " + high_riseBuilding.TheNumberOfPeopleLivingThere);
            House stalin_eraBuilding = new House();
            stalin_eraBuilding.TheNumberOfPeopleLivingThere = 85;
            System.out.println("Сталинка:");
            System.out.println("высота дома - " + stalin_eraBuilding.TheHeightOfTheHouse);
            System.out.println("количество этажей - " + stalin_eraBuilding.TheNumberOfFloors);
            System.out.println("количество подъездов - " + stalin_eraBuilding.TheNumberOfEntrances);
            System.out.println("количество проживающих людей - " + stalin_eraBuilding.TheNumberOfPeopleLivingThere);
            House dilapidatedHousing = new House();
            dilapidatedHousing.TheHeightOfTheHouse = 22;
            dilapidatedHousing.TheNumberOfEntrances = 1;
            System.out.println("Ветхое жилье:");
            System.out.println("высота дома - " + dilapidatedHousing.TheHeightOfTheHouse);
            System.out.println("количество этажей - " + dilapidatedHousing.TheNumberOfFloors);
            System.out.println("количество подъездов - " + dilapidatedHousing.TheNumberOfEntrances);
            System.out.println("количество проживающих людей - " + dilapidatedHousing.TheNumberOfPeopleLivingThere);

            System.out.println();

            Animals animal1 = new Animals();
            //animal1.theAnimalSays = "гав";
            //animal1.value = 30;
            //animal1.speakAs("гав");
            animal1.speak("гав");
            //animal1.speedAs();
            animal1.speed(30);
            Animals animal2 = new Animals();
            //animal2.theAnimalSays = "муу";
            //animal2.value = 5;
            //animal2.speakAs("муу");
            animal2.speak("муу");
            animal2.speed(5);
            Animals animal3 = new Animals();
            //animal3.theAnimalSays = "ррррр";
            //animal3.value = 40;
            //animal3.speakAs("ррррр");
            animal3.speak("ррррр");
            animal3.speed(40);

            System.out.println();

            Hypotenuse hypotenuse1 = new Hypotenuse();
            double sqrt = hypotenuse1.hypoT(3, 4);
            System.out.println("Результат: " + sqrt);
            System.out.println();
            // 1. Ввод текста в main
            Scanner scanner = new Scanner(System.in);
            /*System.out.print("Введите текст: ");
            String text = scanner.nextLine();
            scanner.close();

            // Вызов метода с логикой
            int[] result2 = VowelConsonantCounter.countLetters(text);

            // 2. Вывод результата в main
            System.out.println("Гласных: " + result2[0]);
            System.out.println("Согласных: " + result2[1]);
            System.out.println();*/
            System.out.println(TestChecker.containsWordTestSimple("This is a TEST!"));      // true
            System.out.println(TestChecker.containsWordTestSimple("Testing is fun"));      // false
            System.out.println(TestChecker.containsWordTestSimple("No word here"));         // false
            System.out.println(TestChecker.containsWordTestSimple(" zln H  KbkjvJYQKE TEST fjbk lk"));

            System.out.println();

            AccessDemo demo = new AccessDemo();
            demo.callAll();
            System.out.println();
            // Создаём два экземпляра класса Копилка
            Копилка k1 = new Копилка();
            Копилка k2 = new Копилка();
            // Каждый объект вызывает метод по 3 раза.
            // Поскольку поле static, все вызовы работают с одной общей копилкой.
            for(i = 0; i < 3; i++) {
                k1.положитьВКовилку();
                k2.положитьВКовилку();
            }
            // Выводим итоговое значение
            System.out.println("В копилке: " + Копилка.получитьСумму() + " руб.");
            // Ожидаемый вывод: В копилке: 60000 руб.
            System.out.println();
            // Создаём две переменные: одна из первого enum, другая из второго
            OS os = OS.WINDOWS;
            RAM ram = RAM.EIGHT;
            // Условие: если RAM = EIGHT, выводим обе переменные, иначе только первую
            if (ram == RAM.EIGHT) {
                System.out.println("OS: " + os);
                System.out.println("RAM: " + ram);
            } else {
                System.out.println("OS: " + os);
            }

            System.out.println();

            // Создаём экземпляры, передавая текст в конструктор
            Auto car1 = new Auto("Это легковой автомобиль.");
            Auto car2 = new Auto("Это грузовой автомобиль.");

            // Вызываем метод для вывода текста
            car1.showDescription();
            car2.showDescription();

            System.out.println();

            AutoFun car3 = new AutoFun();
            // Смотрим начальные значения
            System.out.println("Модель: " + car3.getModel());       // bmw
            System.out.println("Мощность: " + car3.getPower());     // 250
            System.out.println("Цвет: " + car3.getColor());         // black
            // Меняем значения через сеттеры
            car3.setModel("audi");
            car3.setPower(300);
            car3.setColor("red");
            // Проверяем, что изменилось
            System.out.println("\nПосле изменений");
            System.out.println("Модель: " + car3.getModel());        // audi
            System.out.println("Мощность: " + car3.getPower());      // 300
            System.out.println("Цвет: " + car3.getColor());          // red

            System.out.println();

            Qa qaEngineer = new Qa("Марина");
            qaEngineer.sleep();
            qaEngineer.drink();
            qaEngineer.run();

            System.out.println();

            qaEngineer.testing();
            qaEngineer.flooding();

            System.out.println();
            PeopleMen person1 = new PeopleMen();
            person1.sleep();        // Вывод: Я сплю
            person1.drinkCoffe();   // Вывод: Я пью кофе

            System.out.println();

            QaChel qaEngineer1 = new QaChel();
            qaEngineer1.sleep();        // Вывод: Я сплю (унаследован от PeopleMen)
            qaEngineer1.drinkCoffe();   // Вывод: Я пью очень много кофе (переопределён в QaChel)

            System.out.println();

            QaGreat qa = new QaGreat();
            qa.testing("Проверить авторизацию");
            qa.testing("Проверить авторизацию", "Проверить регистрацию");
            qa.testing("Проверить авторизацию", "Проверить регистрацию", "Проверить восстановление пароля");
            qa.testing("Задание 1", "Задание 2", "Задание 3", "Задание 4");

            System.out.println();

//            Check check = new Check();
//
//            check.checkValue();

//            try {
//                check.checkValue();
//            } catch (IllegalArgumentException f) {
//                System.err.println("Ошибка: " + f.getMessage());
//            }
//            System.out.println();

//            //LinkedList
//            Iterator<String> it = list.iterator();
//            while(it.hasNext()) {
//                if (condition(it.next())) {
//                    it.remove(); // O(1), потому что итератор уже держит ссылку на текущий узел
//                }
//            System.out.println();
//
//            PhoneBook book = new PhoneBook();
//
//            // Добавляем контакты
//            book.add(new Contact("Алексей", "+7-900-111-22-33"));
//            book.add(new Contact("Марина", "+7-900-222-33-44"));
//            book.add(new Contact("Иван", "+7-900-333-44-55"));
//            book.add(new Contact("Ольга", "+7-900-444-55-66"));
//
//            System.out.println("Все контакты:");
//            book.printAll();
//
//            // Поиск
//            System.out.println("\nПоиск Марина:");
//            Contact found = book.findByName("Марина");
//            System.out.println(found != null ? found : "Не найден");
//
//            // Вставка в середину (например, на позицию 2)
//            book.addAt(2, new Contact("Пётр", "+7-900-555-66-77"));
//            System.out.println("\nПосле вставки Петра на позицию 2:");
//            book.printAll();
//
//            // Изменение телефона
//            book.updatePhone("Иван", "+7-900-999-88-77");
//
//            // Удаление
//            book.removeByName("Ольга");
//            System.out.println("\nПосле удаления Ольги и смены телефона Ивана:");
//            book.printAll();
            System.out.println();
            PhoneBook book = new PhoneBook();
            book.add(new Contact("Алексей", "+7-900-111-22-33"));
            book.add(new Contact("Марина", "+7-900-222-33-44"));
            book.add(new Contact("Иван", "+7-900-333-44-55"));
            book.add(new Contact("Ольга", "+7-900-444-55-66"));

            System.out.println("Все контакты:");
            book.printAll();

            // Мгновенный поиск через HashMap
            System.out.println("\nПоиск <Марина:>");
            Contact found = book.findByName("Марина");
            System.out.println(found != null ? found : "Не найден");

            // Вставка в середину
            book.addAt(2, new Contact("Петр", "+7-900-555-66-77"));
            System.out.println("\nПосле вставки Петра на позицию 2:");
            book.printAll();

            // Смена телефона — объект общий для обеих структур, менять надо один раз
            book.updatePhone("Иван", "+7-900-999-88-77");

            // Удаление
            book.removeByName("Ольга");
            System.out.println("\nПосле удаления Ольги и смены телефона Ивана:");
            book.printAll();

            // Попытка добавить дубликат
            book.add(new Contact("Марина", "+7-900-000-00-00"));

            System.out.println();

            // Создаём мапу: ключ — String, значение — список строк
            Map<String, List<String>> authorsMap = new HashMap<>();

            // Создаём список авторов
            List<String> authors = new ArrayList<>();
            authors.add("Tolstoy");
            authors.add("Chehov");
            authors.add("Pushkin");

            // Кладем список в мапу под ключом "Author"
            authorsMap.put("Author", authors);

            // Достаём список из мапы
            List<String> list = authorsMap.get("Author");

            // Проверяем, что список не null и в нём есть хотя бы 2 элемента (чтобы не было ошибки)
            if (list != null && list.size() >= 2) {
                // Второй элемент — это индекс 1 (индексация с 0)
                String secondAuthor = list.get(1);
                System.out.println("Второй автор: " + secondAuthor);
            } else {
                System.out.println("Недостаточно данных для получения второго элемента.");
            }
        }
}

class Animals {
    String theAnimalSays;
    int value;

    //void speakAs(String Says){
    //    theAnimalSays = Says;
    //}

    void speak(String Says) {
        theAnimalSays = Says;
        System.out.println("Животное говорит " + theAnimalSays);
    }

    //void speedAs(int sAs){
    //    value = sAs;
    //}
    void speed(int sAs){
        value = sAs;
        if (value >= 40){
           System.out.println("Животное очень быстрое");
        } else if (value > 20 && value < 40) {
            System.out.println("Животное быстрое");
        } else if (value <= 20){
            System.out.println("Животное медленное");
        }
    }
}

class Hypotenuse {
    double hypoT(double f, double g) {
    double sqrt = Math.sqrt(Math.pow(f, 2) + Math.pow(g, 2));
    return sqrt;
    }
}

/*class VowelConsonantCounter {

    // Отдельный метод с логикой подсчёта
    // Возвращает массив: [0] — количество гласных, [1] — количество согласных
    public static int[] countLetters(String text) {
        String vowels = "аеёиоуыэюя";
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            // Считаем только русские буквы: пробелы, '_' и всё прочее пропускаем
            if ((c >= 'а' && c <= 'я') || c == 'ё') {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[]{vowelCount, consonantCount};
    }
}*/

class TestChecker {
    public static boolean containsWordTestSimple(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        // Разбиваем по любым небуквенным символам (пробелы, знаки препинания и т.д.)
        String[] words = text.split("[^\\p{L}]+");

        for (String word : words) {
            if ("test".equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
}

class Копилка {
    // Поле «копилка на дом» — static, чтобы оно было общим для всех экземпляров
    private static int копилкаНаДом = 0;
    // Метод «положить в копилку» — добавляет 10000 к общей сумме
    public void положитьВКовилку() {
        копилкаНаДом += 10000;
    }
    // Вспомогательный метод, чтобы получить текущее значение (для вывода в main)
    public static int получитьСумму() {
        return копилкаНаДом;
    }
}

// 1. Enum для операционных систем
enum OS {
    WINDOWS,
    MACOS,
    LINUX
}

// 2. Enum для объёма оперативной памяти
enum RAM {
    TWO,
    FOUR,
    EIGHT
}

class Auto {
    // Поле для хранения текста
    private String description;

    // Конструктор: при создании экземпляра нужно передать текст
    public Auto(String description) {
        this.description = description;
    }

    // Метод, который выводит сохранённый текст
    void showDescription() {
        System.out.println(description);
    }
}

class AutoFun {
    // Скрытые переменные (инкапсуляция)
    private String model = "bmw";
    private int power = 250;
    private String color = "black";

    // --- Геттеры (методы для получения значений) ---
    public String getModel(){
        return model;
    }

    public int getPower(){
        return power;
    }

    public String getColor(){
        return color;
    }

    // --- Сеттеры (методы для изменения значений) ---
    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        // Можно добавить проверку, чтобы мощность не была отрицательной
        if(power >=0) {
            this.power = power;
        } else {
            System.out.println("Ошибка: мощность не может быть отрицательной.");
        }

    }

    public void setColor(String color) {
        this.color = color;
    }
}

class People {
    protected String name;
    
    public People (String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    public void drink() {
        System.out.println(name + " пьет");
    }

    public void run() {
        System.out.println(name + " бежит");
    }
}


class Qa extends People {

    public Qa (String name) {
        super (name);
    }

    public void testing() {
        System.out.println(name + " проводит тестирование");
    }

    public void flooding() {
        System.out.println(name + " проводит нагрузочное тестирование");
    }
}

class PeopleMen {
    public void sleep() {
        System.out.println("Я сплю");
    }

    public void drinkCoffe() {
        System.out.println("Я пью кофе");
    }
}

class QaChel extends PeopleMen {
    // Переопределяем метод: теперь при вызове drinkCoffe() у объекта Qa
    // сработает именно эта версия метода

    @Override
    public void drinkCoffe() {
        System.out.println("Я пью очень много кофе");
    }

//    public void drinkCoffe() {
//        System.out.println("Я пью очень много кофе");
//    }
}

class QaGreat {
    public void testing(String... tasks) {
        int count = tasks.length;

        if(count == 0){
            System.out.println("Нет заданий");
            return;
        }

        switch (count) {
            case 1:
                System.out.println("Получено 1 задание: " + tasks[0]);
                break;
            case 2:
                System.out.println("Получено 2 задания: " + tasks[0] + tasks[1]);
                break;
            case 3:
                System.out.println("Получено 3 задания: " + tasks[0] + tasks[1] + tasks[2]);
                break;
            default:
                System.out.println("Слишком много заданий: можно передать максимум 3");
                break;
        }
    }
}

//class Check {
//    public void checkValue() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b = scanner.nextInt();
//
//        // Проверка на одинаковые числа — выбрасываем исключение
//        if (a == b) {
//            throw new IllegalArgumentException("Ввод двух одинаковых чисел запрещен");
//        }
//
//        // Сравнение чисел
//        if (a > b) {
//            System.out.println("Первое число больше второго");
//        } else {
//            System.out.println("Второе число больше первого");
//        }
//
//        scanner.close();
//    }
//}

// Класс контакта: имя и телефон
//class Contact {
//    private String name;
//    private String phone;
//
//    public Contact(String name, String phone) {
//        this.name = name;
//        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return name + " - " + phone;
//    }
//}
//
//// Телефонный справочник
//class PhoneBook {
//    private ArrayList<Contact> contacts = new ArrayList<>();
//
//    // 1. Добавление контакта (вставка в конец — быстрое, O(1))
//    public void add(Contact c) {
//        contacts.add(c);
//    }
//
//    // 1а. Вставка в конкретную позицию (O(n) — сдвиг элементов после index)
//    public void addAt(int index, Contact c) {
//        if (index >= 0 && index <= contacts.size()) {
//            contacts.add(index, c);
//        } else {
//            System.out.println("Неверный индекс: " + index);
//        }
//    }
//
//    // 2. Поиск по имени (линейный поиск, O(n))
//    public Contact findByName(String name) {
//        for (Contact c : contacts) {
//            if (c.getName().equalsIgnoreCase(name)) {
//                return c;
//            }
//        }
//        return null;
//    }
//
//    // 3. Удаление по имени (O(n): поиск + сдвиг элементов)
//    public boolean removeByName(String name) {
//        for (int i = 0; i < contacts.size(); i++) {
//            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
//                contacts.remove(i); // ArrayList сам сдвинет остальные элементы влево
//                return true;
//            }
//        }
//        return false; //контакта нет
//    }
//
//    // 4. Изменение телефона (сначала находим, потом меняем)
//    public boolean updatePhone(String name, String newPhone) {
//        Contact c = findByName(name);
//        if (c != null) {
//            c.setPhone(newPhone);
//            return true;
//        }
//        return false;
//    }
//
//    // 5. Печать всего справочника
//    public void printAll() {
//        if (contacts.isEmpty()) {
//            System.out.println("Справочник пуст.");
//            return;
//        }
//        for (int i = 0; i < contacts.size(); i++) {
//            System.out.println(i + ": " + contacts.get(i));
//        }
//    }
//}

// Класс контакта — такой же, как раньше
class Contact {
    private String name;
    private String phone;

    public Contact (String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}

// Справочник на связке ArrayList + HashMap
class PhoneBook {
    // Хранение в порядке добавления — для вывода по порядку
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Быстрый поиск по имени — ключ это имя, значение это контакт
    private HashMap<String, Contact> indexByName= new HashMap<>();

    // 1. Добавление контакта: пишем в обе структуры за O(1)
    public void add(Contact c) {
        if (indexByName.containsKey(c.getName())) {
            System.out.println("Контакт <" + c.getName() + "> уже есть в справочнике.");
            return;
        }
        contacts.add(c);
        indexByName.put(c.getName(), c);
    }

    // 2. Поиск по имени: теперь O(1), вместо перебора всего списка
    public Contact findByName(String name) {
        return indexByName.get(name); // null, если не найден
    }

    // 3. Вставка в конкретную позицию: O(n), но с защитой от дублей
    public boolean addAt(int index, Contact c) {
        if (index < 0 || index > contacts.size()) {
            System.out.println("Неверный индекс: " + index);
            return false;
        }
        if (indexByName.containsKey(c.getName())) {
            System.out.println("Контакт <" +  c.getName() + "> уже есть в справочнике.");
            return false;
        }
        contacts.add(index, c);
        indexByName.put(c.getName(), c);
        return true;
    }

    // 4. Удаление по имени: находим мгновенно через HashMap,
    //    потом удаляем из ArrayList (поиск индекса — O(n), сдвиг — O(n))
    public boolean removeByName(String name) {
        Contact c = indexByName.remove(name); // удаляем из HashMap и сразу получаем объект
        if (c == null) {
            return false; // такого контакта нет
        }
        contacts.remove(c); // ArrayList найдёт объект по equals и сдвинет остаток влево
        return true;
    }

    // 5. Изменение телефона: контакт находим за O(1),
    //    менять ничего в структурах не нужно — объект один и тот же в обеих
    public boolean updatePhone(String name, String newPhone) {
        Contact c = indexByName.get(name);
        if (c == null) {
            return false;
        }
        c.setPhone(newPhone);
        return true;
    }

    // 6. Печать всего справочника в порядке добавления
    public void printAll() {
        if (contacts.isEmpty()) {
            System.out.println("Справочник пуст.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ": " + contacts.get(i));
        }
    }
}