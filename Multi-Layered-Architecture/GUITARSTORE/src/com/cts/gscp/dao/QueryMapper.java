package com.cts.gscp.dao;

public interface QueryMapper {
	public static final String ADD_QUERY="insert into guitars values (?,?,?,?)";
	public static final String DELETE_QUERY="delete from guitars where guitarmodel=?)";
	public static final String SELECT_QUERY="select * from guitars where guitarmodel=?)";
	public static final String GETALL_QUERY="select * from guitars";
}
