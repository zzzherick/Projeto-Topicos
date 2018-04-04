package cursoidiomas;

public class Idiomas {
    
    private String nomeIdioma;
    private double preco;
    private int duracao;
    private int horario;
    
    public void setNomeIdioma(String nomeIdioma){
        this.nomeIdioma = nomeIdioma;
    }
    
    public String getNomeIdioma(){
        return nomeIdioma;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void setHorario(int horario){
        this.horario = horario;
    }
    
    public int getHorario(){
        return horario;
    }
    
}
