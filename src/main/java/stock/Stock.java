package stock;

import java.util.Date;

import javax.persistence.*;

@Entity
@IdClass(Stock.class)
public class Stock {
	
	@Id
	@Column(name="name_Of_Stock")
	private String name_Of_Stock;
	
	@Id
	@Column(name="date")
	private Date date;
	
	@Column(name="data")
	private float data;
	
	
	@Column(name="name_Color")
	private color name_Color;
	
	public String getNameOfStock() {
		return name_Of_Stock;
	}
	
	public void setNameOfStock(String name_Of_Stock) {
		this.name_Of_Stock = name_Of_Stock;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public float getData() {
		return data;
	}
	
	public void setData(float data) {
		this.data=data;
	}
	@ManyToOne
	@JoinColumn(name="FK_color")
	public color getNameColor() {
		return name_Color;
	}
}
