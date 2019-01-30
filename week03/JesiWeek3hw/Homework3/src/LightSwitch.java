
public class LightSwitch {
	boolean state; // true means the switch is in the "on" position
	LightBulb lb;
	
	public LightSwitch() {
		state = false;
		lb = new LightBulb(state);
	}
	
	
	public void useSwitch() {
		state = !state;
		lb.setState(this.state);
		lb.reduceLife();
		if(this.state) {
			System.out.println("You turned the switch on.");
		} else {
			System.out.println("You turned the switch off.");
		}
	}
	
	public boolean isState() {
		if(this.lb.isBroken()) {
			System.out.println("Light bulb is broken.");
		}
		if(this.state) {
			System.out.println("Switch is on.");
		} else {
			System.out.println("Switch is off.");
		}
		return this.state;
	}
	
}
