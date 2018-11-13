package cafe.controller;

import cafe.model.Coffee;
import cafe.model.CoffeeHandler;
import cafe.model.Ingredient;
import cafe.model.IngredientHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.Iterator;


public class EventController {

	@FXML
	private TableView<Ingredient> ingredientTable;
	
	@FXML
	private TableColumn<Ingredient,String> ingredientname;
	@FXML
    private TableView<Coffee> coffeeTable;
	@FXML
    private TableColumn<Coffee, String> coffeeName;
	@FXML
    private TableColumn<Coffee, Integer> coffeeOriginalPrice;

	@FXML
	private TableView<Ingredient>  selectedIngTable;
	
	@FXML
	private TableColumn<Ingredient,String> selectedingname;
	
	@FXML
	private TableColumn<Ingredient,Integer >selectedingprice; 
	
	@FXML
	private TableColumn<Ingredient,Integer> changedingprice;
	
	@FXML
	private TextField percentage;

	
	
	//커피 TableView TalbleColumn 추가하기
	Ingredient selected_i=new Ingredient();
	ObservableList<Ingredient> selected_is=FXCollections.observableArrayList();
	ObservableList<ObservableList<String>> temp_name=FXCollections.observableArrayList();
	ObservableList<String> temp_price=FXCollections.observableArrayList();
	ObservableList<String> temp_saleprice=FXCollections.observableArrayList();
	//ObservableList<Ingredient> canceling_i=FXCollections.observableArrayList();
	
	//Ingredient temp_ing=new Ingredient();
	Ingredient canceling_i=new Ingredient();

	CoffeeHandler coffeeHandler;
	
	
	@FXML
	private void initialize() {

		ingredientTable.setItems(IngredientHandler.getIngredientObservableList());
		ingredientname.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
		ingredientTable.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue)->{
			selected_i=newValue;
		});
		selectedIngTable.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue)->{
			canceling_i=newValue;
		});
		//selectedTable.setId(selected_is);
		selectedIngTable.setItems(selected_is);
		selectedingname.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
		selectedingprice.setCellValueFactory(cellData->cellData.getValue().getSaleProperty().asObject());

		changedingprice.setCellValueFactory(cellData->cellData.getValue().getPriceProperty().asObject());
		coffeeName.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
		coffeeOriginalPrice.setCellValueFactory(cellData -> cellData.getValue().getPriceProperty().asObject());
		setCoffeeList();
		
	}
	
	
	@FXML
	private void  handle_sale() {
		int changedprice=0;
			//percentage에 정수가 안들어오는 경우 체크해줘야됨
			if(selected_i!=null) {
			
			changedprice=selected_i.getPrice()-(selected_i.getPrice()  * Integer.parseInt(percentage.getText())/ 100);
		
			selected_i.setSalePrice((int)changedprice);//여기오류
			selected_is.add(selected_i);
			
			tosale();
			ObservableList<Coffee> coffeeList = this.coffeeHandler.getCoffees();
			Iterator<Coffee> it = coffeeList.iterator();

			while (it.hasNext()) {
			    Coffee current = it.next();
			    current.calculatePrice();
            }
		}
	}

	private void setCoffeeList() {
	    this.coffeeHandler = new CoffeeHandler();
	    this.coffeeTable.setItems(coffeeHandler.getCoffees());
    }

	private void tosale() {
		selected_i.swap_price();
	}
	private void offsale() {
		canceling_i.swap_price();
	}
	
	@FXML
	private void cancel_sale() {
			offsale();
			selected_is.remove(canceling_i);
	}
	
	
}
