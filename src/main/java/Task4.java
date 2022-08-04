import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int i;
        int j;
        int l;
        char[][] field = new char[n][m];
        int mine;

        for (j = 0; j < m; ++j) {
            for (i = 0; i < n; ++i) {
                field[i][j] = '.';
            }
        }

        for (l = 0; l < k; ++l) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            field[i - 1][j - 1] = '*';
        }

        for (i = 0; i < n; ++i) {
            for (j = 0; j < m; ++j) {

                if(field[i][j] != '*'){
                    mine = 0;
                    for (int offsetX=-1; offsetX<=1; offsetX++) {
                        for (int offsetY=-1; offsetY<=1; offsetY++) {
                            if (!(offsetX+i < 0 || offsetY+j < 0 || offsetX+i >= n || offsetY+j >= m)){
                         if(field[offsetX+i][offsetY+j] == '*') {mine++;}}
                        }
                    } if(mine > 0) {field[i][j] = (char) (mine + '0');}}
            }
        }

        for(i = 0; i < n; ++i){
                System.out.println(field[i]);}
    }
}

// https://acmp.ru/index.asp?main=task&id_task=234