package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Hashset implements Comparable<Hashset> {
int id;
String name;
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals (Object obj) {
	if(this.id==((Hashset)obj).id)return true;
	return false;
}
public Hashset(int id,String name) {
	super();
	this.id=id;
	this.name=name;
}
public static void main(String[] args) {
	HashSet<Hashset> hs=new HashSet<Hashset>();
	Hashset hs1= new Hashset(1,"shabana");
	hs.add(hs1);
	Hashset hs2= new Hashset(3,"shabana");
	hs.add(hs2);
	Hashset hs3= new Hashset(5,"shabana");
	hs.add(hs3);
	Hashset hs4= new Hashset(7,"shabana");
	hs.add(hs4);
	Hashset hs5= new Hashset(0,"shabana");
	hs.add(hs5);
	Hashset hs6= new Hashset(2,"shabana");
	hs.add(hs6);
	System.out.println(hs1.equals(hs6));
	System.out.println(hs);
	
	
	LinkedHashSet<Hashset> lhs=new LinkedHashSet<Hashset>();
	Hashset lhs1=new Hashset(3,"shabu");
	lhs.add(lhs1);
	Hashset lhs2=new Hashset(4,"shabu");
	lhs.add(lhs2);
	Hashset lhs3=new Hashset(5,"shabu");
	lhs.add(lhs3);
	Hashset lhs4=new Hashset(6,"shabu");
	lhs.add(lhs4);
	System.out.println(lhs);
	
	
	TreeSet<Hashset> ts=new TreeSet<Hashset>();
	Hashset ts1=new Hashset(6,"shabu");
	lhs.add(ts1);
	Hashset ts2=new Hashset(7,"shabu");
	lhs.add(ts2);
	Hashset ts3=new Hashset(8,"shabu");
	lhs.add(ts3);
	Hashset ts4=new Hashset(9,"shabu");
	lhs.add(ts4);
	System.out.println(ts);
	
	
	String name="Java";
	int n1=(name.charAt(0)*31*31*31)+(name.charAt(1)*31*31)+(name.charAt(2)*31)+(name.charAt(3));
	System.out.println(n1);
	System.out.println(name.hashCode());
	
	}
@Override
public String toString() {
	return "Hashset [id=" + id + ", name=" + name + "]";
}
@Override
public int compareTo(Hashset o) {
	if(this.id<o.id) {
		return -1;
	}else if(this.id>o.id) {
		return 1;
	}
	return 0;
}


}
