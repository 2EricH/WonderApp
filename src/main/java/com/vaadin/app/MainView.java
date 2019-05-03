package com.vaadin.app;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
@Tag("div")
@HtmlImport("C:/GIT/Sharon-App/theming.html")
//@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainView extends VerticalLayout {
	private static final long serialVersionUID = 4L;

	public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);
    }
}
