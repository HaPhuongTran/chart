package controller_stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service_stock.StockService;
import stock.Stock;

@Component
@RestController
public class StockController {
	@Autowired
	private StockService stockService;
	
	//add stock
	@RequestMapping("/add")
	public @ResponseBody Stock addStock(Stock stock) {
		stockService.save(stock);
		return stock;
	}
	//get stock by nameStock
	@RequestMapping("/get/{nameStock}")
	public ResponseEntity<Stock> get (@PathVariable("nameStock")  String nameStock){
		Stock stock = stockService.get(nameStock);
		return ResponseEntity.ok().body(stock);
	}
	//get all stock
	@RequestMapping("/get")
	public ResponseEntity<List<Stock>> getall(){
		List<Stock> stock = stockService.list();
		return ResponseEntity.ok().body(stock);
	}
	
	//delete a stock by nameStock
	@RequestMapping("/delete/{nameStock}")
	public ResponseEntity<?> delete(@PathVariable("nameStock") String nameStock){
		stockService.delete(nameStock);
		return getall();
	}
	
}
