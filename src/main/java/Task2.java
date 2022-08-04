import java.util.Scanner;

public class Task2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sequence of integer numbers separated with white space");

        String line = sc.nextLine();
        String[] stringArray = line.split(" ");
        int length = stringArray.length;
        int [] array = new int[length];
        int i;


        for(i =0; i < length; i++){
            array[i] = Integer.parseInt(stringArray[i]);
        }

                boolean isSorted = false;
                int buffer;
                while(!isSorted) {
                    isSorted = true;
                    for (i = 0; i < length-1; i++) {
                        if((array[i]) > array[i+1]){
                            isSorted = false;
                            buffer = array[i];
                            array[i] = array[i+1];
                            array[i+1] = buffer;
                        }
                    }
                }

                for(i=0; i < length; i++){
                System.out.print(array[i] + " ");}
            }
        }

//  На вход программы подаётся массив из чисел,
//  необходимо вывести его в отсортированном виде с помощью метода пузырька.

