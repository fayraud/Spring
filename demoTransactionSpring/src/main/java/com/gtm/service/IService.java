package com.gtm.service;

import com.gtm.service.exceptions.NotEnoughArticleException;
import com.gtm.service.exceptions.QteNegativeException;
import com.gtm.service.exceptions.articleNotFoundException;

public interface IService {
	
	public void sortArticleDuStock(int id, int qute) throws
	articleNotFoundException, QteNegativeException, NotEnoughArticleException;
	
	public int getQtyEnStock(int id) throws articleNotFoundException;

}
