import java.util.*;

public class Poisson {
	// Attributes
	int[] squares;
	private double average, totalCampers, totalSquares;
	private double[] observedProb, poissonProb;
	
	// Constructors
	public Poisson(int[] squares) {
		this.squares = squares;
		getAverage();
		getProb();
		
		System.out.println( average );
		System.out.println(Arrays.toString(observedProb));
	}
	
	private double getAverage() {
		
		totalCampers = 0;
		totalSquares = 0;
		
		for (int i = 0; i < squares.length; i++) {
			
			totalCampers += squares[i] * i;
			totalSquares += squares[i];
		}
		
		average = totalCampers / totalSquares ;
		return average;
	}
	
	private double[] getProb() {
		
		observedProb = new double[squares.length];
		
		for (int i = 0; i < observedProb.length; i++) {
			observedProb[i] = squares[i]/totalSquares;
		}
		
		
		return observedProb;
	}
	
	private double[] getPoisson() {
		poissonProb = new double[squares.length];
		
		for(int i = 0; i < poissonProb.length; i++) {
			poissonProb[i] = Math.pow(average, i) / factorial(i) * Math.exp(average);
			// poissonFreq
		}
		
		return poissonProb;
		
	}
	
	private double factorial (int n) {
		int factor = 1;
		
		for( int i = n; i > 0; i--) {
			factor *= i;
		}
		
		return factor;
	}
	
	
	// Methods
	
	
}
