public class PlayerWarrior {
    Entidade warrior;
    public double getVida(){
        return warrior.getVida();
    }

    public PlayerWarrior(double vida){
        this.warrior = new Entidade(vida);
    }

    public void atacar(Entidade target){
        Skills skills = new Skills(target);
        skills.act(new ActionAttackWarrior());
    }

    public void block(){
        Skills skills = new Skills(warrior);
        skills.act(new ActionBlockWarrior());
    }
}
