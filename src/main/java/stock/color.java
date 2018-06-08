package stock;

import javax.persistence.*;

@Entity
public class color {
	@Id
	@Column(name="name_color")
	private String name_Of_Color;
	
	@Column(name="name_Of_Stock")
	private Stock name_Of_Stock;
	
	public String getNamOfColor() {
		return name_Of_Color;
	}
	
	public void setNameOfColor(String name_Of_Color) {
		this.name_Of_Color = name_Of_Color;
	}
	
	@OneToMany(mappedBy="stock")
	public Stock getNameOfStock() {
		return name_Of_Stock;
	}
	
	public void setNameOfStock(Stock name_Of_Stock) {
		this.name_Of_Stock = name_Of_Stock;
	}
	
}
