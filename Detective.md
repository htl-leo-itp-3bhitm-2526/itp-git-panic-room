# 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: Luca Ebner




## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 

- Stuff, Zu unverständlich
- Update, genauso unverständlich

## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)

Befehl: git log --online
50da5b1 (tag: v2-tests-broken) Update: In dem Tag steht das der test broken ist und dabei erkennt man das es ein Problem gibt.


## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

Befehl: git diff ce65066 50da5b1

(ce65066, 50da5b1), Calculator.java, Es wurd die Division von a/b zu a/0 geändert.



## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

Befehl: git show 50da5b1

Calculator.java, 50da5b1, Update, Function divide: sie ist wichtig da dort die division von a/b zu a/0 verändert wurde.


## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

Befehl: git show 50da5b1

Der Unterschied im Code liegt daran das vor dem Problem die Division noch a/b war welche richtig ist, danach enstadt jedoch das Problem das die Division zu a/0 verändert wurde.
