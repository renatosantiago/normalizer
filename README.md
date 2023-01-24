# Normalizing Job Titles process - Java
The idea of this app is to implements Levenshtein distance to find the closest word match.
Internally we have a list of positions with the following titles:
* **Architect**
* **Software engineer**
* **Quantity surveyor**
* **Accountant**

It will return one of the normalized word from the list when a input string is provided.

exemple:

<img width="931" alt="Captura de Tela 2023-01-24 às 00 12 36" src="https://user-images.githubusercontent.com/3075542/214205127-ff713ee0-24d0-4e2e-b1fc-9c4ca97147c6.png">


***




## Description
The app struct is built as a simple java project using maven to manage the unit tests dependencies.

The class **NormalizerApp** contains the main method where you can run the app, this class just calls the implementation passing a input string to normalize and return the normalized job title

![Captura de Tela 2023-01-24 às 11 57 44](https://user-images.githubusercontent.com/3075542/214328485-9166a398-e1d1-498f-b490-d84cd50e055d.png)
