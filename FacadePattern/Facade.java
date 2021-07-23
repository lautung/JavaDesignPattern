package FacadePattern;

public class Facade {
    private SubSystem01 subSystem01 = new SubSystem01();
    private SubSystem02 subSystem02 = new SubSystem02();
    private SubSystem03 subSystem03 = new SubSystem03();

    public void show() {
        subSystem01.show();
        subSystem02.show();
        subSystem03.show();
    }
}
