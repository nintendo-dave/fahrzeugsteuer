package ch.fahrzeugsteuer;

import org.junit.Test;

public class VehicleTaxCalculator {
	public int getPriceFromCcm(int ccm) {
		int price = 0;
		if (ccm <= 6000) {
			price = 1258;
			if (ccm <= 5500) {
				price = 1180;
				if (ccm <= 5000) {
					price = 958;
					if (ccm <= 4500) {
						price = 808;
						if (ccm <= 4000) {
							price = 658;
							if (ccm <= 3500) {
								price = 508;
								if (ccm <= 3000) {
									price = 358;
									if (ccm <= 2500) {
										price = 208;
										if (ccm <= 2000) {
											price = 148;
											if (ccm <= 1800) {
												price = 128;
												if (ccm <= 1600) {
													price = 108;
													if (ccm <= 1400) {
														price = 88;
														if (ccm <= 1200) {
															price = 69;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			price = 1258;
		}

		return price;
	}
}
