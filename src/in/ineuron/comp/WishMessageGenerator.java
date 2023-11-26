package in.ineuron.comp;
import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	static {
		System.out.println("WishMessageGenerator .class file is loading");
	}
	
	public WishMessageGenerator() {
		System.out.println("Zero Argument Constructor is being created");
	}
	
	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println(this);
		System.out.println("One Parameter Argument Constructor Generated\n");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter Method Performed...");
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	
	
}
