
package AbstractFactory.giftPack;

import AbstractFactory.Packaging;
import AbstractFactory.packaging.HardPlasticBox;
import AbstractFactory.packaging.HolidaySurpriseWrap;
import AbstractFactory.packaging.MerchantCollectionBag;

public class BusinessGiftPack extends GiftPack {

	private Packaging packaging;

	@Override
	public Packaging packageGift(String packagingType) {
		if (packagingType.equals("bag")) {
			packaging = new MerchantCollectionBag(0.50);
		}
		if (packagingType.equals("box")) {
			packaging = new HardPlasticBox(1.00);

		}
		if (packagingType.equals("wrap")) {
			packaging = new HolidaySurpriseWrap(0.25);
		}
		return packaging;

	}
}
