public class Deposit extends ATM {

	private int amount;
	private int deposit;
	private int balance;

	public int getAmount() {
		return this.amount;
	}

	/**
	 * 
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getdeposit() {
		return this.deposit;
	}

	/**
	 * 
	 * @param deposit
	 */
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	/**
	 * 
	 * @param balance
	 */
	public void getBalance(int balance) {
		// TODO - implement Deposit.balance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

}