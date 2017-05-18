package com.gtm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtm.dao.StockRepository;
import com.gtm.metier.Stock;
import com.gtm.service.exceptions.NotEnoughArticleException;
import com.gtm.service.exceptions.QteNegativeException;
import com.gtm.service.exceptions.articleNotFoundException;

@Service
public class ServiceImpl implements IService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public void sortArticleDuStock(int id, int qute)
			throws articleNotFoundException, QteNegativeException, NotEnoughArticleException {

		if (qute < 0) {
			throw new QteNegativeException();
		}
		if (!stockRepository.exists(id)) {
			throw new articleNotFoundException();
		}
		if (stockRepository.findOne(id).getQuantité() < qute) {
			throw new NotEnoughArticleException();
		}
		stockRepository.sortArcticleDuStock(id, qute);

	}

	@Override
	public int getQtyEnStock(int id) throws articleNotFoundException {
		if (!stockRepository.exists(id)) {
			throw new articleNotFoundException();
		}
		return stockRepository.findOne(id).getQuantité();
	}


	public void ajouter(Stock stock) {
		stockRepository.save(stock);
		
	}


	

}
