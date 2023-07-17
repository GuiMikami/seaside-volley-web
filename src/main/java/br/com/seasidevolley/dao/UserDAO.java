package br.com.seasidevolley.dao;

import br.com.seasidevolley.model.User;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;

public class UserDAO {

    String SQL = "INSERT INTO CLIENTE(ID, CPF, NAME, EMAIL) VALUES (?,?,?,?)";


    public void createUser(User user){

        try {

            Connection con = DriverManager.getConnection("jdbc:h2:~/seasidevolley","sa", "sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getCpf());
            preparedStatement.setString(3,user.getName());
            preparedStatement.setString(4,user.getEmail());

            preparedStatement.execute();
            con.close();

        }catch (Exception e){
            System.out.println("fail in connection");
        }

    }
}
