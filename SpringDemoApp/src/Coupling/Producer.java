package Coupling;

public class Producer implements IWorker {
	@Override
	public void first() {
		System.out.println("first from the producer");
	}

	public void second() {
		System.out.println("second from the producer");
	}
}
