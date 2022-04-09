package bg.unwe;

public class Author implements Person {
    private String name;
    private Country country;

    @Override
    public String getName() {
      
        return name;
    }
    @Override
    public void setName(String name) {
     this.name=name;
        
    }
    @Override
    public Country getCountry() {
   
        return country;
    }
    @Override
    public void setCountry(Country country) {
       this.country=country;
        
    }

    

}
