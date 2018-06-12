package stock;

import java.util.List;
import org.springframework.stereotype.Component;
@Component
public interface StockDao {
	String save(Stock stock);
	Stock get(String nameStock);
	List<Stock> list();
//	void update(String namestock, Stock stock);
//	void delete(String namestock);
}
