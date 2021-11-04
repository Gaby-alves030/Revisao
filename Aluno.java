public class Aluno extends Pessoa{

    private double cursos; 
    private String notas;


    public void setCursos(double cursos){
        this.cursos = cursos;
    }public double getCursos(){
        return this.cursos;
    }
    public void setNotas(double notas){
        this.notas = notas;
    }public double getNotas(){
        return this.notas;
    }
    


}

public double calculaMedia(){
    return this.notas;
}

