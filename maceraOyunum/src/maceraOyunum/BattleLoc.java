 package maceraOyunum;

public abstract class BattleLoc extends Location {
  protected Obstacle obstacle;
  protected String award;
  
	BattleLoc(Player player,String isim,Obstacle obstacle,String award) {
		super(player);
		this.obstacle=obstacle;
		this.isim=isim;
		this.award=award;
	}
	
 public boolean getLocation() {
    	int obsCount=obstacle.count();
    	System.out.println(" Şu an buradasınız : "+this.getIsim());
    	System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " bulunuyor!");
    	System.out.print("<S>avaş veya <K>aç :");
    	System.out.println();
    	String selCase = scan.nextLine();
    	selCase = selCase.toUpperCase();
    	if(selCase.equals("S")) {
    		if(combat(obsCount)) {
    			System.out.println(this.getIsim()+" bölgesindeki düşmanları yendin !");
    			if(this.award.equals("Antik Harita")&& player.getInventory().isAntikHarita()==false) {
    				System.out.println(this.award + " Kazandınız !");
    				player.getInventory().setAntikHarita(true);
    			}else if(this.award.equals("Kristal Top")&& player.getInventory().isKristalTop()==false) {
    				System.out.println(this.award+ " Kazandınız !");
    				player.getInventory().setKristalTop(true);;
    			}else if(this.award.equals("Efsanevi Anahtar")&& player.getInventory().isEfsaneviAnahtar()==false) {
    				System.out.println(this.award+ " Kazandınız !");
    				player.getInventory().setEfsaneviAnahtar(true);
    			}
    			return true;
    		}if(player.getSağlık() <= 0) {
    			System.out.println("Öldünüz !");
    			return false;
    		}
    	}
    	return true;
    	
	
 }
    	
        public boolean combat(int obsCount) {
    	for(int i=0; i <obsCount ;i++) {
    		int defObsHealth = obstacle.getHealth();
    		playerStats();
    		enemyStats();
    		while(player.getSağlık() > 0 && obstacle.getHealth() > 0) {
    			System.out.print("<V>ur veya <K>aç : ");
    			String selCase = scan.nextLine();
    			selCase=selCase.toUpperCase();
    			if(selCase.equals("V")) {
    				System.out.println("Düşmana vurdun !");
    				obstacle.setHealth( obstacle.getHealth()- player.getTotalDamage());
    				afterHit();
    				if(obstacle.getHealth() > 0) {
    					System.out.println();
        				System.out.println("Canavar sana vurdu !");
        				player.setSağlık(player.getSağlık()-(obstacle.getDamage()-player.getInventory().getArmor()));
        				afterHit();
    				}
    				 
    			}else {
    				return false;
    			}
    		}
    		if(obstacle.getHealth() <= 0 && player.getSağlık() > 0) {
    			System.out.println("Düşmanı yendin !");
    			player.setPara(player.getPara()+obstacle.getAward());
    			System.out.println("Güncel paranız : " + player.getPara());
    			obstacle.setHealth(defObsHealth);
    		}else {
    			return false;
    			}
    		System.out.println("------------------------------------------");
    	}
    	return true;
        }
    
    public void playerStats() {
	   System.out.println("Oyuncu Değerleri\n------------------------");
	   System.out.println("Can :"+player.getSağlık());
	   System.out.println("Hasar :"+player.getTotalDamage());
	   System.out.println("Para :"+player.getPara());
	   if(player.getInventory().getDamage() >0) {
		   System.out.println("Silah :"+player.getInventory().getwName());
	   }
	   if(player.getInventory().getArmor() > 0) {
		   System.out.println("Zırh :"+player.getInventory().getaName());
	   }
    }
	   public void enemyStats() {
		   System.out.println("\n" + obstacle.getName() + " Değerleri\n---------------------------------");
		   System.out.println("Can : " + obstacle.getHealth());
		   System.out.println("Hasar : "+ obstacle.getDamage());
		   System.out.println("Ödül : "+ obstacle.getAward());
	   }
	   public void afterHit() {
		    System.out.println("Oyuncu Canı : "+player.getSağlık());
			System.out.println(obstacle.getName()+" Canı :"+obstacle.getHealth());
			System.out.println();
	   }
}