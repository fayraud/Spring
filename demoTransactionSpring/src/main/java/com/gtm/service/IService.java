package com.gtm.service;

public interface IService {
	
	public void sortArticleDuStock(int id, int qute) throws
	articleNotFoundException, QteNegativeException, NotEnoughArticleException;

}
