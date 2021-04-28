package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "lenovo v14", 15000, "16 gb ram", 10); //referans oluþturma, instance
		
		Product product2 = new Product(2, "lenovo v15", 16000, "32 gb ram", 10); 
				
		Product product3 = new Product(); //product class ýndaki parametresiz class ý çalýþtýrýr.
		product3.setId(3);
		product3.setName("hp 5");
		product3.setDetail("8 gb ram");
		product3.setDiscount(10);
		product3.setUnitPrice(10000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		System.out.println(product3.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
	}

}
