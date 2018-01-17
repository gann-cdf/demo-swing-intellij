public class Controller {
    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;

        view = new View(this);
        view.setA(model.getA());
        view.setB(model.getB());
    }

    public void handleRedCondition() {
        model.addAtoB();
        view.setB(model.getB());
    }

    public void handleBlueCondition() {
        model.multiplyAbyB();
        view.setA(model.getA());
    }

    public View getView() {
        return view;
    }
}
