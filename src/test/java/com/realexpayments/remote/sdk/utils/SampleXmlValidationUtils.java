package com.realexpayments.remote.sdk.utils;

import org.junit.Assert;

import com.realexpayments.remote.sdk.RealexServerException;
import com.realexpayments.remote.sdk.domain.Card.CardType;
import com.realexpayments.remote.sdk.domain.Cvn.PresenceIndicator;
import com.realexpayments.remote.sdk.domain.payment.Address.AddressType;
import com.realexpayments.remote.sdk.domain.payment.AutoSettle.AutoSettleFlag;
import com.realexpayments.remote.sdk.domain.payment.PaymentRequest;
import com.realexpayments.remote.sdk.domain.payment.PaymentRequest.PaymentType;
import com.realexpayments.remote.sdk.domain.payment.PaymentResponse;
import com.realexpayments.remote.sdk.domain.payment.Recurring.RecurringFlag;
import com.realexpayments.remote.sdk.domain.payment.Recurring.RecurringSequence;
import com.realexpayments.remote.sdk.domain.payment.Recurring.RecurringType;
import com.realexpayments.remote.sdk.domain.threeDSecure.ThreeDSecureRequest;
import com.realexpayments.remote.sdk.domain.threeDSecure.ThreeDSecureRequest.ThreeDSecureType;
import com.realexpayments.remote.sdk.domain.threeDSecure.ThreeDSecureResponse;

/**
 * Unit testing utility class to validate the sample XML files. 
 * 
 * @author markstanford
 *
 */
public class SampleXmlValidationUtils {

	public static final String SECRET = "mysecret";

	//payment sample XML
	public static final String PAYMENT_REQUEST_XML_PATH = "/sample-xml/payment-request-sample.xml";
	public static final String PAYMENT_RESPONSE_XML_PATH = "/sample-xml/payment-response-sample.xml";
	public static final String PAYMENT_RESPONSE_BASIC_ERROR_XML_PATH = "/sample-xml/payment-response-basic-error-sample.xml";
	public static final String PAYMENT_RESPONSE_FULL_ERROR_XML_PATH = "/sample-xml/payment-response-full-error-sample.xml";
	public static final String PAYMENT_RESPONSE_XML_PATH_UNKNOWN_ELEMENT = "/sample-xml/payment-response-sample-unknown-element.xml";

	//3DSecure sample XML
	public static final String THREE_D_SECURE_VERIFY_ENROLLED_REQUEST_XML_PATH = "/sample-xml/3ds-verify-enrolled-request-sample.xml";
	public static final String THREE_D_SECURE_VERIFY_ENROLLED_RESPONSE_XML_PATH = "/sample-xml/3ds-verify-enrolled-response-sample.xml";
	public static final String THREE_D_SECURE_VERIFY_ENROLLED_NOT_ENROLLED_RESPONSE_XML_PATH = "/sample-xml/3ds-verify-enrolled-response-sample-not-enrolled.xml";
	public static final String THREE_D_SECURE_VERIFY_SIG_REQUEST_XML_PATH = "/sample-xml/3ds-verify-sig-request-sample.xml";
	public static final String THREE_D_SECURE_VERIFY_SIG_RESPONSE_XML_PATH = "/sample-xml/3ds-verify-sig-response-sample.xml";

	//other request types sample XML
	public static final String MOBILE_AUTH_PAYMENT_REQUEST_XML_PATH = "/sample-xml/auth-mobile-payment-request-sample.xml";
	public static final String SETTLE_PAYMENT_REQUEST_XML_PATH = "/sample-xml/settle-payment-request-sample.xml";
	public static final String VOID_PAYMENT_REQUEST_XML_PATH = "/sample-xml/void-payment-request-sample.xml";
	public static final String REBATE_PAYMENT_REQUEST_XML_PATH = "/sample-xml/rebate-payment-request-sample.xml";
	public static final String OTB_PAYMENT_REQUEST_XML_PATH = "/sample-xml/otb-payment-request-sample.xml";
	public static final String CREDIT_PAYMENT_REQUEST_XML_PATH = "/sample-xml/credit-payment-request-sample.xml";
	public static final String HOLD_PAYMENT_REQUEST_XML_PATH = "/sample-xml/hold-payment-request-sample.xml";
	public static final String RELEASE_PAYMENT_REQUEST_XML_PATH = "/sample-xml/release-payment-request-sample.xml";

	//Card
	public static final String CARD_NUMBER = "420000000000000000";
	public static final CardType CARD_TYPE = CardType.VISA;
	public static final String CARD_HOLDER_NAME = "Joe Smith";
	public static final String CARD_CVN_NUMBER = "123";
	public static final PresenceIndicator CARD_CVN_PRESENCE = PresenceIndicator.CVN_PRESENT;
	public static final String CARD_EXPIRY_DATE = "0119";
	public static final Integer CARD_ISSUE_NUMBER = 1;

