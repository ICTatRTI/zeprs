package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean PostnatalMaternalVisitReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2007-08-14
 *         Time: 18:08:24
 *         Form Name: Postnatal Maternal Visit
 *         Form Id: 28
 */

/**
 * @hibernate.joined-subclass table="postnatalmaternalvisit"
 * @hibernate.joined-subclass-key column="id"
 */
public class PostnatalMaternalVisitReport extends EncounterData {

private transient Integer postnatal_visit_601;	//postnatal_visit_601
private String postnatal_visit_601R;
private transient Integer day_of_puerperium_611;	//day_of_puerperium_611
private String day_of_puerperium_611R;
private transient Integer pulse_171;	//pulse_171
private String pulse_171R;
private transient Integer bp_systolic_224;	//bp_systolic_224
private String bp_systolic_224R;
private transient Integer bp_diastolic_225;	//bp_diastolic_225
private String bp_diastolic_225R;
private transient Integer hb_235;	//hb_235
private String hb_235R;
private transient Integer urinalysis_240;	//urinalysis_240
private String urinalysis_240R;
private transient Integer urinalysis_alb_242;	//urinalysis_alb_242
private String urinalysis_alb_242R;
private transient Integer urinalysis_glu_243;	//urinalysis_glu_243
private String urinalysis_glu_243R;
private transient Integer urinalysis_ace_244;	//urinalysis_ace_244
private String urinalysis_ace_244R;
private transient Byte anti_d_given_621;	//anti_d_given_621
private String anti_d_given_621R;
private transient String other_complaints_622;	//other_complaints_622
private String other_complaints_622R;
private transient Integer breast_feeding_623;	//breast_feeding_623
private String breast_feeding_623R;
private transient Integer hair_625;	//hair_625
private String hair_625R;
private transient Integer eyes_626;	//eyes_626
private String eyes_626R;
private transient String eyes_other_627;	//eyes_other_627
private String eyes_other_627R;
private transient Integer mouth_628;	//mouth_628
private String mouth_628R;
private transient String mouth_other_1191;	//mouth_other_1191
private String mouth_other_1191R;
private transient Integer teeth_163;	//teeth_163
private String teeth_163R;
private transient String teeth_other_164;	//teeth_other_164
private String teeth_other_164R;
private transient Integer thyroid_165;	//thyroid_165
private String thyroid_165R;
private transient Integer breasts_166;	//breasts_166
private String breasts_166R;
private transient Integer nipples_633;	//nipples_633
private String nipples_633R;
private transient Integer lymphadenopa_1208;	//lymphadenopa_1208
private String lymphadenopa_1208R;
private transient String lymphadenopa_desc_1209;	//lymphadenopa_desc_1209
private String lymphadenopa_desc_1209R;
private transient Integer uterus_187;	//uterus_187
private String uterus_187R;
private transient Integer perineum_580;	//perineum_580
private String perineum_580R;
private transient String perineum_other_1199;	//perineum_other_1199
private String perineum_other_1199R;
private transient String perineum_infect_desc_1198;	//perineum_infect_desc_1198
private String perineum_infect_desc_1198R;
private transient Integer anus_638;	//anus_638
private String anus_638R;
private transient Integer bowels_639;	//bowels_639
private String bowels_639R;
private transient String bowels_abno_640;	//bowels_abno_640
private String bowels_abno_640R;
private transient Integer micturition_641;	//micturition_641
private String micturition_641R;
private transient String micturition_desc_642;	//micturition_desc_642
private String micturition_desc_642R;
private transient Integer wound_643;	//wound_643
private String wound_643R;
private transient String wound_abnor_644;	//wound_abnor_644
private String wound_abnor_644R;
private transient Integer lochia_flow_645;	//lochia_flow_645
private String lochia_flow_645R;
private transient Integer lochia_colou_646;	//lochia_colou_646
private String lochia_colou_646R;
private transient Integer lochia_odor_647;	//lochia_odor_647
private String lochia_odor_647R;
private transient Integer legs_649;	//legs_649
private String legs_649R;
private transient Integer cervix_per_spec_666;	//cervix_per_spec_666
private String cervix_per_spec_666R;
private transient Integer cervix_per_spec_result_667;	//cervix_per_spec_result_667
private String cervix_per_spec_result_667R;
private transient Byte patient_received_arv;	//patient_received_arv
private String patient_received_arvR;
private transient Boolean is_problem;	//is_problem
private String is_problemR;
private transient Byte contraceptive_advice_669;	//contraceptive_advice_669
private String contraceptive_advice_669R;
private transient Byte using_contraception_670;	//using_contraception_670
private String using_contraception_670R;
private transient Integer contraceptive_choice_137;	//contraceptive_choice_137
private String contraceptive_choice_137R;
private transient String contraceptive_other_138;	//contraceptive_other_138
private String contraceptive_other_138R;
private transient Integer education1;	//education1
private String education1R;
private transient Integer education2;	//education2
private String education2R;
private transient Integer education3;	//education3
private String education3R;
private transient Integer education4;	//education4
private String education4R;
private transient Integer education5;	//education5
private String education5R;
private transient Integer education6;	//education6
private String education6R;
private transient Integer education7;	//education7
private String education7R;
private transient String health_educa_discussed_other_674;	//health_educa_discussed_other_674
private String health_educa_discussed_other_674R;
private transient String postnatal_comments;	//postnatal_comments
private String postnatal_commentsR;


