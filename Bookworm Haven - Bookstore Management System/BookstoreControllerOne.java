import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import java.io.*;

public class BookstoreControllerOne {
@FXML
private TextArea textArea;
//file reading method
@FXML
private void OpenSearch(ActionEvent event) {
FileChooser fileChooser = new FileChooser(); //create file chooser object
fileChooser.setTitle("Open/Search File"); //set the title for the dialog box
File file = fileChooser.showOpenDialog(null); //opens dialog
if (file != null) {//check if file is selected
try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//read the opened file
StringBuilder content = new StringBuilder();
String line;
while((line = reader.readLine()) != null) {
//read line and put it into a string variable
content.append(line).append("\n"); //add line to the rest to make content
}
textArea.setText(content.toString()); //display read content in to the gui
}
catch (IOException e) {
e.printStackTrace();
}
}
}


@FXML
private void AddCustomer(ActionEvent event) {
FileChooser fileChooser = new FileChooser();
fileChooser.setTitle("Add Customer");
File file = fileChooser.showSaveDialog(null);
if (file != null) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
writer.write(textArea.getText());
}
catch (IOException e) {
e.printStackTrace();
}
}
} 


@FXML
private void AddBook(ActionEvent event) {
FileChooser fileChooser = new FileChooser();
fileChooser.setTitle("Add Book");
File file = fileChooser.showSaveDialog(null);
if (file != null) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
writer.write(textArea.getText());
}
catch (IOException e) {
e.printStackTrace();
}
}
} 
}








