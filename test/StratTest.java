import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StratTest {
    @Test
    public void deveRetornar195(){
        PlayerWarrior playerWarrior = new PlayerWarrior(200);
        Entidade alvo = new Entidade(1000);
        playerWarrior.block();
        Assertions.assertEquals(195, playerWarrior.getVida());
    }

    @Test
    public void deveRetornar200(){
        PlayerWarrior playerWarrior = new PlayerWarrior(200);
        Entidade alvo = new Entidade(210);
        playerWarrior.atacar(alvo);
        Assertions.assertEquals(200, alvo.getVida());
    }
}
