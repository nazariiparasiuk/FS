package models;

import java.util.Date;

/**
 * 
 *
 */
public interface OrderDAO {

	/**
	 * @return the id
	 */
	public int getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id);

	/**
	 * @return the furniture_id
	 */
	public int getFurniture_id();

	/**
	 * @param furniture_id
	 *            the furniture_id to set
	 */
	public void setFurniture_id(int furniture_id);

	/**
	 * @return the user_id
	 */
	public int getUser_id();

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(int user_id);

	/**
	 * @return the quantity
	 */
	public int getQuantity();

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity);

	/**
	 * @return the orderDate
	 */
	public String getOrderDate();

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate);

	/**
	 * @return the totalAmount
	 */
	public long getTotalAmount();

	/**
	 * @param totalAmount
	 *            the totalAmount to set
	 */
	public void setTotalAmount(long totalAmount);

}
