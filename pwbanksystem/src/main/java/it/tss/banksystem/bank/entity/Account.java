/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.banksystem.bank.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author scian
 */
@Entity
@Table(name = "account")
public class Account extends AbstractEntity implements Serializable {

    private Double balance;
    @Column(name = "over_draft")
    private Long overDraft;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Account() {
    }

    public Account(Double balance, Long overDraft, User user) {
        this.balance = balance;
        this.overDraft = overDraft;
        this.user = user;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(Long credit) {
        this.overDraft = credit;
    }

}
