package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "curriculo")
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String descricaoPerfil;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL)
    private List<FormacaoAcademica> formacoesAcademicas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    public List<FormacaoAcademica> getFormacoesAcademicas() {
        return formacoesAcademicas;
    }

    public void setFormacoesAcademicas(List<FormacaoAcademica> formacoesAcademicas) {
        this.formacoesAcademicas = formacoesAcademicas;
    }
}
