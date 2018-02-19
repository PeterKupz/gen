package com.genetica_life.com.genetica_life;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entity")
public class Chat {
	
	private String chatId;

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	
}
