/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestarsala;

/**
 *
 * @author Diego Calvo R
 */
public class Usuario {

    String name, codigo, horario;

    public Usuario(String name, String codigo, String horario) {
        this.name = name;
        this.codigo = codigo;
        this.horario = horario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    @Override
    public String toString(){
        return name+"  ||  "+codigo+"  ||  "+horario;        
    }
}
