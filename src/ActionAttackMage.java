public class ActionAttackMage implements Action{
    @Override
    public Entidade act(Entidade target) {
        target.setVida((float) (target.getVida() - 20));
        return target;
    }
}
