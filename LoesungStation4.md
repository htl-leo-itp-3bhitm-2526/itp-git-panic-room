# Abschluss und Regelwerk von Luca & Julian W.

## #1 - Branch Strategie

### Namensschema

Hauptbranch:
- main - Hauptbranch, immer lauffähig

Feature-Branches:
- feature/feature-name - Für neue Funktionen
  - Beispiel: feature/login-validation

Bugfix-Branches:
- bugfix/bug-beschreibung - Für Fehlerbehebungen
  - Beispiel: bugfix/divide-by-zero


Woran kann ich es erkennen:
- Der Prefix zeigt an wo man Arbeitet (feature/bugfix/..)
- Der Name beschreibt konkret, woran gearbeitet wird
- Kurz und aussagekräftig

### Arbeiten mit Branches

Darf direkt auf main gearbeitet werden?
- Nö, weil man soll vermeiden direkte auf dem main-Branch zu arbeiten
- Begründung: 
  - main - ist immer stabil und lauffähig
  - Arge Fehler würden direkt main kaputt machen
  - Keine chance Änderungen zu testen

Wann wird ein neuer Branch erstellt?
- Für jede neue Feature/Bugfix/..
- Vor Beginn der Arbeit


Wann wird ein Branch gelöscht?
- Nachdem Merge in main-Branch
- Nach Code Review und Tests

---

## #2 - Commit & Merge Regelwerk

### Commit-Regeln

1. Eine logische Änderung pro Commit
   - Ein Commit ist 'eine' abgeschlossene Änderung
   - Nicht mehrere Änderungen in einem Commit vermischen

2. Aussagekräftige Commit Messages
   - Was wurde 'jetzt' genau geändert.
   - Nicht zu kurz, aber auch nicht zu lange
   - Beispiele: "Fix division by zero error", "Add user authentication"

3. Verbotene Wörter und Patterns
   - "update", "stuff", "changes", "fixes", "final", "final2", "really-final"
   - Es sollten konkrete Beschreibungen verwenden werden

4. Code muss kompilieren
   - Jeder Commit soll am besten einen Code haben der läuft
   - Keine Syntax-Fehler committen
   - Tests sollten laufen (falles es welche gibt)

5. Keine sensiblen Daten
   - Keine Passwörter, API-Keys, Tokens, persönlichen Daten
### Merge-Regeln

Wie kommt Code in main?
- Nur durch Pull Request!!!!!!!!
- Direkte Commits auf main sollten nicht gemacht werden
- Prozess:
  1. Feature-Branch erstellen
  2. Änderungen committen
  3. Pull Request öffnen
  4. Nach Approval vom Teamleiter → Merge

Wer darf mergen?
- Nur nach Code Review durch mindestens 1 Teammitglied
- Nicht der Autor selbst

**Wichtig**: Fehler sollen vor dem Merge auffallen, nicht danach.