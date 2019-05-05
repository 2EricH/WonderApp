package com.vaadin.app;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@SuppressWarnings("serial")
@Route("com.vaadin.app")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
@Theme(value = Lumo.class, variant = Lumo.DARK)

public class MainView extends SplitLayout{
	
	public MainView() {
		MainLayout fillview = new MainLayout();
		
		setSplitterPosition(1580);	
		setOrientation(Orientation.VERTICAL);
		setPrimaryStyle("minWidth", "400px");
		setPrimaryStyle("maxWidth", "600px");
//	
		setComponentAlignment( fillview, Alignment.CENTER );
        addToPrimary(fillview.primaryLayout());
        addToSecondary(fillview.secondaryLayout());
        
        
	}

	private void setComponentAlignment(MainLayout fillview, Alignment center) {
		// TODO Auto-generated method stub
		
	}
}