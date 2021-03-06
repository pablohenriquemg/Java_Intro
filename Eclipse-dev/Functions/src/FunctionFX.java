import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionFX {
	
	// Lambda expressions
	UnaryOperator<Double> fx = x -> x*x;
	BinaryOperator<Double> f = (x,y) -> { return ((x*x) + (3*x) + 9); };
	UnaryOperator<Double> ff = x -> {return Math.pow(x, 3) + (4*x) + 7;};

	public static void main(String[] args) {
		// Create FunctionFX object
		FunctionFX f = new FunctionFX();
		double x = 5d;
		
		// Invoke lambda expressions and print output
		System.out.println(f.f.apply(x, 3D));
		System.out.println(f.fx.apply(x));
		System.out.println(f.ff.apply(x));
	}

}
