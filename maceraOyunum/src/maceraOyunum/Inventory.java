package maceraOyunum;

public class Inventory {
   private boolean antikHarita,kristalTop,efsaneviAnahtar;
   private String wName,aName;
   private int damage,armor;
   
   Inventory(){
	   this.antikHarita=false;
	   this.efsaneviAnahtar=false;
	   this.kristalTop=false;
	   this.damage= 0;
	   this.armor= 0;
	   this.wName=null;
	   this.aName=null;
   }

public boolean isAntikHarita() {
	return antikHarita;
}

public void setAntikHarita(boolean antikHarita) {
	this.antikHarita = antikHarita;
}

public boolean isKristalTop() {
	return kristalTop;
}

public void setKristalTop(boolean kristalTop) {
	this.kristalTop = kristalTop;
}

public boolean isEfsaneviAnahtar() {
	return efsaneviAnahtar;
}

public void setEfsaneviAnahtar(boolean efsaneviAnahtar) {
	this.efsaneviAnahtar = efsaneviAnahtar;
}

public String getwName() {
	return wName;
}

public void setwName(String wName) {
	this.wName = wName;
}

public String getaName() {
	return aName;
}

public void setaName(String aName) {
	this.aName = aName;
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	this.damage = damage;
}

public int getArmor() {
	return armor;
}

public void setArmor(int armor) {
	this.armor = armor;
}
   
}
