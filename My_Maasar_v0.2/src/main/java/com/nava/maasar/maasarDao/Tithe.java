package com.nava.maasar.maasarDao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author j713n
 */
@Entity
@Table(name="Tithe")
public class Tithe implements Serializable {
    
    @Id
    @Column(name="member_id")
    private int titheEntry_Number;
    private String titheDate;
    private String first_name;
    private String last_name;
    private double tithe_amount;
    private double offering_amount;
    private double proTemple_amount;
    private double cash_amount;
    private double creditOrDebit_amount;
    private double check_amount;
    private double other_amount;

    public int getTitheEntry_Number() {
        return titheEntry_Number;
    }

    public void setTitheEntry_Number(int titheEntry_Number) {
        this.titheEntry_Number = titheEntry_Number;
    }

    public String getTitheDate() {
        return titheDate;
    }

    public void setTitheDate(String titheDate) {
        this.titheDate = titheDate;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getTithe_amount() {
        return tithe_amount;
    }

    public void setTithe_amount(double tithe_amount) {
        this.tithe_amount = tithe_amount;
    }

    public double getOffering_amount() {
        return offering_amount;
    }

    public void setOffering_amount(double offering_amount) {
        this.offering_amount = offering_amount;
    }

    public double getProTemple_amount() {
        return proTemple_amount;
    }

    public void setProTemple_amount(double proTemple_amount) {
        this.proTemple_amount = proTemple_amount;
    }

    public double getCash_amount() {
        return cash_amount;
    }

    public void setCash_amount(double cash_amount) {
        this.cash_amount = cash_amount;
    }

    public double getCreditOrDebit_amount() {
        return creditOrDebit_amount;
    }

    public void setCreditOrDebit_amount(double creditOrDebit_amount) {
        this.creditOrDebit_amount = creditOrDebit_amount;
    }

    public double getCheck_amount() {
        return check_amount;
    }

    public void setCheck_amount(double check_amount) {
        this.check_amount = check_amount;
    }

    public double getOther_amount() {
        return other_amount;
    }

    public void setOther_amount(double other_amount) {
        this.other_amount = other_amount;
    }
    
    public Tithe(){
        //default constructor
    }
    
    public Tithe(int member_id, String first_name, String last_name) {
        setTitheEntry_Number(member_id);
        setFirst_name(first_name);
        setLast_name(last_name);
    }
    
    public void printInfo() {
        System.out.println("First Name: " + getFirst_name() + "\nLast Name: " + getLast_name() + 
                "\nTithe Amt: " + getTithe_amount() + "\nOffering Amt: " + getOffering_amount() +
                "\nPro Temple Amt: " + getProTemple_amount() + "\nCash Amt: " + getCash_amount() +
                "\nCredit or Debit Amt: " + getCreditOrDebit_amount() + "\nCheck Amt: " + getCheck_amount() +
                "\nOther Amt: " + getOther_amount());
    }
    
    /*
    To add values into Tithe table in database
    */
    public String insertStatement() {
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("INSERT INTO tithe (first_name,last_name,cash_amount,creditOrDebit_amount," + 
                "check_amount,tithe_amount,offering_amount,proTemple_amount,other_amount) VALUES ('");
		strBuffer.append(getFirst_name());
		strBuffer.append("','");
                strBuffer.append(getLast_name());
		strBuffer.append("',");
		strBuffer.append(getCash_amount());
		strBuffer.append(",");
		strBuffer.append(getCreditOrDebit_amount());
		strBuffer.append(",");
		strBuffer.append(getCheck_amount());
		strBuffer.append(",");
		strBuffer.append(getTithe_amount());
		strBuffer.append(",");
                strBuffer.append(getOffering_amount());
		strBuffer.append(",");
                strBuffer.append(getProTemple_amount());
		strBuffer.append(",");
		strBuffer.append(getOther_amount());
		strBuffer.append(")");
                
        String insert = strBuffer.toString();
        
        return insert;
        
    }
    
}
