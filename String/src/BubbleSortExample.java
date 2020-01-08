public class BubbleSortExample {
    public static void main(String []args) {
        String str[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan"};
        String temp;
        System.out.println("Strings in sorted order:");
        for (int loop2 = 0; loop2 < str.length; loop2++) {
            for (int loop1 = loop2 + 1; loop1 < str.length; loop1++) {
                // comparing adjacent strings
                if (str[loop1].compareTo(str[loop2]) < 0) {
                    temp = str[loop2];
                    str[loop2] = str[loop1];
                    str[loop1] = temp;
                }
            }
            System.out.println(str[loop2]);
        }
    }
}
