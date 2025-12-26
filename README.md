# SOAP Web Service

SOAP web service for recipes. This project publishes a WSDL-backed endpoint at `http://localhost:8080/ws/recipes`.

## Quick Start

1. Open the project in IntelliJ.
2. Run the **ServerPublisher** run configuration.
3. Wait for the console message: `Server started at: http://localhost:8080/ws/recipes`.

## Endpoints

```
Service URL: http://localhost:8080/ws/recipes
WSDL URL:    http://localhost:8080/ws/recipes?wsdl
```

## Verify It Is Running

Open a browser and navigate to:

```
http://localhost:8080/ws/recipes?wsdl
```

You should see the WSDL XML document.






