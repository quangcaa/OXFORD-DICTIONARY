package graphic_version;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Random;

public class hangmanController extends hangmanMenuController {
    @FXML
    private ImageView iv;
    Image img1 = new Image("file:src/main/resources/src/images/img1.png");
    Image img2 = new Image("file:src/main/resources/src/images/img2.png");
    Image img3 = new Image("file:src/main/resources/src/images/img3.png");
    Image img4 = new Image("file:src/main/resources/src/images/img4.png");
    Image img5 = new Image("file:src/main/resources/src/images/img5.png");
    Image img6 = new Image("file:src/main/resources/src/images/img6.png");
    Image img7 = new Image("file:src/main/resources/src/images/img7.png");
    @FXML
    private Label w1;
    @FXML
    private Label w2;
    @FXML
    private Label w3;
    @FXML
    private Label w4;
    @FXML
    private Label w5;
    @FXML
    private Label w6;
    @FXML
    private Label w7;
    @FXML
    private Label w8;
    @FXML
    private Label w9;
    @FXML
    private Label w10;
    @FXML
    private Label w11;
    @FXML
    private Label centre;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button b10;
    @FXML
    private Button b11;
    @FXML
    private Button b12;
    @FXML
    private Button b13;
    @FXML
    private Button b14;
    @FXML
    private Button b15;
    @FXML
    private Button b16;
    @FXML
    private Button b17;
    @FXML
    private Button b18;
    @FXML
    private Button b19;
    @FXML
    private Button b20;
    @FXML
    private Button b21;
    @FXML
    private Button b22;
    @FXML
    private Button b23;
    @FXML
    private Button b24;
    @FXML
    private Button b25;
    @FXML
    private Button b26;
    @FXML
    private Button sb;
    String word;
    int sizee;
    int life = 6;

    public void initialize() throws IOException {
        super.readData();
        setDis();
        w11.setVisible(false);
        w10.setVisible(false);
        w9.setVisible(false);
        w8.setVisible(false);
        w7.setVisible(false);
        w6.setVisible(false);
        w5.setVisible(false);
        w4.setVisible(false);
        w3.setVisible(false);
        w2.setVisible(false);
        w1.setVisible(false);
    }

    public int randomW() {
        Random r = new Random();
        return r.nextInt(words.size());
    }
    public void setup() {
        iv.setImage(img1);
        w11.setText("_");
        w10.setText("_");
        w9.setText("_");
        w8.setText("_");
        w7.setText("_");
        w6.setText("_");
        w5.setText("_");
        w4.setText("_");
        w3.setText("_");
        w2.setText("_");
        w1.setText("_");
        w11.setVisible(false);
        w10.setVisible(false);
        w9.setVisible(false);
        w8.setVisible(false);
        w7.setVisible(false);
        w6.setVisible(false);
        w5.setVisible(false);
        w4.setVisible(false);
        w3.setVisible(false);
        w2.setVisible(false);
        w1.setVisible(false);
        setVi();
        correct_ans = 0;
        life = 6;
    }
    public void start() {
        int r = randomW();
        word = words.get(r);
        sizee = word.length();
        sb.setVisible(false);
        setNotDis();
        switch (sizee) {
            case 4:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                break;
            case 5:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                break;
            case 6:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                break;
            case 7:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                w7.setVisible(true);
                break;
            case 8:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                w7.setVisible(true);
                w8.setVisible(true);
                break;
            case 9:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                w7.setVisible(true);
                w8.setVisible(true);
                w9.setVisible(true);
                break;
            case 10:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                w7.setVisible(true);
                w8.setVisible(true);
                w9.setVisible(true);
                w10.setVisible(true);
                break;
            case 11:
                w1.setVisible(true);
                w2.setVisible(true);
                w3.setVisible(true);
                w4.setVisible(true);
                w5.setVisible(true);
                w6.setVisible(true);
                w7.setVisible(true);
                w8.setVisible(true);
                w9.setVisible(true);
                w10.setVisible(true);
                w11.setVisible(true);
                break;
            default:
                break;
        }
    }
    int correct_ans = 0;
    public void checkAnswer(String str) {
        if (word.contains(str)) {
            int index = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (String.valueOf(c).equals(str)) {
                    showAnswer(index, Character.toString(c));
                    correct_ans++;
                }
                index++;
            }
        }
        else showImage();

