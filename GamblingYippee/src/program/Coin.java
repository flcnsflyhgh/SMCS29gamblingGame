package program;

public class Coin {
	private double winChance;
	private double critChance;
	private double winCash ;
	
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
	
	//getter
	public double[] getVars() {
		double[] vars = {winChance,critChance,winCash};
		return vars;
	}
	
	//setters
	public void setWinChance(double x) {
		winChance = x;
	}
	
	public void setCritChance(double x) {
		critChance = x;
	}
	
	public void setWinCash(double x) {
		winCash = x;
	}
	
	//methods
	public double flip() {
		return (Math.random()<winChance) ? ((Math.random()<critChance) ? winCash:0):0;
	}
}