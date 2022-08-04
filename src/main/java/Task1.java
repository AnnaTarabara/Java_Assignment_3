import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sequence of integer numbers separated with white space");

        String line = sc.nextLine();
        String[] stringArray = line.split(" ");
        int length = stringArray.length;
        int i;

        for(i=length-1; i >=0; i--){
            System.out.print(stringArray[i] + " ");
        }
    }
}


//    На вход программы подаётся массив чисел, необходимо сделать вывод массива в обратном порядке.
//        было: 1 0 4 5
//        станет: 5 4 0 1
