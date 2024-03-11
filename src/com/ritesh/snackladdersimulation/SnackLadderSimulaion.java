package com.ritesh.snackladdersimulation;

import java.util.Random;

public class SnackLadderSimulaion {
	
	private  int playerPosition=0;
	private int die;
	
	public void ShowStatus() {
		
		System.out.println("Player Position = "+playerPosition);
	}
	
	public void Playgame() {
		
		Random random = new Random();
		
		die=random.nextInt(6)+1;
		System.out.println("Die NO = "+die);
		
	}

	public static void main(String[] args) {
		
	  System.out.println("Wellcome to Snack Ladder Simulation");
	  
	  SnackLadderSimulaion  player1 = new  SnackLadderSimulaion();
	  
	  player1.ShowStatus();
	  player1.Playgame();
	}

}
