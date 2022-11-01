package com.example.springprojeto.projetointegrador4;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class UserPlanoDeSaude {
    String instituicao;
    String planoDeSaude;
    Long numeroRegistro;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getPlano() {
        return planoDeSaude;
    }

    public void setPlano(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public Long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
}
