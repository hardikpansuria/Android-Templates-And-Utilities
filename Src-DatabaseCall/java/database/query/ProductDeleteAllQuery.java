package com.example.database.query;

import com.example.database.dao.ProductDAO;
import com.example.database.data.Data;


public class ProductDeleteAllQuery extends Query
{
	public ProductDeleteAllQuery()
	{
	}


	@Override
	public Data<Object> processData()
	{
		ProductDAO dao = new ProductDAO();
		dao.deleteAll();

		Data<Object> data = new Data<Object>();
		data.setDataObject(null);

		return data;
	}
}