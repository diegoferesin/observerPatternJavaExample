package observerPattern;

public class Main {

	public static void main(String[] args) {

		YoutubeChannel channel = new YoutubeChannel();
		Subscriber suscriptor01 = new Subscriber(channel);
		Subscriber suscriptor02 = new Subscriber(channel);
		
		channel.attach(suscriptor01);
		channel.attach(suscriptor02);
		
		channel.addNewVideo("Video Nuevo 01");
		
	}

}
