package pojocls;

public class Bpi {
   private USD uSD;
   private GBP gBP;
   private EUR eUR;
public Bpi() {}
public Bpi(USD uSD, GBP gBP, EUR eUR) {
	super();
	this.uSD = uSD;
	this.gBP = gBP;
	this.eUR = eUR;
}
public USD getuSD() {
	return uSD;
}
public void setuSD(USD uSD) {
	this.uSD = uSD;
}
public GBP getgBP() {
	return gBP;
}
public void setgBP(GBP gBP) {
	this.gBP = gBP;
}
public EUR geteUR() {
	return eUR;
}
public void seteUR(EUR eUR) {
	this.eUR = eUR;
}


}
