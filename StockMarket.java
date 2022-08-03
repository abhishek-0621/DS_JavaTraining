import java.time.LocalDate;

public class StockMarket {

	public static void main(String[] args) {
		DematAcc d1=new DematAcc(1911, "3DS", 8000);
		DematAcc.Statement s1=new DematAcc.Statement();
		DematAcc.Statement s2=new DematAcc.Statement();
		DematAcc.Statement s3=new DematAcc.Statement();
		DematAcc.Statement s4=new DematAcc.Statement();
		
		d1.activateSellShares(true);
		
		int sharesSold1=200;
		d1.debit(sharesSold1);
		s1.setTransactionId(1);
		s1.setSharesInTransaction(sharesSold1);
		s1.setTransactionDate(LocalDate.now());
		s1.setTransactionType("Sell");
		s1.setRemainingShares(d1.getShares());
		
		int sharesSold2=500;
		d1.debit(sharesSold2);
		s2.setTransactionId(2);
		s2.setSharesInTransaction(sharesSold2);
		s2.setTransactionDate(LocalDate.now());
		s2.setTransactionType("Sell");
		s2.setRemainingShares(d1.getShares());
		
		int sharesBought1=600;
		d1.credit(sharesBought1);
		s3.setTransactionId(3);
		s3.setSharesInTransaction(sharesBought1);
		s3.setTransactionDate(LocalDate.now());
		s3.setTransactionType("Buy");
		s3.setRemainingShares(d1.getShares());
		
		int sharesSold3=180;
		d1.debit(sharesSold3);
		s4.setTransactionId(4);
		s4.setSharesInTransaction(sharesSold3);
		s4.setTransactionDate(LocalDate.now());
		s4.setTransactionType("Sell");
		s4.setRemainingShares(d1.getShares());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		d1.deActivateSellShares(false);
		d1.debit(1000);
		

	}

}

class DematAcc{
	private int dematID;
	private String accName;
	private int shares;
	private DematPermission dematPermission=new DematPermission(false,true,true);
	
	void activateSellShares(boolean activate) {
		System.out.println("You can now sell the shares");
		dematPermission.setDebitShares(activate);
	}
	void deActivateSellShares(boolean deActivate) {
		System.out.println("You cannot sell these shares today");
		dematPermission.setDebitShares(deActivate);
	}
	public DematAcc(int dematID, String accName, int shares) {
		super();
		this.dematID = dematID;
		this.accName = accName;
		this.shares = shares;
	}
	
	void debit(int sharesToSell) {
		if(dematPermission.isDebitShares()==false) {
			throw new RuntimeException("You cannot sell as the shares are in t1");
		}
		else {
			shares=shares-sharesToSell;
		}
	}
	void credit(int sharesToBuy) {
		shares=sharesToBuy+shares;
	}


	public int getDematID() {
		return dematID;
	}


	public void setDematID(int dematID) {
		this.dematID = dematID;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public int getShares() {
		return shares;
	}


	public void setShares(int shares) {
		this.shares = shares;
	}


	public DematPermission getDematPermission() {
		return dematPermission;
	}


	public void setDematPermission(DematPermission dematPermission) {
		this.dematPermission = dematPermission;
	}
	
	@Override
	public String toString() {
		return "DematAcc [dematID=" + dematID + ", accName=" + accName + ", shares=" + shares + ", dematPermission="
				+ dematPermission + "]";
	}
	public static class Statement
	{
		int transactionId;
		LocalDate transactionDate;
		String transactionType;
		int sharesInTransaction;
		int remainingShares;
		public int getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}
		public LocalDate getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}
		public int getSharesInTransaction() {
			return sharesInTransaction;
		}
		public void setSharesInTransaction(int sharesInTransaction) {
			this.sharesInTransaction = sharesInTransaction;
		}
		public int getRemainingShares() {
			return remainingShares;
		}
		public void setRemainingShares(int remainingShares) {
			this.remainingShares = remainingShares;
		}
		public String getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		@Override
		public String toString() {
			return "Statement [transactionId=" + transactionId + ", transactionDate=" + transactionDate
					+ ", transactionType=" + transactionType + ", sharesInTransaction=" + sharesInTransaction
					+ ", remainingShares=" + remainingShares + "]";
		}
		
	}



	private class DematPermission{
		boolean debitShares;
		boolean creditShares;
		boolean transfer;
		public boolean isDebitShares() {
			return debitShares;
		}
		public void setDebitShares(boolean debitShares) {
			this.debitShares = debitShares;
		}
		public boolean isCreditShares() {
			return creditShares;
		}
		public void setCreditShares(boolean creditShares) {
			this.creditShares = creditShares;
		}
		public boolean isTransfer() {
			return transfer;
		}
		public void setTransfer(boolean transfer) {
			this.transfer = transfer;
		}
		public DematPermission(boolean debitShares, boolean creditShares, boolean transfer) {
			super();
			this.debitShares = debitShares;
			this.creditShares = creditShares;
			this.transfer = transfer;
		}
		
		
		
		
	}
}
