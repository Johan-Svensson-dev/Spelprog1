/**
 * GameUpdate
 * Klassen uppdaterar spelfigurernas läge
 * De olika metoderna anropas då en specifik tangent trycks ner.
 * 
 * Skriv koden för att få interaktivitet i spelet
 * 
 * @author Henrik Bygren
 * @since  2016-05-10
 * @see    GameUpdate
 *
 */
public class GameUpdate {
	// Koordinater för spelfigurerna
	int greenX = 900, greenY = 200;
	int greyX = 10, greyY = 200;
	
	/**
	 * Anropas då vänster piltangent trycks ner
	 */
	public void leftKey(){		
		greenX -= 10;
		if(greenX < 10) {
			greenX = 10;
			checkCollision();
		}
	}
	
	/**
	 * Anropas då höger piltangent trycks ner
	 */
	public void rightKey(){
		greenX += 10;
		if(greenX > 980) {
			greenX = 980;
		}
	}
	
	/**
	 * Anropas då upp piltangent trycks ner
	 */
	public void upKey(){
		greenY -= 10;
		if(greenY < 10) {
			greenY =10;
		}
	}
	
	/**
	 * Anropas då ner piltangent trycks ner
	 */
	public void downKey(){
		greenY += 10;
		if(greenY > 680) {
			greenY = 680;
		}
	}

	
	/**
	 * Anropas då A tangenten trycks ner
	 */
	public void aKey(){
		greyX -= 10;
		if(greyX < 10) {
			greyX = 10;
		}
	}
	
	/**
	 * Anropas då D tangenten trycks ner
	 */
	public void dKey(){
		greyX += 10;
		if(greyX > 950) {
			greyX = 950;
		}
	}
	
	/**
	 * Anropas då W tangenten trycks ner
	 */
	public void wKey(){
		greyY -= 10;
		if(greyY < 0) {
			greyY = 0;
		}
	}
	
	/**
	 * Anropas då S tangenten trycks ner
	 */
	public void sKey(){
		greyY += 10;
		if(greyY > 680)
			greyY = 680;
	}



public void checkCollision(){
	if(greenX == greyX && greenY==greyY) {
		greenX = 900; greenY = 900;
		greyX = 10; greenX = 10;
		
		}
	}
}



