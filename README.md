# PIOKolokwium
Paczkomat

Etap I
Stwórzcie klasę Parcel (paczka) i ParcelLocker (paczkomat).
Właściwości klasy Parcel:
- code -- tekstowy kod paczki,
- weight -- waga paczki (w gramach).
Metody klasy ParcelLocker:
- addParcel(Parcel) -- dodaje paczkę,
- listParcels() -- wyświetla listę dodanych paczek oraz całkowitą wagę wszystkich paczek.

Etap II
Dodajcie sprawdzanie kodu paczki wg wzoru LLL-CCCCN (L - litera, C - cyfra, N - inicjał Waszego nazwiska), np. "FDA-1356L". W przypadku nieprawidłowości ma rzucać wyjątek.
Dodajcie konstruktor inicjalizujący kod i wagę paczki.
Dodajcie zabezpieczenie przed dodaniem null-a zamiast paczki. W przypadku nieprawidłowości ma rzucać wyjątek.
Dodajcie metodę usuwającą wszystkie paczki z paczkomatu.

Etap III
Dodajcie metodę usuwającą paczkę z paczkomatu (kluczem jest kod paczki). W przypadku braku paczki o podanym kodzie ma zostać rzucony wyjątek.
Do klasy paczkomatu dodajcie właściwość określającą limit liczby paczek (locakerCapacity) z ustaloną wartością domyślną. Przy próbie dodania paczki do pełnego paczkomatu ma zostać rzucony wyjątek. Dodajcie metodę zwracającą liczbę paczek w paczkomacie.
Wprowadźcie rodzinę klas paczek: paczka bazowa (abstrakcyjna) i dwie klasy konkretne reprezentujące paczki o dwóch gabarytach: ParcelA, ParcelB. Zadbajcie o konstruktory, tak by była możliwość stworzenia paczki tylko z kodem i wagą.
