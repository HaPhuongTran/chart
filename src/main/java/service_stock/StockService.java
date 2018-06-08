package service_stock;

import java.util.List;

import org.springframework.stereotype.Component;
import stock.Stock;

@Component
public interface StockService {
	String save(Stock stock );
	Stock get (String nameStock);
	List<Stock> list();
	void update(String nameStock, Stock stock);
	void delete(String nameStock);
}
