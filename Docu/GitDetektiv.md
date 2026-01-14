# Git Detective

## Einleitung

In dieser Station seid ihr Git-Detektiv:innen.

Ihr lernt:

+ die Git-History zu lesen
+ Commits zu vergleichen
+ Fehlerquellen einzugrenzen
+ Git als Analyse-Werkzeug zu nutzen

#### >> Wichtig:

+ **Noch nichts reparieren**
+ Erst verstehen, dann handeln

## Voraussetzungen checken

Bevor ihr startet, klärt im Team wie ihr arbeitet.

**Erlaubt:**

+ Google / Dokumentation nutzen
+ Die KI befragen zum VERSTÄNDNIS und zur eigenen Ausarbeitung! 
+ Im Team diskutieren
+ Mehrere Versuche machen

**Nicht erlaubt:**

+ Direkt auf main arbeiten
+ Dateien löschen, ohne Git zu nutzen
+ Commits ohne Message erstellen
+ Die Anleitung 1:1 in die KI kopieren und dabei den Kopf nicht nutzen :(

## Der PANIC ROOM

### Link zum Repo
Unter dem folgenden Link findet ihr ein vorbereitetes REPO - den GIT PANIC ROOM.
Klont dieses Repository und arbeitet die angeführten To-Dos ab. Dabei sollt ihr lernen, auch "kaputte" GIT Repositories noch zu retten / Änderungen anzupassen, und mit der Commit-History zu arbeiten. 

Wichtig - denkt an folgende Schritte dabei!
* Git Repo lokal klonen
* BRANCH mit eurem Teamnamen/Nachnamen/Initialien/... erstellen
* NIEMALS auf dem Main-Branch arbeiten!

## 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: <<<- Bitte hier deinen Namen einfügen.>>>




## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 

### Lösung:
Mir fällt negativ auf das die zwei commits "stuff" und "update" nicht die beste art ist etwas zu commiten. Es ist zu wening info Dabei


## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)

### Antwort:
Mit "git log" schaute ich die Commits an die alle erstellt wurde. Dabei ist mir aufgefallen das bei einen commit "broken" steht. Da schaute ich auf github was los ist und da war eine Division durch 0.
**50da5b1caf09339b68ce5d4ace7368a7b99f013e, Update, Es steht dabei "Broken"**


## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

### Antwort:
Mit "git show id" konnte ich nachschauen was geändert wurde. Dabei sah ich das eine Div durch 0 gemacht wurde.
**50da5b1caf09339b68ce5d4ace7368a7b99f013e, b/src/main/Calculator.java, divison durch 0 geaddet**

## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

### Antwort:
Mit "git show id" konnte ich nachschauen was geändert wurde. Dabei sah ich das eine Div durch 0 gemacht wurde.
**b/src/main/Calculator.java, 50da5b1caf09339b68ce5d4ace7368a7b99f013e, Update , retur a/0, Da eine division Durch Null ist was nicht funktioniert**

## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

### Antowrt
Mit "git diff id1 id0" habe ich herausgefunden das die rechnung "a/b" zu einer "a/0" geändert wurde.
