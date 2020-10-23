package observerPattern;

public class Subscriber implements Observer {

	private YoutubeChannel observable;

	public Subscriber(YoutubeChannel observable) {
		super();
		this.observable = observable;
	}

	@Override
	public void update() {

		System.out.println("Nuevo video posteado (Imprime Suscriber/Observer)");
		System.out.println(this.observable.getLastVideo());

	}

}
