package com.xworkz.xworkzapp.cricket;

public class Cricket {
	
	private String teamName="INDIA";
	public PlayersDTO[] players;
	int index;
	
	public Cricket(int size) {
		players = new PlayersDTO[size]; 
	}
	
	public void addPlayers(PlayersDTO playersDTO) {
		players[index++] = playersDTO;
		
	}
	
	public void getPlayersDetails(){
		System.out.println(teamName);
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].getName()+"  "+players[i].getJerseyNo()+" "
						+players[i].getAddress() );
			
		}
	}
	
}
