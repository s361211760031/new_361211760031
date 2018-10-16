package lab10;


import java.sql.*;

public class myDatabase {
    public static void main(String[] args) {
        //connectDB();
        myDatabase myConnect = new myDatabase();
        myConnect.selectAll();
    }//main
    private void selectAll (){
        String sql = "select * from user";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //loop
            while (rs.next()) {
                System.out.println(rs.getInt("ID")+"\t"+
                rs.getString("name")+"\t"+
                rs.getString("lastname"));
        }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private Connection connect(){

        Connection conn = null;
        try {
            //
            String url = "jdbc:sqlite:D:\\361211760031\\src\\lab10\\myData.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Database is Connected.");
        }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return conn;

    }//connect



        private static void connectDB() {
        Connection conn = null;
        try {
            //
            String url = "jdbc:sqlite:D:\\361211760031\\src\\lab10\\myData.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Database is Connected.");

    } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Can not connecting to Database");
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }





    }//connection
}
