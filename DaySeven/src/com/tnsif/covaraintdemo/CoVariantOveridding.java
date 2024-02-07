package com.tnsif.covaraintdemo;

class Color
{
//returns obj of color class
public Color getColor()
{
	Color c=new Color();
	return c;
}


}

class Red extends Color
{
	public Red getColor()
	{
		Red r=new Red();
		return r;
		
	}
}

class Blue extends Color
{
	public Blue getColor()
	{
		Blue b=new Blue();
		return b;
		
	}
	
}

public class CoVariantOveridding {

	public static void main(String[] args) {
		Color c1=new Color();
		Color c2=c1.getColor();
		System.out.println(c2);
		
		Red r1=new Red();
		Red r2=r1.getColor();
		System.out.println(r2);

	}

}
