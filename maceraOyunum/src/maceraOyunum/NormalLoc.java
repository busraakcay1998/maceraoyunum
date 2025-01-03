package maceraOyunum;

public abstract class NormalLoc extends Location{

	NormalLoc(Player player,String isim) {
		super(player);
		this.isim=isim;
	}
	public boolean getLocation() {
		return true;
	}
	

}

