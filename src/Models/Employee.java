package Models;

import Enums.Role;

public class Employee {
    private String name;
    private Role role;
    private String hiringDate;

    public Employee() {}

    public Employee(String name, Role role, String hiringDate) {
        this.name = name;
        this.role = role;
        this.hiringDate = hiringDate;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public String getHiringDate() {
        return hiringDate;
    }

}
