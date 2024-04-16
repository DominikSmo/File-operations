import java.util.Arrays;

public class Harddrive {
    public static void main(String[] args) {

        /*Each character symbolizes a memory cell on the hard drive, working cells containing data are marked with capital letters from 'A' to 'Z'
        and cells that have been corrupted are marked with '!'. Count the number of occurrences of corrupted memory sectors.*/

        String[] tab = {"J", "O", "O", "Z", "Q", "S", "T", "U", "!", "C", "V", "F", "P", "D", "Y", "X", "!", "!", "P", "U", "R", "F", "!", "H", "!", "!", "!", "L", "J", "R", "J", "V", "!", "V", "I", "O", "B", "P", "R", "W", "N", "!", "J", "E", "B", "X", "S", "O", "!", "Q", "L", "N", "S", "!", "L", "A", "A", "B", "F", "U", "!", "I", "N", "!", "!", "!", "K", "V", "W", "!", "E", "M", "A", "!", "!", "!", "E", "Y", "Q", "P", "T", "!", "H", "!", "X", "E", "K", "J", "!", "Z", "E", "!", "!", "!", "Z", "F", "!", "X", "D", "T" };
        String[] tab1 = new String[tab.length];
        int errorNumbers = 0;                       // Variable, which its value is the number of exclamation marks in an array 'tab'



        for (int i = 0; i < tab.length; i ++) {

            if (tab[i].equals("!")) {       // In a loop we count the number of exclamation marks in an array 'tab'.
                errorNumbers++;
            }
        }
        System.out.println("error Numbers:" + errorNumbers);
        System.out.println("tab:" + " " +  Arrays.toString(tab));

        for (int i = 0; i < tab.length; i ++){
            tab1[i] = tab[i];

            if (tab1[i].equals("!")){  // In a loop we fill in the sectors with exclamation marks by value 'null'.
                tab1[i] = null;

            }

        }

        System.out.println("tab1:" + " " + Arrays.toString(tab1));
    }
}

















