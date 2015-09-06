#Määrittelydokumentti


	
**Mitä algoritmeja ja tietorakenteita toteutat työssäsi** 
* Algoritmi, joka valitsee aiempien tuloksien ja patternien perusteella joko kiven, paperin tai sakset
* Tarvitsen tietorakenteet aiempien tulosten tallentamiseen (esim monta kertaa kukin on pelattu) ja mahdollisten patternien tallentamiseen. Luultavasti joudun toteuttamaan ainakin HashMapin ja PriorityQueuen


**Mitä ongelmaa ratkaiset ja miksi valitsit kyseiset algoritmit/tietorakenteet**
* Tekoäly kivi-paperi-sakset peliin. 
* En ole vielä varma, mutta ajattelin, että HashMap toimisi hyvin tulosten tallentamiseen, koska avaimena voi olla kivi, paperi ja sakset, ja arvona monta kertaa kyseinen valinta on pelattu. 
PriorityQueuea saatan tarvita, jossa ylimmäksi kohoaa aina tulosten perusteella se, mitä tekoälyn kannattaa pelata seuraavaksi.


**Mitä syötteitä ohjelma saa ja miten näitä käytetään** 
* Ohjelma saa syötteenä kivi, paperi tai sakset käyttäjältä, ja tallentaa niitä tietorakenteisiin. Ohjelma valitsee itse aikaisempien syötteiden perusteella valintansa pelatessa.



**Tavoitteena olevat aika- ja tilavaativuudet (m.m. O-analyysit)**
* En ole varma vielä, luultavasti O(1) aika- ja tilavaativuus, koska syötteen koko ei vaihdu. 
