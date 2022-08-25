package comdemo;

class hello{
	void disp() {
		for (int i=0;i<5;i++) {
		System.out.println("hello");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
}
class hi{
	void disp() {
		for (int i=0;i<5;i++) {
		System.out.println("hi");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
    }
}



public class ajstudio {
}

	public void main(String[] args)
	{
		System.out.println("Arjun");
		hello obj1=new hello();
		hi obj2=new hi();
		obj1.disp();
		obj2.disp();
	}
}
	
	




