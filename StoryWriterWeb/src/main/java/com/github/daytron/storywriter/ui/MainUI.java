package com.github.daytron.storywriter.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class MainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		ClickListener listener = new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Notification.show("Welcome to Vaadin Spring");
			}
		};
		Button button = new Button("Click Me",listener);
		setContent(button);
	}

}
