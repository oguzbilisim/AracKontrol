public class User {
  
    private String plaka;
    private String adsoyad;
    private int agirlik;
    private String girissaat;
    private String cikissaat;
    
    
    public User(String PLAKA,String ADSOYAD,int AGIRLIK,String SAAT,String SAATT){
        
        this.plaka = PLAKA;
        this.adsoyad = ADSOYAD;
        this.agirlik = AGIRLIK;
        this.girissaat = SAAT;
        this.cikissaat = SAATT;
        
    
    }
    
    public String getPLAKA(){
    
        return plaka;
    
    }
    
     public String getADSOYAD(){
    
        return adsoyad;
    
    }
      public int getAGIRLIK(){
    
        return agirlik;
    
    }
       public String getSAAT(){
    
        return girissaat;
    
    }
       
       public String getSAATT(){
    
        return cikissaat;
    
}
       
    
}