 /**
  * @return
  * @hibernate.property column="postnatal_visit_601"
  */
    public Integer getPostnatal_visit_601() {
        return this.postnatal_visit_601;
    }

    public void setPostnatal_visit_601(Integer postnatal_visit_601) {
        this.postnatal_visit_601 = postnatal_visit_601;
    }



    public String getPostnatal_visit_601R() {
        return this.postnatal_visit_601R;
    }

    public void setPostnatal_visit_601R(String postnatal_visit_601R) {
        this.postnatal_visit_601R = postnatal_visit_601R;
    }





    public String getDay_of_puerperium_611R() {
        return this.day_of_puerperium_611R;
    }

    public void setDay_of_puerperium_611R(String day_of_puerperium_611R) {
        this.day_of_puerperium_611R = day_of_puerperium_611R;
    }



 /**
  * @return
  * @hibernate.property column="pulse_171"
  */
    public Integer getPulse_171() {
        return this.pulse_171;
    }

    public void setPulse_171(Integer pulse_171) {
        this.pulse_171 = pulse_171;
    }



    public String getPulse_171R() {
        return this.pulse_171R;
    }

    public void setPulse_171R(String pulse_171R) {
        this.pulse_171R = pulse_171R;
    }



 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getBp_systolic_224() {
        return this.bp_systolic_224;
    }

    public void setBp_systolic_224(Integer bp_systolic_224) {
        this.bp_systolic_224 = bp_systolic_224;
    }



    public String getBp_systolic_224R() {
        return this.bp_systolic_224R;
    }

    public void setBp_systolic_224R(String bp_systolic_224R) {
        this.bp_systolic_224R = bp_systolic_224R;
    }



 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getBp_diastolic_225() {
        return this.bp_diastolic_225;
    }

    public void setBp_diastolic_225(Integer bp_diastolic_225) {
        this.bp_diastolic_225 = bp_diastolic_225;
    }



    public String getBp_diastolic_225R() {
        return this.bp_diastolic_225R;
    }

    public void setBp_diastolic_225R(String bp_diastolic_225R) {
        this.bp_diastolic_225R = bp_diastolic_225R;
    }



 /**
  * @return
  * @hibernate.property column="hb_235"
  */
    public Integer getHb_235() {
        return this.hb_235;
    }

    public void setHb_235(Integer hb_235) {
        this.hb_235 = hb_235;
    }



    public String getHb_235R() {
        return this.hb_235R;
    }

