// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if ( hours < 12 ) {
			if (minutes < 10) {
				System.out.println(hours + ":" + "0" + minutes + " AM");
			}

			else {
				System.out.println(hours + ":" + minutes + " AM");
			}
		}

		if ( hours == 12 ) {
			if (minutes < 10) {
				System.out.println(hours + ":" + "0" + minutes + " PM");
			}

			else {
				System.out.println(hours + ":" + minutes + " PM");
			}
		}

		if ( hours > 12 ) {
			hours = hours - 12;
			if (minutes < 10) {
				System.out.println(hours + ":" + "0" + minutes + " PM");
			}
			
			else {
				System.out.println(hours + ":" + minutes + " PM");
			}
		}
	}
}