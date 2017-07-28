
package AbstractFactory.giftPack;

import java.util.List;

import AbstractFactory.Address;
import AbstractFactory.GiftItem;
import AbstractFactory.Packaging;

public abstract class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private String packType; // 'Business','Adults', or 'Kids'

	public abstract Packaging packageGift(String packaging);

	public List<GiftItem> getGiftItems() {
		return giftItems;
	}

	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	@Override
	public String toString() {
		return "GiftPack [giftItems=" + giftItems + ", shippingAddress=" + shippingAddress + ", packType=" + packType
				+ "]";
	}
}
