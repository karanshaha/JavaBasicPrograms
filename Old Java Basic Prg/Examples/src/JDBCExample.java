import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {

	@SuppressWarnings("null")
	public static void main(String s[]) throws SQLException{
		Connection con = null;
		Statement stmt;
		PreparedStatement prstmt = null;
		CallableStatement callStmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "karan_demo", "demo");
			stmt = con.createStatement();
			String n = "Rahul";
 			String query = "insert into employee(emp_id,emp_name,dept_id,emp_salary) values (110,'"+n+"',2,10)" ;
			stmt.executeQuery(query);
			
			String query1 = "insert into employee values(?,?,?,?)";
			prstmt = con.prepareStatement(query1);
			prstmt.setInt(1, Integer.parseInt("111"));
			prstmt.setString(2, "Ravi");
			prstmt.setInt(3, Integer.parseInt("1"));
			prstmt.setInt(4, Integer.parseInt("8000"));
			
			prstmt.executeUpdate();
			con.commit();
			ResultSet rs = stmt.executeQuery("select * from employee");
		
			while(rs.next()){
				System.out.println(rs.getInt("emp_id"));
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getInt("dept_id"));
				System.out.println(rs.getInt("emp_salary"));
			}
			
			
		}catch(ClassNotFoundException e){
			System.out.println("Error loading driver");
		}
		catch (SQLException e) {
			System.out.println("SQL Exception");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			con.close();
			prstmt.close();
		}
	}
}
