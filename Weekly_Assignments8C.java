package assignments;


interface Camera{
	void takePhoto();
	
}

interface MusicPlayer{
	void playMusic();
}

interface SmartFeatures{
	void connectToWifi();
}

class SmartPhone implements  Camera,MusicPlayer, SmartFeatures{
	public void takePhoto() {
		System.out.println("Photo captured successfully");
	}
	
	public void playMusic() {
		System.out.println("Playing Music...");
	}
	
	public void connectToWifi() {
		System.out.println("Connected to wifi");
		
	}
}

public class Weekly_Assignments8C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone phone =new SmartPhone();
		
		phone.takePhoto();
		
		phone.playMusic();
		
		phone.connectToWifi();
		

	}

}
