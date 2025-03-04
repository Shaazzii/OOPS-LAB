class CPU {
  int price = 20000;

  class processor {
    int no_cores = 1000;
    String manufacturer = "intel";
    
    	static class ram{
    		int memory=128;
    		String manufacturer = "AMD";
    	}
    }
}
public class main {
  public static void main(String[] args) {
	CPU a = new CPU();
	CPU.processor b = a.new processor();
	CPU.processor.ram c = new CPU.processor.ram();
	
	System.out.println(a.price);
	
	System.out.println(b.no_cores);
	System.out.println(b.manufacturer);
	
	System.out.println(c.memory);
	System.out.println(c.manufacturer);
	}
}
	
