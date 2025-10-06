package com.bptn.course._08_inheritance_in_depth;

//From the previous exercise. Feel free to post yours in here, if you like.
import java.util.Scanner;

public class Player {

 private String name;
 // Add other instance variable(s)
 private String playerNumber;
 // Question: should scanner be static or not?
 private Scanner scanner = new Scanner(System.in);// complete line

 public Player(String name, String playerNumber) {
     // complete constructor
     this.name = name;
     this.playerNumber = playerNumber;
 }

 // create getter methods
 public String getName() {
     return this.name;
 }
 public String getPlayerNumber() {
     return this.playerNumber;
 }
 
 public int makeMove() {
     System.out.println("Make your move. What column do you want to put a token in?");
     int column = scanner.nextInt();// receive user input
     return column;
 }

 public String toString() {
     return ("Player " + playerNumber + " is " + name);
 }
}