	//PaymentRequest
	public static final String ACCOUNT = "internet";
	public static final String MERCHANT_ID = "thestore";
	public static final Long AMOUNT = 29900l;
	public static final String CURRENCY = "EUR";
	public static final AutoSettleFlag AUTO_SETTLE_FLAG = AutoSettleFlag.MULTI;
	public static final String TIMESTAMP = "20151201094345";
	public static final String CHANNEL = "yourChannel";
	public static final String ORDER_ID = "ORD453-11";
	public static final String REQUEST_HASH = "085f09727da50c2392b64894f962e7eb5050f762";
	public static final String COMMENT1 = "comment 1";
	public static final String COMMENT2 = "comment 2";
	public static final String REFUND_HASH = "hjfdg78h34tyvklasjr89t";
	public static final String FRAUD_FILTER = "fraud filter";
	public static final String CUSTOMER_NUMBER = "cust num";
	public static final String PRODUCT_ID = "prod ID";
	public static final String VARIABLE_REFERENCE = "variable ref 1234";
	public static final String CUSTOMER_IP = "127.0.0.1";

	//Recurring
	public static final RecurringType RECURRING_TYPE = RecurringType.FIXED;
	public static final RecurringFlag RECURRING_FLAG = RecurringFlag.ONE;
	public static final RecurringSequence RECURRING_SEQUENCE = RecurringSequence.FIRST;

	//Address
	public static final AddressType ADDRESS_TYPE_BUSINESS = AddressType.BILLING;
	public static final String ADDRESS_CODE_BUSINESS = "21|578";
	public static final String ADDRESS_COUNTRY_BUSINESS = "IE";

	public static final AddressType ADDRESS_TYPE_SHIPPING = AddressType.SHIPPING;
	public static final String ADDRESS_CODE_SHIPPING = "77|9876";
	public static final String ADDRESS_COUNTRY_SHIPPING = "GB";

	//response fields
	public static final String ACQUIRER_RESPONSE = "<response>test acquirer response</response>";
	public static final Long AUTH_TIME_TAKEN = 1001l;
	public static final Long BATCH_ID = -1L;
	public static final String BANK = "bank";
	public static final String COUNTRY = "Ireland";
	public static final String COUNTRY_CODE = "IE";
	public static final String REGION = "Dublin";
	public static final String CVN_RESULT = "M";
	public static final String MESSAGE = "Successful";
	public static final String RESULT_SUCCESS = "00";
	public static final Long TIME_TAKEN = 54564L;
	public static final String TSS_RESULT = "67";
	public static final String TSS_RESULT_CHECK1_ID = "1";
	public static final String TSS_RESULT_CHECK2_ID = "2";
	public static final String TSS_RESULT_CHECK1_VALUE = "99";
	public static final String TSS_RESULT_CHECK2_VALUE = "199";
	public static final String RESPONSE_HASH = "368df010076481d47a21e777871012b62b976339";
	public static final String PASREF = "3737468273643";
	public static final String AUTH_CODE = "79347";
	public static final String AVS_POSTCODE = "M";
	public static final String AVS_ADDRESS = "P";
	public static final String MOBILE = "apple-pay";
	public static final String TIMESTAMP_RESPONSE = "20120926112654";

	//basic response error fields
	public static final String MESSAGE_BASIC_ERROR = "error message returned from system";
	public static final String RESULT_BASIC_ERROR = "508";
	public static final String TIMESTAMP_BASIC_ERROR = "20120926112654";
	public static final String ORDER_ID_BASIC_ERROR = "ORD453-11";

	//basic response error fields
	public static final String RESULT_FULL_ERROR = "101";
	public static final String MESSAGE_FULL_ERROR = "Bank Error";
	public static final String RESPONSE_FULL_ERROR_HASH = "0ad8a9f121c4041b4b832ae8069e80674269e22f";

	//3DS request fields
	public static final String THREE_D_SECURE_VERIFY_ENROLLED_REQUEST_HASH = "085f09727da50c2392b64894f962e7eb5050f762";
	public static final String THREE_D_SECURE_VERIFY_SIG_REQUEST_HASH = "085f09727da50c2392b64894f962e7eb5050f762";

	//3DS response fields
	public static final String THREE_D_SECURE_ENROLLED_RESULT = "00";
	public static final String THREE_D_SECURE_SIG_RESULT = "00";
	public static final String THREE_D_SECURE_NOT_ENROLLED_RESULT = "110";
	public static final String THREE_D_SECURE_ENROLLED_MESSAGE = "Enrolled";
	public static final String THREE_D_SECURE_SIG_MESSAGE = "Authentication Successful";
	public static final String THREE_D_SECURE_NOT_ENROLLED_MESSAGE = "Not Enrolled";
	public static final String THREE_D_SECURE_PAREQ = "eJxVUttygkAM/ZUdnitZFlBw4na02tE6bR0vD+0bLlHpFFDASv++u6i1";
	public static final String THREE_D_SECURE_PARES = "eJxVUttygkAM/ZUdnitZFlBw4na02tE6bR0vD+0bLlHpFFDASv++u6i1";
	public static final String THREE_D_SECURE_URL = "http://myurl.com";
	public static final String THREE_D_SECURE_ENROLLED_NO = "N";
	public static final String THREE_D_SECURE_ENROLLED_YES = "Y";
	public static final String THREE_D_SECURE_STATUS = "Y";
	public static final String THREE_D_SECURE_ECI = "5";
	public static final String THREE_D_SECURE_XID = "e9dafe706f7142469c45d4877aaf5984";
	public static final String THREE_D_SECURE_CAVV = "AAABASY3QHgwUVdEBTdAAAAAAAA=";
	public static final String THREE_D_SECURE_ALGORITHM = "1";
	public static final String THREE_D_SECURE_NOT_ENROLLED_RESPONSE_HASH = "e553ff2510dec9bfee79bb0303af337d871c02ad";
	public static final String THREE_D_SECURE_ENROLLED_RESPONSE_HASH = "728cdbef90ff535ed818748f329ed8b1df6b8f5a";
	public static final String THREE_D_SECURE_SIG_RESPONSE_HASH = "e5a7745da5dc32d234c3f52860132c482107e9ac";

