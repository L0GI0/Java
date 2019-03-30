package tomek.it.threads1;

public class W19a_ extends Thread {
    public W19a_(String string) {
    	super(string);
    	//setName("aaaa");
    }

	public void run() {
		System.out.println(getName());
    }

    public static void main(String[] args) {
        new W19a_("I am Ann").start();
        new W19a_("I am Tom").start();
    }
}