
public class Test {

	public static void main(String[] args) {
		
		
		// make a light switch
		LightSwitch ls = new LightSwitch();
		
		System.out.println(ls.isState());
		System.out.println(ls.lb.isState());
		System.out.println(ls.lb.getLifetime());
		
		
		for(int i = 0; i < 10 ; i++) {
			ls.useSwitch();
			
			System.out.println(ls.isState());
			System.out.println(ls.lb.isState());
			System.out.println(ls.lb.getLifetime());
		}
	}

}
