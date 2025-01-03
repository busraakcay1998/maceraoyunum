package maceraOyunum;

import java.util.Scanner;

public class Game {
   Player player;
   Location location;
   Scanner scan=new Scanner(System.in);
private Scanner scan2;
   
   public void login() {
	    scan2 = new Scanner(System.in);
		System.out.println("Hoş geldiniz!");
		System.out.println("İsminiz:");
		String playerName=scan2.nextLine();
		player=new Player(playerName);
		player.selectCha();
		start();
   }

private void start() {
	while(true) {
		System.out.println();
		System.out.println("============================================");
		System.out.println();
		System.out.println("Savaş konumu seçin.");
		System.out.println("1.Enerji Kristali Evi -->Bu evdeki kristalleri toplayarak can yenileyebilirsin.Öldüğünde tekrar bu evde doğaacaksın.");
		System.out.println("2.Kayıp Şehir -->Eskiden güçlü bir medeniyetin bulunduğu ancak zamanla kaybolan bir şehir.Gizemli tuzaklar,unutulmuş tapınaklar ve terk edilmiş saraylarla doludur.Karşınıza garip yaratıklar çıkabilir.");
		System.out.println("3.Buzul Mağaraları Krallığı -->Oyuncular, buzul mağaralarının içinde bulunan bir krallığı keşfederler. Mağaralar, dev buz kristalleri, buz ejderhaları ve antik tapınaklarla doludur.Buradan kurtulabilmek için buzul canavarlarını yenmelisin.");
		System.out.println("4.Zombi Salgınına Dönüşen Şehir --> Oyuncular, bir zombi salgınının ortasında bulunan bir şehre ulaşırlar. Şehir, terkedilmiş binalar, karanlık sokaklar ve tehlikeli zombi sürüleriyle doludur.Buradan kurtulmak için zombilerle savaş!");
		System.out.println("5.Mağaza -->Silah ve zırh satın alabilirsiniz.");
		System.out.print("Gitmek istediğiniz yer:");
		int selLoc=scan.nextInt();
		while(selLoc<0 || selLoc > 5) {
			System.out.print("Lütfen geçerli bir konum seçiniz.");
			selLoc=scan.nextInt();
			
		}
		 switch (selLoc){
		 case 1: 
			 location=new EnergyCrystalHouse(player);
		 break;
		 
		 case 2:
			 location=new theLostCity(player);
			 break;
		 case 3:
			 
			 location=new BuzulMagaralari(player);
			 break;
		 case 4:
			 
			 location=new ZombiSalgininaDönüsenSehir(player);
			 break;
		 case 5:
			 
			 location= new ToolStore(player,null);
			 break;
			 
		 default:location=new EnergyCrystalHouse(player);
		
		 }
		if(location.getIsim().equals("Enerji Kristal Evi")) {
			if(player.getInventory().isAntikHarita()&&player.getInventory().isEfsaneviAnahtar()&&player.getInventory().isKristalTop()) {
				System.out.println("Tebrikler Oyunu Kazandınız !");
				break;
	}
		
		}
	   if(!location.getLocation()) {
		   System.out.println("Oyun Bitti !");
		   break;
	   }
	}
	
}
}
