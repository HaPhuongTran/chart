package stock;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Stock implements Serializable {
	
	@Id
	private String name_Of_Stock;
	
	@Id
	private Date date;
	
	private float data;
	
	@ManyToOne
	private color name_Color;
	
	@ManyToOne
	private color date_color;

	
	
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
	
	public color getNameColor() {
		return name_Color;
	}
}
