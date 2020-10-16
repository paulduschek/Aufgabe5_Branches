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

        final TextField t1 = new TextField();
        t1.setMinHeight(25);
        t1.setStyle("-fx-font-size: 10; -fx-font-weight: bold");

        Label L1 = new Label("Grad Fahrenheit");
        L1.setStyle("-fx-font-size: 15; -fx-font-weight: bold");

        final TextField t2 = new TextField();
        t2.setMinHeight(25);
        t2.setStyle("-fx-font-size: 10; -fx-font-weight: bold");

        Button b1 = new Button();
        b1.setText("Convert C -> F");
        EventHandler <MouseEvent> Handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double c = 0;

                c = Double.parseDouble(t1.getText());
                double f = ((c * 1.8) + 32);

                t2.setText(String.valueOf(f));
            }
        };

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, Handler1);

        Button b2 = new Button();
        b2.setText("Convert F -> C");
        EventHandler<MouseEvent> Handler2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double f1;

                f1 = Integer.parseInt(t2.getText());
                double c1 = ((f1 - 32) * 5/9);
                t1.setText(String.valueOf(c1));
            }
        };
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, Handler2);

        vbox.getChildren().addAll(L,t1,L1,t2,b1,b2);

        stage.setTitle("Aufgabe 5 - Branches");
        stage.setScene(sc);
        stage.show();
    }
}
