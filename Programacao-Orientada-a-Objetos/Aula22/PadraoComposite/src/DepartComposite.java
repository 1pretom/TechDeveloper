
public class DepartComposite implements Departmento {
    private int id;
    private String name;

    private List<Departmento> childDepartments;

    public DepartComposite(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void getName() {
        childDepartments.forEach(Departmento::getName);
    }

    public void addDepart(Departmento department) {
        childDepartments.add(department);
    }

    public void removeDepart(Departmento department) {
        childDepartments.remove(department);
    }
}

