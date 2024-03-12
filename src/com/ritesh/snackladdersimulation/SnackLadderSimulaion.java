package com.ritesh.snackladdersimulation;

import java.util.Random;

public class SnackLadderSimulaion {
	
	private int playerPosition=0;
	private int die;
	
	private static final int NOPLAY=0;
	private static final int LADDER=1;
	private static final int SNAKE=2;
	private static final int WINNIGPOSITION=100;
	
	public void ShowStatus() {
		
		System.out.println("Player Position = "+playerPosition);
	}
	
	public void Playgame() {
		
		Random random = new Random();
		 
		while(playerPosition < WINNIGPOSITION) {
			
			die=random.nextInt(6)+1;
			System.out.println("Die NO = "+die);
			
			int option=random.nextInt(2);
			System.out.println("Option = "+option);
			System.out.println("---------------");
			
		switch(option) {
		
		case NOPLAY:
			playerPosition = playerPosition;
			break;
			
		case LADDER:
			playerPosition = playerPosition + die;
			if(playerPosition > WINNIGPOSITION) {
				
				playerPosition=playerPosition-die;
			}
			
			break;
			
		case SNAKE:
			playerPosition = playerPosition - die;
			
				if(playerPosition < 0) {
					
					playerPosition=0;	
				}
			break;
			
		 }
		ShowStatus();
		}
		
	}

	public static void main(String[] args) {
		
	  System.out.println("Wellcome to Snack Ladder Simulation");
	  
	  SnackLadderSimulaion  player1 = new  SnackLadderSimulaion();
	  
	  player1.ShowStatus();
	  player1.Playgame();
	  player1.ShowStatus();
	  
	}

}
