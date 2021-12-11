package models;

/**
 *
 *
 */
public interface FurnitureDAO {

	/*
	 * Getter Setter for the member variables
	 */
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
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name);

	/**
	 * @return the type
	 */
	public String getType();

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type);

	/**
	 * @return the room
	 */
	public String getRoom();

	/**
	 * @param room
	 *            the room to set
	 */
	public void setRoom(String room);

	/**
	 * @return the price
	 */
	public int getPrice();

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price);

	/**
	 * @return the image
	 */
	public String getImage();

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(String image);
}
