package poly;

class Bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
		
	}
}
class robin extends Bird {
	public void sing() {
		System.out.println("twiddledeedee");
		
	}
		
	
}
class Pelican extends Bird{
}

public class polymorphism {

	public static void main(String[] args) {
		robin b=new robin();
		b.sing();
		

	}

}
