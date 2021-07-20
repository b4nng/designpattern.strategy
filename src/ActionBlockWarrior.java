public class ActionBlockWarrior implements Action{
    @Override
    public Entidade act(Entidade target) {
        target.setVida((float) (target.getVida() - 5));
        return target;
    }
}
