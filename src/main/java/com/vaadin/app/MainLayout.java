package com.vaadin.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.RouterLayout;

@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=no")

public class MainLayout extends VerticalLayout implements RouterLayout {
private static final long serialVersionUID = 4L;

public MainLayout() {
	
}
    public VerticalLayout primaryLayout() {
		VerticalLayout layout = new VerticalLayout();
		
		Label firstLabel = new Label("Circular Design View");
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        
        layout.add(firstLabel, button);
        return(layout);
    }
    
    public VerticalLayout secondaryLayout() {
		VerticalLayout layout = new VerticalLayout();
		
		Label secondLabel = new Label("Toolbar");
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        
        layout.add(secondLabel, button);
        return(layout);
    }
}