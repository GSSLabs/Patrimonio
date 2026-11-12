package https.github.com.GSSLabs.Patrimonio.git.patrimonio.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "th_patrimonio")
public class Patrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nr_patrimonio", nullable = false, length = 50)
    private String nr_patrimonio;

    @Column(name = "Local", nullable = false, length = 255)
    private String Local;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    /// getters and setters

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /// constructor

    public Patrimonio(Long id, String nr_patrimonio, String local, String descricao) {
        Id = id;
        this.nr_patrimonio = nr_patrimonio;
        this.descricao = descricao;
        Local = Local;
    }
}