	//auth-mobile fields
	public static final String AUTH_MOBILE_TIMESTAMP = "20150820154047";
	public static final String AUTH_MOBILE_MERCHANT_ID = "thestore";
	public static final String AUTH_MOBILE_ACCOUNT = "internet";
	public static final String AUTH_MOBILE_ORDER_ID = "8cdbf036-73e2-44ff-bf11-eba8cab33a14";
	public static final String AUTH_MOBILE_MOBILE = "apple-pay";
	public static final AutoSettleFlag AUTH_MOBILE_AUTOSETTLE_FLAG = AutoSettleFlag.TRUE;
	public static final String AUTH_MOBILE_TOKEN = "{\"version\":\"EC_v1\",\"data\":\"Ft+dvmdfgnsdfnbg+zerKtkh/RWWjdfgdjhHGFHGFlkjdfgkljlkfs78678hEPnsbXZnMDy3o7qDg+iDHB0JVEjDHxjQIAPcNN1Cqdtq63nX4+VRU3eXzdo1QGqSptH6D5KW5SxZLAdnMEmCxG9vkVEdHTTlhVPddxiovAkFTBWBFTJ2uf5f2grXC/VnK0X/efAowXrhJIX1ngsGfAk3/EVRzADGHJFGHJKH78hjkhdfgih80UU05zSluzATidvvBoHBz/WpytSYyrUx1QI9nyH/Nbv8f8lOUjPzBFb+EFOzJaIf+fr0swKU6EB2/2Sm0Y20mD0IvyomtKQ7Tf3VHKA7zhFrDvZUdtX808oHnrqDFRAQZHWAppGUVstqkOyibA0C4suxnOQlsQNZT0r70Tz84=\",\"signature\":\"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\",\"header\":{\"ephemeralPublicKey\":\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEWdNhNAHy9kO2Kol33kIh7k6wh6E/lxriM46MR1FUrn7SHugprkaeFmWKZPgGpWgZ+telY/G1+YSoaCbR57bdGA==\",\"transactionId\":\"fd88874954acdb29976gfnjd784ng8ern8BDF8gT7G3fd4ebc22a864398684198644c3\",\"publicKeyHash\":\"h7njghUJVz2gmpTSkHqETOWsskhsdfjj4mgf3sPTS2cBxgrk=\"}}";
	public static final String AUTH_MOBILE_REQUEST_HASH = "b13f183cd3ea2a0b63033fb53bdeb4894c684643";

	//settle fields
	public static final String SETTLE_TIMESTAMP = "20151204133035";
	public static final String SETTLE_MERCHANT_ID = "thestore";
	public static final String SETTLE_ACCOUNT = "internet";
	public static final String SETTLE_PASREF = "13276780809850";
	public static final String SETTLE_AUTH_CODE = "AP1234";
	public static final String SETTLE_AMOUNT = "1000";
	public static final String SETTLE_CURRENCY = "EUR";
	public static final String SETTLE_ORDER_ID = "e3cf94c6-f674-4f99-b4db-7541254a8767";
	public static final String SETTLE_REQUEST_HASH = "b2e110f78803ccb377e8f3f12730e41d0cb0ed66";

	//void fields
	public static final String VOID_TIMESTAMP = "20151204142728";
	public static final String VOID_MERCHANT_ID = "thestore";
	public static final String VOID_ACCOUNT = "internet";
	public static final String VOID_PASREF = "13276780809851";
	public static final String VOID_AUTH_CODE = "AP12345";
	public static final String VOID_ORDER_ID = "012bf34b-3ec9-4c9b-b3a5-700f2f28e67f";
	public static final String VOID_REQUEST_HASH = "9f61456cce6c90dcc13281e6b95734f5b91e628f";

