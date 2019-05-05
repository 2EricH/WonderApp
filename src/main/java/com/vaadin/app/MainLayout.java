package com.vaadin.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
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
		VerticalLayout layout3 = new VerticalLayout();

		
    	VerticalLayout spacing = new VerticalLayout();  

		
		Label firstLabel = new Label("Circular Design View");
		
		diary.setPlaceholder("placeholder text");
		
		
		
		
//        Button wealth = new Button("Wealth", event -> { 
//                	diary.setPlaceholder("Wealth entry here");
//                	diary.setEnabled(true);
//        });
//
//        
//        Button community = new Button("Community", event -> {
//        	diary.setPlaceholder("Community entry here");
//        	diary.setEnabled(true);
//    });
//        
//        Button wisdom = new Button("Wisdom", event -> {
//        	diary.setPlaceholder("Wisdom entry here");
//        	diary.setEnabled(true);
//        });
//        
//        Button reputation = new Button("Reputation", event -> {
//        	diary.setPlaceholder("Reputation entry here");
//        	diary.setEnabled(true);
//});
//        
//        Button health = new Button("Health", event -> {
//        	diary.setPlaceholder("Health entry here");
//        	diary.setEnabled(true);
//        });
//        
//        Button purpose = new Button("Purpose", event -> {
//        	diary.setPlaceholder("Purpose entry here");
//        	diary.setEnabled(true);
//        });
//        
//        Button love = new Button("Love", event -> {
//        	diary.setPlaceholder("Love entry here");
//        	diary.setEnabled(true);
//        });
//        
//        Button creativity = new Button("Creativity", event -> {
//        	diary.setPlaceholder("Creativity entry here");
//        	diary.setEnabled(true);
//        });
//        
//        Button guidence = new Button("Guidence", event -> {
//        	diary.setPlaceholder("Guidence entry here");
//        	diary.setEnabled(true);
//        });
		
//		  layout.add(wealth, community, wisdom);
//	      layout2.add(reputation, health, purpose);
//	      layout3.add(love, creativity, guidence);
		
		
		Icon wealthCircle = new Icon(VaadinIcon.CIRCLE);
		wealthCircle.getStyle().set("cursor", "pointer");
		wealthCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		wealthCircle.setSize("150px");
		
		Icon communityCircle = new Icon(VaadinIcon.CIRCLE);
		communityCircle.getStyle().set("cursor", "pointer");
		communityCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		communityCircle.setSize("150px");
		
		Icon wisdomCircle = new Icon(VaadinIcon.CIRCLE);
		wisdomCircle.getStyle().set("cursor", "pointer");
		wisdomCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		wisdomCircle.setSize("150px");
		
		Icon reputationCircle = new Icon(VaadinIcon.CIRCLE);
		reputationCircle.getStyle().set("cursor", "pointer");
		reputationCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		reputationCircle.setSize("150px");
		
		Icon healthCircle = new Icon(VaadinIcon.CIRCLE);
		healthCircle.getStyle().set("cursor", "pointer");
		healthCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		healthCircle.setSize("150px");
		
		Icon purposeCircle = new Icon(VaadinIcon.CIRCLE);
		purposeCircle.getStyle().set("cursor", "pointer");
		purposeCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		purposeCircle.setSize("150px");
		
		Icon loveCircle = new Icon(VaadinIcon.CIRCLE);
		loveCircle.getStyle().set("cursor", "pointer");
		loveCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		loveCircle.setSize("150px");
		
		Icon creativityCircle = new Icon(VaadinIcon.CIRCLE);
		creativityCircle.getStyle().set("cursor", "pointer");
		creativityCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		creativityCircle.setSize("150px");
		
		Icon guidenceCircle = new Icon(VaadinIcon.CIRCLE);
		guidenceCircle.getStyle().set("cursor", "pointer");
		guidenceCircle.addClickListener(
		        event -> Notification.show("Saved!"));		
		guidenceCircle.setSize("150px");
		
		 layout.add(wealthCircle, communityCircle, wisdomCircle);
	     layout2.add(reputationCircle, healthCircle, purposeCircle);
	     layout3.add(loveCircle, creativityCircle, guidenceCircle);
	     
        underTitle.add(layout, layout2, layout3);
        title.add(firstLabel, underTitle);
        
        view.add(title);
		setHorizontalComponentAlignment(Alignment.CENTER, view);

        return(view);
    }
    
 // ----------------------------- Second Layout ---------------------------------------------
    
    public HorizontalLayout secondaryLayout() {
		HorizontalLayout view = new HorizontalLayout();
		HorizontalLayout layout = new HorizontalLayout();
		VerticalLayout organize = new VerticalLayout();
		
		Label secondLabel = new Label("Toolbar");
		
		diary.setLabel("Write your entry below :)");
		
        diary.setPlaceholder("");

        Button button = new Button("Save Entry", event -> {
        	Notification.show("Saved!");
        	diary.clear();
        	diary.setPlaceholder("");
        	diary.setEnabled(false);
        });
        
        layout.add(diary, button);
        organize.add(secondLabel, layout);
        view.add(organize);
        
		setHorizontalComponentAlignment(Alignment.CENTER, view);
		
        return(view);
    }
}