package stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class StockController {
	@Autowired
	private StockService stockService;
	
//	@RequestMapping("/text")
//	public Stock test_text(@RequestParam("tag_input") String first_test, @RequestBody Stock stock) {
//		stock.setNameOfStock(first_test);
//		stockService.save(stock);
//		return stock;
//	}
   /*---Add new book---*/
   @RequestMapping("/stock")
   public @ResponseBody Stock addNewStock (@RequestBody Stock stock) {
	   stockService.save(stock);
		return stock;
   }
	   
//	//add stock
//	@RequestMapping("/add")
//	public @ResponseBody Stock addStock(@RequestParam("tag_input") Stock stock) {
//		stockService.save(stock);
//		return stock;
//	}
//	//get stock by nameStock
//	@RequestMapping("/get/{nameStock}")
//	public ResponseEntity<Stock> get (@PathVariable("nameStock")  String nameStock){
//		Stock stock = stockService.get(nameStock);
//		return ResponseEntity.ok().body(stock);
//	}
//	//get all stock
//	@RequestMapping("/get")
//	public ResponseEntity<List<Stock>> getall(){
//		List<Stock> stock = stockService.list();
//		return ResponseEntity.ok().body(stock);
//	}
//	
//	//delete a stock by nameStock
//	@RequestMapping("/delete/{nameStock}")
//	public ResponseEntity<?> delete(@PathVariable("nameStock") String nameStock){
//		stockService.delete(nameStock);
//		return getall();
//	}
	
}
