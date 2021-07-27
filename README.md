## How to run the WebTest

### To run the WebTest locally, run the following command:
```bash
gradle clean web_test -DwebDriverMode=local
```
### To run the WebTest remotely, run the following command:
```bash
gradle clean web_test -DwebDriverMode=remote
```
### To run the WebTest with the set of parameters, run the following command:
```bash
gradle clean web_test -Dweb.browser={browserName} -Dweb.browser.version={browserVersion} -Dweb.driver.remote={isWebDriverRemote}
```
### To run the WebTest with default parameters (local.properties), run the following command:
```bash
gradle clean web_test
```

## How to run the ApiTest
### To run the ApiTest, run the following command:
```bash
gradle clean api_test
```
The *token* property can be taken from:
* api.properties file on the local machine by the following path ~/tmp/api.properties (default option)
* api.properties file by classpath:api.properties