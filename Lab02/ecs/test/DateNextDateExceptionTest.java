import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{

	private int year;
	private int month;
	private int day;

	public DateNextDateExceptionTest(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Parameters
	public static List<Integer[]> DateTest()
	{
		List<Integer[]> dateList = new LinkedList<Integer[]>( );
		dateList.add(new Integer[] { 1500,2,31 });
		dateList.add(new Integer[] { 1500,2,29 });
		dateList.add(new Integer[] { -1,10,20 });
		dateList.add(new Integer[] { 1458,15,12 });
		dateList.add(new Integer[] { 1975,6,-50 });
		return dateList;
	}

	@Test
	public void testNextDateException()
	{
		Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year,month,day));
	}

}