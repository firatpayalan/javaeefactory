This package contains Factory pattern implementation via JAVA EE 7

All of processor types are inherited from IProcessor.
If new processor will be integrated, a class would implemented fro IProcessor.
Also, annotation declaration must be implemented.


## Example

@Inject
ProcessorFactory factory;

String cardNo = "515755XXXXXXXXXX";
String rawResponse = (String)factory.setCardNo(cardNo).getProcessor().getCardInfo();

## References
How Producer annotation works ?
http://buraktas.com/cdi-dependency-injection-producer-method-example/
Factory pattern implementation via JAVA EE 7 framework.
https://stackoverflow.com/questions/6621403/replace-factory-based-object-creation-with-cdi-mechanism

## Author
Created by yfpayalan on 25.01.2018
