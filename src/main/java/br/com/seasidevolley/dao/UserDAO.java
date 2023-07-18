package br.com.seasidevolley.dao;

import br.com.seasidevolley.model.User;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;

public class UserDAO {


    public void createUser(User user) {
        String SQL = "INSERT INTO USERS(CPF, NAME, EMAIL) VALUES (?,?,?)";
        try {

            Connection con = DriverManager.getConnection("jdbc:h2:~/seasidevolley", "sa", "sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            preparedStatement.setString(1, user.getCpf());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail());

            preparedStatement.execute();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("fail in connection");
        }

    }
}
