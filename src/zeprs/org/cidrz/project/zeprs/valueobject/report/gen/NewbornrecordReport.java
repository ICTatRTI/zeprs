package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean NewbornrecordReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2007-08-14
 *         Time: 18:08:24
 *         Form Name: Newborn Record Subform
 *         Form Id: 109
 */

/**
 * @hibernate.joined-subclass table="newbornrecord"
 * @hibernate.joined-subclass-key column="id"
 */
public class NewbornrecordReport extends EncounterData {

private transient Date date_of_birth;	//date_of_birth
private String date_of_birthR;
private transient Time time_of_birth_1514;	//time_of_birth_1514
private String time_of_birth_1514R;
private transient Integer sequence_num_489;	//sequence_num_489
private String sequence_num_489R;
private transient Integer sex_490;	//sex_490
private String sex_490R;
private transient Float weight_at_birth_491;	//weight_at_birth_491
private String weight_at_birth_491R;
private transient Integer ega_weeks;	//ega_weeks
private String ega_weeksR;


 /**
  * @return
  * @hibernate.property column="date_of_birth"
  */
    public Date getDate_of_birth() {
        return this.date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }



    public String getDate_of_birthR() {
        return this.date_of_birthR;
    }

    public void setDate_of_birthR(String date_of_birthR) {
        this.date_of_birthR = date_of_birthR;
    }



 /**
  * @return
  * @hibernate.property column="time_of_birth_1514"
  */
    public Time getTime_of_birth_1514() {
        return this.time_of_birth_1514;
    }

    public void setTime_of_birth_1514(Time time_of_birth_1514) {
        this.time_of_birth_1514 = time_of_birth_1514;
    }



    public String getTime_of_birth_1514R() {
        return this.time_of_birth_1514R;
    }

    public void setTime_of_birth_1514R(String time_of_birth_1514R) {
        this.time_of_birth_1514R = time_of_birth_1514R;
    }



 /**
  * @return
  * @hibernate.property column="sequence_num_489"
  */
    public Integer getSequence_num_489() {
        return this.sequence_num_489;
    }

    public void setSequence_num_489(Integer sequence_num_489) {
        this.sequence_num_489 = sequence_num_489;
    }



    public String getSequence_num_489R() {
        return this.sequence_num_489R;
    }

    public void setSequence_num_489R(String sequence_num_489R) {
        this.sequence_num_489R = sequence_num_489R;
    }



 /**
  * @return
  * @hibernate.property column="sex_490"
  */
    public Integer getSex_490() {
        return this.sex_490;
    }

    public void setSex_490(Integer sex_490) {
        this.sex_490 = sex_490;
    }



    public String getSex_490R() {
        return this.sex_490R;
    }

    public void setSex_490R(String sex_490R) {
        this.sex_490R = sex_490R;
    }



 /**
  * @return
  * @hibernate.property column="weight_at_birth_491"
  */
    public Float getWeight_at_birth_491() {
        return this.weight_at_birth_491;
    }

    public void setWeight_at_birth_491(Float weight_at_birth_491) {
        this.weight_at_birth_491 = weight_at_birth_491;
    }



    public String getWeight_at_birth_491R() {
        return this.weight_at_birth_491R;
    }

    public void setWeight_at_birth_491R(String weight_at_birth_491R) {
        this.weight_at_birth_491R = weight_at_birth_491R;
    }



 /**
  * @return
  * @hibernate.property column="ega_weeks"
  */
    public Integer getEga_weeks() {
        return this.ega_weeks;
    }

    public void setEga_weeks(Integer ega_weeks) {
        this.ega_weeks = ega_weeks;
    }



    public String getEga_weeksR() {
        return this.ega_weeksR;
    }

    public void setEga_weeksR(String ega_weeksR) {
        this.ega_weeksR = ega_weeksR;
    }



}