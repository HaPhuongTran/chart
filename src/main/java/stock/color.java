package stock;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class color {
	@Id
	@Column(name="name_color")
	private String name_Of_Color;
	
	@OneToOne
	@JoinColumns({
		  @JoinColumn(name = "name_Of_Stock"),
		  @JoinColumn(name = "date")
		})
	private Stock stock;
//	
//	@OneToOne
//	@JoinColumn(name = "date")
//	private Stock date;
	
	
	public String getNamOfColor() {
		return name_Of_Color;
	}
	
	public void setNameOfColor(String name_Of_Color) {
		this.name_Of_Color = name_Of_Color;
	}
	
	public Stock getNameOfStock() {
		return stock;
	}
	
	public void setNameOfStock(Stock name_Of_Stock) {
		this.stock = name_Of_Stock;
	}
	
}
