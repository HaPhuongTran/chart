package stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;;

@Component
@Service
public class StockServiceImp implements StockService {
	@Autowired
	private StockDao stockDao;
	
	@Override
	public String save(Stock stock ) {
		return stockDao.save(stock);
	}
	
	@Override
	public Stock get(String namestock) {
		return stockDao.get(namestock);
	}
	
	@Override
	public List<Stock> list(){
		return stockDao.list();
	}
	
//	@Override
//	public void update(String namestock, Stock stock) {
//		stockDao.update(namestock, stock);
//	}
//	
//	@Override 
//	public void delete(String namestock) {
//		stockDao.delete(namestock);
//	}

}
