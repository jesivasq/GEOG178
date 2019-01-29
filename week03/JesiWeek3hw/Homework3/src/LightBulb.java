
public class LightBulb {
	static int MAX_LIFE = 5;
	
	boolean state;		// true = on, false = off
	int lifetime; 		// how many more times you can flip it
						// before it dies
	
	// CONSTRUCTOR
	public LightBulb(boolean state) {
		lifetime = MAX_LIFE;
		this.state = state; 	// the light switch sets the state
	}
	
	// GETTERS
	public boolean isBroken() {
		if (lifetime < 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isState() {
		return state;
	}
	
	public int getLifetime() {
		return lifetime;
	}
	
	// SETTERS
	public void setState(boolean state) {
		this.state = state;
	}
	
	public void reduceLife() {
		lifetime--;
	}
	
}
