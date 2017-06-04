# Slack Helpers

Just throwing some Slack helper into a single integration package.

## How do I use it?

Everything is bundled up in a single integration object:

``` java
final ISlackIntegration integration = new SlackIntegrationImpl(new SlackClientConfig()
        .withClientId(clientId)
        .withClientSecret(clientSecret)
        .withRedirectUrl("https://example.com/auth"));
```

## How do I authenticate?

Once you have an `ISlackIntegration` implementation, you can use the component
as middleware to both receive a user authentication URL *and* receive an access token:

__Generate an authentication URL__

``` java
String authUrl = integration.getAuthUrl();

String authNonceUrl = integration.getAuthUrl(state1, state2, stateN);
```

Send the user to either of those auth URL's to complete application installation.

__Complete the login for a token__

User your favorite serverless or server framework to handle the Slack OAuth redirect:

``` java
Map<String, String> params = request.getParams();
String code = params.get("code");

OAuthAccess token = integration.login(code);
```

