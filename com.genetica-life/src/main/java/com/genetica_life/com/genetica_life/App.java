package com.genetica_life.com.genetica_life;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.SQLiteDialect;
import org.hibernate.service.internal.SessionFactoryServiceRegistryFactoryInitiator;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendLocation;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SendPhoto;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;

/**
 * Hello world
 *
 */
public class App {

	public static void main(String[] args) {

		TelegramBot bot = new TelegramBot("540137040:AAGzrB4lk1jxm6mHcI1Wq-jG6YPJrB0HE8s");

		GetUpdates getUpdates = new GetUpdates().limit(100).offset(0).timeout(0);

		GetUpdatesResponse updatesResponse = bot.execute(getUpdates);

		List<Update> updates = updatesResponse.updates();

		for (Update u : updates) {
			Message message = u.message();
			message.chat().id();
			System.out.println(message.text() + " " + message.chat().id());
		}

		SendMessage sendMessage = new SendMessage("212060198", "<b>hello</b>");

		sendMessage.parseMode(ParseMode.HTML);

//		bot.execute(sendMessage);
		
SQLiteDialect dialect = new SQLiteDialect();
		
		System.out.println(dialect.getCascadeConstraintsString());
		Chat c = new Chat();
		
		Configuration configure = new Configuration()
				.configure();
		
		configure.setProperty("dialect", "org.hibernate.dialect.SQLiteDialect");
		
		
		
		SessionFactory buildSessionFactory = configure
				.buildSessionFactory();
		
		
		Session session = buildSessionFactory.getCurrentSession();
		
//		session.
		
		session.save(c);
		
		
	}
}
