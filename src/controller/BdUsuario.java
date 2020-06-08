package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.Usuario;
import util.CriaConexao;
import static util.CriaConexaoJPA.conecta;
import view.JFCliente;

public class BdUsuario {
    
    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;
     CriaConexao conecta;
    
    // Estabelece uma conexão
    public BdUsuario() throws SQLException {       
        this.conexao = CriaConexao.getConnection();
    }
    /* <-CONEXÃO COM O BD---- */
    
    //public BdUsuario(){}
    
    
    /* ----USUARIO-> */
    
    // CREATE - Adiciona um registro
    public void adicionaUsuario(Usuario c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL      
        PreparedStatement stmt;
        String sql = "INSERT INTO usuario(login, senha, p_admin)"
                + "VALUES(?, ?, ?)"; 
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"
        stmt.setString(1, c.getLogin());
        stmt.setString(2, c.getSenha());
        stmt.setString(3, c.getAdmin());
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
        
    }
    
    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Usuario> getLista(String nome) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM usuario WHERE login like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<Usuario> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Usuario c = new Usuario();
            
            // "c" -> Cliente novo - .setNome recebe o campo do banco de String "nome" 
            c.setId(Integer.valueOf(rs.getString("id_usuario")));
            c.setLogin(rs.getString("login"));
            c.setSenha(rs.getString("senha"));
            c.setAdmin(rs.getString("p_admin"));
            
            // Adiciona o registro na lista
            lista.add(c);            
        } 
       
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
       
    // UPDATE - Atualiza registros
    public void altera(Usuario c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "UPDATE usuario set login=?, senha=?"
                + "WHERE id_usuario=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"
        stmt.setInt(1, c.getId());
        stmt.setString(1, c.getLogin());
        stmt.setString(2, c.getSenha());        
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
    }
    
    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {       
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM usuario WHERE id_usuario=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);
        
        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();
        
    }
    /* <-USUARIO---- */
    
    public boolean ckeckLogin(String login, String senha){
        
        JFCliente campos = new JFCliente();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = this.conexao.prepareStatement("SELECT * FROM usuario WHERE login=? and senha=?;");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
//            if(admin == "Sim"){
//                campos.habilitaCamposUsuario();
//            }else{
//                campos.desabilitaCamposUsuario();
//            }
            
            if(rs.next()){
                check = true; 
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar no banco");
        }
        return check;
        
    }
    
    public void isAdmin(int id) throws SQLException {       
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM usuario WHERE p_admin=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);
        
        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();
        
    }
    
    public Vector<Usuario> getAdmin() throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT id_genero FROM genero";
        PreparedStatement stmt = conecta.getConnection().prepareStatement(sql);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        Vector<Usuario> lista = new Vector<Usuario>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
           Usuario m = new Usuario();
            
            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            m.setAdmin(rs.getString("id_genero"));
            
            // Adiciona o registro na lista
            lista.add(m);            
        }
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
}
