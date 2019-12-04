
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {



	public void setPessoa(Pessoas pessoas) throws ClassNotFoundException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contas", "root", "");
			stmt = conn.prepareStatement("INSERT INTO \"PUBLIC\".\"PESSOAS\" ( \"EMAIL\", \"NOME\" ) VALUES ('"+ pessoas.getEmail() +"', '"+pessoas.getNome()+"')");
			int executeUpdate = stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void setDivida(Dividas dividas) throws ClassNotFoundException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contas", "root", "");
						
			stmt = conn.prepareStatement("INSERT INTO \"PUBLIC\".\"DIVIDAS\" (\"ANO\", \"MES\", \"VALOR\", \"PERCENTUAL_DESCONTO\", \"PESSOAS_ID\" ) VALUES ( '"+dividas.getAno()+"', '"+dividas.getMes()+"', '"+dividas.getValor()+"', '"+dividas.getPercentual_desconto()+"', '"+dividas.getPessoas_id()+"')");
			int executeUpdate = stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void setProventos(Proventos proventos) throws ClassNotFoundException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contas", "root", "");
						
			stmt = conn.prepareStatement("INSERT INTO \"PUBLIC\".\"PROVENTOS\" (\"ANO\", \"MES\", \"VALOR\", \"IMPOSTO\", \"PESSOAS_ID\" ) VALUES ( '"+proventos.getAno()+"', '"+proventos.getMes()+"', '"+proventos.getValor()+"', '"+proventos.getImposto()+"', '"+proventos.getPessoas_id()+"')");
			int executeUpdate = stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	

}