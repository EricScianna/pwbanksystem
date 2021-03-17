/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.banksystem.bank.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author scian
 */
@Entity
@Table(name = "transaction")
public class Transaction extends AbstractEntity implements Serializable {

    public enum Type {
        DEPOSIT, WITHDRAWAL, TRANSFER
    }
    @Enumerated(EnumType.STRING)
    private Type type;

    private Double amount;

    @ManyToOne(optional = false)
    private Account account;

    @ManyToOne
    private Account src;

    @ManyToOne
    private Account dest;

    @Column(length = 2048)
    private String note;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Account getSrc() {
        return src;
    }

    public void setSrc(Account src) {
        this.src = src;
    }

    public Account getDest() {
        return dest;
    }

    public void setDest(Account dest) {
        this.dest = dest;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
