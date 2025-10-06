package com.bptn.course._08_inheritance_in_depth;

import java.util.Scanner;

public class Game {

    private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game() {
        // Let's default it two players for now. Later, you can improve upon this to allow the game creator to choose how many players are involved.
        this.players = new Player[2];// complete line.
        board = new Board();// complete line
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1");
        String playerTwoName;
        do { //wrapping the second player name reader in a do while statement to print the prompt at least once
        	//and then keep printing the error message if PlayerTwo name matches playerOne
            System.out.println("Enter player 2's name: ");
            playerTwoName = scanner.nextLine();

            if (playerTwoName.equals(players[0].getName())) {
                System.out.println("Error! Both Players cannot have the same name.");
            }
        } while (playerTwoName.equals(players[0].getName()));
        // /** add logic to prevent a user from giving a second name that's equal to the first. Allow the user to try as long as the names are not different.*/
        // if(players[0]) {}
        /* wrap the code in here with a conditional block that enables the check described above. 
        
            System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
            playerTwoName = scanner.nextLine();
        
        */
        players[1] = new Player(playerTwoName, "2");

        // set up the board using the appropriate method
        this.board = new Board();
        this.board.boardSetUp();
        // print the board the using appropriate method
        board.printBoard();
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove();
        while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
           // call board method to add token.
           board.addToken(col, currentPlayer.getPlayerNumber());
        }
        // print board
        board.printBoard();
    }

    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            //if (/* provide condition)*/ board.boardFull()) {
               // System.out.println("Board is now full. Game Ends.");
               // return;
            //}

            Player currentPlayer = players[currentPlayerIndex];
            // Override default tostring for Player class
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            playerTurn(currentPlayer);
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
              if (currentPlayerIndex == 0) {
                currentPlayerIndex = 1;
              } else if (currentPlayerIndex == 1) {
                currentPlayerIndex = 0;
              }
                
                // reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
            }
        }
    }

}