        if (correct_ans == word.length()) {
            centre.setText("YOU WON!!");
            setDis();
            setup();
            sb.setVisible(true);
            sb.setText("TRY AGAIN");
        }
    }

    public void showAnswer(int index, String str) {
        switch (index) {
            case 0:
                w1.setText(str);
                break;
            case 1:
                w2.setText(str);
                break;
            case 2:
                w3.setText(str);
                break;
            case 3:
                w4.setText(str);
                break;
            case 4:
                w5.setText(str);
                break;
            case 5:
                w6.setText(str);
                break;
            case 6:
                w7.setText(str);
                break;
            case 7:
                w8.setText(str);
                break;
            case 8:
                w9.setText(str);
                break;
            case 9:
                w10.setText(str);
                break;
            case 10:
                w11.setText(str);
                break;
        }
    }

    public void showImage() {
        life--;
        switch (life) {
            case 5:
                iv.setImage(img2);
                break;
            case 4:
                iv.setImage(img3);
                break;
            case 3:
                iv.setImage(img4);
                break;
            case 2:
                iv.setImage(img5);
                break;
            case 1:
                iv.setImage(img6);
                break;
            case 0:
                iv.setImage(img7);
                centre.setText("GAME OVER!!");
                setDis();
                setup();
                sb.setVisible(true);
                sb.setText("TRY AGAIN");
                break;
        }
    }

    public void clicked1(ActionEvent e) {
        checkAnswer("a");
        b1.setVisible(false);
    }
    public void clicked2(ActionEvent e) {
        checkAnswer("b");
        b2.setVisible(false);
    }
    public void clicked3(ActionEvent e) {
        checkAnswer("c");
        b3.setVisible(false);
    }
    public void clicked4(ActionEvent e) {
        checkAnswer("d");
        b4.setVisible(false);
    }
    public void clicked5(ActionEvent e) {
        checkAnswer("e");
        b5.setVisible(false);
    }
    public void clicked6(ActionEvent e) {
        checkAnswer("f");
        b6.setVisible(false);
    }
    public void clicked7(ActionEvent e) {
        checkAnswer("g");
        b7.setVisible(false);
    }
    public void clicked8(ActionEvent e) {
        checkAnswer("h");
        b8.setVisible(false);
    }
    public void clicked9(ActionEvent e) {
        checkAnswer("i");
        b9.setVisible(false);
    }
    public void clicked10(ActionEvent e) {
        checkAnswer("j");
        b10.setVisible(false);
    }
    public void clicked11(ActionEvent e) {
        checkAnswer("k");
        b11.setVisible(false);
    }
    public void clicked12(ActionEvent e) {
        checkAnswer("l");
        b12.setVisible(false);
    }
    public void clicked13(ActionEvent e) {
        checkAnswer("m");
        b13.setVisible(false);
    }
    public void clicked14(ActionEvent e) {
        checkAnswer("n");
        b14.setVisible(false);
    }
    public void clicked15(ActionEvent e) {
        checkAnswer("o");
        b15.setVisible(false);
    }
    public void clicked16(ActionEvent e) {
        checkAnswer("p");
        b16.setVisible(false);
    }
    public void clicked17(ActionEvent e) {
        checkAnswer("q");
        b17.setVisible(false);
    }
    public void clicked18(ActionEvent e) {
        checkAnswer("r");
        b18.setVisible(false);
    }
    public void clicked19(ActionEvent e) {
        checkAnswer("s");
        b19.setVisible(false);
    }
    public void clicked20(ActionEvent e) {
        checkAnswer("t");
        b20.setVisible(false);
    }
    public void clicked21(ActionEvent e) {
        checkAnswer("y");
        b21.setVisible(false);
    }
    public void clicked22(ActionEvent e) {
        checkAnswer("x");
        b22.setVisible(false);
    }
    public void clicked23(ActionEvent e) {
        checkAnswer("u");
        b23.setVisible(false);
    }
    public void clicked24(ActionEvent e) {
        checkAnswer("v");
        b24.setVisible(false);
    }
    public void clicked25(ActionEvent e) {
        checkAnswer("w");
        b25.setVisible(false);
    }
    public void clicked26(ActionEvent e) {
        checkAnswer("z");
        b26.setVisible(false);
    }

    public void setDis() {
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);
        b10.setDisable(true);
        b11.setDisable(true);
        b12.setDisable(true);
        b13.setDisable(true);
        b14.setDisable(true);
        b15.setDisable(true);
        b16.setDisable(true);
        b17.setDisable(true);
        b18.setDisable(true);
        b19.setDisable(true);
        b20.setDisable(true);
        b21.setDisable(true);
        b22.setDisable(true);
        b23.setDisable(true);
        b24.setDisable(true);
        b25.setDisable(true);
        b26.setDisable(true);
    }

    public void setNotDis() {
        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        b4.setDisable(false);
        b5.setDisable(false);
        b6.setDisable(false);
        b7.setDisable(false);
        b8.setDisable(false);
        b9.setDisable(false);
        b10.setDisable(false);
        b11.setDisable(false);
        b12.setDisable(false);
        b13.setDisable(false);
        b14.setDisable(false);
        b15.setDisable(false);
        b16.setDisable(false);
        b17.setDisable(false);
        b18.setDisable(false);
        b19.setDisable(false);
        b20.setDisable(false);
        b21.setDisable(false);
        b22.setDisable(false);
        b23.setDisable(false);
        b24.setDisable(false);
        b25.setDisable(false);
        b26.setDisable(false);
    }

    public void setVi() {
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        b5.setVisible(true);
        b6.setVisible(true);
        b7.setVisible(true);
        b8.setVisible(true);
        b9.setVisible(true);
        b10.setVisible(true);
        b11.setVisible(true);
        b12.setVisible(true);
        b13.setVisible(true);
        b14.setVisible(true);
        b15.setVisible(true);
        b16.setVisible(true);
        b17.setVisible(true);
        b18.setVisible(true);
        b19.setVisible(true);
        b20.setVisible(true);
        b21.setVisible(true);
        b22.setVisible(true);
        b23.setVisible(true);
        b24.setVisible(true);
        b25.setVisible(true);
        b26.setVisible(true);
    }


}
