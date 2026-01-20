# Panic Room

### So geht's!
Das Projekt ist absichtlich fehlerhaft.
Eure Aufgabe:

* 1️⃣ Tests reparieren
* 2️⃣ Git-History verstehen
* 3️⃣ Repository aufräumen
* 4️⃣ Datei aus der History wiederherstellen

## Problem #1 - Tests sind rot
Du kannst Unit-Tests auch auf Git nutzen und ausführen. Diese kannst du beispielsweise mit MAVEN ausführen. Nutzt dazu den passenden Befehl, und findet anschließend die Fehler im Code. Behebt diese, und versucht somit die Tests lauffähig zu machen. Ergänzt anschließend einen zweiten Test, welcher ebenfalls funktionsfähig sein soll! Dazu könnt ihr den Code nach Belieben auch erweitern/ergänzen.

Alle Änderungen sollen anschließend auch im Repo ersichtlich sein. Denkt an korrekte, aussagekräftige Commit-Messages! 

Befehl zum Testen mit Maven (Terminal): 

mvn test

## Problem #2 - schlechte Commit Message
In der History gibt es mind. eine schlechte **Commit Message**.
Arbeitet euch durch die Commit-History und schaut, welche Message nicht sinnvoll ist. Notiert in eurem Markdown-File die fehlerhafte Commit-Message, und begründet, warum diese nicht gut ist. Schlagt Alternativen dazu vor. Auch dieses File soll am Ende im Repository zu finden sein!

### Antwort
 
#### Commit "update"
"update" als commit benützen ist nicht eine gute Message. Es ist zu wenig angegeben was geupdatet wurde. Etwas besseres wäre "update login formular". Dabei ist es sofort erkentlich, dass das Formular geupdatet wurde

#### Commit "stuff"
Genau das gleiche Problem wie bei "update", wobei stuff noch weniger aussagt. "stuff" kann alles mögliches sein. Ich würde es nie so alleine schreiben "stuff" sonder komplett es auslassen und es anders schreiben oder "add stuff to JSON".

## blem #3 - Repository aufräumen
Im Repository liegt eine Datei die dort nicht hingehört. Sie hat keinen weiteren Sinn für euer Programm. Findet sie, und entfernt sie!
Begründet in eurem MARKDOWN File, warum ihr diese Datei gewählt habt.

(Tipp: git status, Strukturen ansehen, ...) 

### Antwort
In der Git-Commit-Historie habe ich einen Commit mit der Nachricht „suff“ gefunden. Dieser Commit fügte lediglich die Datei debug.log hinzu, die keinen funktionalen Nutzen für unser Projekt hat. Da es sich dabei um ein temporäres Debug-Artefakt handelt und nicht um Quellcode oder benötigte Konfiguration, wurde die Datei entfernt.

## Problem #4 - Datei wiederherstellen
Hilfe - eine wichtige Datei wurde gelöscht!
Finde den Commit, in dem sie noch existierte und holt euch diese Datei zurück. Ergänze kurz deine Vorgehensweise in eurem Markdown-File.

Folgende Befehle können dir dabei (unter anderem) helfen. Hier gibt es mehrere Lösungswege:
* git log 
* git checkout
* git status

### Antwort
Mit git log habe ich die letzten Commits durchsucht und dabei einen Commit mit der Nachricht „Remove target directory from repository“ gefunden. In diesem Commit wurden viele Dateien im target-Verzeichnis entfernt.
Um die gelöschten Dateien wiederherzustellen, habe ich aus einem vorherigen Commit, in dem die Dateien noch vorhanden waren, die benötigte Datei mit
"git checkout <hash> -- <file>" in den aktuellen Branch geholt.
Mit git status habe ich anschließend überprüft, dass die Datei als geändert bzw. neu angezeigt wurde.

