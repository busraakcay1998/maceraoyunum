package maceraOyunum;

import java.util.Scanner;

public class ToolStore extends NormalLoc{
	

	private Scanner scan;
	ToolStore(Player player, String isim) {
		super(player, "Mağaza");
		
	}
    public boolean getLocation() {
    	scan = new Scanner(System.in);
    	System.out.println("Para:" +player.getPara());
    	System.out.println("1.Silahlar");
    	System.out.println("2.Zırhlar ve Kalkanlar");
    	System.out.println("3.Çıkış");
    	System.out.print("Seçiminiz:");
    
		int selTool=scan.nextInt();
    	int selItemID ;
    	switch(selTool) {
    	case 1:
    		selItemID=weaponMenu();
    		buyWeapon(selItemID);
    		break;
    	case 2:
    		selItemID=armorMenu();
    		buyArmor(selItemID);
    		break;
    	
    	}
    	return true;
    	
   
    }
 public int armorMenu() {
	System.out.println("1.Gölge Zırhı <Para:15 - Hasar:1>");
 	System.out.println("2.Magma Zırhı<Para:25 - Hasar:3>");
 	System.out.println("3.Kristal Zırh <Para:40 - Hasar:5>");
 	System.out.println("4.Çıkış");
 	System.out.println("Zırh Seçiniz.");
 	int selArmorID=scan.nextInt();
 	return selArmorID;
    }
 public void buyArmor(int itemID) {
	 int avoid=0,fiyat=0;
 	 String aName=null;
 	 switch(itemID) {
	   case 1:
		   avoid=1;
		   aName="Gölge Zırhı";
		   fiyat=15;
		   break;
	   case 2:
		   avoid=3;
		   aName="Magma Zırhı";
		   fiyat=25;
		   break;
	   case 3:
		   avoid=5;
		   aName="Kristal Zırh";
		   fiyat=40;
		   break;
		   
		   default:System.out.println("İşlem Yapılamadı.");
		   break;
		case 4:
		   System.out.println("Çıkış Yapılıyor.");
		   break;
	   }
 	 if(fiyat>0) {
 		 if(player.getPara()>= fiyat) {
 		    	player.getInventory().setArmor(avoid);
 		    	player.getInventory().setaName(aName);
 		    	player.setPara(player.getPara()-fiyat);
 		    }
 		    	 System.out.println(aName+" satın aldınız, Engellenen hasar: " + player.getInventory().getArmor());
 		    	 System.out.println("Kalan para:"+player.getPara());
 	 }else {
	    	System.out.println();
	    }
	 
 }
    public int weaponMenu() {
    	System.out.println("1.Gölge Asası\t <Para:25 - Hasar: 2 >");
    	System.out.println("2.Lazer Tüfeği\t<Para:35 - Hasar: 3 >");
    	System.out.println("3.Akıllı Tetik\t <Para:45 -Hasar: 7 >");
    	System.out.println("4.Çıkış");
    	System.out.println("Silah Seçiniz : ");
    	int selWeaponID=scan.nextInt();
    	return selWeaponID;
    }
    public void buyWeapon(int itemID) {
    	int hasar=0,fiyat=0;
    	String wName=null;
    	switch(itemID) {
  	   case 1:
  		   hasar=2;
  		   wName="Gölge Asası";
  		   fiyat=25;
  		   break;
  	   case 2:
  		   hasar=3;
  		   wName="Lazer Tüfeği";
  		   fiyat=35;
  		   break;
  	   case 3:
  		   hasar=7;
  		   wName="Akıllı Tetik";
  		   fiyat=45;
  		   break;
  	   default:System.out.println("İşlem Yapılamadı.");
  		   break;
  		case 4:
  		   System.out.println("Çıkış Yapılıyor.");
  		   break;
  	   }
  	  
    	 if(fiyat>0) {
    		 if(player.getPara()> fiyat) {
    		    	player.getInventory().setDamage(hasar);
    		    	player.getInventory().setwName(wName);
    		    	player.setPara(player.getPara()-fiyat);
    		    	System.out.println(wName+ " satın aldınız, Önceki hasar:" +player.getHasar()+ ", Yeni hasar:"+ player.getTotalDamage());
   		    		System.out.println("Kalan para :" +player.getPara());	 
    		    }else {
    		    	System.out.println("Para yetersiz!");
    		    }
    		    	 
    	 }
}
}
