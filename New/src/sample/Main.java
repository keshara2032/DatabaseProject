package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Entities.Employee;
import sample.ImplementEmployeeInterface.EmployeeImplement;

import java.sql.Connection;
import java.sql.SQLException;


public class Main extends Application {


   public static Stage window;
    public static Scene login,signup;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        login = new Scene(root, 965, 645);

        window.setScene(login);
        window.setTitle("Studio Saman");
        window.show();

    }


    public static void main(String[] args) {
        launch(args);

//        EmployeeImplement empImp1 = new EmployeeImplement();
//        empImp1.createEmployeeTable();
//
//        Employee Admin = new Employee("Keshara","Weerasinghe");
//        Employee Owner = new Employee("Subadra","Samarasinghe");
//        empImp1.insert(Owner);
//        empImp1.insert(Admin);
//
//        Employee selectedEmp = empImp1.selectById(2);
//        System.out.println(selectedEmp.getId() + " " + selectedEmp.getFirstName() + " " + selectedEmp.getLastName());

    }





}
