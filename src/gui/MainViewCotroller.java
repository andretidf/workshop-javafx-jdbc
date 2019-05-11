package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewCotroller implements Initializable{
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	
	@FXML
	public void onMenuItemSellerActin() {
		System.out.println("onMenuItemSellerActin");
		
	}
	
	@FXML
	public void onMenuItemDepartmentActin() {
		System.out.println("onMenuItemDepartmentActin");
		
	}
	
	@FXML
	public void onMenuItemAboutActin() {
		System.out.println("onMenuItemAboutActin");
		
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
