
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //task 1(**)
        String[] array = new String[]{"мама", "тато", "вово", "їж їжак желе"};
        System.out.println(returnUniqueChars(returnAllWordsWithPairDuplicates(array)));
        //task 2
        int[] array2 = new int[]{8, 2, 3, 4, 5, 6, 7};
        task2(array2);
        //task 3
        String n = "Alexx9800";
        printElements(n);
    }


    public static String returnAllWordsWithPairDuplicates(String[] array) {
        int count = 0;
        String wordsWithDuplicates = "";
        for (int i = 0; i < array.length; i++) {
            if (count == 2) {
                break;
            } else {
                if (!getWordWithPairDuplicates(array[i]).isEmpty()) {
                    count++;
                    wordsWithDuplicates = wordsWithDuplicates + array[i];
                }
            }
        }
        return wordsWithDuplicates;
    }

    public static Set<Character> returnUniqueChars(String wordsWithDuplicates) {
        char[] arrayList = wordsWithDuplicates.toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < arrayList.length; i++) {
            if (!uniqueChars.contains(arrayList[i])) {
                uniqueChars.add(arrayList[i]);
            }
        }
        return uniqueChars;
    }

    public static String getWordWithPairDuplicates(String n) {
        char[] arrayList = n.toCharArray();
        Arrays.sort(arrayList);
        for (int i = arrayList.length - 1; i > 0; i--) {
            if (arrayList[i] != arrayList[i - 1]) {
                return "";
            } else {
                i--;
            }
        }
        return n;
    }

    public static void task2(int[] array) {
        //Написати метод який приймає массив цілих чисел
        // і вертає суму всіх його парних
        // елементів(не тих які мають парні індекси а ті які самі є парними).
        // [8,2,3,4,5,6,7] -> 20
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count = count + array[i];
//            }
//        }
//        System.out.println(count);
    }

    public static void printElements(String n) {
        //Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
        //Alexx9800
        //A
        //l
        //e
        //x
        //9
        //8
        //0
        char[] chars = n.toCharArray();
        Set<Character> characterSet = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            characterSet.add(chars[i]);
        }
        for (Character character : characterSet) {
            System.out.println(character);
        }
    }
}
