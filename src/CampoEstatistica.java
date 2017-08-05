import java.awt.Color;
import java.util.HashMap;

public class CampoEstatistica
{
    private HashMap<Class, Contador> contadores;
    private boolean contadoresValidos;

    public CampoEstatistica()
    {
        contadores = new HashMap<Class, Contador>();
        contadoresValidos = true;
    }

    public String getPopulationDetails(Campo campo)
    {
        StringBuffer buffer = new StringBuffer();
        if(!contadoresValidos) {
            geraContadores(campo);
        }
        for(Class chave : contadores.keySet()) {
            Contador info = contadores.get(chave);
            buffer.append(info.getName());
            buffer.append(": ");
            buffer.append(info.getCount());
            buffer.append(' ');
        }
        return buffer.toString();
    }
    
    public void redefine()
    {
        contadoresValidos = false;
        for(Class chave : contadores.keySet()) {
            Contador contador = contadores.get(chave);
            contador.reset();
        }
    }

    public void incrementaContador(Class animalClass)
    {
        Contador contador = contadores.get(animalClass);
        if(contador == null) {
            contador = new Contador(animalClass.getName());
            contadores.put(animalClass, contador);
        }
        contador.increment();
    }

    public void contadorFinalizado()
    {
        contadoresValidos = true;
    }

    public boolean ehViavel(Campo campo)
    {
        int nonZero = 0;
        if(!contadoresValidos) {
            geraContadores(campo);
        }
        for(Class key : contadores.keySet()) {
            Contador info = contadores.get(key);
            if(info.getCount() > 0) {
                nonZero++;
            }
        }
        return nonZero > 1;
    }
    
    private void geraContadores(Campo campo)
    {
        redefine();
        for(int linha = 0; linha < campo.getProfundidade(); linha++) {
            for(int coluna = 0; coluna < campo.getLargura(); coluna++) {
                Object animal = campo.getObjectAt(linha, coluna);
                if(animal != null) {
                    incrementaContador(animal.getClass());
                }
            }
        }
        contadoresValidos = true;
    }
}
