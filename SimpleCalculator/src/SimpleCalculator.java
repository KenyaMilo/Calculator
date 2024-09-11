/* Objective: To provide a simple GUI for performing basic arithmetic operations as well as calculating the square root.
 * Algorithm: First the GUI components have to be initialized. The TextField and Button components are created, then arranged in the FlowPane and HBox layout.
 * The event handlers are then set up such as the addition, Subtraction, Multiplication, Division, and Square Root Buttons. Then the application is launched.  
 * Input and Output: Input are the numbers "Number 1 and Number 2" and the arithmetic operation.
 * The output is the result. 
 * Created by: Kenya Milo
 * Date: 07/11/2024
 * Version: java 20.0.2
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
	
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		//TextFields for Number input and Result output
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		//Set the column count for the TextFields
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		//Create a FlowPane layout to hold the labels and TextFields
		pane.getChildren().addAll(
				//Label TextField for Number 1
				new Label("Number 1: "), tfNumber1,
				//Label TextField for NUmber 2
				new Label("Number 2: "), tfNumber2,
				//Label TextField for Result
				new Label("Result: "), tfResult);
		//Create Buttons for Calculator operations
		HBox hBox = new HBox(5);//HBox layout with 5 units of spacing between buttons
		Button btAdd = new Button("Add"); //Button for additions
		Button btSubtract = new Button("Subtract"); //Button for Subtraction
		Button btMultiply = new Button("Multiply"); //Button for Multiplication
		Button btDivide = new Button("Divide"); //Button for Division
		Button btSquareRoot = new Button("Square root"); //Button for square root
		//Center align buttons
		hBox.setAlignment(Pos.CENTER);
		// Add buttons to HBox
		hBox.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivide,btSquareRoot);
		//Create BorderPane layout for the entire window
		BorderPane borderPane = new BorderPane();
		//Set FlowPane layout to the center of the BorderPane
		borderPane.setCenter(pane);
		//Set the HBox layout (buttons) to the bottom of the BorderPane
		borderPane.setBottom(hBox);
		//Create the scene and set it on the primary stage
		//Set the scene size to 350x250 pixels
		Scene scene = new Scene(borderPane, 350,250);
		//Set the window title
		primaryStage.setTitle("Simple Calculator");
		//Set the scene for the primary stage
		primaryStage.setScene(scene);
		//Show the primary stage
		primaryStage.show();
		//Addition operation
		btAdd.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) +
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		//Subtraction operation
		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		//Multiplication operation
		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		//Division operation
		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		//Square Root operation
		btSquareRoot.setOnAction(e -> {
			double num1 = Double.parseDouble(tfNumber1.getText());
			double num2 = Double.parseDouble(tfNumber2.getText());
			double sum = num1 + num2;
            if (sum >= 0) {
                tfResult.setText(String.valueOf(Math.sqrt(sum)));
            } else {
                tfResult.setText("Error: Negative sum");
            }	
		});

}
	//Launch the JavaFX application
	public static void main(String[] args) {
		launch(args);

	}
	}
