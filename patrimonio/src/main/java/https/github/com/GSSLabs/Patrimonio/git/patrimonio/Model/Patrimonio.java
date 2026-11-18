package https.github.com.GSSLabs.Patrimonio.git.patrimonio.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "th_patrimonio")
public class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nr_patrimonio", nullable = false, length = 50)
    private String nr_patrimonio;

    @Column(name = "local", nullable = false, length = 255)
    private String local;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    // Construtor vazio
    public Patrimonio() {
    }

    // Construtor com parâmetros
    public Patrimonio(Long id, String nr_patrimonio, String local, String descricao) {
        this.id = id;
        this.nr_patrimonio = nr_patrimonio;
        this.local = local;
        this.descricao = descricao;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
