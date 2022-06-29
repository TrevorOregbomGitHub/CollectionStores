package com.qa.enums;

public class EnumsTest {
	
	public enum Squad {
		Goalkeeper(2,94), 
		FullBack(3,94), 
		CentreHalf(4,95), 
		CentreMid(7,93), 
		CentreForward(4,94), 
		Winger(2,96);
		
		private final int numOfPlayers;
		private final double averageRating;
		
		Squad(int numOfPlayers, double averageRating) {
	        this.numOfPlayers = numOfPlayers;
	        this.averageRating = averageRating;

		}

	}
}
