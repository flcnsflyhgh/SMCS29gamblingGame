package program;

public class Coin {
	private double winChance = 0;
	private double critChance = 0;
	private double winCash = 0;
	
	public Coin(double a,double b,double c) {
		double winChance = a;
		double critChance = b;
		double winCash = c;
	}
	
	public void setWinChance(double x) {
		winChance = x;
	}
	
	public boolean flip() {
		return (Math.random()<winChance)
	}
}
