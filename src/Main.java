import java.util.*;
import java.io.*;

public class Main {
    private static int getIntInput(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (Exception e) {
                System.out.print("Некорректный ввод! Введите целое число: ");
                in.next();
            }
        }
    }
    public static <T> List<T> remove(List<T> list) {
        List<T> result = new ArrayList<>();

        if (list.isEmpty()) return result;

        T pred = list.get(0);
        result.add(pred);


        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (!current.equals(pred)) {
                result.add(current);
            }
            pred = current;
        }

        return result;
    }
    public static <T> List<T> reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Очередь не может быть пустой!");
        }

        Stack<T> stack = new Stack<>();
        List<T> reversedmetod = new ArrayList<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            reversedmetod.add(stack.pop());
        }

        return reversedmetod;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.1
//        System.out.println("Введите числитель:");
//        int numerator = getIntInput(in);
//
//        System.out.println("Введите знаменатель (не равен нулю):");
//        int denominator;
//        while (true) {
//            denominator = getIntInput(in);
//            if (denominator != 0) break;
//            System.out.println("Знаменатель не может быть равен нулю. Попробуйте снова:");
//        }
//
//
//        Fraction fraction = new Fraction(numerator, denominator);
//        System.out.println("Создана дробь: " + fraction);
//
//        int k=1;
//        while (k==1) {
//            System.out.println("Выберите действие:");
//            System.out.println("1 - Показать вещественное значение");
//            System.out.println("2 - Изменить числитель");
//            System.out.println("3 - Изменить знаменатель");
//            System.out.println("0 - Выход");
//            System.out.print("Ваш выбор: ");
//
//            int choice = getIntInput(in);
//
//            switch (choice) {
//                case 1 -> System.out.println("Вещественное значение: " + fraction.getDecimalValue());
//                case 2 -> {
//                    System.out.print("Введите новый числитель: ");
//                    fraction.seta(getIntInput(in));
//                    System.out.println("Числитель изменен. Новая дробь: " + fraction);
//                }
//                case 3 -> {
//                    System.out.print("Введите новый знаменатель (не равен нулю): ");
//                    while (true) {
//                        denominator = getIntInput(in);
//                        if (denominator != 0) {
//                            fraction.setb(denominator);
//                            break;
//                        }
//                        System.out.println("Знаменатель не может быть равен нулю. Попробуйте снова:");
//                    }
//                    System.out.println("Знаменатель изменен. Новая дробь: " + fraction);
//                }
//                case 0 -> {
//                    System.out.println("Выход из программы.");
//                    k=0;
//                }
//                default -> System.out.println("Неверный выбор. Попробуйте снова.");
//            }
//        }
        //2.1
//        System.out.print("Введите имя кота: ");
//        String name = in.nextLine();
//
//        Cat cat = new Cat(name);
//
//
//        System.out.print("Сколько раз кот должен мяукнуть? ");
//        int meowCount;
//        while (true) {
//            if (in.hasNextInt()) {
//                meowCount = in.nextInt();
//                if (meowCount > 0) break;
//                else System.out.print("Введите положительное число: ");
//            } else {
//                System.out.print("Введите корректное число: ");
//                in.next();
//            }
//        }
//
//        List<Meowable> meowables = new ArrayList<>();
//        meowables.add(cat);
//
//        System.out.println("Кот начинает мяукать...");
//        for (int i = 0; i < meowCount; i++) {
//            Funs.meowsCare(meowables);
//        }
//
//        System.out.println("\nРезультаты:");
//        System.out.println(cat + " мяукал " + cat.getMeowCount() + " раз(а).");

        //3.6
//        System.out.println("Введите элементы списка через пробел:");
//        String input = in.nextLine();
//
//
//        List<String> list = List.of(input.split("\\s+"));
//        System.out.println("Исходный список: " + list);
//
//
//        List<String> result = remove(list);
//
//
//        System.out.println("Результат: " + result);
        //4.6
//        String fileName = "src/q.txt";
//
//        Map<String, List<Integer>> applicants = new HashMap<>();
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            int n = Integer.parseInt(reader.readLine().trim());
//
//            for (int i = 0; i < n; i++) {
//                String line = reader.readLine().trim();
//                String[] parts = line.split(" ");
//
//                String name = parts[0] + " " + parts[1];
//                List<Integer> scores = Arrays.asList(
//                        Integer.parseInt(parts[2]),
//                        Integer.parseInt(parts[3]),
//                        Integer.parseInt(parts[4])
//                );
//                applicants.put(name, scores);
//            }
//
//
//            List<String> admitted = new ArrayList<>();
//
//            for (Map.Entry<String, List<Integer>> entry : applicants.entrySet()) {
//                List<Integer> scores = entry.getValue();
//                int score1 = scores.get(0);
//                int score2 = scores.get(1);
//                int score3 = scores.get(2);
//                int total = score1 + score2 + score3;
//
//                if (score1 >= 30 && score2 >= 30 && score3 >= 30 && total >= 140) {
//                    admitted.add(entry.getKey());
//                }
//            }
//
//
//            System.out.println("Допущенные абитуриенты:");
//            for (String name : admitted) {
//                System.out.println(name);
//            }
//
//        } catch (IOException e) {
//            System.err.println("Ошибка при чтении файла: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.err.println("Ошибка формата числа: " + e.getMessage());
//        }

        //5.6
//        String fileName = "src/q1.txt";
//        Set<Character> bykv = new HashSet<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            int wordnomer = 1;
//
//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split("\\s+");
//
//                for (String word : words) {
//                    if (wordnomer % 2 == 0) {
//                        for (char c : word.toCharArray()) {
//                            if (!Character.isWhitespace(c)) {
//                                bykv.add(c);
//                            }
//                        }
//                    }
//                    wordnomer++;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка при чтении файла: " + e.getMessage());
//        }
//
//
//        System.out.println("Символы из слов с четными номерами:");
//        for (char c : bykv) {
//            System.out.print(c + " ");
//        }

        //6.1
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(52);
        queue.add(-4353453);
        queue.add(4);

        System.out.println("Исходная очередь: " + queue);

        List<Integer> reversed = reverseQueue(queue);

        System.out.println("Элементы в обратном порядке: " + reversed);


        in.close();
    }













}