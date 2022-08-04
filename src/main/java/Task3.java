import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sorted sequence of integer numbers separated with white space");
        String line = sc.nextLine();

        System.out.println("Enter an integer number to search");
        int element = sc.nextInt();

        String[] stringArray = line.split(" ");
        int length = stringArray.length;
        int [] array = new int[length];
        int i;

        for(i =0; i < length; i++){
            array[i] = Integer.parseInt(stringArray[i]);
        }

            int left = 0;
            int right = length - 1;
            int middle;
            int current;
            int foundIndex = -1;

            while (left <= right) {

                middle = (left + right) / 2;
                current = array[middle];

                if (current == element) {
                    foundIndex = middle; break;

                } else if (current < element) {
                    left = middle + 1;

                } else {
                    right = middle - 1;
                }
            }
            if(foundIndex!=-1){System.out.println("number is found at index " + foundIndex);}
            else{System.out.println("number is not found");}
        }
    }

//    На вход программы подаётся искомое число и отсортированный массив,
//    необходимо реализовать алгоритм бинарного поиска для проверки того,
//    что число присутствует в массиве.
