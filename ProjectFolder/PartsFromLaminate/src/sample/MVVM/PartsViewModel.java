package sample.MVVM;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PartsViewModel implements ViewModel {

    private final StringProperty labelText = new SimpleStringProperty("");

    private final BooleanProperty radioButtonSmall = new SimpleBooleanProperty(true);
    private final BooleanProperty radioButtonMedium = new SimpleBooleanProperty();
    private final BooleanProperty radioButtonBig = new SimpleBooleanProperty();

    private final BooleanProperty checkBoxEdges = new SimpleBooleanProperty();
    private final BooleanProperty checkBoxNumber = new SimpleBooleanProperty();
    private final BooleanProperty checkBoxFoil = new SimpleBooleanProperty();

    public void updateValues() {

        new Model(radioButtonSmall.getValue(), radioButtonMedium.getValue(), radioButtonBig.getValue(),
                checkBoxEdges.getValue(), checkBoxNumber.getValue(), checkBoxFoil.getValue());
    }

    public void changeLabel() {

        labelText.setValue("");

        PrintStream ps = new PrintStream(
                new OutputStream() {
                    @Override
                    public void write(int i) throws IOException {
                        labelText.set(labelText.getValue() + (char) i);
                    }
                }
        );
        System.setOut(ps);
        updateValues();
    }

    public ReadOnlyStringProperty getLabelText() {
        return labelText;
    }

    public BooleanProperty checkBoxEdgesProperty() {
        return checkBoxEdges;
    }

    public BooleanProperty checkBoxNumberProperty() {
        return checkBoxNumber;
    }

    public BooleanProperty checkBoxFoilProperty() {
        return checkBoxFoil;
    }

    public BooleanProperty radioButtonSmallProperty() {
        return radioButtonSmall;
    }

    public BooleanProperty radioButtonMediumProperty() {
        return radioButtonMedium;
    }

    public BooleanProperty radioButtonBigProperty() {
        return radioButtonBig;
    }
}
