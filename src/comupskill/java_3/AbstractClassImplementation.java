package comupskill.java_3;

import comupskill.java_4.AbstractClass;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iCar() {
		System.out.println("My Car is Tesla");		
	}

	@Override
	public void iWheel() {
		System.out.println("My Car has 4 wheel");		
	}

	@Override
	public int iDoor() {
		return 4;
	}

	@Override
	public String iSeatType() {
		return "Leather";
	}
}
