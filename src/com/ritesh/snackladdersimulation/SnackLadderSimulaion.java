package com.ritesh.snackladdersimulation;

public class SnackLadderSimulaion {
	private  int playerPosition=0;
	
	public void ShowStatus() {
		
		System.out.println("Player Position = "+playerPosition);
	}

	public static void main(String[] args) {
		
	  System.out.println("Wellcome to Snack Ladder Simulation develop by : Ritesh Badgujar");
	  
	  SnackLadderSimulaion  player1=new  SnackLadderSimulaion();
	  
	  player1.ShowStatus();
	}

}
