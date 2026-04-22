package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em entidade no BD
//JPA = Java Persistante API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne = UM NINJA PODE UMA ÚNICA MISSÃO
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key -- CHAVE ESTRANGEIRA
    private MissoesModel missoes;
}
