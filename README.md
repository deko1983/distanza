## Scopo

Creare una libreria in grado di gestire le operazioni aritmetiche tra distanze. La distanza è una informazione che deve essere espressa in una unità di misura. In questo esempio la consideriamo più semplicemente in metri e centimetri.

## Procedimento
Troverai già lo scheletro di alcune classi. Lo scopo è costruire una classe Distanza concreta che implementi l'interfaccia Aritmetica declinata nel generico
Distanza (Aritmetica<Distanza>).

## Vincoli
Se l'operazione di sottrazione genera una distanza negativa, devi sollevare
l'eccezione DistanzaNegativaException. Se l'operazione di moltiplicazione o divisione viene eseguita tra oggetti entrambi non scalari (vedi proprietà scalare) devi sollevare l'eccezione DistanzaNotScalareException. In entrambe le operazioni solo uno dei due oggetti che vai a moltiplicare/dividere deve essere scalare, in particolare per quanto riguarda la divisione solo l'oggetto ricevuto come parametro deve essere scalare.

## Suggerimenti
Ragiona con calma prima di partire a scrivere codice. Prenditi il tempo necessario per comprendere la richiesta.


