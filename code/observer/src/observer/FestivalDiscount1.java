package observer;

public class FestivalDiscount1 extends Discount {
	public FestivalDiscount1(Store store){
		this.store = store;
		this.store.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Discount in FestivalDiscount1:"+this.store.getState());
	}

}
