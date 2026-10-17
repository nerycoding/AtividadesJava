package trabalhandolambdastreamspringframework;

public class Avaliacao <T>{

    private T item;
    private Double nota;
    private String comentario;

    public Avaliacao(T item, Double nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Double mediaAvaliacao(Double nota) {
        return nota / this.nota;
    }

}
