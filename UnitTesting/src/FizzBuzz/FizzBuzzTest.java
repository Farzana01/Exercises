package FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturnOne() {
		//arrange
		FizzBuzz underTest= new FizzBuzz();
		//act
		String response = underTest.say();
		//assert
		Assert.assertEquals("should have responded '1'", "1", response);
		
	}
	@Test
	public void shouldReturnTwo() {
		//arrange
		FizzBuzz underTest = new FizzBuzz();
		//act
		underTest.say();
		String response = underTest.say();
		//assert (without message)
		Assert.assertEquals("2", response);
	}
	
	@Test
	public void shouldReturnFizzInsteadOf3() {
		//arrange
		FizzBuzz underTest = new FizzBuzz();
		//act
	//	underTest.say();//1
	//	underTest.say();//2
		String response = underTest.say(3);//3
		//assert (without message)
		Assert.assertEquals("Fizz", response);
	}	
	@Test
/*	public void shouldReturnFizzInsteadOf3() {
		//arrange
		FizzBuzz underTest = new FizzBuzz();
		//act
	//	underTest.say();//1
	//	underTest.say();//2
		String response = underTest.say(3);//3
		//assert (without message)
		Assert.assertEquals("Fizz", response);	
	}
*/	
	
public void shouldReturnBuzzInsteadOf5(){
	//arrange
			FizzBuzz underTest = new FizzBuzz();
			//act
		//	underTest.say();//1
		//	underTest.say();//2
			String response = underTest.say(5);//3
			//assert (without message)
			Assert.assertEquals("Buzz", response);	
		}

@Test
public void shouldReturnBuzzInsteadOf15(){
	//arrange
			FizzBuzz underTest = new FizzBuzz();
			//act
		//	underTest.say();//1
		//	underTest.say();//2
			String response = underTest.say(15);//
			//assert (without message)
			Assert.assertEquals("FizzBuzz", response);	
		}

@Test
public void shouldReturnBuzzInsteadOf(){
	//arrange
			FizzBuzz underTest = new FizzBuzz();
			//act
		//	underTest.say();//1
		//	underTest.say();//2
			String response = underTest.say(30);//
			//assert (without message)
			Assert.assertEquals("FizzBuzz", response);
}
}