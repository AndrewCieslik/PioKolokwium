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
