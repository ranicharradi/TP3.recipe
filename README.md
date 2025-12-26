# SOAP Web Service

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![XML](https://img.shields.io/badge/XML-005C99?style=flat&logo=w3c&logoColor=white)

Recipe SOAP service with a Swing client GUI. The service publishes a WSDL-backed endpoint at `http://localhost:8080/ws/recipes`.

## Clone

```bash
git clone https://github.com/ranicharradi/TP3.recipe.git
cd TP3.recipe
```

## Run

1. Open the project in IntelliJ.
2. Run the **ServerPublisher** run configuration.
3. Wait for the console message: `Server started at: http://localhost:8080/ws/recipes`.
4. Run **ClientGUI** to open the desktop client.

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






