package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean Antesum generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2007-08-14
 *         Time: 18:08:14
 *         Form Name: Antenatal Hospitalization Summary
 *         Form Id: 63
 */

/**
 * @hibernate.joined-subclass table="antesum"
 * @hibernate.joined-subclass-key column="id"
 */
public class Antesum extends EncounterData {

private Date field1268;	//date_of_discharge_1268
private Integer field1269;	//hospital_ward_1269
private Boolean field1270;	//anaemia
private Integer field1319;	//anaemia_measurement
private Boolean field1273;	//cardiac_disease
private Boolean field1271;	//diabetes_gestational
private Boolean field1272;	//diabetes_pregestational
private Boolean field1274;	//dysentary
private Boolean field1275;	//epilepsy
private Boolean field1276;	//gastroenteritis
private Boolean field1297;	//hemoglobinopathy_sickle
private Boolean field1320;	//hemoglobinopathy_thallasemia
private Boolean field1321;	//hepatitis
private Boolean field1323;	//malaria_suspected
private Boolean field1769;	//missed_abortion
private Boolean field1324;	//polyarthritis
private Boolean field1326;	//psychosis
private Boolean field1325;	//tuberculosis
private Boolean field1628;	//preterm_labour
private Boolean field1629;	//prom
private Boolean field1630;	//breech_presentation
private Byte field1754;	//aph
private Boolean field1632;	//uti
private Boolean field1621;	//antepartum_hemhorrhage
private Boolean field1622;	//draining
private Boolean field1623;	//malpresentations
private Boolean field1624;	//previous_c_s
private Boolean field1625;	//wrong_dates
private Integer field1627;	//Hypertensive_disorders
private Integer field932;	//miscarriage
private String field1359;	//diag_other
private Integer field1136;	//drug_1_1136
private Integer field1137;	//drug_2_1137
private Integer field1138;	//drug_3_1138
private Integer field1139;	//drug_4_1139
private Integer field1140;	//drug_5_1140
private Integer field1141;	//drug_6_1141
private Integer field1142;	//drug_7_1142
private Integer field1143;	//drug_8_1143
private Integer field1144;	//drug_9_1144
private Integer field1145;	//drug_10_1145
private String field1284;	//med_treatments_other_desc
private Boolean field1285;	//mva
private Boolean field1286;	//dilatation_and_curettage
private Boolean field1287;	//laparotomy
private Boolean field1288;	//hysterectomy
private Boolean field1289;	//salpingostomy
private Boolean field1633;	//cervical_suture
private String field1291;	//surg_treat_other_desc
private String field1292;	//medications_discharge
private Float field266;	//temperature_266
private Integer field171;	//pulse_171
private Integer field167;	//respiratory_system_167
private String field1449;	//respiratory_system_other
private Integer field269;	//respiration_rate_269
private Integer field224;	//bp_systolic_224
private Integer field225;	//bp_diastolic_225
private Date field1293;	//scheduled_followup_1293
private String field1213;	//place_of_next_visit_1213
private Integer field1911;	//referring_encounter_id


 /**
  * @return
  * @hibernate.property column="date_of_discharge_1268"
  */
    public Date getField1268() {
        return this.field1268;
    }

    public void setField1268(Date field1268) {
        this.field1268 = field1268;
    }





 /**
  * @return
  * @hibernate.property column="hospital_ward_1269"
  */
    public Integer getField1269() {
        return this.field1269;
    }

    public void setField1269(Integer field1269) {
        this.field1269 = field1269;
    }





 /**
  * @return
  * @hibernate.property column="anaemia"
  */
    public Boolean getField1270() {
        return this.field1270;
    }

    public void setField1270(Boolean field1270) {
        this.field1270 = field1270;
    }





 /**
  * @return
  * @hibernate.property column="anaemia_measurement"
  */
    public Integer getField1319() {
        return this.field1319;
    }

    public void setField1319(Integer field1319) {
        this.field1319 = field1319;
    }





