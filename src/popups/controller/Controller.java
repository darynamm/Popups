package popups.controller;

import popup.view.Popup;

public class Controller
{
	private Popup view;

	public Controller()
	{
		this.view = new Popup();
	}
	public void start()
	{
		view.displayMessage("Isn't this better than the console?");
		String answer = view.askQuestion("Whats ur fav song?");
		view.displayMessage("you typed: " + answer);
	}
}


