package Entities;

import java.util.Objects;

public class Affectation_MembreDep {
    private int id_affectation;
    private int id_membre;
    private int id_depertment;

    public Affectation_MembreDep(int id_affectation, int id_membre, int id_depertment) {
        this.id_affectation = id_affectation;
        this.id_membre = id_membre;
        this.id_depertment = id_depertment;
    }

    public int getId_affectation() {
        return id_affectation;
    }

    public void setId_affectation(int id_affectation) {
        this.id_affectation = id_affectation;
    }

    public int getId_membre() {
        return id_membre;
    }

    public void setId_membre(int id_membre) {
        this.id_membre = id_membre;
    }

    public int getId_depertment() {
        return id_depertment;
    }

    public void setId_depertment(int id_depertment) {
        this.id_depertment = id_depertment;
    }

    @Override
    public String toString() {
        return "Affectation_MembreDep{" +
                "id_affectation=" + id_affectation +
                ", id_membre=" + id_membre +
                ", id_depertment=" + id_depertment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affectation_MembreDep that = (Affectation_MembreDep) o;
        return id_affectation == that.id_affectation && id_membre == that.id_membre && id_depertment == that.id_depertment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_affectation, id_membre, id_depertment);
    }
}
