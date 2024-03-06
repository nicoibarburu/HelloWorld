package domain;

import java.util.HashMap;

public class Message {
	public String keyMessage;
	public HashMap<String, String> traductions;

	public String getKeyMessage() {
		return keyMessage;
	}

	public void setKeyMessage(String keyMessage) {
		this.keyMessage = keyMessage;
	}

	public String getTraductions(String lang) {
		return traductions.get(lang);
	}

	public Message(String keyMessage, HashMap<String, String> traductions) {
		super();
		this.keyMessage = keyMessage;
		this.traductions = traductions;
	}
}
