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

  public static String generatedDate() {
    Random random = new Random();
String[] arrDay = new String[30];
arrDay[0] = "01";
arrDay[1] = "02";
arrDay[2] = "03";
arrDay[3] = "04";
arrDay[4] = "05";
arrDay[5] = "06";
arrDay[6] = "07";
arrDay[7] = "08";
arrDay[8] = "09";

    for (int i = 9; i < 30; i++) {
      String s = "" + i;
arrDay[i] = s;
}
    String[] arrMonth = {"01", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};//11
String[] arrYear = {"1985", "1990", "1989", "1999"};//4
String date = arrYear[random.nextInt(4)] + "-" + arrMonth[random.nextInt(11)] + "-"
+ arrDay[random.nextInt(30)];
    return date;
}

  public static void fillTableUsers() {

    Random random = new Random();
String[] arrName = {"Rob", "Bob", "Peet", "Jack", "Sara",
"Salli", "Bill", "Kate", "Lola", "Tor", "Mike", "Bred", "Donald", "Monika", "Glen",};//15
String[] arrSurname = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis",
"Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White",
"Harris"};//15

Connection connection = null;
Statement statement = null;
    try {
      connection = DriverManager.getConnection(Main.URL, Main.USERNAME, Main.PASSWORD);
statement = connection.createStatement();
      for (int i = 0; i < 1001; i++) {
        String qery = "insert into vepamke.users (name, surname, birthdate) "
+ "values (" + "\'" + arrName[random.nextInt(15)] + "\'" + ", " + "\'" +
            arrSurname[random.nextInt(15)] + "\'" + ", " + "\'" + generatedDate() + "\'" + ")";
statement.execute(qery);
}

      System.out.println("Table users is filled!");
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
}
