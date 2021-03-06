package com.keenum.calcengine;

public class DynamicHelper {
	
	private IMathProcessing[] handlers;
	
	// Constructor
	public DynamicHelper(IMathProcessing[] handlers)
	{
		this.handlers = handlers;
	}
	
	public String process(String statement)
	{
		// IN: "add 1.0 2.0"
		// OUT: "1.0 + 2.0 = 3.0"
		
		String parts[] = statement.split(IMathProcessing.SEPARATOR);
		String keyword = parts[0];
		
		
		IMathProcessing theHandler = null;
		
		for (IMathProcessing handler:handlers)
		{
			if (keyword.equalsIgnoreCase(handler.getKeyword()))
			{
				theHandler = handler;
				break;
			}
		}
		
		
		double leftVal = Double.parseDouble(parts[1]);
		double rightVal = Double.parseDouble(parts[2]);
		double result = theHandler.doCalculations(leftVal, rightVal);
		
		StringBuilder sb = new StringBuilder(20);
		sb.append(leftVal);
		sb.append(" ");
		sb.append(theHandler.getSymbol());
		sb.append(" ");
		sb.append(rightVal);
		sb.append(" = ");
		sb.append(result);
		
		
		return sb.toString();
		
	}

}
