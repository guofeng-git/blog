//package test.qrCode;
//
//import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
//import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
//import org.bouncycastle.crypto.params.ECPublicKeyParameters;
//import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
//
//import jieyi.accservice.utils.sm2.SM2Util;
//
//
//public class SM2UtilTest {
//    public static final byte[] SRC_DATA = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
//    public static final byte[] SRC_DATA_16B = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
//    public static final byte[] SRC_DATA_24B = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
//    public static final byte[] SRC_DATA_32B = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
//    public static final byte[] WITH_ID = new byte[]{1, 2, 3, 4};
//    
//    public static void main(String[] args) {
//    	testSignAndVerify();
//	}
//    
//    public static void testSignAndVerify() {
//        try {
//            AsymmetricCipherKeyPair keyPair = SM2Util.generateKeyPairParameter();
//            ECPrivateKeyParameters priKey = (ECPrivateKeyParameters) keyPair.getPrivate();
//            ECPublicKeyParameters pubKey = (ECPublicKeyParameters) keyPair.getPublic();
//
//            System.out.println("Pri Hex:"
//                + ByteUtils.toHexString(priKey.getD().toByteArray()).toUpperCase());
//            System.out.println("Pub X Hex:"
//                + ByteUtils.toHexString(pubKey.getQ().getAffineXCoord().getEncoded()).toUpperCase());
//            System.out.println("Pub X Hex:"
//                + ByteUtils.toHexString(pubKey.getQ().getAffineYCoord().getEncoded()).toUpperCase());
//            System.out.println("Pub Point Hex:"
//                + ByteUtils.toHexString(pubKey.getQ().getEncoded(false)).toUpperCase());
//
//            byte[] sign = SM2Util.sign(priKey, WITH_ID, SRC_DATA);
//            System.out.println("SM2 sign with withId result:\n" + ByteUtils.toHexString(sign));
//            byte[] rawSign = SM2Util.decodeDERSM2Sign(sign);
//            sign = SM2Util.encodeSM2SignToDER(rawSign);
//            System.out.println("SM2 sign with withId result:\n" + ByteUtils.toHexString(sign));
//            boolean flag = SM2Util.verify(pubKey, WITH_ID, SRC_DATA, sign);
//            if (!flag) {
//            	System.err.println("verify failed");
//            }
//
//            sign = SM2Util.sign(priKey, SRC_DATA);
//            System.out.println("SM2 sign without withId result:\n" + ByteUtils.toHexString(sign));
//            flag = SM2Util.verify(pubKey, SRC_DATA, sign);
//            if (!flag) {
//            	System.err.println("verify failed");
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//}
