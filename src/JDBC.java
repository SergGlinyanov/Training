import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

  private static final String URL = "jdbc:mysql://localhost:3306/dataBase?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "pass";

  public static void main(String[] args) {
    Connection connection;
    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      Statement statement = connection.createStatement();
      statement.execute("insert into dataBase.user (name, surname, birthdate) "
          + "values (\"Ivan\", \"Petrov\", \"11 jan 1987\")");

      if (!connection.isClosed()) {
        System.out.println("Успешно!");
      }
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public static void createTable(String tableName, String numberAttributeName1,
      String numberAttributeName2, String date) {

    String createTableSQL = "CREATE TABLE " + tableName + "("
        + numberAttributeName1 + " INT(10) NOT NULL, "
        + numberAttributeName2 + " INT(10) NOT NULL, "
        + date + " DATE NOT NULL)";

    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      statement = connection.createStatement();

      // выполнить SQL запрос
      statement.execute(createTableSQL);
      System.out.println("Table " + tableName + " is created!");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void createTable(String tableName, String numberAttributeName,
      String attributeName1, String attributeName2,
      String date) throws SQLException {
    Connection connection = null;
    Statement statement = null;

    String createTableSQL = "CREATE TABLE " + tableName + "("
        + numberAttributeName + " INT(10) NOT NULL, "
        + attributeName1 + " VARCHAR(20) NOT NULL, "
        + attributeName2 + " VARCHAR(20) NOT NULL, "
        + date + " DATE NOT NULL, " + "PRIMARY KEY (numberAttributeName) "
        + ")";

    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      statement = connection.createStatement();
      // выполнить SQL запрос
      statement.execute(createTableSQL);
      System.out.println("Table " + tableName + " is created!");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void createTableWithTwoNumberAttribute(String tableName,
      String numberAttributeName1,
      String numberAttributeName2, String attributeName1,
      String date) throws SQLException {
    Connection connection = null;
    Statement statement = null;

    String createTableSQL = "CREATE TABLE " + tableName + "("
        + numberAttributeName1 + " NUMBER(10) NOT NULL, "
        + numberAttributeName2 + " NUMBER(10) NOT NULL, "
        + attributeName1 + " VARCHAR(20) NOT NULL, "
        + date + " DATE NOT NULL, " + "PRIMARY KEY (atributName1) "
        + ")";

    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      statement = connection.createStatement();
      // выполнить SQL запрос
      statement.execute(createTableSQL);
      System.out.println("Table " + tableName + " is created!");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void fillTable() {

  }
}
