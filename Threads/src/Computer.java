public class Computer implements Runnable{
	Printer printer=new Printer();
	String id;
	int count=1;
	public Computer(Printer p, String i){
		printer=p;
		id=i;
	}
	public void run() {
		while(true){
			try
			{
				Thread.sleep(5000+ (int)(Math.random()*15000));
			}
			catch(InterruptedException chase)
			{
				chase.printStackTrace();
			}
			printer.add("This is Print Job " + count + " coming from user " + id);
			count++;
		}
	}
	
}
