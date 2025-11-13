
---

# Simulazione Produzione Sedie

### Autore

**Crisan Bogdan – Classe 5DINF**
Versione: **1.0**

---

## Descrizione

Questo progetto in **Java** simula, tramite **thread**, il processo di produzione di una o più **sedie**.
Ogni sedia è composta da:

* 4 gambe
* 1 schienale
* 1 sedile

Ogni componente viene costruita in parallelo (grazie ai thread) e mostra a schermo la percentuale di completamento.
Al termine della costruzione di tutte le parti, viene simulato anche l’assemblaggio finale della sedia.

---

## Struttura del progetto

Il progetto è composto da quattro classi principali:

### 1. `GambaSedia`

Estende `Thread` e simula la creazione di una singola gamba della sedia, mostrando la percentuale di completamento ogni 10%.

### 2. `SchienaleSedia`

Estende `Thread` e simula la creazione dello schienale della sedia, anch’esso con aggiornamenti di avanzamento.

### 3. `SedileSedia`

Estende `Thread` e simula la creazione del sedile (anche se nel codice è stampato “schienale”, ma il funzionamento è lo stesso).

### 4. `Processo`

Contiene il metodo `main` e gestisce:

* la richiesta del numero di sedie da produrre,
* l’avvio in parallelo dei thread delle varie parti,
* l’attesa del completamento di tutti i thread (`join()`),
* la simulazione dell’assemblaggio finale.

---

Il programma mostrerà a schermo l’avanzamento della costruzione di ogni parte e l’assemblaggio finale.

---

## Note

* Ogni parte della sedia (gamba, schienale, sedile) viene eseguita in thread separati per simulare una produzione parallela.
* Puoi modificare i tempi di `Thread.sleep()` per velocizzare o rallentare la simulazione.
* Attenzione: nella classe `SedileSedia` il testo stampato fa ancora riferimento allo “schienale” — può essere facilmente corretto.

---

## Esempio di output

```
Inserire il numero di sedie da produrre: 1
Creo la Gamba della sedia
Creo lo schienale della sedia
Creo lo schienale della sedia
Gamba della 1° sedia pronta al 10%
Schienale della sedia pronto al 10%
...
Sedia numero 1 assemblata al 100%
```
