package com.cts.oopp.model;

public class Complex {
	private int realPart;
	private int imaginaryPart;
	
	public Complex() {
		realPart=0;
		imaginaryPart=0;
	}
	
	public Complex(int realPart,int imaginaryPart) {
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	
	public Complex(Complex obj) {
		this.realPart=obj.realPart;
		this.imaginaryPart=obj.imaginaryPart;
	}
	
	public void setRealPart(int realPart) {
		this.realPart=realPart;
	}
	
	public int getRealPart() {
		return realPart;
	}
	
	public void setImaginaryPart(int imaginaryPart) {
		this.imaginaryPart=imaginaryPart;
	}
	
	public int getImaginaryPart() {
		return imaginaryPart;
	}
	
	public Complex sum(Complex inp1,Complex inp2) {
		int realPartSum=inp1.getRealPart()+inp2.getRealPart();
		int imaginaryPartSum=inp1.getImaginaryPart()+inp2.getImaginaryPart();
		Complex t=new Complex(realPartSum,imaginaryPartSum);
		return t;
	}
	
	@Override
	public String toString() {
		return "realPart=" + realPart + ", imaginaryPart=" + imaginaryPart;
	}

}
