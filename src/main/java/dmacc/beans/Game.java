package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

import org.thymeleaf.expression.Arrays;

import dmacc.controller.WebController;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	public WebController choice; 
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner(choice, player1);
	}

	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
	
		/*
		String winner = "You";
		
		this.setComputerPlayer("You");
		*/
		
		Random rand = new Random();
		 int cinput = rand.nextInt(3)+ 1;
		  if (cinput == 1)
		  computerPlayer = "rock";
		   if (cinput == 2)
		  computerPlayer = "paper";
		 if (cinput == 3)
		  computerPlayer = "scissors";
		    return;
		  
	}
	
	private void determineWinner(WebController choice, String computerPlayer) {
		// TODO Auto-generated method stub
		//System.out.println (" Computer Choice: " + computer);
		  //System.out.println ("Your Choice : " + user);
		
		String user = choice.toString();
		
		  if (computerPlayer.compareTo( "rock" ) == 0 && user.compareTo  ("scissors") == 0)
			  //winner = computerPlayer;
		   	  winner = "You Lose";
			  this.setWinner(winner);
		  if (computerPlayer.compareTo("scissors")== 0 && user.compareTo("paper") == 0)
			  //winner = computerPlayer;
			  winner = "You Lose";
			  this.setWinner(winner);
		  if (computerPlayer.compareTo("Paper") == 0 && user.compareTo("rock") == 0)
			  //winner = computerPlayer;
			  winner = "You Lose";
			  this.setWinner(winner);
		   if (computerPlayer.compareTo("rock") == 0 && user.compareTo("paper") == 0)
			   //winner = player1;
			   winner = "You win";
			   this.setWinner(winner);
		  if (computerPlayer.compareTo("scissors") == 0 && user.compareTo("rock") == 0)
			 //winner = player1;
			  winner = "You win";
			  this.setWinner(winner);
		  if (computerPlayer.compareTo("paper") == 0 && user.compareTo("scissors") == 0)
			  //winner = player1;
			  winner = "You win";
			  this.setWinner(winner);
		  if (computerPlayer.compareTo(user) == 0 ){
		    winner = "Tie!";
			  this.setWinner(winner);
		    
		  }
	}
}
