import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Paul Duschek
 * @version 1.0, 15.10.2020
 */

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){
        VBox vbox = new VBox();
        Scene sc = new Scene(vbox, 300,300);

        Label L = new Label("Grad Celcius");
        L.setStyle("-fx-font-size: 15; -fx-font-weight: bold");

        TextField t1 = new TextField();
        t1.setMinHeight(25);

        Label L1 = new Label("Grad Fahrenheit");
        L1.setStyle("-fx-font-size: 15; -fx-font-weight: bold");

        TextField t2 = new TextField();
        t2.setMinHeight(25);

        Button b1 = new Button();
        b1.setText("Convert C -> F");
        EventHandler <MouseEvent> Handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        };
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, Handler1);

        Button b2 = new Button();
        b2.setText("Convert F -> C");
        EventHandler<MouseEvent> Handler2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        };
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, Handler2);

        vbox.getChildren().addAll(L,t1,L1,t2,b1,b2);

        stage.setTitle("Aufgabe 5 - Branches");
        stage.setScene(sc);
        stage.show();
    }
}
