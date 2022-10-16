
public class Kiamotors {
	int nocars;
	String model;
	String color;
	int speed=100;
	void display()
	{
		System.out.println("Welcome to KIA Motors");	
	}
	private void display2() {
		System.out.println("The speed is:"+speed);
	}
	

	public static void main(String[] args) {
	
		Kiamotors KIA=new Kiamotors();
		KIA.display();
		KIA.display2();
		
		
	}

}

