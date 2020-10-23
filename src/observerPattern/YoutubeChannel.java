package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {

	private List<Observer> observersList = new ArrayList<>();
	private String lastVideo;

	@Override
	public void attach(Observer observer) {

		observersList.add(observer);

	}

	@Override
	public void detach(Observer observer) {

		// eliminar Suscriptor

	}

	@Override
	public void notification() {

		this.observersList.stream().forEach(subscriptor -> subscriptor.update());

	}

	public void addNewVideo(final String title) {

		this.notification();
		this.lastVideo = title;
		System.out.println("Nuevo video agregado al canal (Imprime el channel/Observable");
	}

	public String getLastVideo() {
		return lastVideo;
	}

}
