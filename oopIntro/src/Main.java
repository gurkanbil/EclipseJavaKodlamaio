
public class Main {

	public static void main(String[] args) {
		//don t repeat yourself
		// her class sadece bir iþ yapar 
		//özellik tutucu class lar - 2 iþ yapan class lar
		Product product1 = new Product(1,"lenovo v14",15000,"16gb ram");  //referans olust instance olust
		
		
		
		Product product2 = new Product();  //referans olust instance olust
		product2.id=2;
		product2.name="leovo V15";
		product2.unitPrice=19000;
		product2.detail="32gb ram";
		
		
		
		Product product3 = new Product();  //referans olust instance olust
		product1.id=3;
		product1.name="hp 5";
		product1.unitPrice=10000;
		product1.detail="8 gb ram";
		
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
			
		}
		
		System.out.println(products.length);

		Category category1 = new Category();
		category1.id=1;
		category1.name="bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		// sepete ekle sepete ne ekleyecek yani bir data yollanacak ona
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
		
	}
		
}
