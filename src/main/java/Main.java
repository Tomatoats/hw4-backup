import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.io.IOException;

/* COP 3503C Assignment 3
This program is written by: Alexys Veloz */

public class Main {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(Paths.get("in.txt")))
        {
            //take in the inputs
            while (in.hasNext())
            {
                //this block of text takes in the graph
                int rows = in.nextInt();
                int cols = in.nextInt();
                char[][] graph = new char[rows][cols];
                int j = 0;
                int k = 0;
                for (int i = 0; i < rows; i++){
                    String takein = in.next();
                    char[] putin = new char[cols];
                    for (int p = 0; p < cols; p++){
                        putin[p] = takein.charAt(p);
                        graph[i][p] = putin[p];
                    }
                }
                /* if you need to make sure it still inputs properly use this
                for (int i = 0; i < rows; i++){
                    for (j = 0; j < cols; j++){
                        System.out.printf("%c", graph[i][j]);
                    }
                    System.out.printf("\n");
                }
                */

            }
    } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
