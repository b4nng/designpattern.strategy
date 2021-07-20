public class Skills {
    private Entidade entidade;

    public Skills(Entidade entidade){
        this.entidade = entidade;
    }

    public Entidade act(Action action){
        return action.act(entidade);
    }
}
