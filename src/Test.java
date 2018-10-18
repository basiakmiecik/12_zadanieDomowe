import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();

        do {
            int number = scanner.nextInt();
            numbers.add(number);
        } while (scanner.hasNextLine());
        System.out.println(numbers);

        TreeSet<Integer>numbers2=new TreeSet<>();
            numbers2.addAll(numbers);

        for (Integer number : numbers2) {
            System.out.println(number + " - liczba wystapień: " + Collections.frequency(numbers,number));
        }
    }
}
