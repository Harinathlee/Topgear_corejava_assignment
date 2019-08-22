package Question3;

/*3.	Create an abstract class Instrument which is having the abstract function play.  Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message 
             “Piano is playing  tan tan tan tan  ”  for Piano class
              “Flute is playing  toot toot toot toot”  for Flute class
              “Guitar is playing  tin  tin  tin ”  for Guitar class 
      Create an array of 10 Instruments.
      Assign different type of instrument to Instrument reference.
     Check for the polymorphic behavior of  play method.
*/

public class MusicallInstruments{
	public static void main(String[] args) {
		Instruments[] instruments = new Instruments[10];
		
		for (int i = 0; i < instruments.length; i++) {
			if(i==1||i==3||i==7) {
				instruments[i] = new Piano();
			}
			else if(i==2||i==6||i==8||i==4) {
				instruments[i] = new Flute();
			}
			else {
				instruments[i] = new Guitar();
			}
			instruments[i].play();
			
			if (instruments[i] instanceof Piano) {
				System.out.println("InstanceOf Piano");
			}
			else if (instruments[i] instanceof Flute) {
				System.out.println("InstanceOf Flute");
			}
			else {
				System.out.println("InstanceOf Guitar");
			}
			System.out.println();
		}
	}
}

 abstract class Instruments{
	
	 abstract public void play();
}
  class Piano extends Instruments{
	 
	  public void play() {
		  System.out.println("Piano is playing  tan tan tan tan");
	  }
 }
  class Flute extends Instruments{
		 
	  public void play() {
		  System.out.println("Flute is playing  toot toot toot toot");
	  }
 }
  class Guitar extends Instruments{
		 
	  public void play() {
		  System.out.println("Guitar is playing  tin  tin  tin");
	  }
 }
  
 