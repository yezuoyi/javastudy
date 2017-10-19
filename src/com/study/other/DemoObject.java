package com.study.other;

class Iequ {
	private int a;
	private int b;
	private Term term;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Term getTerm() {
		return term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

}

class Term {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class DemoObject {
	public static void main(String[] args) {
		Iequ a = new Iequ();
		a.setA(10);
		a.setB(88);
		Term term = new Term();
		term.setValue(99);
		a.setTerm(term);
		output(a);
		changeValue(a);
		output(a);
		Term t = getTerm(a);
		t.setValue(222);
		
		output(a);
	}

	private static Term getTerm(Iequ a) {
		return a.getTerm();
	}

	private static void output(Iequ a) {
		System.out.println("Iequ.a = " + a.getA() + " Iequ.b = " + a.getB() + " Iequ.term.value = " + a.getTerm().getValue());

	}

	private static void changeValue(Iequ a) {
		Iequ b = a;
		b.setA(33);
		b.setB(44);
		Term t = a.getTerm();
		t.setValue(111);
	}
	
}
