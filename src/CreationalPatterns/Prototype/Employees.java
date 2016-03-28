package CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple Prototype design pattern
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {

        //read all employees from database and put into the list
        empList.add("Ranj");
        empList.add("dsfsd");
        empList.add("sdfsdafsdaf");
        empList.add("sadfsafas");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }

    public static void main(String... str) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();
        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");
    }
}
