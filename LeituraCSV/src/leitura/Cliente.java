
package leitura;

public class Cliente {
     private String id;
     private String nome;
     private String telefone;
     private String email;
     private double totalCompras;
     private String nascimento;

    public Cliente(String id, String nome, String email, String nascimento, String telefone, String totalCompras) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.totalCompras = Double.parseDouble(totalCompras);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }
          
    
}
