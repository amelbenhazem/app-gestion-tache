package Models;

import java.util.Objects;

public class Department {
    private int id_department;
    private String name_department;
    private String Responsable_department;

    public Department(int id_department, String name_department, String responsable_department) {
        this.id_department = id_department;
        this.name_department = name_department;
        Responsable_department = responsable_department;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    public String getName_department() {
        return name_department;
    }

    public void setName_department(String name_department) {
        this.name_department = name_department;
    }

    public String getResponsable_department() {
        return Responsable_department;
    }

    public void setResponsable_department(String responsable_department) {
        Responsable_department = responsable_department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id_department=" + id_department +
                ", name_department='" + name_department + '\'' +
                ", Responsable_department='" + Responsable_department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id_department == that.id_department && Objects.equals(name_department, that.name_department) && Objects.equals(Responsable_department, that.Responsable_department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_department, name_department, Responsable_department);
    }
}
