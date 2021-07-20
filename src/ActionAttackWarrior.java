public class ActionAttackWarrior implements Action{

    @Override
    public Entidade act(Entidade target) {
        target.setVida((float) (target.getVida() - 10));
        return target;
    }
}
