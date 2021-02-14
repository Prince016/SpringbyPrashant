package Coupling;

public class Consumer {
	IWorker io = new Producer();

	public Consumer(IWorker io) {
		this.io = io;
	}

//
	public void call() {
		io.first();
	}
}
