import java.util.Scanner;

public class ticTacToe {
    public char[][] board;
    public char currentChar;
    public String player1, player2, currentPlayer;

    public ticTacToe(String p1, String p2) {
        board = new char[3][3];
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;
        currentChar = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void changePlayer() {
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
            currentChar = 'O';
        } else {
            currentPlayer = player1;
            currentChar = 'X';
        }
    }

    public boolean placeMark(int row, int col) {
        if (row >= 0 && col >= 0 && row < 3) {
            if (board[row][col] == '-') {

                board[row][col] = currentChar;
                return true;
            }
        }

        return false;
    }

    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
                || checkRowCol(board[0][2], board[1][1], board[2][0]) == true);
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of player 1: ");
        String p1 = scan.nextLine();
        System.out.println("Enter the name of player 2: ");
        String p2 = scan.nextLine();
        ticTacToe game = new ticTacToe(p1, p2);
        boolean doYouWantToPlayAgain = true;
        while (doYouWantToPlayAgain) {
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("--------------------------------");
            boolean gameEnded = false;
            while (!gameEnded) {
                System.out.println("Current board:");
                game.printBoard();
                int row;
                int col;
                while (true) {
                    System.out.println(
                            game.currentPlayer + ", enter an empty row and column to place your mark!");
                    row = scan.nextInt() - 1;
                    col = scan.nextInt() - 1;
                    if (game.placeMark(row, col)) {
                        break;
                    } else {
                        System.out.println("This position is already set. Try another one.");
                    }
                }
                if (game.checkForWin()) {
                    System.out.println("We have a winner: " + game.currentPlayer + "!");
                    gameEnded = true;
                } else if (game.isBoardFull()) {
                    System.out.println("Appears we have a draw!");
                    gameEnded = true;
                }

                game.changePlayer();
            }
            System.out.println("Would you like to play again? [Yes / No]");
            String userInput = scan.next().trim();
            doYouWantToPlayAgain = userInput.equalsIgnoreCase("yes");
            game.initializeBoard();
        }
        scan.close();
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}