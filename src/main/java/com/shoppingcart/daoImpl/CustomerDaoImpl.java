package com.shoppingcart.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoppingcart.dao.CustomerDao;
import com.shoppingcart.models.Customer;

public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Customer customer) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			tx.begin();
			session.save(customer);
		} catch (Exception e) {
			tx.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		/*
		 * String sql =
		 * "insert into customer(username,password,firstname,lastname,mailid) values('"
		 * + customer.getId() + "'," + customer.getUsername() + ",'" +
		 * customer.getPassword() + "','" + customer.getFirstname() + "','" +
		 * customer.getLastname() + "','" + customer.getMailid() + "')";
		 * template.update(sql);
		 */
	}

	/*
	 * public int update(Customer p){ String
	 * sql="update Employee set name='"+p.getName()+"', salary="+p.getSalary()
	 * +", designation='"+p.getDesignation()+"' where id="+p.getId()+""; return
	 * template.update(sql); } public int delete(int id){ String
	 * sql="delete from Employee where id="+id+""; return template.update(sql);
	 * } public Customer getEmployeeById(int id) throws DataAccessException{
	 * 
	 * String sql="select * from employee where id=?";
	 * 
	 * System.out.println(id); Object a[]=new Object[]{id};
	 * System.out.println(a[0].getClass()); System.out.println("object"+a[0]);
	 * 
	 * 
	 * Customer emp=(Customer)template.queryForObject(sql, new Object[] {id},new
	 * BeanPropertyRowMapper<Employee>(Employee.class));
	 * //System.out.println("dao "+emp.toString()); return emp;
	 * 
	 * } public List<Customer> getEmployees(){ return
	 * template.query("select * from employee",new RowMapper<Customer>(){ public
	 * Customer mapRow(ResultSet rs, int row) throws SQLException { Customer
	 * e=new Customer(); e.setId(rs.getInt(1)); e.setName(rs.getString(2));
	 * e.setDesignation(rs.getString(3)); e.setSalary(rs.getInt(4));
	 * //System.out.println("dao"+e.toString()); return e; } }); }
	 */
}
