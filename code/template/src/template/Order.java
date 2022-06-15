package template;

public abstract class Order {
	public void order() {
		selectItem();
		doPayment();
		doDelivery();
	}
	protected abstract void selectItem();
	protected abstract void doPayment();
	protected abstract void doDelivery();
}
