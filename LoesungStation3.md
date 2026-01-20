# Problem #1 - Tests sind rot

In der File Calculator.java muss man in der Funktion division, die Division von a/0 zu a/b ändern und dann den Befehl mvn test ausführen. 

# Problem #2 - schlechte Commit Message

- Stuff: sagt nicht viel aus, besser wäre (Die File Debug.log wurd geaddet).
- Update: sagt ebenfalls nicht viel aus, besser wäre (Calculator.java wurd geupdated).
- Update more: sagt auch nicht viel aus, besser wäre (More Files added).

# Problem #3 - Repository aufräumen

Mit dem Befehl "git status" kann man sich die Struktur ansehen und wenn man nun auf den commit stuff klickt sieht man das dort die File debug.log reingeben wurde welche aber eigentlich kein Sinn für diese Projekt hat.

# Problem #4 - Datei wiederherstellen

Mit dem Befehl git log hab ich mir erstmal die letzten Commits angeschaut und dabei den Commit "Remove target directory from repository". Danch hab ich mit "git checkout (commit Hash) -- target/" die files wiederhergestellt in dem target ordner. Und wenn man jetzt "git status" ausführt sieht man das die Files neu geaddet wurden.