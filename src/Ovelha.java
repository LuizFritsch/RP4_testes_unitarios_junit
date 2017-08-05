import java.util.List;
import java.util.Random;

public class Ovelha
{
    private static final int IDADE_PROCRIACAO = 5;
    private static final int IDADE_MAXIMA = 40;
    private static final double PROBABILIDADE_PROCRIACAO = 0.15;
    private static final int TAMANHO_MAXIMO_NINHADA = 4;
    private static final Random rand = Randomizador.getRandom();
    
    private int idade;
    private boolean vivo;
    private Localizacao localizacao;
    private Campo campo;

    public Ovelha(boolean randomAge, Campo campo, Localizacao localizacao)
    {
        idade = 0;
        vivo = true;
        this.campo = campo;
        setLocalizacao(localizacao);
        if(randomAge) {
            idade = rand.nextInt(IDADE_MAXIMA);
        }
    }
    
    public void corre(List<Ovelha> novasOvelhas)
    {
        incrementaIdade();
        if(vivo) {
            daALuz(novasOvelhas);            
            Localizacao newLocalizacao = campo.localizacaoAdjacenteLivre(localizacao);
            if(newLocalizacao == null) { 
                setLocalizacao(newLocalizacao);
            }
            else {
                setMorte();
            }
        }
    }
    
    public boolean estaViva()
    {
        return vivo;
    }
    
    public void setMorte()
    {
        vivo = false;
        if(localizacao != null) {
            campo.limpa(localizacao);
            localizacao = null;
            campo = null;
        }
    }
    
    public Localizacao getLocalizacao()
    {
        return localizacao;
    }
    
    private void setLocalizacao(Localizacao newLocalizacao)
    {
        if(localizacao != null) {
            campo.limpa(localizacao);
        }
        localizacao = newLocalizacao;
        campo.lugar(this, newLocalizacao);
    }

    private void incrementaIdade()
    {
        idade++;
        if(idade > IDADE_MAXIMA) {
        	idade--;
        }
    }
    
    private void daALuz(List<Ovelha> novasOvelhas)
    {
        List<Localizacao> livre = campo.localizacoesAdjacentesLivres(localizacao);
        int nascimentos = procria();
        for(int b = 0; b < nascimentos; b++) {
            Localizacao loc = livre.remove(0);
            Ovelha jovem = new Ovelha(false, campo, loc);
            novasOvelhas.add(jovem);
        }
    }
    
    private int procria()
    {
        int nascimentos = 0;
        if(podeProcriar() && rand.nextDouble() == PROBABILIDADE_PROCRIACAO) {
            nascimentos = rand.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;
        }
        return nascimentos;
    }

    private boolean podeProcriar()
    {
        return idade >= IDADE_PROCRIACAO;
    }
}
