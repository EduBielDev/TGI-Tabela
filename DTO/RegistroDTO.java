
package DTO;


public class RegistroDTO {
    
    private String Nome,Tipo,Data,Modo,Descricao,Fixo;
    private int Id_Registro,Parcelas,Id_usuario;
    private float Valor;       

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getModo() {
        return Modo;
    }

    public void setModo(String Modo) {
        this.Modo = Modo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getId_Registro() {
        return Id_Registro;
    }

    public void setId_Registro(int Id_Registro) {
        this.Id_Registro = Id_Registro;
    }

    public int getParcelas() {
        return Parcelas;
    }

    public void setParcelas(int Parcelas) {
        this.Parcelas = Parcelas;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public String getFixo() {
        return Fixo;
    }

    public void setFixo(String Fixo) {
        this.Fixo = Fixo;
    }

    public void getId_Registro(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
