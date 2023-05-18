package demo;

import java.util.Date;

import org.testng.annotations.Test;

public class DemoTest{
	@Test
	public void demo() {
		System.out.println("hi this is my first comment");

		System.out.println("hi from second work space");


		System.out.println("hi from original work space");

		System.out.println("hi");
		Date d=new Date();
		System.out.println(d.toString());
		
		String arr[]=d.toString().split(" ");
		String day=arr[2];
		String month=arr[1];
		String year=arr[5];
		String time=arr[3];
		System.out.println(day+" "+month+" "+year+" "+time);
		
}

}
