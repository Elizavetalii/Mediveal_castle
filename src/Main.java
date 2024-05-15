import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medieval_castle {

    public static int strength = 100;
    public static int exp = 0;
    public static int gold = 0;
    List<String> inventory = new ArrayList<>();

    public static void main(String[] args) {
        Medieval_castle app = new Medieval_castle();
        firstFunction();
        app.castleActions(strength);
    }

    static void firstFunction() {
        System.out.println("Ваш путь был тяжёлым и вот вы уже приблизились к замку!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("К вам подошёл охранник замка..");
        System.out.print("- Охранник: Приветствую тебя, гость. Как представить вас Лорду?\n- Вы: Моё имя ");
        String playerName = scanner.nextLine();
        if (isRussian(playerName)) {
            System.out.println("- Охранник: Так давно тебя ждали " + playerName + "!" +
                    " Добро пожаловать в настоящий замок средневековья. Чувствуйте себя как дома!");
            secondFunction();
        } else {
            System.out.println("Имя должно содержать только русские буквы :)");
            firstFunction();
        }
    }

    static boolean isRussian(String str) {
        for (char c : str.toCharArray()) {
            if (!(c >= '\u0410' && c <= '\u044F')) {
                return false;
            }
        }
        return true;
    }

    static void secondFunction() {
        System.out.println("Вы вошли в замок и встали в ступор от невероятной красоты залы..");
        System.out.println("К вам подошла служанка.");
        System.out.println("- Служанка: На каком этаже замка вы хотите разместиться?");
        System.out.print("1. Первый этаж \n2. Второй этаж \nВыберите этаж: ");

        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        scanner.nextLine();

        if (floor == 1) {
            System.out.println("Вы пустили длинный коридор!");
            thirdFunction();
        } else if (floor == 2) {
            System.out.println("Вы долго поднимались на второй этаж.");
            fourthFunction();
        } else {
            System.out.println("Пожалуйста, выберите существующий этаж.");
            secondFunction();
        }
    }

    static void thirdFunction() {
        System.out.println("Теперь вам предстоит выбор комнаты на первом этаже!");
        System.out.println("1. Маленькая, но уютная комната с балконом");
        System.out.println("2. Роскошная, большая комната");
        System.out.println("3. Средняя комната, с чудесным видом на озеро");
        System.out.print("Выберите существующую комнату: ");
        Scanner scanner = new Scanner(System.in);
        int room = scanner.nextInt();
        scanner.nextLine();

        if (room == 1) {
            System.out.println("Вы прошли по коридору и вошли в маленькую комнату с балконом. У вас очень хорошее настроение!");
            System.out.println("Вы удачно выбрали комнату и уже расположили свои вещи!");
        } else if (room == 2) {
            System.out.println("Вы вошли в большую комнату с роскошным средневековым дизайном.");
            System.out.println("Вы удачно выбрали комнату и уже расположили свои вещи!");
        } else if (room == 3) {
            System.out.println("Вы прошли по коридору и вошли в комнату с видом на озеро и долго любовались в окно!");
            System.out.println("Вы удачно выбрали комнату и уже расположили свои вещи!");
        } else {
            System.out.println("Пожалуйста, выберите существующую комнату.");
            thirdFunction();
        }
    }

    static void fourthFunction() {
        System.out.println("Теперь вам предстоит выбор комнаты на втором этаже!");
        System.out.println("1. Спальня с камином");
        System.out.println("2. Комната с тайной библиотекой");
        System.out.println("3. Просторная комната с арфой");
        System.out.print("Выберите комнату: ");
        Scanner scanner = new Scanner(System.in);
        int room = scanner.nextInt();
        scanner.nextLine();

        if (room == 1) {
            System.out.println("Вы зашли в уютную спальню с камином.");
            System.out.println("Вы прекрасно отдохнули около камина и уже расположили свои вещи!");
        } else if (room == 2) {
            System.out.println("Вы зашли в комнату и открыли дверь библиотеки..там вы увидели древние свитки.");
            System.out.println("Вы увлеченно изучили некоторые свитки и расположили свои вещи!");
        } else if (room == 3) {
            System.out.println("Вы зашли в комнту и сразу же принялись играть на арфе. Вы восхищены и рады своему выбору!");
            System.out.println("После прекрасной игры вы расположили свои вещи в комнате.");
        }
        else
        { System.out.println("Пожалуйста, выберите доступную комнату.");
            fourthFunction();
        }
    }

    public void castleActions(int strength) {
        Scanner input = new Scanner(System.in);
        System.out.println("Теперь вам предстоит выбор действий!");
        System.out.println("1. Помочь с делами Лорду");
        System.out.println("2. Прогуляться по саду");
        System.out.println("3. Покушать в столовой замка");
        System.out.println("4. Активно провести время");
        System.out.println("5. Покинуть замок");
        System.out.println("6. Узнать свой прогресс");
        System.out.println("7. Пополнить свой инвентарь");
        System.out.println("Выберите действие:");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                helpLord();
                castleActions(strength);
                break;
            case "2":
                walkInGarden();
                castleActions(strength);
                break;
            case "3":
                eatFood();
                castleActions(strength);
                break;
            case "4":
                playGames();
                castleActions(strength);
                break;
            case "5":
                leaveCastle();
                break;
            case "6":
                checkProgress();
                castleActions(strength);
                break;
            case "7":
                manageInventory();
                castleActions(strength);
                break;
            default:
                System.out.println("Недопустимое действие");
                castleActions(strength);
        }
    }

    void helpLord() {
        if (strength >= 30) {
            System.out.println("Вы очень помогли Лорду с его делами, за это он вас поблагодарил вас 50 золотыми и 20 опыта!");
            strength -= 30;
            gold += 50;
            exp += 20;
        } else {
            System.out.println("У вас недостаточно силы для помощи Лорду.");
        }
    }

    void walkInGarden() {
        if (strength >= 20) {
            System.out.println("Вы прогулялись по прекрасному саду средневекового замка, получив 15 опыта!");
            strength -= 20;
            exp += 15;
        } else {
            System.out.println("У вас недостаточно силы для прогулки по саду.");
        }
    }

    public static void eatFood() {
        System.out.println("Выберите вид еды:");
        System.out.println("1. Отведать пшеничного хлеба с уткой (+25 к силе) (-15 монет)");
        System.out.println("2. Выпить вино (+12 к силе) (-5 монет)");
        System.out.println("3. Полакомиться десертом замка (+40 к силе) (-25 монет)");
        System.out.println("4. Поесть фрукты (+20 к силе) (-10 монет)");
        System.out.println("5. Томленое мясо курицы (+30 к силе) (-20 монет)");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                if (gold >= 15) {
                    strength += 25;
                    gold -= 15;
                    System.out.println("Вы отведали пшеничного хлеба с уткой. Приятного аппетита!");
                } else {
                    System.out.println("У вас недостаточно золота для отведания пшеничного хлеба с уткой.");
                }
                break;
            case "2":
                if (gold >= 5) {
                    strength += 12;
                    gold -= 5;
                    System.out.println("Вы выпили вино. Наслаждайтесь его изысканым вкусом!");
                } else {
                    System.out.println("У вас недостаточно золота для покупки вина.");
                }
                break;
            case "3":
                if (gold >= 25) {
                    strength += 40;
                    gold -= 25;
                    System.out.println("Вы полакомились десертом замка. Очень вкусно!");
                } else {
                    System.out.println("У вас недостаточно золота для полакомиться десертом замка.");
                }
                break;
            case "4":
                if (gold >= 10) {
                    strength += 20;
                    gold -= 10;
                    System.out.println("Вы поели фрукты из сада средневекового замка.");
                } else {
                    System.out.println("У вас недостаточно золота для покупки фруктов.");
                }
                break;
            case "5":
                if (gold >= 20) {
                    strength += 30;
                    gold -= 20;
                    System.out.println("Вы поели фирменное томленое мясо этого замка!");
                } else {
                    System.out.println("У вас недостаточно золота для покупки томленого мяса.");
                }
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте еще раз.");
                eatFood();
                break;
        }
    }

    public static void playGames() {
        System.out.println("Выберите досуг:");
        System.out.println("1. Загадочные кости  (-3 к силе) (+5 опыта)");
        System.out.println("2. Шахматы (-6 к силе) (+15 опыта)");
        System.out.println("3. Турнир по мечам (-9 к силе) (+22 опыта)");
        System.out.println("4. Бег через лабиринт (-12 к силе) (+30 опыта)");
        System.out.println("5. Охота на уток (-15 к силе) (+33 опыта)");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                if (strength >= 3) {
                    strength -= 3;
                    exp += 5;
                    System.out.println("Вы бросаете загадочные кости. Узнайте свою судьбу!");
                } else {
                    System.out.println("У вас недостаточно силы для игры в загадочные кости.");
                }
                break;
            case "2":
                if (strength >= 6) {
                    strength -= 6;
                    exp += 15;
                    System.out.println("Вы поиграли в шахматы. Сила уменьшилась на 6.");
                } else {
                    System.out.println("У вас недостаточно силы для игры в шахматы.");
                }
                break;
            case "3":
                if (strength >= 9) {
                    strength -= 9;
                    exp += 22;
                    System.out.println("Вы принимаете участие в турнире по мечам. Победите всех соперников!");
                } else {
                    System.out.println("У вас недостаточно силы для участия в турнире по мечам.");
                }
                break;
            case "4":
                if (strength >= 12) {
                    strength -= 12;
                    exp += 30;
                    System.out.println("Вы пробежали лабиринт. Сила уменьшилась на 12.");
                } else {
                    System.out.println("У вас недостаточно силы для бега через лабиринт.");
                }
                break;
            case "5":
                if (strength >= 15) {
                    strength -= 15;
                    exp += 33;
                    System.out.println("Вы выезжаете с Лордом в поле и удачно охотитесь на уток! Вы нашли общий язык.");
                } else {
                    System.out.println("У вас недостаточно силы для охоты на уток.");
                }
                break;
            default:
                System.out.println("Неверный выбор. Выберите игру снова.");
                playGames();
                break;
        }
    }

     void leaveCastle() {
        System.out.println("Вы покинули замок");
        System.exit(0);
    }

     void checkProgress() {
        System.out.println("Ваш прогресс: ");
        System.out.println("Сила путника --- " + strength);
        System.out.println("Опыт --- " + exp);
        System.out.println("Золотые монеты --- " + gold);
         System.out.println("Инвентарь:");
         for (String item : inventory) {
             System.out.println(item);
         }
    }
     void manageInventory() {
        System.out.println("Доступные товары:");
        System.out.println("1. Элитный перстень - 500 золотых монет - 100 опыта");
        System.out.println("2. Кожанная обувь - 30 золотых монет - 50 опыта");
        System.out.println("3. Хлопковая одежда - 20 золотых монет - 30 опыта");
        System.out.println("4. Драгоценный камень - 1000 золотых монет - 200 опыта");

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите товар для покупки:");
        String itemChoice = input.nextLine();

        switch (itemChoice) {
            case "1":
                buyItem("Элитный перстень", 500, 100);
                break;
            case "2":
                buyItem("Кожанная обувь", 30, 50);
                break;
            case "3":
                buyItem("Хлопковая одежда", 20, 30);
                break;
            case "4":
                buyItem("Драгоценный камень", 1000, 200);
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
                manageInventory();
                break;
        }
    }

    void buyItem(String itemName, int price, int requiredExp) {
        if (gold >= price && exp >= requiredExp) {
            gold -= price;
            System.out.println("Вы приобрели " + itemName);
            addToInventory(itemName);
        } else {
            System.out.println("У вас недостаточно золота или опыта для покупки " + itemName);
        }
    }

    void addToInventory(String item) {
        inventory.add(item);
        // Логика добавления купленного предмета в инвентарь
        System.out.println(item + " добавлен в ваш инвентарь.");
    }
}