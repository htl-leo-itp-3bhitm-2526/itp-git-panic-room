# Abschluss und Regelwerk

## #1 - Branch Strategie

### Namensschema
Entwickelt ein Branch-Namensschema für euer Team. Beantwortet:

+ Wie heißt der Hauptbranch?
+ Wie heißen Feature-Branches?
+ Wie erkennt man, woran gearbeitet wird?

Dokumentiert euer Schema mit Beispielen.

Beispiel (nur Inspiration): 
+ main
+ feature/login-validation
+ bugfix/divide-by-zero

### Arbeiten mit Branches
Legt fest:
+ Darf direkt auf main gearbeitet werden?
+ Wann wird ein neuer Branch erstellt?
+ Wann wird ein Branch gelöscht?

Begründet eure Entscheidungen kurz.

**Atwort:** Grundlegende Änderungen können direkt auf main durchgeführt werden. Für neue Features oder getrennte Aufgaben wird ein eigener Branch erstellt und erst nach erfolgreicher Fertigstellung wieder gelöscht.


## #2 - Commit & Merge 
### Regelwerk
Formuliert 3–5 klare Commit-Regeln.

Beispiele:

+ Eine Änderung pro Commit
+ Commit Messages beschreiben was geändert wurde
+ Keine Wörter wie update, stuff, final

Schreibt eure finalen Regeln auf.
(Denkt an das erste Board -> vielleicht könnt ihr hier Regeln direkt wiederverwenden.)

#### Antwort
+ Es wird in Deutsch geschrieben
+ Kurz aber informationsreich
+ Jede wichtige Info dazuschreiben

### Merge Regel
Legt fest:

+ Wie kommt Code in main?
+ Nur per Pull Request?
+ Wer darf mergen?

Fehler sollen vor dem Merge auffallen, nicht danach.

#### Antwort
Ansich haben wir festgelegt das der Gruppenleiter alles richtig Merget, aber es haben bei uns alle Mergereche. Somit haben wir ausgemacht, wenn jemand Mergte muss er achten wie er das macht. 

## #4 - ADVANCED CHALLENGE - .gitignore kennenlernen und nutzen

### Zusammenfassung - .gitignore
Ergänzt in eurem File eine Zusammenfassung darüber, wie man das .gitignore File erfolgreich im Projekt nutzen kann. 
Überlegt:

Welche Dateien gehören nicht ins Repo?
Welche Dateien werden automatisch erzeugt?

### .gitignore für das Projekt anlegen
Erstellt oder überprüft eine .gitignore für:
+ Maven / Gradle
+ IDE-Dateien
+ Logs / Build-Ordner
+ ...

Legt eine Beispiel .gitignore-Datei fest. 

#### Antwort
Der ordner scr/test kann man in ein gitnore packen, da das ja eine Testumgebung ist und die anderen (Ausenstehende) brauchen nicht zu wissen was nicht funktioniert.