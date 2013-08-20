public class CashPayment implements Payment {
	
	int price;

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setAmount(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}
	
	@Override
	public void printMe(){
		System.out.println("I am cash payment.");
	}

}
