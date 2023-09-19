package lk.uok.mmsdb.view.tm;

public class DoctorTM {
    private int doc_id;
    private String doc_name;
    private String doc_gender;
    private String doc_age;
    private String doc_specialization;
    private int doc_fee;
    private String doc_mobile;
    private String doc_email;
    private String doc_address;
    private String doc_username;
    private String doc_password;

    public DoctorTM() {
    }

    public DoctorTM(int doc_id, String doc_name, String doc_gender, String doc_age, String doc_specialization,
                    int doc_fee, String doc_mobile, String doc_email, String doc_address, String doc_username,
                    String doc_password) {
        this.doc_id = doc_id;
        this.doc_name = doc_name;
        this.doc_gender = doc_gender;
        this.doc_age = doc_age;
        this.doc_specialization = doc_specialization;
        this.doc_fee = doc_fee;
        this.doc_mobile = doc_mobile;
        this.doc_email = doc_email;
        this.doc_address = doc_address;
        this.doc_username = doc_username;
        this.doc_password = doc_password;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_gender() {
        return doc_gender;
    }

    public void setDoc_gender(String doc_gender) {
        this.doc_gender = doc_gender;
    }

    public String getDoc_age() {
        return doc_age;
    }

    public void setDoc_age(String doc_age) {
        this.doc_age = doc_age;
    }

    public String getDoc_specialization() {
        return doc_specialization;
    }

    public void setDoc_specialization(String doc_specialization) {
        this.doc_specialization = doc_specialization;
    }

    public int getDoc_fee() {
        return doc_fee;
    }

    public void setDoc_fee(int doc_fee) {
        this.doc_fee = doc_fee;
    }

    public String getDoc_mobile() {
        return doc_mobile;
    }

    public void setDoc_mobile(String doc_mobile) {
        this.doc_mobile = doc_mobile;
    }

    public String getDoc_email() {
        return doc_email;
    }

    public void setDoc_email(String doc_email) {
        this.doc_email = doc_email;
    }

    public String getDoc_address() {
        return doc_address;
    }

    public void setDoc_address(String doc_address) {
        this.doc_address = doc_address;
    }

    public String getDoc_username() {
        return doc_username;
    }

    public void setDoc_username(String doc_username) {
        this.doc_username = doc_username;
    }

    public String getDoc_password() {
        return doc_password;
    }

    public void setDoc_password(String doc_password) {
        this.doc_password = doc_password;
    }
}
