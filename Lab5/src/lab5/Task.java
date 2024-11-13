package lab5;

public class Task implements Priority{
	
	private String task1;
	private int number;
	
	
	public Task(String tas)
	{
		number = 1;
		task1 = tas;
	}
	
	public void setPriority(int num2)
	{
		number = num2;
	}
	
	
	public int getPriority()
	{
		return number;
	}
	
	
	public String getTask()
	{
		return task1;
	}
	
	public String toString()
	{
		return task1 + ("\t") + number; 
	}

	
	


}