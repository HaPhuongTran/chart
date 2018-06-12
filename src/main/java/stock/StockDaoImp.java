package stock;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockDaoImp implements StockDao{
	@Autowired
	private EntityManagerFactory entitymanger;
	
	@Override
	public String save(Stock stock) {
		entitymanger.unwrap(SessionFactory.class).openSession().save(stock);
		return stock.getNameOfStock();
	}
	
	@Override
	public Stock get(String nameStock) {
		return entitymanger.unwrap(SessionFactory.class).openSession().get(Stock.class, nameStock);
	}
	
	@Override
	public List<Stock> list(){
		Session session = entitymanger.unwrap(SessionFactory.class).openSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Stock> cq = cb.createQuery(Stock.class);
	      Root<Stock> root = cq.from(Stock.class);
	      cq.select(root);
	      Query<Stock> query = session.createQuery(cq);
	      return query.getResultList();
	}

}
