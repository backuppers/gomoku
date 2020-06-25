import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BoardController implements Initializable {
    
    @FXML private ImageView board_view;
    @FXML private AnchorPane pane;

    private Board board;
    private int count;
    private Color color;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        board = new Board(19, 19);
        count = 0;

        board_view.setOnMouseClicked( event -> {
            int x = ((int)event.getX() - 4) / 20;
            int y = ((int)event.getY() - 4) / 20;
            System.out.println("x : " + x + " y : " + y);

            if (board.getPiece(x, y) != null) {
                System.out.println("이미 있는 자리 입니다.");
                return;
            }
            if(!board.putPiece(new Piece(color), x, y)) {
                System.out.println("놓을 수 없는 자리 입니다.");
                return;
            }

            String image_url = "";
            if ((count & 1) == 0) {
                image_url = "800px-Go_b_no_bg.svg.png";
                color = Color.BLACK;
            } else {
                image_url = "Go_w_no_bg.svg.png";
                color = Color.WHITE;
            }
            ImageView go_stone = new ImageView(new Image(image_url));

            go_stone.setFitHeight(20);
            go_stone.setFitWidth(20);
            
            go_stone.setLayoutX(x * 20 + 3);
            go_stone.setLayoutY(y * 20 + 3);
            pane.getChildren().add(go_stone);
            
            count++;
        });
    }
    
}