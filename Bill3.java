// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//names of diners
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int cost = Integer.parseInt(args[3]); //full amount needed to pay

		double splitAmount = Math.ceil((double)cost/3);

		System.out.println("Dear " + name1 + ", " + name2 + ", and " 
							+ name3 + ": pay " + splitAmount + " Shekels each.");
	  
	}
}
