import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;

public class Simulador
{
    private static final int LARGURA_PADRAO = 50;
    private static final int PROFUNDIDADE_PADRAO = 50;
    private static final double PROBABILIDADE_CRIACAO_LOBOGUARA = 0.02;
    private static final double PROBABILIDADE_CRIACAO_OVELHA = 0.28;    

    private List<Ovelha> ovelhas;
    private List<LoboGuara> lobos;
    private Campo campo;
    private int etapa;
    private SimuladorTela tela;
    
    public Simulador()
    {
        this(PROFUNDIDADE_PADRAO, LARGURA_PADRAO);
    }
    
    public Simulador(int profundidade, int largura)
    {
        if(largura < 0 || profundidade < 0) {
            System.out.println("As dimensões devem ser maior do que zero.");
            System.out.println("Usando valores padrões.");
            profundidade = PROFUNDIDADE_PADRAO;
            largura = LARGURA_PADRAO;
        }
        
        ovelhas = new ArrayList<Ovelha>();
        lobos = new ArrayList<LoboGuara>();
        campo = new Campo(profundidade, largura);

        tela = new SimuladorTela(profundidade, largura);
        tela.setCor(Ovelha.class, Color.orange);
        tela.setCor(LoboGuara.class, Color.blue);
        
        redefine();
    }

    public void executaLongaSimulacao()
    {
        simulacao(500);
    }
    
    public void simulacao(int numEtapas)
    {
        for(int etapa = 1; etapa <= numEtapas && tela.ehViavel(campo); etapa++) {
            simulacaoUmaEtapa();
        }
    }

    public void simulacaoUmaEtapa()
    {
        List<Ovelha> novasOvelhas = new ArrayList<Ovelha>();        
        for(Iterator<Ovelha> it = ovelhas.iterator(); it.hasNext(); ) {
            Ovelha ovelha = it.next();
            ovelha.corre(novasOvelhas);
            if(ovelha.estaViva()) {
                it.remove();
            }
        }
        
        List<LoboGuara> novosLobos = new ArrayList<LoboGuara>();        
        for(Iterator<LoboGuara> it = lobos.iterator(); it.hasNext(); ) {
            LoboGuara loboGuara = it.next();
            loboGuara.caca(novosLobos);
            if(loboGuara.estaVivo()) {
                it.remove();
            }
        }
        
        ovelhas.addAll(novasOvelhas);
        lobos.addAll(novosLobos);

        tela.mostraStatus(etapa, campo);
    }
    
    public void redefine()
    {
        etapa = 0;
        ovelhas.clear();
        lobos.clear();
        povoa();
        
        tela.mostraStatus(etapa, campo);
    }
    
    private void povoa()
    {
        Random rand = Randomizador.getRandom();
        campo.limpa();
        for(int linha = 0; linha < campo.getProfundidade(); linha++) {
            for(int coluna = 0; coluna < campo.getLargura(); coluna++) {
                if(rand.nextDouble() < PROBABILIDADE_CRIACAO_OVELHA) {
                    Localizacao localizacao = new Localizacao(linha, coluna);
                    LoboGuara loboGuara = new LoboGuara(false, campo, localizacao);
                    lobos.add(loboGuara);
                }
                else if(rand.nextDouble() < PROBABILIDADE_CRIACAO_LOBOGUARA) {
                    Localizacao localizacao = new Localizacao(linha, coluna);
                    Ovelha ovelha = new Ovelha(false, campo, localizacao);
                    ovelhas.add(ovelha);
                }
            }
        }
    }
}