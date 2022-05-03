package comp3111.covid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.application.Application;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Building on the sample skeleton for 'ui.fxml' Controller Class generated by SceneBuilder 
 */


/**
 * class Controller
 * @author chleungba, AlanHLTong
 *
 */
public class Controller {

    @FXML
    private Button importCSV;
    
    @FXML
    private Button buttonConfirmedCases;

    @FXML
    private Button buttonConfirmedDeaths;

    @FXML
    private Button buttonRateOfVaccination;

    @FXML
    private ListView<String> countryEntry;
    //private String[] countries = {"Hong Kong0","Hong Kong1","Hong Kong2","Hong Kong3","Hong Kong4"};
    private List<String> countries = DataAnalysis.getUniqueLocations();
    private ObservableList<String> countryList = FXCollections.observableArrayList(countries);
    
    @FXML
    private ListView<String> countryEntry2;
    private List<String> countries2 = DataAnalysis.getUniqueLocations();
    private ObservableList<String> countryList2 = FXCollections.observableArrayList(countries);  
    
    @FXML
    private TextField dateEntry;
    
    @FXML
    private TextField dateEntry2;
    
    @FXML
    private TextField dateEntry3;

    @FXML
    private Button generateA1;
    
    @FXML
    private Button generateB1;
    
    @FXML
    private Button generateC1;
    
    @FXML
    private Button generateA2;
    
    @FXML
    private Button generateB2;
    
    @FXML
    private Button generateC2;

    @FXML
	private Label table_label;

	@FXML
	private TableView<TableResult> table;

	@FXML
	private TableColumn<TableResult, String> country;

	@FXML
	private TableColumn<TableResult, String> table_output1;

	@FXML
	private TableColumn<TableResult, String> table_output2;

	@FXML
	private Label chart_label;

	@FXML
	private LineChart<?, ?> chart;
	
    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;
	
    @FXML
    private Tab tabApp1;

    @FXML
    private Tab tabApp2;

    @FXML
    private Tab tabApp3;

    @FXML
    private Tab tabReport1;

    @FXML
    private Tab tabReport2;

    @FXML
    private Tab tabReport3;

    @FXML
    private Tab tabTaskZero;

    @FXML
    private TextArea textAreaConsole;
    
    @FXML
    private TextArea textAreaConsole2;
    
    @FXML
    private TextField textfieldDataset;

    @FXML
    private TextField textfieldISO;
    
    @FXML
	private CharSequence endDate;

    /**
     * import the CSV file
     * @param event
     */
    public void doImportCSV(ActionEvent event) {
    	String iDataset = textfieldDataset.getText();
    	DataAnalysis.setClass(iDataset);
    	
    	System.out.print( "Test End" + "\n");

    	countries = DataAnalysis.getUniqueLocations();
    	countryList = FXCollections.observableArrayList(countries);
    	
    	countries2 = DataAnalysis.getUniqueLocations();
    	countryList2 = FXCollections.observableArrayList(countries);
    	

    	initialize();
    }
    
    /**
     * A class to store the table result
     * @author chleungba
     *
     */
    public class TableResult {
		private SimpleStringProperty tableCountryName;
		private SimpleStringProperty tableOutput1;
		private SimpleStringProperty tableOutput2;

		public TableResult(String tableCountryName, String tableOutput1, String tableOutput2) {
			this.setTableCountryName(tableCountryName);
			this.setTableOutput1(tableOutput1);
			this.setTableOutput2(tableOutput2);
		}

		public String getTableCountryName() {
			return tableCountryName.get();
		}

		public void setTableCountryName(String tableCountryName) {
			this.tableCountryName = new SimpleStringProperty(tableCountryName);
		}

		public String getTableOutput1() {
			return tableOutput1.get();
		}

		public void setTableOutput1(String tableOutput1) {
			this.tableOutput1 = new SimpleStringProperty(tableOutput1);
		}

		public String getTableOutput2() {
			return tableOutput2.get();
		}

