package com.vaadin.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.RouterLayout;

@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=no")

public class MainLayout extends VerticalLayout implements RouterLayout {
private static final long serialVersionUID = 4L;
TextArea diary = new TextArea();



public MainLayout() {
		
}

// ----------------------------- Primary Layout ---------------------------------------------

    public HorizontalLayout primaryLayout() {
    	diary.setEnabled(false);

    	
    	HorizontalLayout view = new HorizontalLayout();  
    	HorizontalLayout underTitle = new HorizontalLayout();  

    	VerticalLayout title = new VerticalLayout();  
		VerticalLayout layout = new VerticalLayout();
		VerticalLayout layout2 = new VerticalLayout();
		
    	VerticalLayout spacing = new VerticalLayout();  

		
		Label firstLabel = new Label("Circular Design View");
		
		diary.setPlaceholder("placeholder text");
		
        Button button = new Button("this", event -> { 
                	diary.setPlaceholder("this entry here");
                	diary.setEnabled(true);
        });

        
        Button thing = new Button("thing", event -> {
        	diary.setPlaceholder("thing entry here");
        	diary.setEnabled(true);
    });
        
        Button that = new Button("that", event -> {
        	diary.setPlaceholder("that entry here");
        	diary.setEnabled(true);
        });
        
        Button there = new Button("there", event -> {
        	diary.setPlaceholder("there entry here");
        	diary.setEnabled(true);
});
        
        Button them = new Button("them", event -> {
        	diary.setPlaceholder("them entry here");
        	diary.setEnabled(true);
        });
        
        Button thought = new Button("thought", event -> {
        	diary.setPlaceholder("thought entry here");
        	diary.setEnabled(true);
        });
        
        layout.add(button, thing, that);
        layout2.add(there, them, thought);
        underTitle.add(layout, layout2, spacing);
        title.add(firstLabel, underTitle);
        
        view.add(title);
		setHorizontalComponentAlignment(Alignment.CENTER, view);

        return(view);
    }
    
 // ----------------------------- Second Layout ---------------------------------------------
    
    public HorizontalLayout secondaryLayout() {
		HorizontalLayout view = new HorizontalLayout();
		HorizontalLayout layout = new HorizontalLayout();
		
		Label secondLabel = new Label("Toolbar");
		
		diary.setLabel("Write your entry below :)");
		
        diary.setPlaceholder("");

		
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        layout.add(diary);
        
        view.add(secondLabel, layout, button);
        
		setHorizontalComponentAlignment(Alignment.CENTER, view);
		
        return(view);
    }
}