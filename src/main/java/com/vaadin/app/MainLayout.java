package com.vaadin.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=no")

public class MainLayout extends VerticalLayout implements RouterLayout {
private static final long serialVersionUID = 4L;
TextArea diary = new TextArea();
String entryType;
int runcount = 0;


public MainLayout() {
		
}

// ----------------------------- Primary Layout ---------------------------------------------

    public HorizontalLayout primaryLayout() {
    	   	
    	HorizontalLayout view = new HorizontalLayout();  
    	HorizontalLayout underTitle = new HorizontalLayout();  

    	VerticalLayout title = new VerticalLayout();  
		VerticalLayout layout = new VerticalLayout();
		VerticalLayout layout2 = new VerticalLayout();
		VerticalLayout layout3 = new VerticalLayout();

		
		Label firstLabel = new Label("Test here");
		
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
				event -> { 
                	diary.setPlaceholder("Wealth entry here");
                	diary.setEnabled(true);
                	entryType = "Wealth";
        });		
		wealthCircle.setSize("150px");
		wealthCircle.setColor("#ac00e6");

		
		Icon communityCircle = new Icon(VaadinIcon.CIRCLE);
		communityCircle.getStyle().set("cursor", "pointer");
		communityCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Community entry here");
                	diary.setEnabled(true);
                	entryType = "Community";
        });		
		communityCircle.setSize("150px");
		communityCircle.setColor("#70db70");

		
		Icon wisdomCircle = new Icon(VaadinIcon.CIRCLE);
		wisdomCircle.getStyle().set("cursor", "pointer");
		wisdomCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Wisdom entry here");
                	diary.setEnabled(true);
                	entryType = "Wisdom";
        });		
		wisdomCircle.setSize("150px");
		wisdomCircle.setColor("#00ace6");

		
		Icon reputationCircle = new Icon(VaadinIcon.CIRCLE);
		reputationCircle.getStyle().set("cursor", "pointer");
		reputationCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Reputation entry here");
                	diary.setEnabled(true);
                	entryType = "Reputation";
        });		
		reputationCircle.setSize("150px");
		reputationCircle.setColor("#ff6666");

		
		Icon healthCircle = new Icon(VaadinIcon.CIRCLE);
		healthCircle.getStyle().set("cursor", "pointer");
		healthCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Health entry here");
                	diary.setEnabled(true);
                	entryType = "Health";
        });
		healthCircle.setSize("150px");
		healthCircle.setColor("#ffff66");

		
		Icon purposeCircle = new Icon(VaadinIcon.CIRCLE);
		purposeCircle.getStyle().set("cursor", "pointer");
		purposeCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Purpose entry here");
                	diary.setEnabled(true);
                	entryType = "Purpose";
        });
		purposeCircle.setSize("150px");
		purposeCircle.setColor("#001a33");

		
		Icon loveCircle = new Icon(VaadinIcon.CIRCLE);
		loveCircle.getStyle().set("cursor", "pointer");
		loveCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Love entry here");
                	diary.setEnabled(true);
                	entryType = "Love";
        });		
		loveCircle.setSize("150px");
		loveCircle.setColor("#ff6699");

		
		Icon creativityCircle = new Icon(VaadinIcon.CIRCLE);
		creativityCircle.getStyle().set("cursor", "pointer");
		creativityCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Creativity entry here");
                	diary.setEnabled(true);
                	entryType = "Creativity";
        });
		creativityCircle.setSize("150px");
		creativityCircle.setColor("#e6ffe6");

		
		Icon guidenceCircle = new Icon(VaadinIcon.CIRCLE);
		guidenceCircle.getStyle().set("cursor", "pointer");
		guidenceCircle.addClickListener(
				event -> { 
                	diary.setPlaceholder("Guidance entry here");
                	diary.setEnabled(true);
                	entryType = "Guidance";
        });
		guidenceCircle.setSize("150px");
		guidenceCircle.setColor("#8c8c8c");
				
		 layout.add(wealthCircle, communityCircle, wisdomCircle);
	     layout2.add(reputationCircle, healthCircle, purposeCircle);
	     layout3.add(loveCircle, creativityCircle, guidenceCircle);
	     
        underTitle.add(layout, layout2, layout3);
        title.add(firstLabel, underTitle);
        
        view.add(title);
		setHorizontalComponentAlignment(Alignment.CENTER, view);

        return(view);
    }
    
 // ----------------------------- Secondary Layout ---------------------------------------------
    
    public HorizontalLayout secondaryLayout() {
		HorizontalLayout view = new HorizontalLayout();
		HorizontalLayout layout = new HorizontalLayout();
		VerticalLayout organize = new VerticalLayout();
		
		diary.setEnabled(false);
    	diary.setWidth("700px");				
		diary.setLabel("Write your entry below :)");		
        diary.setPlaceholder("");
        
        Button generateChart = new Button("View Chart", event -> {
        	GenerateChart chart = new GenerateChart();
        	try {
				chart.main();
			} catch (Exception e) {
				e.printStackTrace();
			} 
        	
        });   
        generateChart.setDisableOnClick(true);

        Button button = new Button("Save Entry", event -> {
        	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        	LocalDateTime now = LocalDateTime.now();
        	String date = new String(dtf.format(now));
        	
        	BufferedWriter writer;
        	String home = System.getProperty("user.home");
        	String fileName = new String("Chart Records");
        	File file = new File(home+"/Downloads/" + fileName + ".txt");         	
			try {
				 if (file.createNewFile()) {		                
		                System.out.println("File has been created.");
		            } else {		            
		                System.out.println("File already exists.");
		            }				
				writer = new BufferedWriter(new FileWriter(file, true));
				writer.newLine();
				writer.write("Entry type: " + entryType);
				writer.newLine();
				writer.write(date + " :: " + diary.getValue());
				writer.newLine();
	            writer.close();

			} catch (IOException e1) {
				System.out.println("Could not find file");
				e1.printStackTrace();
			}
			
			Notification.show("Saved!");
        	diary.clear();
        	diary.setPlaceholder("");
        	diary.setEnabled(false);		
          
        });
        
        organize.add(button, generateChart);
        layout.add(diary, organize);
        view.add(layout);
        
		setHorizontalComponentAlignment(Alignment.CENTER, view);
		
        return(view);
    }
}