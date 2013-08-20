import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PaymentTest {

	Payment cp;
	
	@Before
	public void setUp() throws Exception {
		cp = new CashPayment();
	}

	@Test
	public void test() {
		cp.setAmount(100);
		assertEquals(100,cp.getAmount());
	}

}
