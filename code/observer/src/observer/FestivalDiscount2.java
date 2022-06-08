package observer;

public class FestivalDiscount2 extends Discount {

	public FestivalDiscount2(Store store){
		this.store = store;
		this.store.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Discount in FestivalDiscount2:"+(this.store.getState()+10));
	}

}
