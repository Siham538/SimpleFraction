
public class Fraction {
	private int numerateur;
	private int denominateur;
	public Fraction (int numerateur,int denominateur) {
		this.numerateur = numerateur;
		this. denominateur =  denominateur;
	}
	public String toString() {
		System.out.println("Fraction = "+ this.numerateur +"/" + this. denominateur);
		return "Fraction : " + this.numerateur + "/" + this.denominateur;
	
	}
	

}
