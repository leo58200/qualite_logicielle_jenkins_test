package testCucumber;

import java.util.List;
import java.util.ArrayList;

public class Order {
	private String from;
	private String to;
	private List<String> contents = new ArrayList<String>();

	public void declareOwner(String romeo) {
		this.from = romeo;
	}

	public void declareTarget(String juliette) {
		this.to = juliette;
	}

	public List<String> getCocktails() {
		return contents;
	}
}