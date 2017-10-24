package prestarsala;

/**
 *
 * @author Diego Calvo R
 */
public class Nodo {

    boolean libre;
    String name, codigo, horario;
    Nodo link1, link2, link3, link4;
    int itemn, hora, turno;

    

    /**
     * este nodo se crea para la lista de los usuarios y sus reservas
     *
     * @param name
     * @param codigo
     * @param link3
     * @param link4
     */
    public Nodo(String name, String codigo, Nodo link3, Nodo link4) {
        this.name = name;
        this.codigo = codigo;
        this.link3 = link3;
        this.link4 = link4;
    }

    /**
     * este nodo se crea para dar lugar a las reservaciones que tiene cada usuario
     * @param name
     * @param horario 
     * @param codigo
     * @param link4
     */
    public Nodo(String name, String horario, String codigo, Nodo link4) {    
        this.name = name;
        this.horario = horario;
        this.codigo = codigo;
        this.link4 = link4;
    }

    /**
     * *
     * aqui se hace la creación de los tipos de nodos. de sala y de horario.
     *
     * @param libre
     * @param name
     * @param codigo
     * @param turno
     * @param link2
     * @param horario
     */
    public Nodo(boolean libre, String name, String codigo, String horario, int turno, Nodo link2) {
        this.libre = libre;
        this.name = name;
        this.codigo = codigo;
        this.horario = horario;
        this.turno = turno;
        this.link2 = link2;
    }

    /**
     * *
     * 
     *
     * @param name
     * @param itemn
     * @param link1
     * @param link2
     */
    public Nodo(String name, int itemn, Nodo link1, Nodo link2) {
        this.name = name;
        this.itemn = itemn;
        this.link1 = link1;
        this.link2 = link2;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
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

    public Nodo getLink1() {
        return link1;
    }

    public void setLink1(Nodo link1) {
        this.link1 = link1;
    }

    public Nodo getLink2() {
        return link2;
    }

    public void setLink2(Nodo link2) {
        this.link2 = link2;
    }

    public int getItemn() {
        return itemn;
    }

    public void setItemn(int itemn) {
        this.itemn = itemn;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public Nodo getLink3() {
        return link3;
    }

    public void setLink3(Nodo link3) {
        this.link3 = link3;
    }

    public Nodo getLink4() {
        return link4;
    }

    public void setLink4(Nodo link4) {
        this.link4 = link4;
    }

}
