
public class Main {

	public static void main(String[] args) {

		Country c1 = new Country();
		Country c2 = new Country("MA");
		Country c3 = new Country("ALG",780580);
		Country c4 = new Country("USA",10452,4467000);
		
		
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		c4.printInfo();

	}

}
