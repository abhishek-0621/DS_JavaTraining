public class AssignmentExceptionHandling {
	public static void main(String[] args) {

		System.out.println("Begin main...");

		Heater heater = new Heater();
		Heater heater1 = new Heater();
		try {
			heater.switchOn();
			heater.selectTemperature();
			heater1.selectTemperature();
		} catch (HeaterIsNotSwitchedOnException e) {
			System.out.println("Problem : " + e);
		}

		System.out.println("End of main...");
	}
}

class HeaterIsNotSwitchedOnException extends Exception {
	private static final long serialVersionUID = 1L;

	HeaterIsNotSwitchedOnException(String msg) {
		super(msg);
	}
}

class Heater {
	boolean current;

	Heater() {
		System.out.println("Heater is created, but is it switched on??");
	}

	void switchOn() {
		if (current == false) {
			current = true;
		}
		System.out.println("Heater is switched on....");
	}

	void selectTemperature() throws HeaterIsNotSwitchedOnException {
		if (current == false) {
			HeaterIsNotSwitchedOnException heaterSwitchNotOnEx = new HeaterIsNotSwitchedOnException(
					"The Heater is not yet switched on.....");
			throw heaterSwitchNotOnEx;
		}

		System.out.println("Program started..");
		heat();
		System.out.println("Program finished..");
	}

	void heat() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Heating..." + i);
		}
		filter();
	}

	void filter() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("\tCleaning..." + i);
		}
	}

	void switchOff() {
		if (current == true) {
			current = false;
		}
		System.out.println("Heater is switched off..");
	}
}