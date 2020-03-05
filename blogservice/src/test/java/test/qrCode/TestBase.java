package test.qrCode;

import jieyi.accservice.utils.PubMethodUtil;

/**
 * @author Hongzhao.wu
 */

public class TestBase {
	static String moudules = "D7DD644D9460387200D39BE3EE68E832D7B47B08A87BC49904A71CC37FF98D02357B6E051319B739641733366E8B40978E550FDC8E5C1AE95A0A05D5E49CB9CEA2F91CC3A77290E20157CAD972F80826176984FEAAA7ABBD4A0CE830751155F4BBEA647DCBE6FEBC2878883D3BF3D4923B0DCE2B100381135BAFA286B00E4481";
	static String privKey = "B33B38800DB582C86D9545B790097CDA522DA18643D6581B3138CBF22B3CF9EE9E977877302FC6E919090655A89D68A92DDDC4C8BD4F0E6D387C5FF203DA798EE96B6D8D6BCCE2E616D19A9CD110D58CB4430EB4FD3CE5C697F50025E5427336546ED232A4DF104267155549D87DEF99DF5865E13406AC19889E7E0F3C81B351";
	static String pubKey = "10001";

	public static String getSignCode(String json) {
		String signdata = null;
		try {
			signdata = PubMethodUtil.autograph(json, moudules, privKey);
			System.out.println("---签名数据：" + signdata);
			return signdata;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return signdata;
	}
}