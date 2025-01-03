package maceraOyunum;

public class EnergyCrystalHouse extends NormalLoc{

	EnergyCrystalHouse(Player player) {
		super(player,"Enerji Kristal Evi");
	}
   public boolean getLocation() {
	   player.setSağlık(player.getgCan());
	   System.out.println("Can dolduruldu!");
	   System.out.println("Şu an güvenli bölgedesiniz!");
	   return true;
   }
}
