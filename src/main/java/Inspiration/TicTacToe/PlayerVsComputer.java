package Inspiration.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class PlayerVsComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {  {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
        printBoard(board);
        whoWon(scanner, board);
    }

    private static void whoWon(Scanner scanner, char[][] board) {
        while (true) {
            playerTurn(board, scanner);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
            computerTurn(board);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                    board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                    board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                    board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                    board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                    board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' ||
                    board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                    board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                System.out.println("Player Won !!!");
                break;
            } else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                    board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                    board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                    board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                    board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                    board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' ||
                    board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                    board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                System.out.println("Computer Won !!!");
                break;
            }
        }
    }

    private static boolean isGameFinished(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }

    private static void computerTurn(char[][] board) {
        Random random = new Random();
        int computerMove;
        while (true) {
            computerMove = random.nextInt(9) + 1;
            if (isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer chose : " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    private static boolean isValidMove(char[][] board, int position) {
        return switch (position) {
            case 1 -> (board[0][0] == ' ');
            case 2 -> (board[0][1] == ' ');
            case 3 -> (board[0][2] == ' ');
            case 4 -> (board[1][0] == ' ');
            case 5 -> (board[1][1] == ' ');
            case 6 -> (board[1][2] == ' ');
            case 7 -> (board[2][0] == ' ');
            case 8 -> (board[2][1] == ' ');
            case 9 -> (board[2][2] == ' ');
            default -> false;
        };
    }

    private static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Wybierz pole od 1 do 9");
            userInput = scanner.nextLine();
            if (isValidMove(board, Integer.parseInt(userInput))) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
                break;
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String userInput, char symbol) {
        switch (userInput) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Only 1-9 digit, Moran!");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
