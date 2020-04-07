package tpctableperclass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)



public class A {
    @Id
    int id;
    String name;

    public int getId() {return id; }

    public void setId(int id) { this.id = id;}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
//kitni bhi classes ho store in one table
//how to tell update value tables that which object belong
//so for that we use discriminator col to tell value nd type
//col stores the value

//101 abc
//102 def 200
//103 ghi 300

//id name valueone valuetwo type
// 101 abc null    null   A
//102 def  200  null     B
