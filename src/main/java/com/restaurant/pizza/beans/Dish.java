package com.restaurant.pizza.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Dish extends BaseBean {

	private static final long serialVersionUID = 1L;

	public Dish() {
		super();
	}

	@Column(name = "dish_name")
	private String DishName;
	@Column(name = "ingredients")
	private String Ingredients;
	@Column(name = "price")
	private String Price;
	@Column(name = "contains_ham")
	private String ConatinsHam;

	public String getDishName() {
		return DishName;
	}

	public void setDishName(String dishName) {
		DishName = dishName;
	}

	public String getIngredients() {
		return Ingredients;
	}

	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getConatinsHam() {
		return ConatinsHam;
	}

	public void setConatinsHam(String conatinsHam) {
		ConatinsHam = conatinsHam;
	}

	@Override
	public String toString() {
		return "Dish [ DishName=" + DishName + ", ingredients=" + Ingredients + ", Price=" + Price + ", containsham="
				+ ConatinsHam + "]";
	}

}
