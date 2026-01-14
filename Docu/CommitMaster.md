# Commit Master

## Commit Message 

### Warum sind Commit Messages wichtig?
Commit Messages helfen dabei:

+ Änderungen schnell zu verstehen
+ Fehler leichter zu finden
+ im Team den Überblick zu behalten

❌ Schlechte Commit Messages machen Projekte unübersichtlich. ✅ Gute Commit Messages sparen Zeit und Nerven.

Nie vergessen: **eine COMMIT MESSAGE IST IMMER PFLICHT!!!**

## Analyse 
### Gut oder Schlecht

Gut oder schlecht?
Ordnet die folgenden Commit-Messages zu. (Gut oder schlecht?). Begründe mindestens drei deiner Entscheidungen. 

### Lösung
| **Good**                            | **Bad**                       |
|-------------------------------------|-------------------------------|
| Add login validation                | Update                        |
| Refactor Calculator for readability | Fix bug                       |
| Remove unused imports               | stuff (1)                     |
| Improve performance                 | Changes in app                |
| Add null check (2)                  | final version                 |
| Update Calculator                   | Fix issue #23                 |
| Rename variables                    | Refactor code                 |
| Adjust logic                        | Cleanup                       |
| Improve readability                 | Small fixes (3)               |
| Handle edge cases                   | Temporary fix                 |

#### Erklärung

(1) "stuff", Dieser Commit ist schlecht da es nicht aussagt was gemacht wurde oder geändert. Es sagt nur "stuff" was alles heißen kann. 

(2) "Add null check", ist ein guter commit, da es kurz und knackig erklärt was hinzugefügt wird. Es wird im Programm einfach eine kontrolle hinzugefügt.

(3) "smal fixes", ist ein schlechter commit, weil es wieder nichts aussagt was gefixt wurde. Wurde vlt. Runntimefehler oder Out of bounce fehler behoben. Es ist einfach unklar.


## Verbessern

### Feinschliff der Nachrichten

Einige Commit Messages aus der ersten Spalte wirken auf den ersten Blick vielleicht „okay“, sind aber problematisch. Wähle mindestens vier Grenzfälle aus der Liste aus, und halte fest:

+ Was ist daran unklar? 
+ Welche Information fehlt?
+ In welchem Kontext wäre die Message akzeptabel?
+ Wie würdest du die Nachricht deutlich verbessern? (KONKRET anführen!)

### Lösung

__Update:__
An "Update" ist es unklar was geupdatet wurde. Mann muss noch hinzufüge was geupdatet wurde, wie "Update von Kundeinfo json". Nur "update" wäre akzeptable wenn man das repo erstellt und vlt die struktur minimal ändert oder so. 

__Fix Bug:__ 
Bei dem Commig "Fix Bug" ist wieder das Problem, zu wenig information. Was wurde gefixed. Wie z.B.: "Fix Bug LogIn" oder "Fix Bug Method AddPerso()". Nur "Fix Bug" macht sinn wenn man kaum code zeile hat wo es offensichtlich ist wo der Fehler war.

__Fix issue #23:__ 
Das Problem and diesen Commit ist, flecher Fehler wurde Korrigiert. Der Fehler in der Zeile 23 oder der 23te Fehler ist verbessert. Anstat "#23" zu schreiben, soll man es ersetzen mit was gefixed wurde, wie: "Fix issue Call back". Es mach nur sinn wenn man eine Datei hat. 

__Temporary fix :__ 
Was ist ein "Temporary fix"? Ist es schon jetz geregelt oder nicht, und wiederum was wurde gefixt. Vieleicht wurde die verbindung zum Server temp. gefixt aber man weiß nicht was. Wiederum muss man mehr ifo dazu geben.

### Tausch-Prüfung

## Regeln festlegen

### Regeln für die Projektarbeit im ITP-Unterricht definieren
Formuliert für euer Projektteam 3–5 Regeln, nach denen ihr ab jetzt Commit Messages schreibt.

Beispiele:

+ Beginne mit einem Verb
+ Keine Wörter wie update, stuff, final
+ Eine Änderung pro Commit
+ .... 

✍️ Schreibt eure Regeln klar und nummeriert ins Markdown-File. Begründet kurz, warum euch genau dieser Aspekt wichtig ist.

#### Regeln
+ Auf Deutsch schreiben
+ Nur das Wichtigste
+ Kurz formuliert

Z.B.: Annmelde Formular Design