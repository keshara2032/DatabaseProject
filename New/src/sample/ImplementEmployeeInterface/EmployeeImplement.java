package sample.ImplementEmployeeInterface;

import sample.DBConnection;
import sample.Entities.Employee;
import sample.Interfaces.EmployeeInterface;

import java.sql.*;
import java.util.List;

public class EmployeeImplement implements EmployeeInterface {

    @Override
    public void createEmployeeTable() {

        Connection newConnection = null;

        Statement statement = null;

        try {


            newConnection = DBConnection.databaseConnection();

            statement = newConnection.createStatement();

            System.out.println("Before query");

            statement.execute("CREATE TABLE IF NOT EXISTS employee (id int primary key unique auto_increment," +
                    "first_name varchar(55), last_name varchar(55))");

            System.out.println("after query");

        }catch (Exception e){

        }finally {

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(newConnection != null){
                try {
                    newConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void insert(Employee employee) {

        Connection myConnetion = null;
        PreparedStatement preparedStatement = null;

        try {

            myConnetion = DBConnection.databaseConnection();
            preparedStatement = myConnetion.prepareStatement("INSERT INTO EMPLOYEE (first_name,last_name)" +
                    "VALUES (?, ?)");

            preparedStatement.setString(1,employee.getFirstName());
            preparedStatement.setString(2,employee.getLastName());
            preparedStatement.executeUpdate();
            System.out.println("INSERT INTO EMPLOYEE (first_name,last_name)" +
                    "VALUES (?, ?)");




        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(preparedStatement != null){
                try {

                    preparedStatement.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(myConnetion != null){
                try {

                    myConnetion.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public Employee selectById(int id) {

            Employee employee = new Employee();
            Connection myConnection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {

                myConnection = DBConnection.databaseConnection();
                preparedStatement = myConnection.prepareStatement("SELECT * from  employee where id = ?");
                preparedStatement.setInt(1,id);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()){
                    employee.setId(resultSet.getInt("id"));
                    employee.setFirstName(resultSet.getString("first_name"));
                    employee.setLastName(resultSet.getString("last_name"));

                }



            }catch (Exception e){


            }finally {

                if(resultSet != null){
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if(preparedStatement != null){
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if(myConnection != null){
                    try {
                        myConnection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }




        return employee;
    }

    @Override
    public List<Employee> selectAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Employee employee, int id) {

    }
}
