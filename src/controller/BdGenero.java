
package controller;

import util.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.Genero;

public class BdGenero {
    
    Genero g =  new Genero();
    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;
    
    // Estabelece uma conexão
    public BdGenero() throws SQLException {       
        this.conexao = CriaConexao.getConnection();
    }
    /* <-CONEXÃO COM O BD---- */
    
    
    
    
    /* ----MULTA-> */
    
    // CREATE - Adiciona um registro
    public void adicionaGenero(Genero g) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO genero(tipo, classificao) VALUES(?, ?)";       
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"        
        stmt.setString(1, g.getTipo());
        stmt.setString(2, g.getClassificao());
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
        
    }
    
    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Genero> getLista(String id) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM genero WHERE id_genero like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<Genero> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Genero m = new Genero();
            
            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            m.setId_genero(Integer.valueOf(rs.getString("id_genero")));
            m.setTipo(rs.getString("tipo"));
            m.setClassificao(rs.getString("classificao"));
            
            // Adiciona o registro na lista
            lista.add(m);            
        }
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
    
    public Vector<Genero> getListaId() throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT id_genero FROM genero";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        Vector<Genero> lista = new Vector<Genero>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Genero m = new Genero();
            
            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            m.setId_genero(rs.getInt("id_genero"));
            
            // Adiciona o registro na lista
            lista.add(m);            
        }
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
    
    
    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {       
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM genero WHERE id_genero=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);
        
        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();        
    }
    /* <-MULTA---- */
}

