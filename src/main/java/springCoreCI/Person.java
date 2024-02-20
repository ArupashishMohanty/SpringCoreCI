package springCoreCI;

public class Person {
private String name;
private int Id;
private Certi certificate;

public Person(String name,int Id,Certi certificate) {
	this.name=name;
	this.Id=Id;
	this.certificate=certificate;
}

@Override
public String toString() {
	return this.name+" : "+ this.Id +"{"+this.certificate.name+"}";
}
}
