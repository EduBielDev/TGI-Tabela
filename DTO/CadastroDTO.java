package DTO;

public class CadastroDTO {
    
    private int id_cadastro;
    private String email_cadastro, senha_cadastro, confirma_senha;

    public int getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public String getEmail_cadastro() {
        return email_cadastro;
    }

    public void setEmail_cadastro(String email_cadastro) {
        this.email_cadastro = email_cadastro;
    }

    public String getSenha_cadastro() {
        return senha_cadastro;
    }

    public void setSenha_cadastro(String senha_cadastro) {
        this.senha_cadastro = senha_cadastro;
    }

    public String getConfirma_senha() {
        return confirma_senha;
    }

    public void setConfirma_senha(String confirma_senha) {
        this.confirma_senha = confirma_senha;
    }
                    
    
}
