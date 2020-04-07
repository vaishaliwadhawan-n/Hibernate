package tpctableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class C  extends A{
    private String valueTwo;
    public String getValueTwo (){ return valueTwo; }
    public void setValueTwo(String valueOne){this.valueTwo=valueTwo;}
}
