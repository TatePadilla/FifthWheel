/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */

package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "fifthwheel")
@Table(name = "fifthwheel")
public class FifthWheel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;

	private String manufacturer;
	private String brand;
	private String model;
	private double rating;

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}