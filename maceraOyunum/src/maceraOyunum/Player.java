package maceraOyunum;

import java.util.Scanner;

public class Player {
  private int hasar,sağlık,para,gCan;
  private String isim,kname,özellik,yetenek,motivasyon,hayatHikayesi;
  private Inventory inventory;
  Scanner scan = new Scanner(System.in);
  
public Player(String isim) {
	
	this.isim = isim;
	this.inventory=new Inventory();
}

  public void selectCha() {
	 switch( chaMenu()) {
	 //KaldenDarkthronseçildi.
	 case 1:
		 setKname("Selene Frostwind");
		 setHasar(12);
		 setSağlık(21);
		 setPara(25);
		 setgCan(sağlık);
		 break;
	 case 2:
		 setKname("Aric Shadowblade");
		 setHasar(12);
		 setSağlık(21);
		 setPara(15);
		 setgCan(sağlık);
		 break;
	 }
	System.out.println("Karakter : "+getKname() +"\t Hasar:"+ getHasar() + "\tCan:"+ getSağlık()+"\t Para:"+getPara());
  }
  
  
  public int chaMenu() {

	  System.out.println("1-Karakter isim:Selene Frostwind.\nÖzellik: Selene, buz büyüleriyle donanmış bir büyücüdür.\nSoğukkanlılığı ve içsel gücüyle bilinir.\nYetenek:Buz ve dondurucu büyülerin ustasıdır.\nAynı zamanda, bu güçleri kullanarak ortamı manipüle etme yeteneğine sahiptir.\nMotivasyon: Ailesinin eski bir büyü mirası ve bir felaketi önleme sorumluluğu,Selene'i macera dolu bir yolculuğa sürükler.\nHayat Hikayesi: Selene, buz büyülerini kontrol edebilen nadir bir aile geleneğine sahiptir.\nAilesinin geçmişteki hatalarıyla yüzleşmeli ve gelecekteki felaketleri önlemek için gücünü kullanmalıdır.\nHasar:7\nPara:20,\nSağlık:18");
	  System.out.println();
	  System.out.println("2-Karakter isim:Aric Shadowblade.\nÖzellik: Aric, gizlilik ve hız konusunda uzmanlaşmış bir hırsızdır. Esnek ve atletiktir, gölgelerle bütünleşebilme yeteneğine sahiptir. \nYetenek: Keskin nişancılık ve hırsızlık becerilerine ek olarak, düşmanlarına gizlice yaklaşma ve sessizce etkisiz hale getirme yeteneği vardır. \nMotivasyon: Kaybolan ailesini bulma ve gizemli bir örgütün ardındaki sırları çözme arzusu, Aric'i bu maceraya iten güçlerdir.\nHayat Hikayesi: Aric, genç yaşta bir hırsız olarak yetiştirildi ve zamanla geliştirdiği yeteneklerle büyüdü.\nAilesinin kaybolması, onu karanlık sırları açığa çıkarmak için bir arayışa itti.\nHasar:8,\nPara:5,\nSağlık:24");
	  System.out.println();
	  System.out.println("Seçiminiz : ");
	  int chaID=scan.nextInt();
	  while(chaID<1 || chaID>3) {
		  	System.out.print("Lütfen geçerli bir karakter seçin.");
		  	chaID=scan.nextInt();
	  }
  
	  return chaID;
  }
	
	public int getTotalDamage() {
	   return this.getHasar()+this.getInventory().getDamage();
	
  }

public int getHasar() {
	return hasar;
}

public void setHasar(int hasar) {
	this.hasar = hasar;
}

public int getSağlık() {
	return sağlık;
}

public void setSağlık(int sağlık) {
	this.sağlık = sağlık;
}


public int getPara() {
	return para;
}

public void setPara(int para) {
	this.para = para;
}

public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}

public String getKname() {
	return kname;
}

public void setKname(String kname) {
	this.kname = kname;
}

public String getÖzellik() {
	return özellik;
}

public void setÖzellik(String özellik) {
	this.özellik = özellik;
}

public String getYetenek() {
	return yetenek;
}

public void setYetenek(String yetenek) {
	this.yetenek = yetenek;
}

public String getMotivasyon() {
	return motivasyon;
}

public void setMotivasyon(String motivasyon) {
	this.motivasyon = motivasyon;
}

public String getHayatHikayesi() {
	return hayatHikayesi;
}

public void setHayatHikayesi(String hayatHikayesi) {
	this.hayatHikayesi = hayatHikayesi;
}

public Inventory getInventory() {
	return inventory;
}

public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}
public int getgCan() {
	return gCan;
}


public void setgCan(int gCan) {
	this.gCan = gCan;
}

  
}
