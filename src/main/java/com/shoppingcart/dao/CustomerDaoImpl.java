package com.shoppingcart.dao;



import org.springframework.jdbc.core.JdbcTemplate;

import com.shoppingcart.models.Customer;

public class CustomerDaoImpl {
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public int save(Customer p){
	String sql="insert into customer(usernaem,password,firstname,lastname,mailid) values('"+p.getId()+"',"+p.getUsername()+",'"+p.getPassword()+"','"+p.getFirstname()+"','"+p.getLastname()+"','"+p.getMailid()+"')";
	return template.update(sql);
}

/*
public int update(Customer p){
	String sql="update Employee set name='"+p.getName()+"', salary="+p.getSalary()+", designation='"+p.getDesignation()+"' where id="+p.getId()+"";
	return template.update(sql);
}
public int delete(int id){
	String sql="delete from Employee where id="+id+"";
	return template.update(sql);
}
public Customer getEmployeeById(int id) throws DataAccessException{
	
	String sql="select * from employee where id=?";
	
	System.out.println(id);
	Object a[]=new Object[]{id};
	System.out.println(a[0].getClass());
	System.out.println("object"+a[0]);
	
	
	Customer emp=(Customer)template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
	//System.out.println("dao "+emp.toString());
	 return emp;

}
public List<Customer> getEmployees(){
	return template.query("select * from employee",new RowMapper<Customer>(){
		public Customer mapRow(ResultSet rs, int row) throws SQLException {
			Customer e=new Customer();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDesignation(rs.getString(3));
			e.setSalary(rs.getInt(4));
			//System.out.println("dao"+e.toString());
			return e;
		}
	});
}*/
}
