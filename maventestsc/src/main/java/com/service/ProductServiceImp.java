package com.service;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Product;
import com.mapper.ProductDao;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductDao productdao;

	@Override
	public List<Product> findAll(Map map) {
		return productdao.findAll(map);
	}
	@Override
	public void save(Product product) {
		productdao.save(product);
		
	}

	@Override
	public List<Product> selid(int pid) {
		
		
	return productdao.selid(pid);
	}

	@Override
	public int findCount(Map map) {
		
		return productdao.findCount(map);
	}
	@Override
	public void delPro(int pid) {
		productdao.delPro(pid);
		
	}
	@Override
	public void upPro(Map map) {
		productdao.upPro(map);
	}
}
