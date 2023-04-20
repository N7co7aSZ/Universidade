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
public class Unidade {
    private String nome;
    private String gestor;
     private ArrayList<Curso> cursos= new ArrayList <>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
    
}