 /**
  * @return
  * @hibernate.property column="cardiac_disease"
  */
    public Boolean getField1273() {
        return this.field1273;
    }

    public void setField1273(Boolean field1273) {
        this.field1273 = field1273;
    }





 /**
  * @return
  * @hibernate.property column="diabetes_gestational"
  */
    public Boolean getField1271() {
        return this.field1271;
    }

    public void setField1271(Boolean field1271) {
        this.field1271 = field1271;
    }





 /**
  * @return
  * @hibernate.property column="diabetes_pregestational"
  */
    public Boolean getField1272() {
        return this.field1272;
    }

    public void setField1272(Boolean field1272) {
        this.field1272 = field1272;
    }





 /**
  * @return
  * @hibernate.property column="dysentary"
  */
    public Boolean getField1274() {
        return this.field1274;
    }

    public void setField1274(Boolean field1274) {
        this.field1274 = field1274;
    }





 /**
  * @return
  * @hibernate.property column="epilepsy"
  */
    public Boolean getField1275() {
        return this.field1275;
    }

    public void setField1275(Boolean field1275) {
        this.field1275 = field1275;
    }





 /**
  * @return
  * @hibernate.property column="gastroenteritis"
  */
    public Boolean getField1276() {
        return this.field1276;
    }

    public void setField1276(Boolean field1276) {
        this.field1276 = field1276;
    }





 /**
  * @return
  * @hibernate.property column="hemoglobinopathy_sickle"
  */
    public Boolean getField1297() {
        return this.field1297;
    }

    public void setField1297(Boolean field1297) {
        this.field1297 = field1297;
    }





 /**
  * @return
  * @hibernate.property column="hemoglobinopathy_thallasemia"
  */
    public Boolean getField1320() {
        return this.field1320;
    }

    public void setField1320(Boolean field1320) {
        this.field1320 = field1320;
    }





 /**
  * @return
  * @hibernate.property column="hepatitis"
  */
    public Boolean getField1321() {
        return this.field1321;
    }

    public void setField1321(Boolean field1321) {
        this.field1321 = field1321;
    }





 /**
  * @return
  * @hibernate.property column="malaria_suspected"
  */
    public Boolean getField1323() {
        return this.field1323;
    }

    public void setField1323(Boolean field1323) {
        this.field1323 = field1323;
    }





 /**
  * @return
  * @hibernate.property column="missed_abortion"
  */
    public Boolean getField1769() {
        return this.field1769;
    }

    public void setField1769(Boolean field1769) {
        this.field1769 = field1769;
    }





 /**
  * @return
  * @hibernate.property column="polyarthritis"
  */
    public Boolean getField1324() {
        return this.field1324;
    }

    public void setField1324(Boolean field1324) {
        this.field1324 = field1324;
    }





 /**
  * @return
  * @hibernate.property column="psychosis"
  */
    public Boolean getField1326() {
        return this.field1326;
    }

    public void setField1326(Boolean field1326) {
        this.field1326 = field1326;
    }





 /**
  * @return
  * @hibernate.property column="tuberculosis"
  */
    public Boolean getField1325() {
        return this.field1325;
    }

    public void setField1325(Boolean field1325) {
        this.field1325 = field1325;
    }





 /**
  * @return
  * @hibernate.property column="preterm_labour"
  */
    public Boolean getField1628() {
        return this.field1628;
    }

    public void setField1628(Boolean field1628) {
        this.field1628 = field1628;
    }





 /**
  * @return
  * @hibernate.property column="prom"
  */
    public Boolean getField1629() {
        return this.field1629;
    }

    public void setField1629(Boolean field1629) {
        this.field1629 = field1629;
    }





 /**
  * @return
  * @hibernate.property column="breech_presentation"
  */
    public Boolean getField1630() {
        return this.field1630;
    }

    public void setField1630(Boolean field1630) {
        this.field1630 = field1630;
    }





 /**
  * @return
  * @hibernate.property column="aph"
  */
    public Byte getField1754() {
        return this.field1754;
    }

    public void setField1754(Byte field1754) {
        this.field1754 = field1754;
    }





