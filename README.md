# Saucedemo Test Automation

## Setup Ambiente
1. Installare **Java JDK 11+** e **Maven**.
2. Clonare il progetto o estrarlo dalla cartella ZIP.
3. Aprire il progetto in un IDE (IntelliJ/Eclipse).
4. Eseguire i test con:
   ```sh
   mvn test
   ```

## Struttura dei Test
- **LoginTest.java** → Verifica il login corretto.
- **CartTest.java** → Aggiunta prodotto al carrello.
- **LogoutTest.java** → Verifica il logout.
- **LockedOutUserTest.java** → Verifica che l'utente `locked_out_user` non possa accedere.

## Dipendenze
- Selenium WebDriver
- WebDriverManager
- TestNG

## Esecuzione
Per eseguire i test:
```sh
mvn test
```
