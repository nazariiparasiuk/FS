package models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *
 */
public class Order implements OrderDAO {

	private int id;
	private int furniture_id;
	private int user_id;
	private int quantity;
	private Date orderDate;
	private long totalAmount;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

	/**
	 * @param id
	 * @param furniture_id
	 * @param user_id
	 * @param quantity
	 * @param orderDate
	 */
	public Order(int id, int furniture_id, int user_id, int quantity,
			long totalAmount, Date orderDate) {
		this.id = id;
		this.furniture_id = furniture_id;
		this.user_id = user_id;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}

	/**
	 * @param furniture_id
	 * @param user_id
	 * @param quantity
	 * @param date
	 * @param orderDate
	 */
	public Order(int furniture_id, int user_id, int quantity,
			long totalAmount) {
		this.furniture_id = furniture_id;
		this.user_id = user_id;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the furniture_id
	 */
	public int getFurniture_id() {
		return furniture_id;
	}

	/**
	 * @param furniture_id
	 *            the furniture_id to set
	 */
	public void setFurniture_id(int furniture_id) {
		this.furniture_id = furniture_id;
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return sdf.format(orderDate);
	}

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the totalAmount
	 */
	public long getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount
	 *            the totalAmount to set
	 */
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
}