	//rebate fields
	public static final String REBATE_TIMESTAMP = "20151204145825";
	public static final String REBATE_MERCHANT_ID = "thestore";
	public static final String REBATE_ACCOUNT = "internet";
	public static final String REBATE_PASREF = "13276780809852";
	public static final String REBATE_AUTH_CODE = "AP12346";
	public static final String REBATE_AMOUNT = "3000";
	public static final String REBATE_CURRENCY = "EUR";
	public static final String REBATE_ORDER_ID = "6df026a7-15d6-4b92-86e1-9f7b2b1d97c5";
	public static final String REBATE_REFUND_HASH = "52ed08590ab0bb6c2e5e4c9584aca0f6e9635a3a";
	public static final String REBATE_REQUEST_HASH = "c1319b2999608fcfa3e71d583627affaeb25d961";

	//OTB fields
	public static final String OTB_ACCOUNT = "internet";
	public static final String OTB_MERCHANT_ID = "thestore";
	public static final AutoSettleFlag OTB_AUTO_SETTLE_FLAG = AutoSettleFlag.TRUE;
	public static final String OTB_TIMESTAMP = "20151204152333";
	public static final String OTB_ORDER_ID = "3be87fe9-db95-470f-ab04-b82f965f5b17";
	public static final String OTB_REQUEST_HASH = "c05460fa3d195c1ee6ac97d3594e8cace4449cb2";

	//credit fields
	public static final String CREDIT_TIMESTAMP = "20151204145825";
	public static final String CREDIT_MERCHANT_ID = "thestore";
	public static final String CREDIT_ACCOUNT = "internet";
	public static final String CREDIT_PASREF = "13276780809852";
	public static final String CREDIT_AUTH_CODE = "AP12346";
	public static final String CREDIT_AMOUNT = "3000";
	public static final String CREDIT_CURRENCY = "EUR";
	public static final String CREDIT_ORDER_ID = "6df026a7-15d6-4b92-86e1-9f7b2b1d97c5";
	public static final String CREDIT_REFUND_HASH = "52ed08590ab0bb6c2e5e4c9584aca0f6e9635a3a";
	public static final String CREDIT_REQUEST_HASH = "c1319b2999608fcfa3e71d583627affaeb25d961";

	//hold fields
	public static final String HOLD_TIMESTAMP = "20151204161419";
	public static final String HOLD_MERCHANT_ID = "thestore";
	public static final String HOLD_ACCOUNT = "internet";
	public static final String HOLD_PASREF = "ABC123456";
	public static final String HOLD_ORDER_ID = "292af5fa-6cbc-43d5-b2f0-7fd134d78d95";
	public static final String HOLD_REQUEST_HASH = "eec6d1f5dcc51a6a2d2b59af5d2cdb965806d96c";

