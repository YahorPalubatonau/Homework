package HomeWork10;

import java.util.ArrayList;

public class Paragraph extends Sentence {

	private String paragraph;

	private ArrayList<Paragraph> stringBuildersListOfParagraph = new ArrayList<Paragraph>();

	public Paragraph() {

	}

	public Paragraph(String paragraph) {
		this.paragraph = paragraph;
	}

	@Override
	public String toString() {
		System.out.println("These are paragraphs in the text :");
		for (int i = 0; i < stringBuildersListOfParagraph.size(); i++) {

			System.out.println(stringBuildersListOfParagraph.get(i).getParagraph());
		}
		return "This is all Paragraph";
	}

	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	@Override
	public ArrayList separation(String string, int givenNumber) {
		ArrayList<Sentence> listOfSentences = super.separation(string, givenNumber);
		StringBuilder sumOfParagrah = new StringBuilder();
		for (int i = 0; i < listOfSentences.size(); i++) {
			sumOfParagrah.append(listOfSentences.get(i).getSentence());
		}
		String newStringWithChangedValue = sumOfParagrah.toString();

		String[] arrayParagraph = newStringWithChangedValue.split("\\/");
		for (int i = 0; i < arrayParagraph.length; i++) {
			Paragraph paragraph = new Paragraph(arrayParagraph[i].trim());
			stringBuildersListOfParagraph.add(paragraph);
		}

		return stringBuildersListOfParagraph;

	}
}
