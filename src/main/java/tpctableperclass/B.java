 package tpctableperclass;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class B  extends A{
    private String valueOne;
    public String getValueOne(){ return valueOne; }
    public void setValueOne(String valueOne){this.valueOne=valueOne;}
}
