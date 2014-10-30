public class MainClass {
	public static void main(String[] args) {
		Printer p=new Printer();
		Computer c1= new Computer(p,"1");
		Computer c2= new Computer(p,"2");
		Computer c3= new Computer(p,"3");
		Computer c4= new Computer(p,"4");
		Computer c5= new Computer(p,"5");
		new Thread (p).start();
		new Thread (c1).start();
		new Thread (c2).start();
		new Thread (c3).start();
		new Thread (c4).start();
		new Thread (c5).start();
	}
}
