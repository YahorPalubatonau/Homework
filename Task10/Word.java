package HomeWork10;

import java.util.ArrayList;

public class Word extends Text {

	private StringBuilder name;
	private ArrayList<StringBuilder> stringBuildersListOfWord = new ArrayList<StringBuilder>();
	private static final StringBuilder space = new StringBuilder(" ");
	private ArrayList<Word> wordList = new ArrayList<Word>();

	public Word() {

	}


	public Word(StringBuilder name) {
		this.name = name;
	}

	public StringBuilder getName() {
		return name;
	}

	public void setName(StringBuilder name) {
		this.name = name;
	}

	public ArrayList<Word> getWordList() {
		return wordList;
	}

	public void setWordList(ArrayList<Word> wordList) {
		this.wordList = wordList;
	}

	@Override
	public String toString() {
		System.out.println("These are words in the text :");
		for (int i = 0; i < wordList.size(); i++) {

			System.out.println(wordList.get(i).getName());
		}
		return "This is all words";
	}

	@Override
	public ArrayList separation(String string, int givenNumber) {
		String[] arrayWord = string.split(space.toString());

		for (int i = 0; i < arrayWord.length; i++) {

			if (arrayWord[i].length() < givenNumber || arrayWord[i].charAt(givenNumber - 1) == '.') {
				StringBuilder stringBuilder = new StringBuilder(arrayWord[i]);
				addWord(stringBuilder);
				continue;
			}
			StringBuilder stringBuilder = new StringBuilder(arrayWord[i]);
			stringBuilder.setCharAt(givenNumber - 1, '%');
			addWord(stringBuilder);
		}
		return stringBuildersListOfWord;
	}

	private void addWord(StringBuilder name) {
		String correctWord = name.toString().replace(".", "").replace("/", "");
		StringBuilder stringBuilderCorrect = new StringBuilder(correctWord);
		stringBuildersListOfWord.add(name);
		stringBuildersListOfWord.add(space);
		wordList.add(new Word(stringBuilderCorrect));

	}

	public int hashCode() {

		return (int) (17 + ((null == getName()) ? 0 : getName().hashCode()));

	}

}