    public void setHb_235R(String hb_235R) {
        this.hb_235R = hb_235R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_240"
  */
    public Integer getUrinalysis_240() {
        return this.urinalysis_240;
    }

    public void setUrinalysis_240(Integer urinalysis_240) {
        this.urinalysis_240 = urinalysis_240;
    }



    public String getUrinalysis_240R() {
        return this.urinalysis_240R;
    }

    public void setUrinalysis_240R(String urinalysis_240R) {
        this.urinalysis_240R = urinalysis_240R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_alb_242"
  */
    public Integer getUrinalysis_alb_242() {
        return this.urinalysis_alb_242;
    }

    public void setUrinalysis_alb_242(Integer urinalysis_alb_242) {
        this.urinalysis_alb_242 = urinalysis_alb_242;
    }



    public String getUrinalysis_alb_242R() {
        return this.urinalysis_alb_242R;
    }

    public void setUrinalysis_alb_242R(String urinalysis_alb_242R) {
        this.urinalysis_alb_242R = urinalysis_alb_242R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_glu_243"
  */
    public Integer getUrinalysis_glu_243() {
        return this.urinalysis_glu_243;
    }

    public void setUrinalysis_glu_243(Integer urinalysis_glu_243) {
        this.urinalysis_glu_243 = urinalysis_glu_243;
    }



    public String getUrinalysis_glu_243R() {
        return this.urinalysis_glu_243R;
    }

    public void setUrinalysis_glu_243R(String urinalysis_glu_243R) {
        this.urinalysis_glu_243R = urinalysis_glu_243R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_ace_244"
  */
    public Integer getUrinalysis_ace_244() {
        return this.urinalysis_ace_244;
    }

    public void setUrinalysis_ace_244(Integer urinalysis_ace_244) {
        this.urinalysis_ace_244 = urinalysis_ace_244;
    }



    public String getUrinalysis_ace_244R() {
        return this.urinalysis_ace_244R;
    }

    public void setUrinalysis_ace_244R(String urinalysis_ace_244R) {
        this.urinalysis_ace_244R = urinalysis_ace_244R;
    }



 /**
  * @return
  * @hibernate.property column="anti_d_given_621"
  */
    public Byte getAnti_d_given_621() {
        return this.anti_d_given_621;
    }

    public void setAnti_d_given_621(Byte anti_d_given_621) {
        this.anti_d_given_621 = anti_d_given_621;
    }



    public String getAnti_d_given_621R() {
        return this.anti_d_given_621R;
    }

    public void setAnti_d_given_621R(String anti_d_given_621R) {
        this.anti_d_given_621R = anti_d_given_621R;
    }



 /**
  * @return
  * @hibernate.property column="other_complaints_622" type="text"
  */
    public String getOther_complaints_622() {
        return this.other_complaints_622;
    }

    public void setOther_complaints_622(String other_complaints_622) {
        this.other_complaints_622 = other_complaints_622;
    }



    public String getOther_complaints_622R() {
        return this.other_complaints_622R;
    }

    public void setOther_complaints_622R(String other_complaints_622R) {
        this.other_complaints_622R = other_complaints_622R;
    }





    public String getBreast_feeding_623R() {
        return this.breast_feeding_623R;
    }

    public void setBreast_feeding_623R(String breast_feeding_623R) {
        this.breast_feeding_623R = breast_feeding_623R;
    }



 /**
  * @return
  * @hibernate.property column="hair_625"
  */
    public Integer getHair_625() {
        return this.hair_625;
    }

    public void setHair_625(Integer hair_625) {
        this.hair_625 = hair_625;
    }



    public String getHair_625R() {
        return this.hair_625R;
    }

    public void setHair_625R(String hair_625R) {
        this.hair_625R = hair_625R;
    }



 /**
  * @return
  * @hibernate.property column="eyes_626"
  */
    public Integer getEyes_626() {
        return this.eyes_626;
    }

    public void setEyes_626(Integer eyes_626) {
        this.eyes_626 = eyes_626;
    }



    public String getEyes_626R() {
        return this.eyes_626R;
    }

    public void setEyes_626R(String eyes_626R) {
        this.eyes_626R = eyes_626R;
    }



 /**
  * @return
  * @hibernate.property column="eyes_other_627" type="text"
  */
    public String getEyes_other_627() {
        return this.eyes_other_627;
    }

    public void setEyes_other_627(String eyes_other_627) {
        this.eyes_other_627 = eyes_other_627;
    }



    public String getEyes_other_627R() {
        return this.eyes_other_627R;
    }

    public void setEyes_other_627R(String eyes_other_627R) {
        this.eyes_other_627R = eyes_other_627R;
    }



 /**
  * @return
  * @hibernate.property column="mouth_628"
  */
    public Integer getMouth_628() {
        return this.mouth_628;
    }

    public void setMouth_628(Integer mouth_628) {
        this.mouth_628 = mouth_628;
    }



    public String getMouth_628R() {
        return this.mouth_628R;
    }

    public void setMouth_628R(String mouth_628R) {
        this.mouth_628R = mouth_628R;
    }



 /**
  * @return
  * @hibernate.property column="mouth_other_1191" type="text"
  */
    public String getMouth_other_1191() {
        return this.mouth_other_1191;
    }

    public void setMouth_other_1191(String mouth_other_1191) {
        this.mouth_other_1191 = mouth_other_1191;
    }



    public String getMouth_other_1191R() {
        return this.mouth_other_1191R;
    }

    public void setMouth_other_1191R(String mouth_other_1191R) {
        this.mouth_other_1191R = mouth_other_1191R;
    }



 /**
  * @return
  * @hibernate.property column="teeth_163"
  */
    public Integer getTeeth_163() {
        return this.teeth_163;
    }

    public void setTeeth_163(Integer teeth_163) {
        this.teeth_163 = teeth_163;
    }



    public String getTeeth_163R() {
        return this.teeth_163R;
    }

    public void setTeeth_163R(String teeth_163R) {
        this.teeth_163R = teeth_163R;
    }



 /**
  * @return
  * @hibernate.property column="teeth_other_164" type="text"
  */
    public String getTeeth_other_164() {
        return this.teeth_other_164;
    }

    public void setTeeth_other_164(String teeth_other_164) {
        this.teeth_other_164 = teeth_other_164;
    }



    public String getTeeth_other_164R() {
        return this.teeth_other_164R;
    }

    public void setTeeth_other_164R(String teeth_other_164R) {
        this.teeth_other_164R = teeth_other_164R;
    }



 /**
  * @return
  * @hibernate.property column="thyroid_165"
  */
    public Integer getThyroid_165() {
        return this.thyroid_165;
    }

    public void setThyroid_165(Integer thyroid_165) {
        this.thyroid_165 = thyroid_165;
    }



    public String getThyroid_165R() {
        return this.thyroid_165R;
    }

    public void setThyroid_165R(String thyroid_165R) {
        this.thyroid_165R = thyroid_165R;
    }



 /**
  * @return
  * @hibernate.property column="breasts_166"
  */
    public Integer getBreasts_166() {
        return this.breasts_166;
    }

    public void setBreasts_166(Integer breasts_166) {
        this.breasts_166 = breasts_166;
    }



    public String getBreasts_166R() {
        return this.breasts_166R;
    }

    public void setBreasts_166R(String breasts_166R) {
        this.breasts_166R = breasts_166R;
    }



 /**
  * @return
  * @hibernate.property column="nipples_633"
  */
    public Integer getNipples_633() {
        return this.nipples_633;
    }

    public void setNipples_633(Integer nipples_633) {
        this.nipples_633 = nipples_633;
    }



    public String getNipples_633R() {
        return this.nipples_633R;
    }

    public void setNipples_633R(String nipples_633R) {
        this.nipples_633R = nipples_633R;
    }



 /**
  * @return
  * @hibernate.property column="lymphadenopa_1208"
  */
    public Integer getLymphadenopa_1208() {
        return this.lymphadenopa_1208;
    }

    public void setLymphadenopa_1208(Integer lymphadenopa_1208) {
        this.lymphadenopa_1208 = lymphadenopa_1208;
    }



    public String getLymphadenopa_1208R() {
        return this.lymphadenopa_1208R;
    }

    public void setLymphadenopa_1208R(String lymphadenopa_1208R) {
        this.lymphadenopa_1208R = lymphadenopa_1208R;
    }



 /**
  * @return
  * @hibernate.property column="lymphadenopa_desc_1209" type="text"
  */
    public String getLymphadenopa_desc_1209() {
        return this.lymphadenopa_desc_1209;
    }

    public void setLymphadenopa_desc_1209(String lymphadenopa_desc_1209) {
        this.lymphadenopa_desc_1209 = lymphadenopa_desc_1209;
    }



    public String getLymphadenopa_desc_1209R() {
        return this.lymphadenopa_desc_1209R;
    }

    public void setLymphadenopa_desc_1209R(String lymphadenopa_desc_1209R) {
        this.lymphadenopa_desc_1209R = lymphadenopa_desc_1209R;
    }



 /**
  * @return
  * @hibernate.property column="uterus_187"
  */
    public Integer getUterus_187() {
        return this.uterus_187;
    }

    public void setUterus_187(Integer uterus_187) {
        this.uterus_187 = uterus_187;
    }



    public String getUterus_187R() {
        return this.uterus_187R;
    }

    public void setUterus_187R(String uterus_187R) {
        this.uterus_187R = uterus_187R;
    }



 /**
  * @return
  * @hibernate.property column="perineum_580"
  */
    public Integer getPerineum_580() {
        return this.perineum_580;
    }

    public void setPerineum_580(Integer perineum_580) {
        this.perineum_580 = perineum_580;
    }



    public String getPerineum_580R() {
        return this.perineum_580R;
    }

    public void setPerineum_580R(String perineum_580R) {
        this.perineum_580R = perineum_580R;
    }



 /**
  * @return
  * @hibernate.property column="perineum_other_1199" type="text"
  */
    public String getPerineum_other_1199() {
        return this.perineum_other_1199;
    }

    public void setPerineum_other_1199(String perineum_other_1199) {
        this.perineum_other_1199 = perineum_other_1199;
    }



    public String getPerineum_other_1199R() {
        return this.perineum_other_1199R;
    }

    public void setPerineum_other_1199R(String perineum_other_1199R) {
        this.perineum_other_1199R = perineum_other_1199R;
    }



 /**
  * @return
  * @hibernate.property column="perineum_infect_desc_1198" type="text"
  */
    public String getPerineum_infect_desc_1198() {
        return this.perineum_infect_desc_1198;
    }

    public void setPerineum_infect_desc_1198(String perineum_infect_desc_1198) {
        this.perineum_infect_desc_1198 = perineum_infect_desc_1198;
    }



    public String getPerineum_infect_desc_1198R() {
        return this.perineum_infect_desc_1198R;
    }

    public void setPerineum_infect_desc_1198R(String perineum_infect_desc_1198R) {
        this.perineum_infect_desc_1198R = perineum_infect_desc_1198R;
    }



 /**
  * @return
  * @hibernate.property column="anus_638"
  */
    public Integer getAnus_638() {
        return this.anus_638;
    }

    public void setAnus_638(Integer anus_638) {
        this.anus_638 = anus_638;
    }



    public String getAnus_638R() {
        return this.anus_638R;
    }

    public void setAnus_638R(String anus_638R) {
        this.anus_638R = anus_638R;
    }



 /**
  * @return
  * @hibernate.property column="bowels_639"
  */
    public Integer getBowels_639() {
        return this.bowels_639;
    }

    public void setBowels_639(Integer bowels_639) {
        this.bowels_639 = bowels_639;
    }



    public String getBowels_639R() {
        return this.bowels_639R;
    }

    public void setBowels_639R(String bowels_639R) {
        this.bowels_639R = bowels_639R;
    }



 /**
  * @return
  * @hibernate.property column="bowels_abno_640" type="text"
  */
    public String getBowels_abno_640() {
        return this.bowels_abno_640;
    }

    public void setBowels_abno_640(String bowels_abno_640) {
        this.bowels_abno_640 = bowels_abno_640;
    }



    public String getBowels_abno_640R() {
        return this.bowels_abno_640R;
    }

    public void setBowels_abno_640R(String bowels_abno_640R) {
        this.bowels_abno_640R = bowels_abno_640R;
    }



 /**
  * @return
  * @hibernate.property column="micturition_641"
  */
    public Integer getMicturition_641() {
        return this.micturition_641;
    }

    public void setMicturition_641(Integer micturition_641) {
        this.micturition_641 = micturition_641;
    }



    public String getMicturition_641R() {
        return this.micturition_641R;
    }

    public void setMicturition_641R(String micturition_641R) {
        this.micturition_641R = micturition_641R;
    }



 /**
  * @return
  * @hibernate.property column="micturition_desc_642" type="text"
  */
    public String getMicturition_desc_642() {
        return this.micturition_desc_642;
    }

    public void setMicturition_desc_642(String micturition_desc_642) {
        this.micturition_desc_642 = micturition_desc_642;
    }



    public String getMicturition_desc_642R() {
        return this.micturition_desc_642R;
    }

    public void setMicturition_desc_642R(String micturition_desc_642R) {
        this.micturition_desc_642R = micturition_desc_642R;
    }



 /**
  * @return
  * @hibernate.property column="wound_643"
  */
    public Integer getWound_643() {
        return this.wound_643;
    }

    public void setWound_643(Integer wound_643) {
        this.wound_643 = wound_643;
    }



    public String getWound_643R() {
        return this.wound_643R;
    }

    public void setWound_643R(String wound_643R) {
        this.wound_643R = wound_643R;
    }



 /**
  * @return
  * @hibernate.property column="wound_abnor_644" type="text"
  */
    public String getWound_abnor_644() {
        return this.wound_abnor_644;
    }

    public void setWound_abnor_644(String wound_abnor_644) {
        this.wound_abnor_644 = wound_abnor_644;
    }



    public String getWound_abnor_644R() {
        return this.wound_abnor_644R;
    }

    public void setWound_abnor_644R(String wound_abnor_644R) {
        this.wound_abnor_644R = wound_abnor_644R;
    }



 /**
  * @return
  * @hibernate.property column="lochia_flow_645"
  */
    public Integer getLochia_flow_645() {
        return this.lochia_flow_645;
    }

    public void setLochia_flow_645(Integer lochia_flow_645) {
        this.lochia_flow_645 = lochia_flow_645;
    }



    public String getLochia_flow_645R() {
        return this.lochia_flow_645R;
    }

    public void setLochia_flow_645R(String lochia_flow_645R) {
        this.lochia_flow_645R = lochia_flow_645R;
    }



 /**
  * @return
  * @hibernate.property column="lochia_colou_646"
  */
    public Integer getLochia_colou_646() {
        return this.lochia_colou_646;
    }

    public void setLochia_colou_646(Integer lochia_colou_646) {
        this.lochia_colou_646 = lochia_colou_646;
    }



    public String getLochia_colou_646R() {
        return this.lochia_colou_646R;
    }

    public void setLochia_colou_646R(String lochia_colou_646R) {
        this.lochia_colou_646R = lochia_colou_646R;
    }



 /**
  * @return
  * @hibernate.property column="lochia_odor_647"
  */
    public Integer getLochia_odor_647() {
        return this.lochia_odor_647;
    }

    public void setLochia_odor_647(Integer lochia_odor_647) {
        this.lochia_odor_647 = lochia_odor_647;
    }



    public String getLochia_odor_647R() {
        return this.lochia_odor_647R;
    }

    public void setLochia_odor_647R(String lochia_odor_647R) {
        this.lochia_odor_647R = lochia_odor_647R;
    }



 /**
  * @return
  * @hibernate.property column="legs_649"
  */
    public Integer getLegs_649() {
        return this.legs_649;
    }

    public void setLegs_649(Integer legs_649) {
        this.legs_649 = legs_649;
    }



    public String getLegs_649R() {
        return this.legs_649R;
    }

    public void setLegs_649R(String legs_649R) {
        this.legs_649R = legs_649R;
    }



 /**
  * @return
  * @hibernate.property column="cervix_per_spec_666"
  */
    public Integer getCervix_per_spec_666() {
        return this.cervix_per_spec_666;
    }

    public void setCervix_per_spec_666(Integer cervix_per_spec_666) {
        this.cervix_per_spec_666 = cervix_per_spec_666;
    }



    public String getCervix_per_spec_666R() {
        return this.cervix_per_spec_666R;
    }

    public void setCervix_per_spec_666R(String cervix_per_spec_666R) {
        this.cervix_per_spec_666R = cervix_per_spec_666R;
    }



 /**
  * @return
  * @hibernate.property column="cervix_per_spec_result_667"
  */
    public Integer getCervix_per_spec_result_667() {
        return this.cervix_per_spec_result_667;
    }

    public void setCervix_per_spec_result_667(Integer cervix_per_spec_result_667) {
        this.cervix_per_spec_result_667 = cervix_per_spec_result_667;
    }



    public String getCervix_per_spec_result_667R() {
        return this.cervix_per_spec_result_667R;
    }

    public void setCervix_per_spec_result_667R(String cervix_per_spec_result_667R) {
        this.cervix_per_spec_result_667R = cervix_per_spec_result_667R;
    }



 /**
  * @return
  * @hibernate.property column="patient_received_arv"
  */
    public Byte getPatient_received_arv() {
        return this.patient_received_arv;
    }

    public void setPatient_received_arv(Byte patient_received_arv) {
        this.patient_received_arv = patient_received_arv;
    }



    public String getPatient_received_arvR() {
        return this.patient_received_arvR;
    }

    public void setPatient_received_arvR(String patient_received_arvR) {
        this.patient_received_arvR = patient_received_arvR;
    }



 /**
  * @return
  * @hibernate.property column="is_problem"
  */
    public Boolean getIs_problem() {
        return this.is_problem;
    }

    public void setIs_problem(Boolean is_problem) {
        this.is_problem = is_problem;
    }



    public String getIs_problemR() {
        return this.is_problemR;
    }

    public void setIs_problemR(String is_problemR) {
        this.is_problemR = is_problemR;
    }



 /**
  * @return
  * @hibernate.property column="contraceptive_advice_669"
  */
    public Byte getContraceptive_advice_669() {
        return this.contraceptive_advice_669;
    }

    public void setContraceptive_advice_669(Byte contraceptive_advice_669) {
        this.contraceptive_advice_669 = contraceptive_advice_669;
    }



    public String getContraceptive_advice_669R() {
        return this.contraceptive_advice_669R;
    }

    public void setContraceptive_advice_669R(String contraceptive_advice_669R) {
        this.contraceptive_advice_669R = contraceptive_advice_669R;
    }



 /**
  * @return
  * @hibernate.property column="using_contraception_670"
  */
    public Byte getUsing_contraception_670() {
        return this.using_contraception_670;
    }

    public void setUsing_contraception_670(Byte using_contraception_670) {
        this.using_contraception_670 = using_contraception_670;
    }



    public String getUsing_contraception_670R() {
        return this.using_contraception_670R;
    }

    public void setUsing_contraception_670R(String using_contraception_670R) {
        this.using_contraception_670R = using_contraception_670R;
    }



 /**
  * @return
  * @hibernate.property column="contraceptive_choice_137"
  */
    public Integer getContraceptive_choice_137() {
        return this.contraceptive_choice_137;
    }

    public void setContraceptive_choice_137(Integer contraceptive_choice_137) {
        this.contraceptive_choice_137 = contraceptive_choice_137;
    }



    public String getContraceptive_choice_137R() {
        return this.contraceptive_choice_137R;
    }

    public void setContraceptive_choice_137R(String contraceptive_choice_137R) {
        this.contraceptive_choice_137R = contraceptive_choice_137R;
    }



 /**
  * @return
  * @hibernate.property column="contraceptive_other_138" type="text"
  */
    public String getContraceptive_other_138() {
        return this.contraceptive_other_138;
    }

    public void setContraceptive_other_138(String contraceptive_other_138) {
        this.contraceptive_other_138 = contraceptive_other_138;
    }



    public String getContraceptive_other_138R() {
        return this.contraceptive_other_138R;
    }

    public void setContraceptive_other_138R(String contraceptive_other_138R) {
        this.contraceptive_other_138R = contraceptive_other_138R;
    }



 /**
  * @return
  * @hibernate.property column="education1"
  */
    public Integer getEducation1() {
        return this.education1;
    }

    public void setEducation1(Integer education1) {
        this.education1 = education1;
    }



    public String getEducation1R() {
        return this.education1R;
    }

    public void setEducation1R(String education1R) {
        this.education1R = education1R;
    }



 /**
  * @return
  * @hibernate.property column="education2"
  */
    public Integer getEducation2() {
        return this.education2;
    }

    public void setEducation2(Integer education2) {
        this.education2 = education2;
    }



    public String getEducation2R() {
        return this.education2R;
    }

    public void setEducation2R(String education2R) {
        this.education2R = education2R;
    }



 /**
  * @return
  * @hibernate.property column="education3"
  */
    public Integer getEducation3() {
        return this.education3;
    }

    public void setEducation3(Integer education3) {
        this.education3 = education3;
    }



    public String getEducation3R() {
        return this.education3R;
    }

    public void setEducation3R(String education3R) {
        this.education3R = education3R;
    }



 /**
  * @return
  * @hibernate.property column="education4"
  */
    public Integer getEducation4() {
        return this.education4;
    }

    public void setEducation4(Integer education4) {
        this.education4 = education4;
    }



    public String getEducation4R() {
        return this.education4R;
    }

    public void setEducation4R(String education4R) {
        this.education4R = education4R;
    }



 /**
  * @return
  * @hibernate.property column="education5"
  */
    public Integer getEducation5() {
        return this.education5;
    }

    public void setEducation5(Integer education5) {
        this.education5 = education5;
    }



    public String getEducation5R() {
        return this.education5R;
    }

    public void setEducation5R(String education5R) {
        this.education5R = education5R;
    }



 /**
  * @return
  * @hibernate.property column="education6"
  */
    public Integer getEducation6() {
        return this.education6;
    }

    public void setEducation6(Integer education6) {
        this.education6 = education6;
    }



    public String getEducation6R() {
        return this.education6R;
    }

    public void setEducation6R(String education6R) {
        this.education6R = education6R;
    }



 /**
  * @return
  * @hibernate.property column="education7"
  */
    public Integer getEducation7() {
        return this.education7;
    }

    public void setEducation7(Integer education7) {
        this.education7 = education7;
    }



    public String getEducation7R() {
        return this.education7R;
    }

    public void setEducation7R(String education7R) {
        this.education7R = education7R;
    }



 /**
  * @return
  * @hibernate.property column="health_educa_discussed_other_674" type="text"
  */
    public String getHealth_educa_discussed_other_674() {
        return this.health_educa_discussed_other_674;
    }

    public void setHealth_educa_discussed_other_674(String health_educa_discussed_other_674) {
        this.health_educa_discussed_other_674 = health_educa_discussed_other_674;
    }



    public String getHealth_educa_discussed_other_674R() {
        return this.health_educa_discussed_other_674R;
    }

    public void setHealth_educa_discussed_other_674R(String health_educa_discussed_other_674R) {
        this.health_educa_discussed_other_674R = health_educa_discussed_other_674R;
    }



 /**
  * @return
  * @hibernate.property column="postnatal_comments" type="text"
  */
    public String getPostnatal_comments() {
        return this.postnatal_comments;
    }

    public void setPostnatal_comments(String postnatal_comments) {
        this.postnatal_comments = postnatal_comments;
    }



    public String getPostnatal_commentsR() {
        return this.postnatal_commentsR;
    }

    public void setPostnatal_commentsR(String postnatal_commentsR) {
        this.postnatal_commentsR = postnatal_commentsR;
    }



}