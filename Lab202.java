import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int n : initial_numbers) {
            numbers.add(n);
        }

        System.out.println("Initial data : " + numbers);

        System.out.print("Enter a number to add at the end: ");
        int num = sc.nextInt();
        numbers.add(num);

        System.out.print("Enter the index to insert: ");
        int index = sc.nextInt();

        System.out.print("Enter the number to insert: ");
        int value = sc.nextInt();

        numbers.add(index, value);

        System.out.print("Enter the index to remove: ");
        int removeIndex = sc.nextInt();
        numbers.remove(removeIndex);

        System.out.print("Enter the index to update: ");
        int updateIndex = sc.nextInt();

        System.out.print("Enter the new value: ");
        int newValue = sc.nextInt();

        numbers.set(updateIndex, newValue);

        System.out.println("Final data in ArrayList:");
        System.out.println(numbers);

        sc.close();
    }
}