		public void setTableOutput2(String tableOutput2) {
			this.tableOutput2 = new SimpleStringProperty(tableOutput2);
		}
	}
    
    //private 

    /**
     * A1 task
     * @param event
     */
    @FXML
    void generateTableA1(ActionEvent event) {
    	//textAreaConsole.clear();
    	//textAreaConsole.appendText(null);

    	
    	String date;
    	int info1;
    	float info2;
    	String use1;
    	String use2;
		ObservableList<TableResult> countryView = FXCollections.observableArrayList();

    	if (event == null)
    		return;
    		//dateEntry.setText("");
    
    	if (dateEntry.getText() == null || dateEntry.getText().trim().isEmpty()) {
    		textAreaConsole.appendText("\nPlease Enter a Date");
    		return;
    	}
    	else {
    		date = dateEntry.getText();
    		if (DataAnalysis.isValidDate(date) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
        	//dateEntry.clear();
    	}
    	

    	//textAreaConsole.appendText("\n");
    	//textAreaConsole.appendText("Number of Confirmed COVID-19 Cases as of " + date + "\n");
    	//textAreaConsole.appendText( "Country - Total Cases - Total Cases (per 1M)" + "\n");
    	

    	for (Integer i : countryEntry.getSelectionModel().getSelectedIndices()) {
    		info1 = DataAnalysis.retrieveTotalCases(countryList.get(i), date);
    		info2 = DataAnalysis.retrieveTotalCasesPer1M(countryList.get(i), date);
        	
    		
    		if (info1 != -1) {
    			use1 = Integer.toString(info1);
    		} 
    		else {
    			use1 = "NaN";
    		}
    		if (info2 != -1) {
    			use2 = Float.toString(info2);
    		} 
    		else {
    			use2 = "NaN";
    		}
    		
    		//textAreaConsole.appendText( countryList.get(i) + " " + use1 + " " + use2 + "\n");
        	countryView.add(new TableResult(countryList.get(i), use1, use2));
    	}
    	
    	//textAreaConsole.appendText( "World " + DataAnalysis.retrieveTotalCases("World", date) + " " + DataAnalysis.retrieveTotalCasesPer1M("World", date));


    	
		table_label.setText("Number of Confirmed COVID-19 Cases as of " + date);
		country.setText("Country");
		country.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableCountryName"));
		table_output1.setText("Total Cases");
		table_output1.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput1"));
		table_output2.setText("Total Cases (per 1M)");
		table_output2.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput2"));
		table.setItems(countryView);
		
    	//textAreaConsole.appendText("\n");
    	
    	

    } 

    /**
     * B1 task
     * @param event
     */
    @FXML
    void generateTableB1(ActionEvent event) {
    	if (event == null)
    		return;
    	String date;
    	if (dateEntry.getText() == null || dateEntry.getText().trim().isEmpty()) {
    		textAreaConsole.appendText("\nPlease Enter a Date");
    		return;
    	}
    	else {
    		date = dateEntry.getText();
    		if (DataAnalysis.isValidDate(date) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
    	}
    	
		ObservableList<TableResult> countryView = FXCollections.observableArrayList();
    	int info1;
    	float info2;
    	String use1;
    	String use2;
    	for (Integer i : countryEntry.getSelectionModel().getSelectedIndices()) {
    		info1 = DataAnalysis.retrieveTotal_deaths(countryList.get(i), date);
    		info2 = DataAnalysis.retrieveTotalDeathsPer1M(countryList.get(i), date);
        	
    		
    		if (info1 != -1) {
    			use1 = Integer.toString(info1);
    		} 
    		else {
    			use1 = "NaN";
    		}
    		if (info2 != -1) {
    			use2 = Float.toString(info2);
    		} 
    		else {
    			use2 = "NaN";
    		}
    		
        	countryView.add(new TableResult(countryList.get(i), use1, use2));
    	}
    	
    	
		table_label.setText("Number of Confirmed COVID-19 Deaths as of " + date);
		country.setText("Country");
		country.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableCountryName"));
		table_output1.setText("Total Deaths");
		table_output1.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput1"));
		table_output2.setText("Total Deaths (per 1M)");
		table_output2.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput2"));
		table.setItems(countryView);

    } 

    /**
     * C1 task
     * @param event
     */
    @FXML
    void generateTableC1(ActionEvent event) {
    	if (event == null)
    		return;
    	String date;
    	if (dateEntry.getText() == null || dateEntry.getText().trim().isEmpty()) {
    		textAreaConsole.appendText("\nPlease Enter a Date");
    		return;
    	}
    	else {
    		date = dateEntry.getText();
    		if (DataAnalysis.isValidDate(date) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
    	}
    	
		ObservableList<TableResult> countryView = FXCollections.observableArrayList();

    	int info1;
    	float info2;
    	String use1;
    	String use2;
    	for (Integer i : countryEntry.getSelectionModel().getSelectedIndices()) {
    		info1 = DataAnalysis.retrieveFullyVaccinated(countryList.get(i), date);
    		info2 = DataAnalysis.retrieveRateOfVaccination(countryList.get(i), date);
        	
    		
    		if (info1 != -1) {
    			use1 = Integer.toString(info1);
    		} 
    		else {
    			use1 = "NaN";
    		}
    		if (info2 != -1) {
    			use2 = Float.toString(info2);
    		} 
    		else {
    			use2 = "NaN";
    		}
    		
    		//textAreaConsole.appendText( countryList.get(i) + " " + use1 + " " + use2 + "\n");
        	countryView.add(new TableResult(countryList.get(i), use1, use2));
    	}
    	    	
    	
		table_label.setText("Rate of Vaccination against COVID-19 as of " + date);
		country.setText("Country");
		country.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableCountryName"));
		table_output1.setText("Fully Vaccinated");
		table_output1.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput1"));
		table_output2.setText("Rate of Vaccination");
		table_output2.setCellValueFactory(new PropertyValueFactory<TableResult, String>("tableOutput2"));
		table.setItems(countryView);
		
    } 
    
    /**
     * A2 task
     * @param event
     */
    @FXML
    void generateTableA2(ActionEvent event) {
    	//textAreaConsole.clear();
    	if (event == null)
    		return;
    	String startdate;
    	String enddate;
    	if (dateEntry2.getText() == null || dateEntry2.getText().trim().isEmpty() || dateEntry3.getText() == null || dateEntry3.getText().trim().isEmpty()) {
    		textAreaConsole2.appendText("Please Enter Dates" + "\n");
    		return;
    	}
    	else {
    		startdate = dateEntry2.getText();
    		if (DataAnalysis.isValidDate(startdate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
    		enddate = dateEntry3.getText();
    		if (DataAnalysis.isValidDate(enddate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
        	//dateEntry.clear();
    	}
    	
    
    	//textAreaConsole2.appendText("\n");
    	//textAreaConsole2.appendText("Cumulative Confirmed COVID-19 Cases (per 1M)\n");
    	chart_label.setText("Cumulative Confirmed COVID-19 Cases (per 1M)");

    	ArrayList<Float> data;
    	
    	chart.getData().clear();
    	
    	for (Integer i : countryEntry2.getSelectionModel().getSelectedIndices()) {
        	//textAreaConsole2.appendText( countryList2.get(i) + " from " + startdate + " to " + enddate + "\n");

        	//textAreaConsole2.appendText( countryList2.get(i) + " ");

        	XYChart.Series series = new XYChart.Series();
    		data = DataAnalysis.retrieveTotalCasesList(countryList.get(i),startdate,enddate);
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
           	LocalDate _startDate = LocalDate.parse(startdate, formatter);
    		LocalDate k = _startDate;
    		for (int j = 0; j < data.size(); j++) {			
    			//textAreaConsole2.appendText(Float.toString(data.get(j)) + " ");
    			String formattedString = k.format(formatter);
    			//textAreaConsole2.appendText(formattedString + " ");
    			if (data.get(j) != -1) {
    				series.getData().add(new XYChart.Data(formattedString, data.get(j)));
    			}
    			k = k.plusDays(1);
    		}
    		//textAreaConsole2.appendText(" \n");
    		series.setName(countryList.get(i));
    		chart.getData().add(series);
    	}
    	
    	//textAreaConsole2.appendText( "World \n" );
 
    } 

    /**
     * B2 task
     * @param event
     */
    @FXML
    void generateTableB2(ActionEvent event) {
    	//textAreaConsole.clear();
    	if (event == null)
    		return;
    	String startdate;
    	String enddate;
    	if (dateEntry2.getText() == null || dateEntry2.getText().trim().isEmpty()) {
    		textAreaConsole2.appendText("Please Enter a Dates" + "\n");
    		return;
    	}
    	else {
    		startdate = dateEntry2.getText();
    		if (DataAnalysis.isValidDate(startdate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
    		enddate = dateEntry3.getText();
    		if (DataAnalysis.isValidDate(enddate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
        	//dateEntry.clear();
    	}


    	chart_label.setText("Cumulative Confirmed COVID-19 Deaths (per 1M)");

    	ArrayList<Float> data;
    	
    	chart.getData().clear();
    	
    	for (Integer i : countryEntry2.getSelectionModel().getSelectedIndices()) {
     
        	XYChart.Series series = new XYChart.Series();
    		data = DataAnalysis.retrieveTotalDeathList(countryList.get(i),startdate,enddate);
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
           	LocalDate _startDate = LocalDate.parse(startdate, formatter);
    		LocalDate k = _startDate;
    		for (int j = 0; j < data.size(); j++) {	
    			String formattedString = k.format(formatter);
    			if (data.get(j) != -1) {
    				series.getData().add(new XYChart.Data(formattedString, data.get(j)));
    			}
    			k = k.plusDays(1);
    		}
    		series.setName(countryList.get(i));
    		chart.getData().add(series);
    	}
    	
    	

    } 

    /**
     * C2 task
     * @param event
     */
    @FXML
    void generateTableC2(ActionEvent event) {
    	//textAreaConsole.clear();
    	if (event == null)
    		return;
    	String startdate;
    	String enddate;
    	if (dateEntry2.getText() == null || dateEntry2.getText().trim().isEmpty()) {
    		textAreaConsole2.appendText("Please Enter a Dates" + "\n");
    		return;
    	}
    	else {
    		startdate = dateEntry2.getText();
    		if (DataAnalysis.isValidDate(startdate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
    		enddate = dateEntry3.getText();
    		if (DataAnalysis.isValidDate(enddate) == false) {
    			textAreaConsole.appendText("\nPlease Enter a VALID Date");
    			return;
    		}
        	//dateEntry.clear();
    	}
    	
    	chart_label.setText("Cumulative Rate of Vaccination against COVID-19");
    	
    	ArrayList<Float> data;
    	
    	chart.getData().clear();
    	
    	for (Integer i : countryEntry2.getSelectionModel().getSelectedIndices()) {
        	XYChart.Series series = new XYChart.Series();
    		data = DataAnalysis.retrieveRateOfVaccinationList(countryList.get(i),startdate,enddate);
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
           	LocalDate _startDate = LocalDate.parse(startdate, formatter);
    		LocalDate k = _startDate;
    		for (int j = 0; j < data.size(); j++) {			
    			String formattedString = k.format(formatter);
    			if (data.get(j) != -1) {
    				series.getData().add(new XYChart.Data(formattedString, data.get(j)));
    			}
    			k = k.plusDays(1);
    		}
    		series.setName(countryList.get(i));
    		chart.getData().add(series);
    	}
    	

    } 

    /**
     * initialize
     */
    @FXML
    public void initialize() {
    	dateEntry.setText("");
    	dateEntry2.setText("");
    	dateEntry3.setText("");

    	countryEntry.setItems(countryList);
    	countryEntry.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);    	
    	
        countryEntry2.setItems(countryList);
        countryEntry2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 

    }
}
