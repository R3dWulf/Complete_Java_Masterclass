package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField namefield;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize()
    {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent eventParam)
    {
        if(eventParam.getSource().equals(helloButton))
        {
            System.out.println("Hello, " + namefield.getText());
        } else if(eventParam.getSource().equals(byeButton))
        {
            System.out.println("You come back now, " + namefield.getText() );
        }

        Runnable task = new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("Im going to sleep on the : " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("Im updating the label on the: " + s);
                            ourLabel.setText("It did something");
                        }
                    });

                }
                catch(InterruptedException event)
                {

                }
            }
        };

        new Thread(task).start();

        if(ourCheckBox.isSelected())
        {
            namefield.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased()
    {
        String text = namefield.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }

    @FXML
    public void handleChange()
    {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked") );
    }
}
