package com.keenum.calcengine;

public class Add extends CalculateBase implements IMathProcessing {

	// Constructor
	public Add(){}
	
	// Constructor
	public Add(double leftVal, double rightVal)
	{
		super(leftVal, rightVal);
	}
	
	// Overridden method from CalculateBase
	@Override
	public void calculate() 
	{
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

	public String getKeyword()
	{
		return "Add";
	}

	public char getSymbol()
	{
		return '+';
	}

	public double doCalculations(double leftVal, double rightVal)
	{
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();
		
		return getResult();
	}
	
}
