package maceraOyunum;

import java.util.Scanner;

public abstract class Location {
    protected Player player;
    protected String isim;
    Scanner scan=new Scanner(System.in);
    
    Location(Player player){
    	this.player=player;
    }
    public abstract boolean getLocation();
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
    
    
}
