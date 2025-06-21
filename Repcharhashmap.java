import java.util.HashMap;
import java.util.Scanner;

class Repcharhashmap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                charCountMap.put(lowerC, charCountMap.getOrDefault(lowerC, 0) + 1);
            }
        }
        for (char c : charCountMap.keySet()) {
            if( charCountMap.get(c) > 1) {
                System.out.println("Character: " + c + ", Count: " + charCountMap.get(c));
            }
        }
    }
}
