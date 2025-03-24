package br.com.agibank.dao;

import br.com.agibank.Conexao;
import br.com.agibank.beans.Dependente;
import br.com.agibank.beans.Documento;
import br.com.agibank.beans.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentoDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public DocumentoDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public int criarDocumento(Documento documento) throws SQLException {
        final String sql = "INSERT INTO Documento (id_usuario, tipo, numero, arquivo)VALUES (?, ?,?,?)";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, documento.getId_usuario());
        stmt.setString(2, documento.getTipo());
        stmt.setInt(3, documento.getNumero());
        stmt.setString(4, documento.getArquivo());
        return stmt.executeUpdate();
    }

    public Documento buscarDocumento(String tipo) throws SQLException {
        Documento documento = new Documento();
        final String sql = "SELECT * FROM Usuario WHERE tipo = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, tipo);
        rs = stmt.executeQuery();

        if (rs.next()) {
            documento.setId_usuario(rs.getInt("id_usuario"));
            documento.setTipo(rs.getString("tipo"));
            documento.setNumero(rs.getInt("numero"));
            documento.setArquivo(rs.getString("arquivo"));

        }
        return documento;
    }

}
