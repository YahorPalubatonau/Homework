package HomeWork10;

import java.util.ArrayList;

public class Sentence extends Word {

	private String sentence;

	private ArrayList<Sentence> stringBuildersListOfSentence = new ArrayList<Sentence>();
	private ArrayList<Sentence> stringBuildersListAfterCorrect = new ArrayList<Sentence>();

	public Sentence() {

	}

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		System.out.println("These are lines in the text :");
		for (int i = 0; i < stringBuildersListAfterCorrect.size(); i++) {

			System.out.println(stringBuildersListAfterCorrect.get(i).getSentence());
		}
		return "Sentence";
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public ArrayList separation(String string, int givenNumber) {
		ArrayList listOfWords = super.separation(string, givenNumber);
		StringBuilder sumOfString = new StringBuilder();
		for (int i = 0; i < listOfWords.size(); i++) {
			sumOfString.append(listOfWords.get(i));
		}
		String newStringWithChangedValue = sumOfString.toString();

		String[] arraySentence = newStringWithChangedValue.split("\\.");
		for (int i = 0; i < arraySentence.length - 1; i++) {

			Sentence sentence = new Sentence(arraySentence[i].trim() + ".");
			Sentence sentenceAfteCorrect = new Sentence(
					arraySentence[i].replace(".", "").replace("/", "").trim() + ".");
			stringBuildersListOfSentence.add(sentence);
			stringBuildersListAfterCorrect.add(sentenceAfteCorrect);

		}

		return stringBuildersListOfSentence;

	}
	

}
