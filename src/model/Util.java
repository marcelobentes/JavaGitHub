package model;



public class Util
{
	
	int maior (int num, int num2)
	{
		if (num > num2) {
		return num;
		}else
		return num2;
	}
	
	int maior3 (int num, int num2, int num3)
	{
		
		if((num >= num2) && (num >= num3)){
			return num;
		}
			  if((num2 >= num3) && (num2 >= num)) {
				  return num2;
					 
				 }else 
					 return num3;
	}
	
	int adicao (int num, int num2)
	{
		
		return  num + num2;
	}
		
	int subtracao (int num, int num2)
	{
		
		return  num - num2;
	}
	
	float mult (float num, float num2)
	{
		return num * num2;
	}
	
	float div (float num, float num2)
	{
		float div =0;
		if (num > 0)
			div = num /num2;
		return div;
	}
	
}
	
