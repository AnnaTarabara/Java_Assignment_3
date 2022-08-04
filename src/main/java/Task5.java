import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int j;
        int x = 0;
        int y = -1;
        int offsetX = 0;
        int offsetY = 1;
        int n = sc.nextInt();
        int [][] array = new int[n][n];
        int length = String.valueOf(n*n).length();

        while(i <= n*n){

            if(x+offsetX>=0 && x+offsetX<n && y+offsetY>=0 && y+offsetY<n && array[x+offsetX][y+offsetY] == 0){

                x+=offsetX;
                y+=offsetY;
                array[x][y] = i;
                i+=1;
            }

            else{
                if(offsetY == 1){
                    offsetY = 0;
                    offsetX = 1;
                }
                else if(offsetX == 1){
                    offsetX = 0;
                    offsetY = -1;
                }
                else if(offsetY == -1){
                    offsetY = 0;
                    offsetX = -1;
                }
                else if(offsetX == -1){
                    offsetX = 0;
                    offsetY = 1;
                }
            }
        }
        for(i = 0; i< n; i++){
            for(j = 0; j < n; j++){
                System.out.print(String.format("%1$" + length + "s", array[i][j]) + " ");
            }
            System.out.print("\n");
            }
    }
}

// https://acmp.ru/index.asp?main=task&id_task=196