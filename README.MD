Proszę zrealizować poniższe zadania.
Na potrzeby tego testu zakładamy, że to repozytorium zawiera kod produkcyjnego systemu.
Proszę więc stosować znane sobie dobre praktyki pracy z kodem. 
Jeśli to konieczne można modyfikować plik `pom.xml`.
Rozwiązania proszę "wypchnąć" (push) to tego repozytorium.

# Zadanie 1.
Metoda `AccountingService.process()` jest wieloktotnie wywoływana z tymi samymi parametrami.
Niestety korzysta z bardzo wolnej klasy `SomeSlowInvoiceRepository`.
Zoptymalizuj metodę `AccountingService.process()`
Kodu z pakietu `pl.infinite.recruitment.tasks.task1.some.unmodifable.library` nie można kopiować ani modyfikować.

# Zadanie 2.
Zaprojektować API i napisać algorytm przejścia/przeszukiwania drzewa w głąb. Wartość z każdego węzła drzewa
ma być przekazana do konsumenta przekazanego w parametrach wejściowych.  
Rozwiązanie umieścić w pakiecie `pl.infinite.recruitment.tasks.task2`.
Pakiet zawiera już klasę `Node` reprezentującą węzeł drzewa.

# Zadanie 3
Zaimplementować klasę `XmlTextExtractingHandler`

# Zadanie 4
Mamy następujące historyjki użytkownika (User Story):
1. *Jako* Sprzedawca *aby* przekazać wystawioną fakturę mojemu klientowi (Nabywcy)
  *chciałbym* wysłać ją za pomocą systemu informatycznego
2. *Jako* Nabywca *aby* potwierdzić że odebrałem fakturę 
  *chciałbym* oznaczyć ten fakt w systemie za pomocą którego otrzymałem fakturę  
3. *Jako* Urzędnik skarbowy *aby* kontrolować przepływ faktur
  *chciałbym* wiedzieć kto i kiedy wysłał fakturę, czy faktura została odebrana, kto i kiedy odebrał fakturę 

Zaprojektować i zaimplemenować domenę (DDD) do obsługi przekazywania faktur.
Celem zadania jest tylko domena. Nie trzeba implementować RESTów, warstwy apliakcyjnej ani warstwy perzystencji.
Kod umieścić w pakiecie `pl.infinite.recruitment.tasks.task4` 
