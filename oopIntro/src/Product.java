
public class Product {
	
	//constructor blogu - yazmasak bile bu blok var
	//signature çalýþýnca constructor çalýþmaz - 2 calistim geldi
	public Product() {
		System.out.println("calistim");		
	}
	
	//signature
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
