package fbrs.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FishermanInputReportController implements Initializable {
    public TableColumn numColumn;
    public TableColumn numberColumn;
    public TableColumn priceColumn;
    public TableColumn sellerColumn;
    public TableColumn noteColumn;
    public Button backBtn;
    public TextField search;
    public Label FishermanName;
    public Label account;
    public TextField number;
    public TextField name;
    public Button addBtn;
    public TableView table;
    public Label id;
    public TextField price;
    public BorderPane rootPane;

    public void back(ActionEvent actionEvent) {
        NavigationUtil.navTo(rootPane, NavigationUtil.HOME_FXML, actionEvent);
    }

    public void onAdd(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}