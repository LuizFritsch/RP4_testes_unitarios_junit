
public class Localizacao
{
    private int linha;
    private int coluna;

    public Localizacao(int linha, int coluna)
    {
        this.linha = linha;
        this.coluna = coluna;
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Localizacao) {
        	Localizacao outra = (Localizacao) obj;
            return linha == outra.getLinha() && coluna == outra.getColuna();
        }
        else {
            return false;
        }
    }
    
    public String toString()
    {
        return linha + "," + coluna;
    }
    
    public int hashCode()
    {
        return (linha << 16) + coluna;
    }
    
    public int getLinha()
    {
        return linha;
    }
    
    public int getColuna()
    {
        return coluna;
    }
}
