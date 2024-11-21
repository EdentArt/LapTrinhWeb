package mn.iotstar.models;

import java.util.Locale.Category;

public class Product_22162032 {
	
	private int ProductID;
    public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getSellerID() {
		return SellerID;
	}

	public void setSellerID(int sellerID) {
		SellerID = sellerID;
	}

	public int getSmount() {
		return Smount;
	}

	public void setSmount(int smount) {
		Smount = smount;
	}

	private String ProductName;
    private String Description;
    private int Price;
    private String imageLink;
    
    private Category category;
    
    private int SellerID;
    
    private int Smount;
}
