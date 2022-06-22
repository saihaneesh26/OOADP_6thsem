public abstract class SportStock extends getcurrentStock {
	public getcurrentStock basicstock = new BasicStock();
	SportStock(){
		basicstock.stock();
	}
	@Override
	public abstract void stock();
	
}
