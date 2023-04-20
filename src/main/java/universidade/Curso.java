/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;
import java.util.ArrayList;
/**
 *
 * @author Alunos
 */
public class Curso {
    private String nome;
    private String coordenador;
    private ArrayList<Disciplina> listaDisciplinas= new ArrayList <>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }   
}
