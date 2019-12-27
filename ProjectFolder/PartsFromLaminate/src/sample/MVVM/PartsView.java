package sample.MVVM;

import de.saxsys.mvvmfx.FxmlPath;
import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

@FxmlPath("/sample.fxml")
public class PartsView implements FxmlView<PartsViewModel> {

    @FXML
    private RadioButton radioButtonSmall;

    @FXML
    private RadioButton radioButtonMedium;

    @FXML
    private RadioButton radioButtonBig;

    @FXML
    private CheckBox checkBoxEdges;

    @FXML
    private CheckBox checkBoxNumber;

    @FXML
    private CheckBox checkBoxFoil;

    @FXML
    public Label labelText;

    @InjectViewModel
    private PartsViewModel viewModel;

    public void initialize() {

        radioButtonSmall.selectedProperty().bindBidirectional(viewModel.radioButtonSmallProperty());
        radioButtonMedium.selectedProperty().bindBidirectional(viewModel.radioButtonMediumProperty());
        radioButtonBig.selectedProperty().bindBidirectional(viewModel.radioButtonBigProperty());

        checkBoxEdges.selectedProperty().bindBidirectional(viewModel.checkBoxEdgesProperty());
        checkBoxNumber.selectedProperty().bindBidirectional(viewModel.checkBoxNumberProperty());
        checkBoxFoil.selectedProperty().bindBidirectional(viewModel.checkBoxFoilProperty());

        labelText.textProperty().bind(viewModel.getLabelText());
    }

    public void onUpdateButton(ActionEvent actionEvent) {
        viewModel.changeLabel();
    }
}
