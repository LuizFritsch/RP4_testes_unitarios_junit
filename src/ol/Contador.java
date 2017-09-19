package ol;
import java.awt.Color;

/*
 * Iniciando inspeção de software 14 de agosto de 2017 as 23:00
 * Inspeção de software inicial finalizada em 14 de agosto de 2017 as 23:50
 * 
 * Iniciando Refatoração do código em 14 de agosto de 2017 as 23:50
 * Refatoração finalizada em 15 de agosto de 2017 as 00:03
 */

public class Contador
{
    private String name;
    private int count;

    public Contador(String name)
    {
    	String novoNome="";
    	if(name.contains("Ovelha")) {
    		novoNome="Ovelha";
    	}else if(name.contains("Lobo")){
    		novoNome="LoboGuara";
    	}else {
    		novoNome=name;
    	}
        this.name = novoNome;
        count = 0;
    }
    
    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }

    public void increment()
    {
        count++;
    }
    
    public void reset()
    {
        count = 0;
    }
}
