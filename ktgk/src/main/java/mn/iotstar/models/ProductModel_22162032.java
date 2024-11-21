package mn.iotstar.models;

import java.io.Serializable;

public class ProductModel_22162032 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int ProductID;
	private String ProductName;
	private String Description;
	private int Price;
	private String imageLink;
	private int CategoryID;
	private int SellerID;
	private int Amount;
	
	public ProductModel_22162032() {
		super();
	}

	public ProductModel_22162032(int ProductID, String ProductName, String Description, int Price, String imageLink,
			int SellerID, int Amount, int CategoryID) {
		super();
		this.ProductID = ProductID;
		this.ProductName = ProductName;
		this.Description = Description;
		this.Price = Price;
		this.imageLink = imageLink;
		this.CategoryID = CategoryID;
		this.SellerID = SellerID;
		this.Amount = Amount;
	}
	
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
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public int getSellerID() {
		return SellerID;
	}
	public void setSellerID(int sellerID) {
		SellerID = sellerID;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProductModel_22162032 [ProductID=" + ProductID + ", ProductName=" + ProductName + ", Description="
				+ Description + ", Price=" + Price + ", imageLink=" + imageLink + ", CategoryID=" + CategoryID
				+ ", SellerID=" + SellerID + ", Amount=" + Amount + "]";
	}
	
	

}
