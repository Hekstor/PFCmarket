import java.util.Scanner;

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
    //@Override;
    public void drinkCoffe() {
        System.out.println("Я пью очень много кофе");
    }
}