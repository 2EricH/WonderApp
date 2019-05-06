package com.vaadin.app;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

public class ClickableIcon {
	String color;
	String name;
	
	public ClickableIcon(String name, String color) {
		this.color = color;
		this.name = name;
		
	}
	
	void createIcon() {
		
		Icon name = new Icon(VaadinIcon.CIRCLE);
		name.getStyle().set("cursor", "pointer");
		name.setSize("150px");
		name.setColor(color);
		
	}
	

}
