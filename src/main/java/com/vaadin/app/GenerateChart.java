package com.vaadin.app;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
 
public class GenerateChart extends Application {
	
public static int populateData(String stringToLookFor){    	
    	String home = System.getProperty("user.home");
    	String chartRecords = new String("Chart Records");
    	String fileName = new String(home+"/Downloads/" + chartRecords + ".txt"); 
    	
    	  int count = 0;
    	  try{
    	    FileInputStream fstream = new FileInputStream(fileName);
    	    DataInputStream in = new DataInputStream(fstream);
    	    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    	    String strLine;
    	    while ((strLine = br.readLine()) != null)   {
    	      int startIndex = strLine.indexOf(stringToLookFor);
    	      while (startIndex != -1) {
    	        count += 1;
   	            startIndex = strLine.indexOf(stringToLookFor, startIndex + stringToLookFor.length());
    	      }
    	    }
    	    in.close();
    	  }catch (Exception e){
    	    System.err.println("Error: " + e.getMessage());
    	  }
    	  return count;
    	}
 
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Distrobution Chart");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Wealth", populateData("Entry type: Wealth")),
                new PieChart.Data("Community", populateData("Entry type: Community")),
                new PieChart.Data("Wisdom", populateData("Entry type: Wisdom")),
                new PieChart.Data("Reputation", populateData("Entry type: Reputation")),
                new PieChart.Data("Health", populateData("Entry type: Health")),
                new PieChart.Data("Purpose", populateData("Entry type: Purpose")),
                new PieChart.Data("Love", populateData("Entry type: Love")),
                new PieChart.Data("Creativity", populateData("Entry type: Creativity")),
        		new PieChart.Data("Guidance", populateData("Entry type: Guidance")));

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("User Data Chart");
        

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
        
    }
    
 
    public void main() throws Exception {
        launch();
    }


		
	}
