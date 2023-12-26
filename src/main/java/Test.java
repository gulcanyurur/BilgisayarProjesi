public class Test {
    public static void main(String[] args) {
      Resolition resolition =new Resolition(1920,1080 );
      Monitor monitor =new Monitor("Vs1950DE", "ASUS", "18.5", resolition);
      Kasa kasa =new Kasa("showdow blade","show", "tamperli cam");
      Anakart anakart =new Anakart("b220", "asus", 10, "windows 10");
      Bilgisayar pc =new Bilgisayar(monitor, kasa, anakart);
    pc.getKasa().bilgisayari_ac();
}
    
    
}
