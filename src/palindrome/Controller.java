package palindrome;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Label resultLabel;

    private boolean checkPalindrome(String text){
        text = text.toLowerCase();
        String reversed = new StringBuffer(text).reverse().toString();
        return reversed.matches(text);
    }

    @FXML
    public void checkButtonClick(){
        String word = textField.getText();
        boolean isPalindrome = checkPalindrome(word);
        if(isPalindrome)
            resultLabel.setText(word + " is a palindrome");
        else
            resultLabel.setText(word + " is not a palindrome");
    }
}
