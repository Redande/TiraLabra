# Viikkoraportti 3. viikko
##Mitä olen tehnyt tällä viikolla?/Miten ohjelma on edistynyt?##
* Paransin tekoälyä; nyt tekoäly aluksi arpoo valintansa, mutta se lisää aina joka kierroksen jälkeen ylös, mitä pelaaja pelasi edellisen kerran ja nyt (eli esim. edellinen oli kivi ja nyt pelattiin paperi). Tämän perusteella tekoäly katsoo myöhemmillä kierroksilla, kuinka monta kertaa kutakin on pelattu tietyn valinnan jälkeen, esim montako kertaa kukin valinta on pelattu kiven jälkeen. Tekoäly valitsee sen, joka voitaa eniten valitun. (esim jos pelaaja pelaa kiven, tekoäly tarkistaa montako kertaa kutakin on pelattu kiven jälkeen. Jos vaikka paperia on pelattu kiven jälkeen useiten, tekoäly valitsee sakset voittaakseen paperin.)
* Paransin koodin ymmärrettävyyttä jakamalla toiminnallisuutta omiin luokkiin ja metodeihin paremmin, sekä laittamalla muutaman selventävän kommentin.

##Mitä opin tällä viikolla / tänään? 
* Miten saan paremmin otettua edelliset valinnat huomioon.


##Mikä jäi epäselväksi tai tuottanut vaikeuksia? Vastaa tähän kohtaan rehellisesti, koska saat tarvittaessa apua tämän kohdan perusteella. 
* En oikein tiedä miten testaisin main-metodia. 
* En ole varma onko valitsemani int[][] paras rakenne tallentamaan edellisiä tuloksia, ja saanko käyttää tätä valmista rakennetta vai pitäisikö minun toteuttaa jokin oma rakenne tilalle.

##Mitä teen seuraavaksi? 
* Kehitän pidemmälle edellisten valintojen hyväksikäyttöä.
* Ehkä toteutan jonkin paremman tietorakenteen nykyisen int[][] tilalle.
* Ehkä graafinen käyttöliittymä
