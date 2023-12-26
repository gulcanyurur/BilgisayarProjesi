
public class Monitor {
   private String model;
   private String uretici;
   private String boyut;
  private Resolition resolition;   

    public Monitor(String model, String uretici, String boyut, Resolition resolition) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolition = resolition;
    }
  public void monutoru_kapat(){
      System.out.println("Monutor kapatılıyor...");
      
      
  }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolition
     */
    public Resolition getResolition() {
        return resolition;
    }

    /**
     * @param resolition the resolition to set
     */
    public void setResolition(Resolition resolition) {
        this.resolition = resolition;
    }
  
}
