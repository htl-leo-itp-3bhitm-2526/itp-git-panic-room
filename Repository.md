# Panic room

## Problem #1 - Tests sind rot

Man muss statt a / 0 -> a / b schreiben. Dann funktioniert es.

## Problem #2 - Schlechte Commit Messages
Stuff ist nicht gut weil sie nichts aussagt. 
Update ist auch nicht gut weil nicht gesagt wird was geändert wurde. Besser ist: Funktion divide wurde verändert.
Update - || - Besser: Files added

## Problem #3 - Repository aufräumen

Mit dem Befehl 'git blame debug.log' habe ich herausgefunden, dass die Datei zwar erstellt wird aber 
im Verlauf des restlichen Projekts nicht wirklich einen nutzen hat. 

## Problem #4 - Datei wiederherstellen

Mit dem Befehl 'git log' habe ich mir zuerst angeschaut, welche commits es gab. Unter dem commit 'remove old docs'
wurde eine Datei gelöscht. Diese Datei habe ich mittels 'git checkout f58dc0 -- docs/usage.md' wiederhergestellt.
Anschließend habe ich commited.