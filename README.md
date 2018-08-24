# Warsztaty_1
## TASK 1
Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:

1. wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
2. sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
3. jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
4. jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
5. jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.

## TASK 2
Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49. Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.

Napisz program, który:

* zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
  * czy wprowadzony ciąg znaków jest poprawną liczbą,
  * czy użytkownik nie wpisał tej liczby już poprzednio,
  * czy liczba należy do zakresu 1-49,
* po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
* wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
* poinformuje gracza, czy trafił przynajmniej "trójkę".

## TASK 3
Odwróćmy teraz sytuację z warsztatu "Gra w zgadywanie liczb": to użytkownik pomyśli sobie liczbę z zakresu 1-1000, a komputer będzie zgadywał i zrobi to maksymalnie w 10 ruchach (pod warunkiem, że gracz nie będzie oszukiwał).

Zadaniem gracza będzie udzielanie odpowiedzi "więcej", "mniej", "trafiłeś".

Na następnym slajdzie znajduje się schemat blokowy algorytmu.

Dostępny jest także pod adresem:

https://gist.github.com/arek-jozwiak-coderslab/4783d45e75a71793a123673cc0998ae3

Zaimplementuj go w Javie.
