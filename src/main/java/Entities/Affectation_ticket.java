package Entities;

import java.util.Objects;

public class Affectation_ticket
{
    private int id_affectation_ticket;
    private int id_ticket;
    private int id_member;

    public Affectation_ticket(int id_affectation_ticket, int id_ticket, int id_member) {
        this.id_affectation_ticket = id_affectation_ticket;
        this.id_ticket = id_ticket;
        this.id_member = id_member;
    }

    public int getId_affectation_ticket() {
        return id_affectation_ticket;
    }

    public void setId_affectation_ticket(int id_affectation_ticket) {
        this.id_affectation_ticket = id_affectation_ticket;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getId_member() {
        return id_member;
    }

    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    @Override
    public String toString() {
        return "Affectation_ticket{" +
                "id_affectation_ticket=" + id_affectation_ticket +
                ", id_ticket=" + id_ticket +
                ", id_member=" + id_member +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affectation_ticket that = (Affectation_ticket) o;
        return id_affectation_ticket == that.id_affectation_ticket && id_ticket == that.id_ticket && id_member == that.id_member;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_affectation_ticket, id_ticket, id_member);
    }
}