 /**
  * @return
  * @hibernate.property column="uti"
  */
    public Boolean getField1632() {
        return this.field1632;
    }

    public void setField1632(Boolean field1632) {
        this.field1632 = field1632;
    }





 /**
  * @return
  * @hibernate.property column="antepartum_hemhorrhage"
  */
    public Boolean getField1621() {
        return this.field1621;
    }

    public void setField1621(Boolean field1621) {
        this.field1621 = field1621;
    }





 /**
  * @return
  * @hibernate.property column="draining"
  */
    public Boolean getField1622() {
        return this.field1622;
    }

    public void setField1622(Boolean field1622) {
        this.field1622 = field1622;
    }





 /**
  * @return
  * @hibernate.property column="malpresentations"
  */
    public Boolean getField1623() {
        return this.field1623;
    }

    public void setField1623(Boolean field1623) {
        this.field1623 = field1623;
    }





 /**
  * @return
  * @hibernate.property column="previous_c_s"
  */
    public Boolean getField1624() {
        return this.field1624;
    }

    public void setField1624(Boolean field1624) {
        this.field1624 = field1624;
    }





 /**
  * @return
  * @hibernate.property column="wrong_dates"
  */
    public Boolean getField1625() {
        return this.field1625;
    }

    public void setField1625(Boolean field1625) {
        this.field1625 = field1625;
    }





 /**
  * @return
  * @hibernate.property column="Hypertensive_disorders"
  */
    public Integer getField1627() {
        return this.field1627;
    }

    public void setField1627(Integer field1627) {
        this.field1627 = field1627;
    }





 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getField932() {
        return this.field932;
    }

    public void setField932(Integer field932) {
        this.field932 = field932;
    }





 /**
  * @return
  * @hibernate.property column="diag_other" type="text"
  */
    public String getField1359() {
        return this.field1359;
    }

    public void setField1359(String field1359) {
        this.field1359 = field1359;
    }





 /**
  * @return
  * @hibernate.property column="drug_1_1136"
  */
    public Integer getField1136() {
        return this.field1136;
    }

    public void setField1136(Integer field1136) {
        this.field1136 = field1136;
    }





 /**
  * @return
  * @hibernate.property column="drug_2_1137"
  */
    public Integer getField1137() {
        return this.field1137;
    }

    public void setField1137(Integer field1137) {
        this.field1137 = field1137;
    }





 /**
  * @return
  * @hibernate.property column="drug_3_1138"
  */
    public Integer getField1138() {
        return this.field1138;
    }

    public void setField1138(Integer field1138) {
        this.field1138 = field1138;
    }





 /**
  * @return
  * @hibernate.property column="drug_4_1139"
  */
    public Integer getField1139() {
        return this.field1139;
    }

    public void setField1139(Integer field1139) {
        this.field1139 = field1139;
    }





 /**
  * @return
  * @hibernate.property column="drug_5_1140"
  */
    public Integer getField1140() {
        return this.field1140;
    }

    public void setField1140(Integer field1140) {
        this.field1140 = field1140;
    }





 /**
  * @return
  * @hibernate.property column="drug_6_1141"
  */
    public Integer getField1141() {
        return this.field1141;
    }

    public void setField1141(Integer field1141) {
        this.field1141 = field1141;
    }





 /**
  * @return
  * @hibernate.property column="drug_7_1142"
  */
    public Integer getField1142() {
        return this.field1142;
    }

    public void setField1142(Integer field1142) {
        this.field1142 = field1142;
    }





 /**
  * @return
  * @hibernate.property column="drug_8_1143"
  */
    public Integer getField1143() {
        return this.field1143;
    }

    public void setField1143(Integer field1143) {
        this.field1143 = field1143;
    }





 /**
  * @return
  * @hibernate.property column="drug_9_1144"
  */
    public Integer getField1144() {
        return this.field1144;
    }

    public void setField1144(Integer field1144) {
        this.field1144 = field1144;
    }





 /**
  * @return
  * @hibernate.property column="drug_10_1145"
  */
    public Integer getField1145() {
        return this.field1145;
    }

