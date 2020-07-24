public class TicTacToeStageTwo {
    private final String x = "X";
    private final String o = "O";
    private final String empty = "_";
    private final String XWon = "XXX";
    private final String OWon = "OOO";
    private String game[][] = new String[3][3];

    protected TicTacToeStageTwo(String[][] game) {
        this.game[0][0] = game[0][0];
        this.game[0][1] = game[0][1];
        this.game[0][2] = game[0][2];
        this.game[1][0] = game[1][0];
        this.game[1][1] = game[1][1];
        this.game[1][2] = game[1][2];
        this.game[2][0] = game[2][0];
        this.game[2][1] = game[2][1];
        this.game[2][2] = game[2][2];
    }

    private String[][] getGame() {
        return game;
    }

    protected void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.game[i][j] + "  ");
            }
            System.out.println();

        }
    }

    protected boolean gameIsWon() {
        String Won = "";
        if (isFinished()) {
            for (int i = 1; i < 9; i++){
                switch (i) {
                    case 1:
                        Won = game[0][0] + game[0][1] + game[0][2];
                        break;
                    case 2:
                        Won = game[1][0] + game[1][1] + game[1][2];
                        break;
                    case 3:
                        Won = game[2][0] + game[2][1] + game[2][2];
                        break;
                    case 4:
                        Won = game[0][0] + game[1][1] + game[2][2];
                        break;
                    case 5:
                        Won = game[0][2] + game[1][1] + game[2][0];
                        break;
                    case 6:
                        Won = game[0][0] + game[1][0] + game[2][0];
                        break;
                    case 7:
                        Won = game[0][1] + game[1][1] + game[2][1];
                        break;
                    case 8:
                        Won = game[0][2] + game[1][2] + game[2][2];
                        break;
                }
                if (Won.equals(XWon)) {
                    System.out.println("X won");
                    return true;
                } else if (Won.equals(OWon)) {
                    System.out.println("O won");
                    return true;
                }
            }
            System.out.println("no one won");
            return false;
        }
        System.out.println("game is not finished");
        return false;

    }

    private boolean isFinished() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (game[i][j].equals(empty))
                    return false;
            }

        }
        return true;
    }

}
