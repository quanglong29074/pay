package pay;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sun.awt.SunHints;

public class PayContronller {

    public TextField txtchange;
    public TextField txtpay;
    public Button txt10k;
    public TextField txttotal;


    public void change(){
        if(txtpay!=null&&txttotal!=null){


        }
    }


    public void btnMoney1(MouseEvent mouseEvent) {

        txtpay.setText("1$");


    }

    public void btnDelete(MouseEvent mouseEvent) {
        if(txtpay!=null){
            txtpay.setText("");
        }
    }

    public void number1(MouseEvent mouseEvent) {
        txtpay.setText("1");
    }


    public void btnMoney2(MouseEvent mouseEvent) {
        txtpay.setText("2$");
    }

    public void btnMoney3(MouseEvent mouseEvent) {
        txtpay.setText("5$");
    }

    public void btnMoney4(MouseEvent mouseEvent) {
        txtpay.setText("10$");
    }

    public void btnMoney5(MouseEvent mouseEvent) {
        txtpay.setText("20$");
    }

    public void btnMoney6(MouseEvent mouseEvent) {
        txtpay.setText("50$");
    }

    public void btnMoney7(MouseEvent mouseEvent) {
        txtpay.setText("100$");
    }

    public void pay(MouseEvent mouseEvent) {
        if (txtpay != null && txttotal != null && txtchange != null) {
            Alert aleart = new Alert(Alert.AlertType.CONFIRMATION);
            aleart.setContentText("Payment success");
            aleart.show();
        } else if (txtpay != null && txttotal != null&&txtchange==null) {
            Alert aleart = new Alert(Alert.AlertType.ERROR);
            aleart.setContentText("no spare money");
            aleart.show();
        } else if (txtpay != null && txttotal == null&&txtchange!=null) {
            Alert aleart = new Alert(Alert.AlertType.ERROR);
            aleart.setContentText("no total amount yet");
            aleart.show();
        }else if (txtpay == null && txttotal != null&&txtchange!=null){
            Alert aleart = new Alert(Alert.AlertType.ERROR);
            aleart.setContentText("no money paid by customer");
            aleart.show();
        }
    }
    public void Number(ActionEvent ae) {
        String no= ((Button)ae.getSource()).getText();
        txtpay.setText(txtpay.getText()+no);
    }

    public void complete(ActionEvent actionEvent) {
    }
}
