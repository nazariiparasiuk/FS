package models;

/**
 * 
 *
 */
public class Furniture implements FurnitureDAO {

	private int id;
	private String name;
	private String type;
	private String room;
	private int price;
	private String image;

	public Furniture() {
		this.id = 0;
		this.name = "";
		this.type = "";
		this.room = "";
		this.price = 0;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param id
	 * @param name
	 * @param type
	 * @param room
	 * @param price
	 * @param image
	 */
	public Furniture(int id, String name, String type, String room, int price,
			String image) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.room = room;
		this.price = price;
		if (image == null)
			this.image = "static/img/furniture/default.png";
		else
			this.image = "static/img/furniture/" + image + ".png";
	}

	/*
	 * Getter Setter for the member variables
	 */
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * @param room
	 *            the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

}