	//release fields
	public static final String RELEASE_TIMESTAMP = "20151204161419";
	public static final String RELEASE_MERCHANT_ID = "thestore";
	public static final String RELEASE_ACCOUNT = "internet";
	public static final String RELEASE_PASREF = "ABC123456";
	public static final String RELEASE_ORDER_ID = "292af5fa-6cbc-43d5-b2f0-7fd134d78d95";
	public static final String RELEASE_REQUEST_HASH = "eec6d1f5dcc51a6a2d2b59af5d2cdb965806d96c";

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.AUTH.getType(), fromXmlRequest.getType());
		Assert.assertEquals(CARD_NUMBER, fromXmlRequest.getCard().getNumber());
		Assert.assertEquals(CARD_TYPE.getType(), fromXmlRequest.getCard().getType());
		Assert.assertEquals(CARD_HOLDER_NAME, fromXmlRequest.getCard().getCardHolderName());
		Assert.assertEquals(String.valueOf(CARD_CVN_NUMBER), String.valueOf(fromXmlRequest.getCard().getCvn().getNumber()));
		Assert.assertEquals(CARD_CVN_PRESENCE.getIndicator(), fromXmlRequest.getCard().getCvn().getPresenceIndicator());
		Assert.assertEquals(String.valueOf(CARD_ISSUE_NUMBER), String.valueOf(fromXmlRequest.getCard().getIssueNumber()));
		Assert.assertEquals(CARD_EXPIRY_DATE, fromXmlRequest.getCard().getExpiryDate());
		Assert.assertEquals(ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(String.valueOf(AMOUNT), fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(AUTO_SETTLE_FLAG.getFlag(), fromXmlRequest.getAutoSettle().getFlag());
		Assert.assertEquals(TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(CHANNEL, fromXmlRequest.getChannel());
		Assert.assertEquals(ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(COMMENT1, fromXmlRequest.getComments().get(0).getComment());
		Assert.assertEquals("1", fromXmlRequest.getComments().get(0).getId().toString());
		Assert.assertEquals(COMMENT2, fromXmlRequest.getComments().get(1).getComment());
		Assert.assertEquals("2", fromXmlRequest.getComments().get(1).getId().toString());
		Assert.assertEquals(PASREF, fromXmlRequest.getPaymentsReference());
		Assert.assertEquals(AUTH_CODE, fromXmlRequest.getAuthCode());
		Assert.assertEquals(REFUND_HASH, fromXmlRequest.getRefundHash());
		Assert.assertEquals(FRAUD_FILTER, fromXmlRequest.getFraudFilter());
		Assert.assertEquals(RECURRING_FLAG.getRecurringFlag(), fromXmlRequest.getRecurring().getFlag());
		Assert.assertEquals(RECURRING_TYPE.getType(), fromXmlRequest.getRecurring().getType());
		Assert.assertEquals(RECURRING_SEQUENCE.getSequence(), fromXmlRequest.getRecurring().getSequence());
		Assert.assertEquals(CUSTOMER_NUMBER, fromXmlRequest.getTssInfo().getCustomerNumber());
		Assert.assertEquals(PRODUCT_ID, fromXmlRequest.getTssInfo().getProductId());
		Assert.assertEquals(VARIABLE_REFERENCE, fromXmlRequest.getTssInfo().getVariableReference());
		Assert.assertEquals(CUSTOMER_IP, fromXmlRequest.getTssInfo().getCustomerIpAddress());
		Assert.assertEquals(ADDRESS_TYPE_BUSINESS.getAddressType(), fromXmlRequest.getTssInfo().getAddresses().get(0).getType());
		Assert.assertEquals(ADDRESS_CODE_BUSINESS, fromXmlRequest.getTssInfo().getAddresses().get(0).getCode());
		Assert.assertEquals(ADDRESS_COUNTRY_BUSINESS, fromXmlRequest.getTssInfo().getAddresses().get(0).getCountry());
		Assert.assertEquals(ADDRESS_TYPE_SHIPPING.getAddressType(), fromXmlRequest.getTssInfo().getAddresses().get(1).getType());
		Assert.assertEquals(ADDRESS_CODE_SHIPPING, fromXmlRequest.getTssInfo().getAddresses().get(1).getCode());
		Assert.assertEquals(ADDRESS_COUNTRY_SHIPPING, fromXmlRequest.getTssInfo().getAddresses().get(1).getCountry());
		Assert.assertEquals(THREE_D_SECURE_CAVV, fromXmlRequest.getMpi().getCavv());
		Assert.assertEquals(THREE_D_SECURE_XID, fromXmlRequest.getMpi().getXid());
		Assert.assertEquals(THREE_D_SECURE_ECI, fromXmlRequest.getMpi().getEci());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledMobileAuthPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.AUTH_MOBILE.getType(), fromXmlRequest.getType());
		Assert.assertEquals(AUTH_MOBILE_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(AUTH_MOBILE_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(AUTH_MOBILE_AUTOSETTLE_FLAG.getFlag(), fromXmlRequest.getAutoSettle().getFlag());
		Assert.assertEquals(AUTH_MOBILE_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(AUTH_MOBILE_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(AUTH_MOBILE_MOBILE, fromXmlRequest.getMobile());
		Assert.assertEquals(AUTH_MOBILE_TOKEN, fromXmlRequest.getToken());
		Assert.assertEquals(AUTH_MOBILE_REQUEST_HASH, fromXmlRequest.getHash());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledSettlePaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.SETTLE.getType(), fromXmlRequest.getType());
		Assert.assertEquals(SETTLE_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(SETTLE_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(SETTLE_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(SETTLE_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(SETTLE_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(SETTLE_AMOUNT, fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(SETTLE_CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(SETTLE_PASREF, fromXmlRequest.getPaymentsReference());
		Assert.assertEquals(SETTLE_AUTH_CODE, fromXmlRequest.getAuthCode());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledVoidPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.VOID.getType(), fromXmlRequest.getType());
		Assert.assertEquals(VOID_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(VOID_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(VOID_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(VOID_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(VOID_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(VOID_PASREF, fromXmlRequest.getPaymentsReference());
		Assert.assertEquals(VOID_AUTH_CODE, fromXmlRequest.getAuthCode());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledRebatePaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.REBATE.getType(), fromXmlRequest.getType());
		Assert.assertEquals(REBATE_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(REBATE_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(REBATE_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(REBATE_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(REBATE_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(REBATE_AMOUNT, fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(REBATE_CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(REBATE_PASREF, fromXmlRequest.getPaymentsReference());
		Assert.assertEquals(REBATE_AUTH_CODE, fromXmlRequest.getAuthCode());
		Assert.assertEquals(REBATE_REFUND_HASH, fromXmlRequest.getRefundHash());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledOtbPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.OTB.getType(), fromXmlRequest.getType());
		Assert.assertEquals(CARD_NUMBER, fromXmlRequest.getCard().getNumber());
		Assert.assertEquals(CARD_TYPE.getType(), fromXmlRequest.getCard().getType());
		Assert.assertEquals(CARD_HOLDER_NAME, fromXmlRequest.getCard().getCardHolderName());
		Assert.assertEquals(String.valueOf(CARD_CVN_NUMBER), String.valueOf(fromXmlRequest.getCard().getCvn().getNumber()));
		Assert.assertEquals(CARD_CVN_PRESENCE.getIndicator(), fromXmlRequest.getCard().getCvn().getPresenceIndicator());
		Assert.assertEquals(String.valueOf(CARD_ISSUE_NUMBER), String.valueOf(fromXmlRequest.getCard().getIssueNumber()));
		Assert.assertEquals(CARD_EXPIRY_DATE, fromXmlRequest.getCard().getExpiryDate());
		Assert.assertEquals(OTB_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(OTB_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(OTB_AUTO_SETTLE_FLAG.getFlag(), fromXmlRequest.getAutoSettle().getFlag());
		Assert.assertEquals(OTB_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(OTB_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(OTB_REQUEST_HASH, fromXmlRequest.getHash());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledCreditPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.CREDIT.getType(), fromXmlRequest.getType());
		Assert.assertEquals(CREDIT_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(CREDIT_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(CREDIT_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(CREDIT_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(CREDIT_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(CREDIT_AMOUNT, fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(CREDIT_CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(CREDIT_PASREF, fromXmlRequest.getPaymentsReference());
		Assert.assertEquals(CREDIT_AUTH_CODE, fromXmlRequest.getAuthCode());
		Assert.assertEquals(CREDIT_REFUND_HASH, fromXmlRequest.getRefundHash());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledHoldPaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.HOLD.getType(), fromXmlRequest.getType());
		Assert.assertEquals(HOLD_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(HOLD_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(HOLD_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(HOLD_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(HOLD_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(HOLD_PASREF, fromXmlRequest.getPaymentsReference());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledReleasePaymentRequest(PaymentRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(PaymentType.RELEASE.getType(), fromXmlRequest.getType());
		Assert.assertEquals(RELEASE_ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(RELEASE_MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(RELEASE_TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(RELEASE_ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(RELEASE_REQUEST_HASH, fromXmlRequest.getHash());
		Assert.assertEquals(RELEASE_PASREF, fromXmlRequest.getPaymentsReference());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkUnmarshalledPaymentResponse(PaymentResponse fromXmlResponse) {
		Assert.assertEquals(ACCOUNT, fromXmlResponse.getAccount());
		Assert.assertEquals(ACQUIRER_RESPONSE, fromXmlResponse.getAcquirerResponse());
		Assert.assertEquals(AUTH_CODE, fromXmlResponse.getAuthCode());
		Assert.assertEquals(AUTH_TIME_TAKEN.toString(), fromXmlResponse.getAuthTimeTaken().toString());
		Assert.assertEquals(BATCH_ID.toString(), fromXmlResponse.getBatchId().toString());
		Assert.assertEquals(BANK, fromXmlResponse.getCardIssuer().getBank());
		Assert.assertEquals(COUNTRY, fromXmlResponse.getCardIssuer().getCountry());
		Assert.assertEquals(COUNTRY_CODE, fromXmlResponse.getCardIssuer().getCountryCode());
		Assert.assertEquals(REGION, fromXmlResponse.getCardIssuer().getRegion());
		Assert.assertEquals(CVN_RESULT, fromXmlResponse.getCvnResult());
		Assert.assertEquals(MERCHANT_ID, fromXmlResponse.getMerchantId());
		Assert.assertEquals(MESSAGE, fromXmlResponse.getMessage());
		Assert.assertEquals(ORDER_ID, fromXmlResponse.getOrderId());
		Assert.assertEquals(PASREF, fromXmlResponse.getPaymentsReference());
		Assert.assertEquals(RESULT_SUCCESS, fromXmlResponse.getResult());
		Assert.assertEquals(RESPONSE_HASH, fromXmlResponse.getHash());
		Assert.assertEquals(TIMESTAMP_RESPONSE, fromXmlResponse.getTimeStamp());
		Assert.assertEquals(TIME_TAKEN.toString(), fromXmlResponse.getTimeTaken().toString());
		Assert.assertEquals(TSS_RESULT, fromXmlResponse.getTssResult().getResult());
		Assert.assertEquals(TSS_RESULT_CHECK1_ID, fromXmlResponse.getTssResult().getChecks().get(0).getId());
		Assert.assertEquals(TSS_RESULT_CHECK1_VALUE, fromXmlResponse.getTssResult().getChecks().get(0).getValue());
		Assert.assertEquals(TSS_RESULT_CHECK2_ID, fromXmlResponse.getTssResult().getChecks().get(1).getId());
		Assert.assertEquals(TSS_RESULT_CHECK2_VALUE, fromXmlResponse.getTssResult().getChecks().get(1).getValue());
		Assert.assertEquals(AVS_ADDRESS, fromXmlResponse.getAvsAddressResponse());
		Assert.assertEquals(AVS_POSTCODE, fromXmlResponse.getAvsPostcodeResponse());
		Assert.assertTrue(fromXmlResponse.isSuccess());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkBasicResponseError(RealexServerException ex) {
		Assert.assertEquals(RESULT_BASIC_ERROR, ex.getErrorCode());
		Assert.assertEquals(MESSAGE_BASIC_ERROR, ex.getMessage());
		Assert.assertEquals(TIMESTAMP_BASIC_ERROR, ex.getTimeStamp());
		Assert.assertEquals(ORDER_ID_BASIC_ERROR, ex.getOrderId());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkFullResponseError(PaymentResponse fromXmlResponse) {
		Assert.assertEquals(ACCOUNT, fromXmlResponse.getAccount());
		Assert.assertEquals(ACQUIRER_RESPONSE, fromXmlResponse.getAcquirerResponse());
		Assert.assertEquals(AUTH_CODE, fromXmlResponse.getAuthCode());
		Assert.assertEquals(AUTH_TIME_TAKEN.toString(), fromXmlResponse.getAuthTimeTaken().toString());
		Assert.assertEquals(BATCH_ID.toString(), fromXmlResponse.getBatchId().toString());
		Assert.assertEquals(BANK, fromXmlResponse.getCardIssuer().getBank());
		Assert.assertEquals(COUNTRY, fromXmlResponse.getCardIssuer().getCountry());
		Assert.assertEquals(COUNTRY_CODE, fromXmlResponse.getCardIssuer().getCountryCode());
		Assert.assertEquals(REGION, fromXmlResponse.getCardIssuer().getRegion());
		Assert.assertEquals(CVN_RESULT, fromXmlResponse.getCvnResult());
		Assert.assertEquals(MERCHANT_ID, fromXmlResponse.getMerchantId());
		Assert.assertEquals(MESSAGE_FULL_ERROR, fromXmlResponse.getMessage());
		Assert.assertEquals(ORDER_ID, fromXmlResponse.getOrderId());
		Assert.assertEquals(PASREF, fromXmlResponse.getPaymentsReference());
		Assert.assertEquals(RESULT_FULL_ERROR, fromXmlResponse.getResult());
		Assert.assertEquals(RESPONSE_FULL_ERROR_HASH, fromXmlResponse.getHash());
		Assert.assertEquals(TIMESTAMP_RESPONSE, fromXmlResponse.getTimeStamp());
		Assert.assertEquals(TIME_TAKEN.toString(), fromXmlResponse.getTimeTaken().toString());
		Assert.assertEquals(TSS_RESULT, fromXmlResponse.getTssResult().getResult());
		Assert.assertEquals(TSS_RESULT_CHECK1_ID, fromXmlResponse.getTssResult().getChecks().get(0).getId());
		Assert.assertEquals(TSS_RESULT_CHECK1_VALUE, fromXmlResponse.getTssResult().getChecks().get(0).getValue());
		Assert.assertEquals(TSS_RESULT_CHECK2_ID, fromXmlResponse.getTssResult().getChecks().get(1).getId());
		Assert.assertEquals(TSS_RESULT_CHECK2_VALUE, fromXmlResponse.getTssResult().getChecks().get(1).getValue());
		Assert.assertFalse(fromXmlResponse.isSuccess());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkUnmarshalledThreeDSecureNotEnrolledResponse(ThreeDSecureResponse fromXmlResponse) {
		Assert.assertEquals(ACCOUNT, fromXmlResponse.getAccount());
		Assert.assertEquals(AUTH_CODE, fromXmlResponse.getAuthCode());
		Assert.assertEquals(AUTH_TIME_TAKEN.toString(), fromXmlResponse.getAuthTimeTaken().toString());
		Assert.assertEquals(MERCHANT_ID, fromXmlResponse.getMerchantId());
		Assert.assertEquals(THREE_D_SECURE_NOT_ENROLLED_MESSAGE, fromXmlResponse.getMessage());
		Assert.assertEquals(ORDER_ID, fromXmlResponse.getOrderId());
		Assert.assertEquals(PASREF, fromXmlResponse.getPaymentsReference());
		Assert.assertEquals(THREE_D_SECURE_NOT_ENROLLED_RESULT, fromXmlResponse.getResult());
		Assert.assertEquals(THREE_D_SECURE_NOT_ENROLLED_RESPONSE_HASH, fromXmlResponse.getHash());
		Assert.assertEquals(TIMESTAMP, fromXmlResponse.getTimeStamp());
		Assert.assertEquals(TIME_TAKEN.toString(), fromXmlResponse.getTimeTaken().toString());
		Assert.assertEquals(THREE_D_SECURE_URL, fromXmlResponse.getUrl());
		Assert.assertEquals(THREE_D_SECURE_PAREQ, fromXmlResponse.getPareq());
		Assert.assertEquals(THREE_D_SECURE_ENROLLED_NO, fromXmlResponse.getEnrolled());
		Assert.assertEquals(THREE_D_SECURE_XID, fromXmlResponse.getXid());
		Assert.assertFalse(fromXmlResponse.isSuccess());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkUnmarshalledThreeDSecureEnrolledResponse(ThreeDSecureResponse fromXmlResponse) {
		Assert.assertEquals(ACCOUNT, fromXmlResponse.getAccount());
		Assert.assertEquals(AUTH_CODE, fromXmlResponse.getAuthCode());
		Assert.assertEquals(AUTH_TIME_TAKEN.toString(), fromXmlResponse.getAuthTimeTaken().toString());
		Assert.assertEquals(MERCHANT_ID, fromXmlResponse.getMerchantId());
		Assert.assertEquals(THREE_D_SECURE_ENROLLED_MESSAGE, fromXmlResponse.getMessage());
		Assert.assertEquals(ORDER_ID, fromXmlResponse.getOrderId());
		Assert.assertEquals(PASREF, fromXmlResponse.getPaymentsReference());
		Assert.assertEquals(THREE_D_SECURE_ENROLLED_RESULT, fromXmlResponse.getResult());
		Assert.assertEquals(THREE_D_SECURE_ENROLLED_RESPONSE_HASH, fromXmlResponse.getHash());
		Assert.assertEquals(TIMESTAMP_RESPONSE, fromXmlResponse.getTimeStamp());
		Assert.assertEquals(TIME_TAKEN.toString(), fromXmlResponse.getTimeTaken().toString());
		Assert.assertEquals(THREE_D_SECURE_URL, fromXmlResponse.getUrl());
		Assert.assertEquals(THREE_D_SECURE_PAREQ, fromXmlResponse.getPareq());
		Assert.assertEquals(THREE_D_SECURE_ENROLLED_YES, fromXmlResponse.getEnrolled());
		Assert.assertEquals(THREE_D_SECURE_XID, fromXmlResponse.getXid());
		Assert.assertTrue(fromXmlResponse.isSuccess());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlResponse
	 */
	public static void checkUnmarshalledThreeDSecureSigResponse(ThreeDSecureResponse fromXmlResponse) {
		Assert.assertEquals(ACCOUNT, fromXmlResponse.getAccount());
		Assert.assertEquals(MERCHANT_ID, fromXmlResponse.getMerchantId());
		Assert.assertEquals(THREE_D_SECURE_SIG_MESSAGE, fromXmlResponse.getMessage());
		Assert.assertEquals(ORDER_ID, fromXmlResponse.getOrderId());
		Assert.assertEquals(THREE_D_SECURE_SIG_RESULT, fromXmlResponse.getResult());
		Assert.assertEquals(THREE_D_SECURE_SIG_RESPONSE_HASH, fromXmlResponse.getHash());
		Assert.assertEquals(TIMESTAMP_RESPONSE, fromXmlResponse.getTimeStamp());
		Assert.assertEquals(THREE_D_SECURE_STATUS, fromXmlResponse.getThreeDSecure().getStatus());
		Assert.assertEquals(THREE_D_SECURE_ECI, fromXmlResponse.getThreeDSecure().getEci());
		Assert.assertEquals(THREE_D_SECURE_XID, fromXmlResponse.getThreeDSecure().getXid());
		Assert.assertEquals(THREE_D_SECURE_CAVV, fromXmlResponse.getThreeDSecure().getCavv());
		Assert.assertEquals(THREE_D_SECURE_ALGORITHM, fromXmlResponse.getThreeDSecure().getAlgorithm());
		Assert.assertTrue(fromXmlResponse.isSuccess());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledVerifyEnrolledRequest(ThreeDSecureRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(CARD_NUMBER, fromXmlRequest.getCard().getNumber());
		Assert.assertEquals(CARD_TYPE.getType(), fromXmlRequest.getCard().getType());
		Assert.assertEquals(CARD_HOLDER_NAME, fromXmlRequest.getCard().getCardHolderName());
		Assert.assertEquals(CARD_EXPIRY_DATE, fromXmlRequest.getCard().getExpiryDate());

		Assert.assertEquals(ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(ThreeDSecureType.VERIFY_ENROLLED.getType(), fromXmlRequest.getType());
		Assert.assertEquals(String.valueOf(AMOUNT), fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(THREE_D_SECURE_VERIFY_ENROLLED_REQUEST_HASH, fromXmlRequest.getHash());
	}

	/**
	 * Check all fields match expected values.
	 * 
	 * @param fromXmlRequest
	 */
	public static void checkUnmarshalledVerifySigRequest(ThreeDSecureRequest fromXmlRequest) {
		Assert.assertNotNull(fromXmlRequest);
		Assert.assertEquals(CARD_NUMBER, fromXmlRequest.getCard().getNumber());
		Assert.assertEquals(CARD_TYPE.getType(), fromXmlRequest.getCard().getType());
		Assert.assertEquals(CARD_HOLDER_NAME, fromXmlRequest.getCard().getCardHolderName());
		Assert.assertEquals(CARD_EXPIRY_DATE, fromXmlRequest.getCard().getExpiryDate());

		Assert.assertEquals(ACCOUNT, fromXmlRequest.getAccount());
		Assert.assertEquals(MERCHANT_ID, fromXmlRequest.getMerchantId());
		Assert.assertEquals(ThreeDSecureType.VERIFY_SIG.getType(), fromXmlRequest.getType());
		Assert.assertEquals(String.valueOf(AMOUNT), fromXmlRequest.getAmount().getAmount().toString());
		Assert.assertEquals(CURRENCY, fromXmlRequest.getAmount().getCurrency());
		Assert.assertEquals(TIMESTAMP, fromXmlRequest.getTimeStamp());
		Assert.assertEquals(ORDER_ID, fromXmlRequest.getOrderId());
		Assert.assertEquals(THREE_D_SECURE_PARES, fromXmlRequest.getPares());
		Assert.assertEquals(THREE_D_SECURE_VERIFY_SIG_REQUEST_HASH, fromXmlRequest.getHash());
	}

}
