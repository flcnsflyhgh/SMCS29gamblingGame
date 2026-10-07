package program;

public class Coin {
	private double winChance;
	private double critChance;
	private double winCash ;
	
	//--------------------------------------------------------------
	
	//constructors
	public Coin() {
		winChance = 0;
		critChance = 0;
		winCash = 0;
	}
	public Coin(double a,double b,double c) {
		winChance = a;
		critChance = b;
		winCash = c;
	}
	
	//--------------------------------------------------------------
	
	//getters
	public double getWinChance() {
		return winChance;
	}
	
	public double getCritChance() {
		return critChance;
	}
	
	public double getWinCash() {
		return winCash;
	}
	
	//setters
	public void setWinChance(double x) {
		winChance = (x>=0) ? x:winChance;
	}
	
	public void setCritChance(double x) {
		critChance = (x>=0) ? x:critChance;
	}
	
	public void setWinCash(double x) {
		winCash = (x>=0) ? x:winCash;
	}
	
	//--------------------------------------------------------------
	
	//methods
	public double flip() {
		return (Math.random()<winChance) ? ((Math.random()<critChance) ? winCash:0):0;
	}
}





