package com.samples.springcoredi;

public class Shoppingcart {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Shpooingcart [item=" + item + "]";
	}
	

}
