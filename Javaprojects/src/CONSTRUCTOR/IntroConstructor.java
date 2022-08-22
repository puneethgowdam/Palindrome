package CONSTRUCTOR;
class vehicle{
	int wheels;
	vehicle(){
		wheels=3;
	}
}

public class IntroConstructor {
	
	

	public static void main(String[] args) {
		vehicle auto=new vehicle();
		vehicle auto2=new vehicle();
	System.out.println(auto2.wheels+"wheels");
	}

}
