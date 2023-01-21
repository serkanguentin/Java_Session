public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonno;

    public Account(){
        System.out.println("Kendi constructer imiiizi olsturduk");
    }
    public Account(String hesapNo,double bakiye,String isim,String email, String telefonno){
    this.hesapNo=hesapNo;
    this.bakiye=bakiye;
    this.isim=isim;
    this.email=email;
    this.telefonno=telefonno;
    }
    public void paraYatirma(double miktar){
        bakiye +=miktar;
        System.out.println("yeni bakiyeniz"+bakiye);
    }
    public String getHesapNo() {
        return hesapNo;
    }


    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }
}
