package com.nava.maasar.maasarDao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author j713n
 */
@Entity
@Table(name="Offering")
public class Offering implements Serializable {
    
    @Id
    private String offering_date;
    private String wednesday_offering;
    private String friday_offering;
    private String sundaySchool_offering;
    private String sundayService_offering;
    private String other_amount;

    public String getOffering_date() {
        return offering_date;
    }

    public void setOffering_date(String offering_date) {
        this.offering_date = offering_date;
    }

    public String getWednesday_offering() {
        return wednesday_offering;
    }

    public void setWednesday_offering(String wednesday_offering) {
        this.wednesday_offering = wednesday_offering;
    }

    public String getFriday_offering() {
        return friday_offering;
    }

    public void setFriday_offering(String friday_offering) {
        this.friday_offering = friday_offering;
    }

    public String getSundaySchool_offering() {
        return sundaySchool_offering;
    }

    public void setSundaySchool_offering(String sundaySchool_offering) {
        this.sundaySchool_offering = sundaySchool_offering;
    }

    public String getSundayService_offering() {
        return sundayService_offering;
    }

    public void setSundayService_offering(String sundayService_offering) {
        this.sundayService_offering = sundayService_offering;
    }

    public String getOther_amount() {
        return other_amount;
    }

    public void setOther_amount(String other_amount) {
        this.other_amount = other_amount;
    }
    
    
    
}
