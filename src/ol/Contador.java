package ol;
import java.awt.Color;

/*
 * Iniciando inspe��o de software 14 de agosto de 2017 as 23:00
 * Inspe��o de software inicial finalizada em 14 de agosto de 2017 as 23:50
 * 
 * Iniciando Refatora��o do c�digo em 14 de agosto de 2017 as 23:50
 * Refatora��o finalizada em 15 de agosto de 2017 as 00:03
 */

public class Contador
{
    private String name;
    private int count;

    public Contador(String name)
    {
        this.name = name;
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
