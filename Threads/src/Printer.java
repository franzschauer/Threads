import java.util.ArrayList;

public class Printer implements Runnable {
	ArrayList<String> queue= new ArrayList<String>();
	public Printer(){	
	}
	public void add(String s){
		queue.add(s);
	}
	public void run() {
		while(true){
		while(queue.size()==0){
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException chase){
				chase.printStackTrace();
			}
		}
		if(queue.size()>0){
		System.out.println(queue.get(0));
		queue.remove(0);
		}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException chase){
			chase.printStackTrace();
		}
		}
	}
}
