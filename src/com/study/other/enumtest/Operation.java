package com.study.other.enumtest;

public enum Operation {
	
	PLUS("+"){

		@Override
		double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x+y;
		}},
	MINUS("-"){

		@Override
		double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}},
	TIMES("*"){

		@Override
		double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}},
	DIVIDE("/"){

		@Override
		double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}};
	
	private final String symbol;
	
	Operation(String symbol){
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return symbol;
	}
	
	abstract double apply(double x,double y);
	
	
	public static void main(String[] args){
	/*	double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);*/
		
		double x = 2.00f;
		double y = 4.88f;
		for(Operation op:Operation.values()){
			System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x, y));
			switch (op) {
			case PLUS:
				 System.out.println(op.apply(x, y));
				break;

			default:
				break;
			}
		}
		
	}

}
