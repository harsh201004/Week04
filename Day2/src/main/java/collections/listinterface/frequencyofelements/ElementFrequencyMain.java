package collections.listinterface.frequencyofelements;
import java.util.*;

public class ElementFrequencyMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.println("Enter words if you with all the words then type 'exit' to stop):");
        while (true) {
            String word = input.nextLine().trim();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            words.add(word);
        }

        Map<String, Integer> frequencyMap = ElementsFrequency.countFrequency(words);
        System.out.println("Frequency of Elements: " + frequencyMap);

        input.close();
    }
}
