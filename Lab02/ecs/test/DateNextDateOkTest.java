import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{ 
    public int day;
	public int month;
	public int year; 	
	private Date date;
	private Date expDate;

	public DateNextDateOkTest(int year, int month, int day) {
		this.day = day; 	
		this.month= month;
		this.year = year;  
		this.date = new Date(year, month, day);
		this.expDate = date.nextDate();
	}

	@Parameters public static List<Integer[]> dateList() {
		List<Integer[]> testDate = new LinkedList<Integer[]>();
		testDate.add(new Integer[] {  1700 ,  6,  20 });
		testDate.add(new Integer[] {  2005 ,  4,  15 });
		testDate.add(new Integer[] { 1901,  7 ,  20 });
		testDate.add(new Integer[] { 3456,  3 , 27 });
		testDate.add(new Integer[] { 1500,  2 ,  17 });
		testDate.add(new Integer[] { 1700,  6 ,  29 });
		testDate.add(new Integer[] {  1800 , 11, 29 });
		testDate.add(new Integer[] {  3453 ,  1, 29 });
		testDate.add(new Integer[] { 444,  2 ,  29 });
		testDate.add(new Integer[] { 2005,  4 , 30 });
		testDate.add(new Integer[] { 3453,  1 , 30 });
		testDate.add(new Integer[] { 3456,  3 , 30 });
		testDate.add(new Integer[] {  1901 ,  7, 31 });
		testDate.add(new Integer[] { 3453,  1 , 31 });
		testDate.add(new Integer[] { 3456,  12 , 31 });

		return testDate;
	}



	@Test
	public void testNextDate()	{
	
   switch(month){
	   case 1: case 3: case 5: case 7: case 8: case 10:
	   if(day==31){
	   day=1;
	   Date actualDate = new Date(year,(month+1),day);
	   Assert.assertEquals(expDate,actualDate);}
	   break;
	   case 4: case 6: case 9: case 11: 
       if(day==30){
	   day=1;
	   Date actualDate = new Date(year,(month+1),day);
	   Assert.assertEquals(expDate,actualDate);}
	   break;
	   case 12:
	   if(day==31){
	   day=1;
	   month=1;
	   year+=1;
	   Date actualDate = new Date(year,month,day);
	   Assert.assertEquals(expDate,actualDate);}
	   break;
	   case 2:
	   if ((((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))&&day==29){
	   day=1;
	   Date actualDate = new Date(year,(month+1),day);
	   Assert.assertEquals(expDate,actualDate);}
	   else if (day==28){
	   day=1;
	   Date actualDate = new Date(year,(month+1),day);
	   Assert.assertEquals(expDate,actualDate);}   
	   break;
	   default:
	   Date actualDate = new Date(year,month,(day+1));
	   Assert.assertEquals(expDate, actualDate);
	   break;
   }
}



}