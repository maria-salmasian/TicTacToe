import java.util.Arrays;
import java.util.Scanner;

public class StageTwoDemo {
    public static void main(String[] args) {
        String game[][] = new String[3][3];
        System.out.println("Welcome to Tic Tac Toe! Please enter the elements of the game");
        Scanner enter = new Scanner(System.in);
        String wholeLine = enter.nextLine();
        String letters[] = wholeLine.split("(?!^)");
        int count = 0;
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                game[i][j] = letters[count];
                count++;
            }
        }

        TicTacToeStageTwo TicTacGame = new TicTacToeStageTwo(game);
        TicTacGame.print();
        TicTacGame.gameIsWon();
    }
}
