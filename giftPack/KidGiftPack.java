
package AbstractFactory.giftPack;

import AbstractFactory.Packaging;
import AbstractFactory.packaging.CartoonBox;
import AbstractFactory.packaging.HappyKidGiftWrap;
import AbstractFactory.packaging.MickyGiftBag;

public class KidGiftPack extends GiftPack {
	private Packaging packaging;

	@Override
	public Packaging packageGift(String packagingType) {
		if (packagingType.equals("box")) {
			packaging = new CartoonBox(0.50);
		}
		if (packagingType.equals("bag")) {
			packaging = new MickyGiftBag(0.25);
		}
		if (packagingType.equals("wrap")) {
			packaging = new HappyKidGiftWrap(0.10);
		}
		return packaging;
	}
}