    public void setField1145(Integer field1145) {
        this.field1145 = field1145;
    }





 /**
  * @return
  * @hibernate.property column="med_treatments_other_desc" type="text"
  */
    public String getField1284() {
        return this.field1284;
    }

    public void setField1284(String field1284) {
        this.field1284 = field1284;
    }





 /**
  * @return
  * @hibernate.property column="mva"
  */
    public Boolean getField1285() {
        return this.field1285;
    }

    public void setField1285(Boolean field1285) {
        this.field1285 = field1285;
    }





 /**
  * @return
  * @hibernate.property column="dilatation_and_curettage"
  */
    public Boolean getField1286() {
        return this.field1286;
    }

    public void setField1286(Boolean field1286) {
        this.field1286 = field1286;
    }





 /**
  * @return
  * @hibernate.property column="laparotomy"
  */
    public Boolean getField1287() {
        return this.field1287;
    }

    public void setField1287(Boolean field1287) {
        this.field1287 = field1287;
    }





 /**
  * @return
  * @hibernate.property column="hysterectomy"
  */
    public Boolean getField1288() {
        return this.field1288;
    }

    public void setField1288(Boolean field1288) {
        this.field1288 = field1288;
    }





 /**
  * @return
  * @hibernate.property column="salpingostomy"
  */
    public Boolean getField1289() {
        return this.field1289;
    }

    public void setField1289(Boolean field1289) {
        this.field1289 = field1289;
    }





 /**
  * @return
  * @hibernate.property column="cervical_suture"
  */
    public Boolean getField1633() {
        return this.field1633;
    }

    public void setField1633(Boolean field1633) {
        this.field1633 = field1633;
    }





 /**
  * @return
  * @hibernate.property column="surg_treat_other_desc" type="text"
  */
    public String getField1291() {
        return this.field1291;
    }

    public void setField1291(String field1291) {
        this.field1291 = field1291;
    }





 /**
  * @return
  * @hibernate.property column="medications_discharge" type="text"
  */
    public String getField1292() {
        return this.field1292;
    }

    public void setField1292(String field1292) {
        this.field1292 = field1292;
    }





 /**
  * @return
  * @hibernate.property column="temperature_266"
  */
    public Float getField266() {
        return this.field266;
    }

    public void setField266(Float field266) {
        this.field266 = field266;
    }





 /**
  * @return
  * @hibernate.property column="pulse_171"
  */
    public Integer getField171() {
        return this.field171;
    }

    public void setField171(Integer field171) {
        this.field171 = field171;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_system_167"
  */
    public Integer getField167() {
        return this.field167;
    }

    public void setField167(Integer field167) {
        this.field167 = field167;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_system_other" type="text"
  */
    public String getField1449() {
        return this.field1449;
    }

    public void setField1449(String field1449) {
        this.field1449 = field1449;
    }





 /**
  * @return
  * @hibernate.property column="respiration_rate_269"
  */
    public Integer getField269() {
        return this.field269;
    }

    public void setField269(Integer field269) {
        this.field269 = field269;
    }





 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getField224() {
        return this.field224;
    }

    public void setField224(Integer field224) {
        this.field224 = field224;
    }





 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getField225() {
        return this.field225;
    }

    public void setField225(Integer field225) {
        this.field225 = field225;
    }





 /**
  * @return
  * @hibernate.property column="scheduled_followup_1293"
  */
    public Date getField1293() {
        return this.field1293;
    }

    public void setField1293(Date field1293) {
        this.field1293 = field1293;
    }





 /**
  * @return
  * @hibernate.property column="place_of_next_visit_1213"
  */
    public String getField1213() {
        return this.field1213;
    }

    public void setField1213(String field1213) {
        this.field1213 = field1213;
    }





 /**
  * @return
  * @hibernate.property column="referring_encounter_id"
  */
    public Integer getField1911() {
        return this.field1911;
    }

    public void setField1911(Integer field1911) {
        this.field1911 = field1911;
    }





}