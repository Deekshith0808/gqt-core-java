package gqt375;
/**
 * @author sai deekshith
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class P114 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = sc.nextLine();
input = input.toLowerCase();
HashMap<Character, Integer> freqMap = new HashMap<>();
for (char ch : input.toCharArray()) {
if (ch != ' ') { // ignoring spaces
freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
}
}
System.out.println("Character Frequencies:");
for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
System.out.println(entry.getKey() + " : " + entry.getValue());
}
}
}