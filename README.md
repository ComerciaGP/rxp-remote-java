# Realex Remote Java SDK
You can sign up for a Realex account at https://www.realexpayments.com.
## Requirements
Java 1.6 and later.
## Installation
### Maven users
Add this dependency to your project's POM:
```xml
<dependency>
  <groupId>com.realexpayments.remote.sdk</groupId>
  <artifactId>rxp-remote-java</artifactId>
  <version>1.1</version>
</dependency>
```

### Gradle users
Add this dependency to your project's build file:
```
compile "com.realexpayments.remote.sdk:rxp-remote-java:1.1"
```
##Usage
```
Card card = new Card()
		.addExpiryDate("0119")
		.addNumber("4242424242424242")
		.addType(CardType.VISA)
		.addCardHolderName("Joe Smith")
		.addCvn("123")
		.addCvnPresenceIndicator(PresenceIndicator.CVN_PRESENT);

PaymentRequest request = new PaymentRequest()
		.addAccount("yourAccount")
		.addMerchantId("yourMerchantId")
		.addType(PaymentType.AUTH)
		.addAmount(100)
		.addCurrency("EUR")
		.addCard(card)
		.addAutoSettle(new AutoSettle().addFlag(AutoSettleFlag.TRUE));

RealexClient client = new RealexClient("shared secret");
PaymentResponse response = client.send(request);
```
##License
See the LICENSE file.
