package fr.unice.polytech.isa.tcf;

import javax.ejb.Local;

@Local
public interface AddMoney {

    void addMoney(String name,int money);
}

