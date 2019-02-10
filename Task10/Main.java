package HomeWork10;

public class Main {

	public static void main(String[] args) {
		
		Helpable.helper();


		String myText = ScannerString.createText();
		int positionInText = ScannerString.createNumber();


		Text text = new Word();
		text.separation(myText, positionInText);
		text.toString();
		
		

		text = new Sentence();
		text.separation(myText, positionInText);
		text.toString();

		text = new Paragraph();
		text.separation(myText, positionInText);
		text.toString();
		
		
		Word word = new Word(new StringBuilder("Frogs hate all people"));
		System.out.println("Hash code : " + word.hashCode());

	}
}
