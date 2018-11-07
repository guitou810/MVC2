/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author pedago
 */
public class DAO {
    	protected final DataSource myDataSource;

	/**
	 *
	 * @param dataSource la source de données à utiliser
	 */
	public DAO(DataSource dataSource) {
		this.myDataSource = dataSource;
	}
        
        public List<Discount_Code> listCode() throws DAOException{
            List<Discount_Code> result = new LinkedList<>();
            String sql = "SELECT * FROM DISCOUNT_CODE";
		try (Connection connection = myDataSource.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) { // Tant qu'il y a des enregistrements
					// On récupère les champs nécessaires de l'enregistrement courant
					int code = (char) rs.getObject("DISCOUNT_CODE");
					float po = rs.getFloat("RATE");
					// On crée l'objet entité
					Discount_Code c = new Discount_Code((char) code,po);
					// On l'ajoute à la liste des résultats
					result.add(c);
				}
			}
		}  catch (SQLException ex) {
			Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
			throw new DAOException(ex.getMessage());
		}

		return result;
            
        }
        
        
        public void supprCode(char code) throws DAOException{
            String sql = "DELETE FROM DISCOUNT_CODE WHERE DISCOUNT_CODE";
            try (Connection connection = myDataSource.getConnection(); // On crée un statement pour exécuter une requête
            PreparedStatement stmt = connection.prepareStatement(sql)){
                    stmt.setString(1, Character.toString(code));
                    stmt.executeUpdate();
			
		}  catch (SQLException ex) {
			Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
			throw new DAOException(ex.getMessage());
		}
        }
        
        public void addCode(char code,float val) throws DAOException{
            String sql = "INSERT INTO DISCOUNT_CODE (DISCOUNT_CODE,RATE) VALUES (?,?)";
            try (Connection connection = myDataSource.getConnection(); // On crée un statement pour exécuter une requête
            PreparedStatement stmt = connection.prepareStatement(sql)){
                    stmt.setString(1, Character.toString(code));
                    stmt.setFloat(2, val);
                    stmt.executeUpdate();
			
		}  catch (SQLException ex) {
			Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
			throw new DAOException(ex.getMessage());
		}
        }
        
}
