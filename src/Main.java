import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};

        int[] prices = new int[]{100, 200, 300};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Список возможных товаров для покупки:");

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) break;
            String numbers[] = inputString.split("\\s+");
            if (numbers.length != 2) {
                System.out.println("Не корректный ввод! Выберите товар и количество или введите `end`");
            }else {
                int productNumber = Integer.parseInt(numbers[0]);
                int productCount = Integer.parseInt(numbers[1]);
                if (productNumber > products.length) {
                    System.out.println("Товара с таким номером нет в списке!");
                } else {
                    productNumber--;
                    int sumProducts = prices[productNumber] * productCount;
                    System.out.println(products[productNumber] + " | " + productCount + " шт | " + sumProducts);
                }
            }

        }

    }
}