# HeroLang
## Ogólne informacje
Język HeroLang powstał na zaliczenie przedmiotu Teoria Kompilacji i Kompilatory na AGH.

Głównym założeniem było stworzenie języka, który w prosty i przyjemny sposób wprowadzi młodszych użytkowników w tajniki programowania.

## Składnia

### Sterowanie
* ``` forward ```- przechodzi o jedno pole, w kierunku, w którym patrzy
* ``` turn<kierunek> ``` - obraca się o 90° w wybranym kierunku, kierunek: ```left/right```
* ```attack``` - atakuje wroga przed sobą (musi patrzeć w tym kierunku)
* ```disarm``` - rozbraja pułapkę na polu przed sobą

### Instrukcje sterujące
* ```if<warunek>[wyrażenia]``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```while<warunek>[wyrażenia]``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```for<liczba>[wyrażenia]``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```fun nazwa[ciało]``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funckji o podanej nazwie

### Możliwe warunki
* ```WALL``` - true jeśli przed postacią jest ściana
* ```ENEMY``` - true jeśli przed postacią jest wróg
* ```TRAP``` -  true jeśli przed postacią jest pułapka
* ```TREASURE``` - true jeśli przed postacią jest skarb
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```[``` i ```]``` - wykorzystywane do nawiasowania warunków

## Uruchomienie
Do poprawnego działania wymagane są:
* ```antlr```
### ```pygame```
* ``` python3 -m pip install -U pygame --user ```
### ```numpy```
* ```python3 -m pip install -U numpy --user```
