package com.xworkz.app.boot;

import java.time.LocalDate;

import com.xworkz.app.dto.CountryDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CountryRunner {
public static void main(String[] args) {
System.out.println("Invoking main in CountryRunner...");
Collection<CountryDTO> countries = new ArrayList<>();

CountryDTO india = new CountryDTO(1, "India", "New Delhi", 1380004385, true, LocalDate.of(1947, 8, 15), 28,
"Hinduism", "Bengal Tiger", "Indian Peafowl", "Cricket", "Narendra Modi");
countries.add(india);

CountryDTO countryDTO = new CountryDTO();
CountryDTO china = new CountryDTO(2, "China", "Beijing", 1439323776, true, LocalDate.of(1949, 10, 1), 23,
"Buddhism, Taoism, Atheism", "Giant Panda", "Red-crowned Crane", "Table Tennis", "Xi Jinping");
countries.add(china);

CountryDTO usa = new CountryDTO(3, "United States", "Washington, D.C.", 331002651, true,
LocalDate.of(1776, 7, 4), 50, "Christianity", "Bald Eagle", "Bald Eagle", "Baseball", "Joe Biden");
countries.add(usa);

CountryDTO ireland = new CountryDTO(4, "Ireland", "Dublin", 4941444, true, LocalDate.of(1922, 12, 6), 26,
"Catholicism", "Irish Wolfhound", "Irish Red Setter", "Gaelic Football", "Micheál Martin");
countries.add(ireland);

CountryDTO indonesia = new CountryDTO(5, "Indonesia", "Jakarta", 273523615, true, LocalDate.of(1945, 8, 17), 34,
"Islam", "Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
countries.add(indonesia);

CountryDTO brazil = new CountryDTO(6, "Brazil", "Brasília", 211049527, true, LocalDate.of(1822, 9, 7), 26,
"Christianity", "Jaguar", "Scarlet Macaw", "Football", "Jair Bolsonaro");
countries.add(brazil);

CountryDTO nigeria = new CountryDTO(7, "Nigeria", "Abuja", 206139587, true, LocalDate.of(1960, 10, 1), 36,
"Islam, Christianity", "African Lion", "Eagle", "Football", "Muhammadu Buhari");
countries.add(nigeria);

CountryDTO mexico = new CountryDTO(8, "Mexico", "Mexico City", 126190788, true, LocalDate.of(1810, 9, 16), 31,
"Christianity", "Golden Eagle", "Golden Eagle", "Charrería", "Andrés Manuel López Obrador");
countries.add(mexico);

CountryDTO japan = new CountryDTO(9, "Japan", "Tokyo", 126050000, true, LocalDate.of(660, 2, 11), 47,
"Shintoism, Buddhism", "Sika Deer", "Green Pheasant", "Sumo", "Fumio Kishida");
countries.add(japan);

CountryDTO bangladesh = new CountryDTO(10, "Bangladesh", "Dhaka", 164689383, true, LocalDate.of(1971, 3, 26), 8,
"Islam, Hinduism", "Royal Bengal Tiger", "Oriental Magpie-Robin", "Kabaddi", "Sheikh Hasina");
countries.add(bangladesh);

CountryDTO russia = new CountryDTO(11, "Russia", "Moscow", 145912025, true, LocalDate.of(1991, 12, 25), 85,
"Russian Orthodoxy", "Russian Bear", "Russian Eagle", "Ice Hockey", "Vladimir Putin");
countries.add(russia);

CountryDTO ethiopia = new CountryDTO(12, "Ethiopia", "Addis Ababa", 114963588, true, LocalDate.of(1941, 5, 5),
9, "Orthodox Christianity", "Lion", "Yellow-breasted Lovebird", "Long-Distance Running", "Abiy Ahmed");
countries.add(ethiopia);

CountryDTO philippines = new CountryDTO(13, "Philippines", "Manila", 113538987, true, LocalDate.of(1946, 7, 4),
81, "Roman Catholicism", "Carabao", "Philippine Eagle", "Arnis", "Rodrigo Duterte");
countries.add(philippines);

CountryDTO vietnam = new CountryDTO(14, "Vietnam", "Hanoi", 97338579, true, LocalDate.of(1945, 9, 2), 58,
"Buddhism, Folk Religion", "Water Buffalo", "Red-crowned Crane", "Football", "Nguyen Xuan Phuc");
countries.add(vietnam);

CountryDTO egypt = new CountryDTO(15, "Egypt", "Cairo", 102334404, true, LocalDate.of(1922, 2, 28), 27, "Islam",
"Nile Crocodile", "Steppe Eagle", "Football", "Abdel Fattah el-Sisi");
countries.add(egypt);

CountryDTO drCongo = new CountryDTO(16, "DR Congo", "Kinshasa", 89561403, true, LocalDate.of(1960, 6, 30), 26,
"Christianity, Islam", "Okapi", "African Fish Eagle", "Football", "Félix Tshisekedi");
countries.add(drCongo);

CountryDTO turkey = new CountryDTO(17, "Turkey", "Ankara", 84339067, true, LocalDate.of(1923, 10, 29), 81,
"Islam", "Gray Wolf", "Turkish Red Crescent", "Oil Wrestling", "Recep Tayyip Erdoğan");
countries.add(turkey);

CountryDTO iran = new CountryDTO(18, "Iran", "Tehran", 83992949, true, LocalDate.of(1935, 4, 1), 31, "Islam",
"Asiatic Cheetah", "Common Nightingale", "Varzesh-e Pahlavani", "Ebrahim Raisi");
countries.add(iran);

CountryDTO germany = new CountryDTO(19, "Germany", "Berlin", 83783942, true, LocalDate.of(1990, 10, 3), 16,
"Christianity", "Bald Eagle", "Common Crane", "Football", "Olaf Scholz");
countries.add(germany);

CountryDTO thailand = new CountryDTO(20, "Thailand", "Bangkok", 69799978, true, LocalDate.of(1946, 12, 10), 76,
"Buddhism", "Thai Elephant", "Siamese Fighting Fish", "Muay Thai", "Prayuth Chan-o-cha");
countries.add(thailand);

CountryDTO uk = new CountryDTO(21, "United Kingdom", "London", 67886011, true, LocalDate.of(1707, 5, 1), 4,
"Christianity", "Lion", "Robin", "Football", "Boris Johnson");
countries.add(uk);

CountryDTO france = new CountryDTO(22, "France", "Paris", 65273511, true, LocalDate.of(1789, 7, 14), 18,
"Christianity", "Gallic Rooster", "Gallic Rooster", "Football", "Emmanuel Macron");
countries.add(france);

CountryDTO italy = new CountryDTO(23, "Italy", "Rome", 60461826, true, LocalDate.of(1861, 3, 17), 20,
"Christianity", "Italian Wolf", "Italian Sparrow", "Football", "Mario Draghi");
countries.add(italy);

CountryDTO tanzania = new CountryDTO(24, "Tanzania", "Dodoma", 59734218, true, LocalDate.of(1961, 12, 9), 30,
"Christianity", "Giraffe", "East African Lilac-breasted Roller", "Football", "Samia Suluhu");
countries.add(tanzania);

CountryDTO southAfrica = new CountryDTO(25, "South Africa", "Pretoria", 59308690, true,
LocalDate.of(1961, 5, 31), 9, "Christianity", "Lion", "Blue Crane", "Rugby", "Cyril Ramaphosa");
countries.add(southAfrica);

CountryDTO myanmar = new CountryDTO(26, "Myanmar", "Naypyidaw", 54409800, true, LocalDate.of(1948, 1, 4), 14,
"Buddhism", "Asian Elephant", "Burmese Peacock", "Chinlone", "Aung San Suu Kyi");
countries.add(myanmar);

CountryDTO kenya = new CountryDTO(27, "Kenya", "Nairobi", 53771296, true, LocalDate.of(1963, 12, 12), 47,
"Christianity", "African Lion", "African Lilac-breasted Roller", "Athletics", "Uhuru Kenyatta");
countries.add(kenya);

CountryDTO southKorea = new CountryDTO(28, "South Korea", "Seoul", 51780579, true, LocalDate.of(1945, 8, 15), 9,
"Buddhism, Christianity", "Tiger", "Korean Magpie", "Taekwondo", "Moon Jae-in");
countries.add(southKorea);

CountryDTO colombia = new CountryDTO(29, "Colombia", "Bogotá", 50882891, true, LocalDate.of(1810, 7, 20), 32,
"Christianity", "Andean Condor", "Andean Condor", "Tejo", "Iván Duque");
countries.add(colombia);

CountryDTO spain = new CountryDTO(30, "Spain", "Madrid", 46754778, true, LocalDate.of(1492, 10, 12), 17,
"Christianity", "Bull", "Eagle", "Football", "Pedro Sánchez");
countries.add(spain);

CountryDTO uganda = new CountryDTO(31, "Uganda", "Kampala", 45741007, true, LocalDate.of(1962, 10, 9), 134,
"Christianity", "Grey Crowned Crane", "African Fish Eagle", "Football", "Yoweri Museveni");
countries.add(uganda);

CountryDTO argentina = new CountryDTO(32, "Argentina", "Buenos Aires", 45195777, true, LocalDate.of(1816, 7, 9),
23, "Christianity", "Rufous Hornero", "Andean Condor", "Football", "Alberto Fernández");
countries.add(argentina);

CountryDTO algeria = new CountryDTO(33, "Algeria", "Algiers", 43851044, true, LocalDate.of(1962, 7, 3), 58,
"Islam", "Fennec Fox", "Common Nighthawk", "Football", "Abdelmadjid Tebboune");
countries.add(algeria);

CountryDTO sudan = new CountryDTO(34, "Sudan", "Khartoum", 43849260, true, LocalDate.of(1956, 1, 1), 18,
"Islam", "African Fish Eagle", "African Fish Eagle", "Football", "Abdalla Hamdok");
countries.add(sudan);

CountryDTO ukraine = new CountryDTO(35, "Ukraine", "Kyiv", 44388845, true, LocalDate.of(1991, 8, 24), 27,
"Christianity", "None", "Golden Eagle", "Football", "Volodymyr Zelensky");
countries.add(ukraine);

CountryDTO iraq = new CountryDTO(36, "Iraq", "Baghdad", 40222493, true, LocalDate.of(1932, 10, 3), 18, "Islam",
"Golden Hamster", "Chukar Partridge", "Football", "Mustafa Al-Kadhimi");
countries.add(iraq);

CountryDTO afghanistan = new CountryDTO(37, "Afghanistan", "Kabul", 38041754, true, LocalDate.of(1919, 8, 19),
34, "Islam", "Snow Leopard", "Common Kestrel", "Buzkashi", "Amrullah Saleh");
countries.add(afghanistan);

CountryDTO canada = new CountryDTO(38, "Canada", "Ottawa", 37742154, true, LocalDate.of(1867, 7, 1), 10,
"Christianity", "North American Beaver", "Common Loon", "Ice Hockey", "Justin Trudeau");
countries.add(canada);

CountryDTO poland = new CountryDTO(39, "Poland", "Warsaw", 37887768, true, LocalDate.of(1918, 11, 11), 16,
"Christianity", "Wisent", "White-tailed Eagle", "Football", "Mateusz Morawiecki");
countries.add(poland);

CountryDTO morocco = new CountryDTO(40, "Morocco", "Rabat", 36471769, true, LocalDate.of(1956, 3, 2), 12,
"Islam", "Barbary Lion", "Bald Eagle", "Football", "Aziz Akhannouch");
countries.add(morocco);

CountryDTO saudiArabia = new CountryDTO(41, "Saudi Arabia", "Riyadh", 34813871, true, LocalDate.of(1932, 9, 23),
13, "Islam", "Arabian Oryx", "Falcon", "Football", "Mohammed bin Salman");
countries.add(saudiArabia);

CountryDTO uzbekistan = new CountryDTO(42, "Uzbekistan", "Tashkent", 34140658, true, LocalDate.of(1991, 8, 31),
12, "Islam", "Greater Kudu", "Common Nightingale", "Kurash", "Shavkat Mirziyoyev");
countries.add(uzbekistan);

CountryDTO peru = new CountryDTO(43, "Peru", "Lima", 32971854, true, LocalDate.of(1821, 7, 28), 25,
"Christianity", "Vicuña", "Andean Cock-of-the-rock", "Football", "Pedro Castillo");
countries.add(peru);

CountryDTO angola = new CountryDTO(44, "Angola", "Luanda", 32866272, true, LocalDate.of(1975, 11, 11), 18,
"Christianity", "Giant Sable Antelope", "Red-crested Turaco", "Football", "João Lourenço");
countries.add(angola);

CountryDTO malaysia = new CountryDTO(45, "Malaysia", "Kuala Lumpur", 32365999, true, LocalDate.of(1957, 8, 31),
13, "Islam", "Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
countries.add(malaysia);

CountryDTO ghana = new CountryDTO(46, "Ghana", "Accra", 31072945, true, LocalDate.of(1957, 3, 6), 16,
"Christianity", "Lion", "African Eagle", "Football", "Nana Akufo-Addo");
countries.add(ghana);

CountryDTO mozambique = new CountryDTO(47, "Mozambique", "Maputo", 31255435, true, LocalDate.of(1975, 6, 25),
11, "Christianity", "African Elephant", "African Fish Eagle", "Football", "Filipe Nyusi");
countries.add(mozambique);

CountryDTO yemen = new CountryDTO(48, "Yemen", "Sana'a", 29825968, true, LocalDate.of(1918, 10, 14), 22,
"Islam", "Arabian Leopard", "Arabian Falcon", "Football", "Khalid Bahah");
countries.add(yemen);

CountryDTO nepal = new CountryDTO(49, "Nepal", "Kathmandu", 29136808, true, LocalDate.of(1951, 12, 21), 7,
"Hinduism", "Cow", "Himalayan Monal", "Volleyball", "Sher Bahadur Deuba");
countries.add(nepal);

CountryDTO venezuela = new CountryDTO(50, "Venezuela", "Caracas", 28435940, true, LocalDate.of(1811, 7, 5), 23,
"Christianity", "Armadillo", "Orinoco River Dolphin", "Baseball", "Nicolás Maduro");
countries.add(venezuela);

CountryDTO madagascar = new CountryDTO(51, "Madagascar", "Antananarivo", 27691018, true,
LocalDate.of(1960, 6, 26), 22, "Christianity", "Aye-Aye", "Crested Ibis", "Rugby", "Christian Ntsay");
countries.add(madagascar);

CountryDTO cameroon = new CountryDTO(52, "Cameroon", "Yaoundé", 26545864, true, LocalDate.of(1960, 1, 1), 10,
"Christianity, Islam, Indigenous Religions", "Lion", "African Grey Parrot", "Football (Soccer)",
"Paul Biya");
countries.add(cameroon);

CountryDTO coteDivoire = new CountryDTO(53, "Côte d'Ivoire", "Yamoussoukro", 26378274, true,
LocalDate.of(1960, 8, 7), 31, "Islam, Christianity", "African Elephant", "Northern Bald Ibis",
"Football (Soccer)", "Alassane Ouattara");
countries.add(coteDivoire);

CountryDTO niger = new CountryDTO(54, "Niger", "Niamey", 24206636, true, LocalDate.of(1960, 8, 3), 8, "Islam",
"Giraffe", "White-winged Flufftail", "Football (Soccer)", "Mohamed Bazoum");
countries.add(niger);

CountryDTO northKorea = new CountryDTO(55, "North Korea", "Pyongyang", 25778816, true, LocalDate.of(1945, 9, 9),
9, "Juche (state ideology)", "Chollima (Winged Horse)", "Northern Goshawk", "Football (Soccer)",
"Kim Jong-un");
countries.add(northKorea);

CountryDTO sriLanka = new CountryDTO(56, "Sri Lanka", "Colombo", 21413249, true, LocalDate.of(1948, 2, 4), 9,
"Buddhism, Hinduism, Islam, Christianity", "Lion", "Sri Lankan Junglefowl", "Volleyball",
"Gotabaya Rajapaksa");
countries.add(sriLanka);

CountryDTO australia = new CountryDTO(57, "Australia", "Canberra", 25687041, true, LocalDate.of(1901, 1, 1), 6,
"Christianity", "Red Kangaroo", "Emu", "Australian Rules Football", "Scott Morrison");
countries.add(australia);

CountryDTO burkinaFaso = new CountryDTO(58, "Burkina Faso", "Ouagadougou", 20903273, true,
LocalDate.of(1960, 8, 5), 13, "Islam, Indigenous Religions", "Lion", "White-throated Rockfowl",
"Football (Soccer)", "Roch Marc Christian Kaboré");
countries.add(burkinaFaso);

CountryDTO mali = new CountryDTO(59, "Mali", "Bamako", 20250834, true, LocalDate.of(1960, 9, 22), 10,
"Islam, Indigenous Religions", "Lion", "Yellow-billed Oxpecker", "Football (Soccer)", "Assimi Goïta");
countries.add(mali);

CountryDTO romania = new CountryDTO(60, "Romania", "Bucharest", 19237691, true, LocalDate.of(1877, 5, 9), 41,
"Christianity", "Lynx", "Golden Eagle", "Rugby", "Nicolae Ciucă");
countries.add(romania);

CountryDTO chile = new CountryDTO(61, "Chile", "Santiago", 19116201, true, LocalDate.of(1818, 9, 18), 16,
"Christianity", "Huemul (Andean Deer)", "Andean Condor", "Rodeo (national sport)", "Sebastián Piñera");
countries.add(chile);

CountryDTO malawi = new CountryDTO(62, "Malawi", "Lilongwe", 19129955, true, LocalDate.of(1964, 7, 6), 28,
"Christianity, Islam", "Leopard", "African Fish Eagle", "Football (Soccer)", "Lazarus Chakwera");
countries.add(malawi);

CountryDTO kazakhstan = new CountryDTO(63, "Kazakhstan", "Nur-Sultan", 18776707, true,
LocalDate.of(1991, 12, 16), 14, "Islam", "Steppe Eagle", "Golden Eagle", "Kazakh Wrestling (Kurash)",
"Kassym-Jomart Tokayev");
countries.add(kazakhstan);

CountryDTO zambia = new CountryDTO(64, "Zambia", "Lusaka", 18383955, true, LocalDate.of(1964, 10, 24), 10,
"Christianity", "African Fish Eagle", "African Fish Eagle", "Football (Soccer)", "Hakainde Hichilema");
countries.add(zambia);

CountryDTO guatemala = new CountryDTO(65, "Guatemala", "Guatemala City", 17915568, true,
LocalDate.of(1821, 9, 15), 22, "Christianity", "Quetzal", "Quetzal", "Football (Soccer)",
"Alejandro Giammattei");
countries.add(guatemala);

CountryDTO ecuador = new CountryDTO(66, "Ecuador", "Quito", 17688599, true, LocalDate.of(1830, 5, 13), 24,
"Christianity", "Andean Condor", "Andean Condor", "Football (Soccer)", "Guillermo Lasso");
countries.add(ecuador);

CountryDTO syria = new CountryDTO(67, "Syria", "Damascus", 17500658, true, LocalDate.of(1946, 4, 17), 14,
"Islam", "Hawk", "Northern Eagle Owl", "Football (Soccer)", "Bashar al-Assad");
countries.add(syria);

CountryDTO netherlands = new CountryDTO(68, "Netherlands", "Amsterdam", 17134872, true,
LocalDate.of(1648, 5, 15), 12, "Christianity", "Lion", "Lion", "Football (Soccer)", "Mark Rutte");
countries.add(netherlands);

CountryDTO senegal = new CountryDTO(69, "Senegal", "Dakar", 16743927, true, LocalDate.of(1960, 4, 4), 14,
"Islam, Indigenous Religions", "Lion", "African Fish Eagle", "Wrestling (La Lutte)", "Macky Sall");
countries.add(senegal);

CountryDTO cambodia = new CountryDTO(70, "Cambodia", "Phnom Penh", 16718971, true, LocalDate.of(1953, 11, 9),
25, "Buddhism", "Kouprey (Wild Ox)", "Giant Ibis", "Bokator (Khmer Martial Art)", "Hun Sen");
countries.add(cambodia);

CountryDTO chad = new CountryDTO(71, "Chad", "N'Djamena", 16425864, true, LocalDate.of(1960, 8, 11), 23,
"Islam, Christianity, Indigenous Religions", "Lion", "Arabian Bustard", "Football (Soccer)",
"Mahamat Déby Itno");
countries.add(chad);

CountryDTO somalia = new CountryDTO(72, "Somalia", "Mogadishu", 15893222, true, LocalDate.of(1960, 7, 1), 6,
"Islam", "Leopard", "Greater Hoopoe-lark", "Football", "Mohamed Hussein Roble");
countries.add(somalia);

CountryDTO zimbabwe = new CountryDTO(73, "Zimbabwe", "Harare", 14862927, true, LocalDate.of(1980, 4, 18), 10,
"Christianity", "African Lion", "African Fish Eagle", "Soccer", "Emmerson Mnangagwa");
countries.add(zimbabwe);

CountryDTO guinea = new CountryDTO(74, "Guinea", "Conakry", 13132795, true, LocalDate.of(1958, 10, 2), 8,
"Islam", "African Elephant", "African Grey Parrot", "Football", "Ibrahima Kassory Fofana");
countries.add(guinea);

CountryDTO rwanda = new CountryDTO(75, "Rwanda", "Kigali", 12952218, true, LocalDate.of(1962, 7, 1), 5,
"Christianity", "African Leopard", "African Crowned Crane", "Football", "Paul Kagame");
countries.add(rwanda);

CountryDTO benin = new CountryDTO(76, "Benin", "Porto-Novo", 12123198, true, LocalDate.of(1960, 8, 1), 12,
"Christianity", "African Lion", "African Grey Parrot", "Football", "Patrice Talon");
countries.add(benin);

CountryDTO burundi = new CountryDTO(77, "Burundi", "Bujumbura", 11890784, true, LocalDate.of(1962, 7, 1), 18,
"Christianity", "African Lion", "Grey-crowned Crane", "Football", "Évariste Ndayishimiye");
countries.add(burundi);

CountryDTO tunisia = new CountryDTO(78, "Tunisia", "Tunis", 11818619, true, LocalDate.of(1956, 3, 20), 24,
"Islam", "Barbary Lion", "Bald Ibis", "Football", "Najla Bouden Romdhane");
countries.add(tunisia);

CountryDTO bolivia = new CountryDTO(79, "Bolivia", "Sucre", 11673021, true, LocalDate.of(1825, 8, 6), 9,
"Christianity", "Andean Condor", "Andean Cock-of-the-rock", "Football", "Luis Arce");
countries.add(bolivia);

CountryDTO belgium = new CountryDTO(80, "Belgium", "Brussels", 11589623, true, LocalDate.of(1830, 10, 4), 3,
"Christianity", "Lion", "Common Kingfisher", "Football", "Alexander De Croo");
countries.add(belgium);

CountryDTO haiti = new CountryDTO(81, "Haiti", "Port-au-Prince", 11402533, true, LocalDate.of(1804, 1, 1), 10,
"Christianity", "Bulldog", "Hispaniolan Trogon", "Football", "Ariel Henry");
countries.add(haiti);

CountryDTO cuba = new CountryDTO(82, "Cuba", "Havana", 11326616, true, LocalDate.of(1902, 5, 20), 15,
"Christianity", "Cuban Crocodile", "Cuban Tody", "Baseball", "Miguel Díaz-Canel");
countries.add(cuba);

CountryDTO southSudan = new CountryDTO(83, "South Sudan", "Juba", 11193729, true, LocalDate.of(2011, 7, 9), 10,
"Christianity", "African Leopard", "Black-crowned Crane", "Football", "Salva Kiir Mayardit");
countries.add(southSudan);

CountryDTO dominicanRepublic = new CountryDTO(84, "Dominican Republic", "Santo Domingo", 10847910, true,
LocalDate.of(1844, 2, 27), 31, "Christianity", "Palmchat", "Cigua Palmera", "Baseball",
"Luis Abinader");
countries.add(dominicanRepublic);

CountryDTO czechRepublic = new CountryDTO(85, "Czech Republic", "Prague", 10708981, true,
LocalDate.of(1993, 1, 1), 13, "Christianity", "Lion", "Common Raven", "Ice Hockey", "Andrej Babiš");
countries.add(czechRepublic);

CountryDTO greece = new CountryDTO(86, "Greece", "Athens", 10423054, true, LocalDate.of(1821, 3, 25), 13,
"Christianity", "Dolphin", "Little Owl", "Football", "Kyriakos Mitsotakis");
countries.add(greece);

CountryDTO jordan = new CountryDTO(87, "Jordan", "Amman", 10203134, true, LocalDate.of(1946, 5, 25), 12,
"Islam", "Arabian Oryx", "Sinai Rosefinch", "Football", "Bisher Al-Khasawneh");
countries.add(jordan);

CountryDTO portugal = new CountryDTO(88, "Portugal", "Lisbon", 10196709, true, LocalDate.of(1143, 6, 24), 18,
"Christianity", "Iberian Wolf", "Barcelos Rooster", "Football", "António Costa");
countries.add(portugal);

CountryDTO azerbaijan = new CountryDTO(89, "Azerbaijan", "Baku", 10139177, true, LocalDate.of(1991, 8, 30), 10,
"Islam", "Karabakh Horse", "Karabakh Tur", "Football", "Ilham Aliyev");
countries.add(azerbaijan);

CountryDTO sweden = new CountryDTO(90, "Sweden", "Stockholm", 10099265, true, LocalDate.of(1523, 6, 6), 21,
"Christianity", "Elk", "Common Swift", "Football", "Stefan Löfven");
countries.add(sweden);

CountryDTO honduras = new CountryDTO(91, "Honduras", "Tegucigalpa", 10088078, true, LocalDate.of(1821, 9, 15),
18, "Christianity", "White-tailed Deer", "Scarlet Macaw", "Football", "Xiomara Castro");
countries.add(honduras);

CountryDTO uae = new CountryDTO(92, "UAE", "Abu Dhabi", 9890402, true, LocalDate.of(1971, 12, 2), 7, "Islam",
"Arabian Oryx", "Falcon", "Football", "Khalifa bin Zayed Al Nahyan");
countries.add(uae);

CountryDTO hungary = new CountryDTO(93, "Hungary", "Budapest", 9660351, true, LocalDate.of(1000, 1, 1), 19,
"Christianity", "Turul", "Saker Falcon", "Football", "Viktor Orbán");
countries.add(hungary);

CountryDTO tajikistan = new CountryDTO(94, "Tajikistan", "Dushanbe", 9537645, true, LocalDate.of(1991, 9, 9), 4,
"Islam", "Snow Leopard", "Pamir Shrike", "Football", "Kohir Rasulzoda");
countries.add(tajikistan);

CountryDTO belarus = new CountryDTO(95, "Belarus", "Minsk", 9449323, true, LocalDate.of(1991, 8, 25), 6,
"Christianity", "European Bison", "White Stork", "Football", "Alexander Lukashenko");
countries.add(belarus);

CountryDTO austria = new CountryDTO(96, "Austria", "Vienna", 9006398, true, LocalDate.of(1955, 10, 26), 9,
"Christianity", "Austrian Bundesadler", "Barn Swallow", "Football", "Karl Nehammer");
countries.add(austria);

CountryDTO papuaNewGuinea = new CountryDTO(97, "Papua New Guinea", "Port Moresby", 8947024, true,
LocalDate.of(1975, 9, 16), 22, "Christianity", "Kumul (Raggiana Bird-of-Paradise)",
"Raggiana Bird-of-Paradise", "Rugby League", "James Marape");
countries.add(papuaNewGuinea);

CountryDTO serbia = new CountryDTO(98, "Serbia", "Belgrade", 6945235, true, LocalDate.of(2006, 6, 5), 29,
"Christianity, Orthodox Christianity", "Grey Wolf", "Golden Eagle", "Basketball", "Ana Brnabić");
countries.add(serbia);

CountryDTO israel = new CountryDTO(99, "Israel", "Jerusalem", 9177020, true, LocalDate.of(1948, 5, 14), 6,
"Judaism", "Gazelle", "Hoopoe", "Association Football (Soccer)", "Naftali Bennett");
countries.add(israel);

CountryDTO switzerland = new CountryDTO(100, "Switzerland", "Bern", 8654622, true, LocalDate.of(1848, 8, 1), 26,
"Christianity", "Swiss cow", "Swiss Red Poultry", "Ice Hockey", "Guy Parmelin");
countries.add(switzerland);

CountryDTO togo = new CountryDTO(101, "Togo", "Lome", 8278737, true, LocalDate.of(1960, 4, 27), 5,
"Christianity, Islam, Indigenous Beliefs", "Lion", "Tawny Eagle", "Football",
"Victoire Sidémého Tomegah Dogbé");
countries.add(togo);

CountryDTO sierraLeone = new CountryDTO(102, "Sierra Leone", "Freetown", 7976983, true,
LocalDate.of(1961, 4, 27), 4, "Islam, Christianity, Indigenous Beliefs", "Lion", "Vulture", "Football",
"Julius Maada Bio");
countries.add(sierraLeone);

CountryDTO laos = new CountryDTO(103, "Laos", "Vientiane", 7275560, true, LocalDate.of(1949, 7, 19), 18,
"Buddhism", "Elephant", "White-crested Laughingthrush", "Sepak Takraw", "Thongloun Sisoulith");
countries.add(laos);

CountryDTO paraguay = new CountryDTO(104, "Paraguay", "Asunción", 7132538, true, LocalDate.of(1811, 5, 14), 17,
"Christianity", "Jaguar", "Southern lapwing", "Football", "Mario Abdo Benítez");
countries.add(paraguay);

CountryDTO bulgaria = new CountryDTO(105, "Bulgaria", "Sofia", 6948445, true, LocalDate.of(1908, 9, 22), 28,
"Christianity, Islam", "Lion", "Common Nightingale", "Football", "Stefan Yanev");
countries.add(bulgaria);

CountryDTO libya = new CountryDTO(106, "Libya", "Tripoli", 6871292, true, LocalDate.of(1951, 12, 24), 22,
"Islam", "Barbary Lion", "Barn Swallow", "Football", "Mohammed Menfi");
countries.add(libya);

CountryDTO lebanon = new CountryDTO(107, "Lebanon", "Beirut", 6825445, true, LocalDate.of(1943, 11, 22), 8,
"Islam, Christianity", "Striped Hyena", "Lebanese Mountain Goat", "Association Football (Soccer)",
"Najib Mikati");
countries.add(lebanon);

CountryDTO nicaragua = new CountryDTO(108, "Nicaragua", "Managua", 6624554, true, LocalDate.of(1821, 9, 15), 15,
"Christianity", "Turquoise-browed Motmot", "Turquoise-browed Motmot", "Baseball", "Daniel Ortega");
countries.add(nicaragua);

CountryDTO kyrgyzstan = new CountryDTO(109, "Kyrgyzstan", "Bishkek", 6524195, true, LocalDate.of(1991, 8, 31),
7, "Islam", "Snow Leopard", "Common Raven", "Kok-boru", "Sadyr Japarov");
countries.add(kyrgyzstan);

CountryDTO elSalvador = new CountryDTO(110, "El Salvador", "San Salvador", 6486201, true,
LocalDate.of(1821, 9, 15), 14, "Christianity", "White-tailed Deer", "Turquoise-browed Motmot",
"Football", "Nayib Bukele");
countries.add(elSalvador);

CountryDTO turkmenistan = new CountryDTO(111, "Turkmenistan", "Ashgabat", 6031200, true,
LocalDate.of(1991, 10, 27), 5, "Islam", "Akhal-Teke Horse", "Akhal-Teke Horse",
"Indoor Track and Field", "Serdar Berdimuhamedow");
countries.add(turkmenistan);

CountryDTO singapore = new CountryDTO(112, "Singapore", "Singapore", 5685807, true, LocalDate.of(1965, 9, 16),
1, "Buddhism, Islam, Christianity", "Lion", "Crimson Sunbird", "Table Tennis", "Lee Hsien Loong");
countries.add(singapore);

CountryDTO denmark = new CountryDTO(113, "Denmark", "Copenhagen", 5792202, true, LocalDate.of(1849, 6, 5), 5,
"Christianity", "Lion", "Mute Swan", "Association Football (Soccer)", "Mette Frederiksen");
countries.add(denmark);

CountryDTO finland = new CountryDTO(114, "Finland", "Helsinki", 5540720, true, LocalDate.of(1917, 12, 6), 19,
"Christianity", "Brown Bear", "Whooper Swan", "Ice Hockey", "Sanna Marin");
countries.add(finland);

CountryDTO congo = new CountryDTO(115, "Congo", "Brazzaville", 5518092, true, LocalDate.of(1960, 8, 15), 12,
"Christianity, Indigenous Beliefs", "African Lion", "African Fish Eagle", "Football",
"Denis Sassou Nguesso");
countries.add(congo);

CountryDTO slovakia = new CountryDTO(116, "Slovakia", "Bratislava", 5460109, true, LocalDate.of(1993, 1, 1), 8,
"Christianity", "Tatra Chamois", "European Bee-eater", "Ice Hockey", "Eduard Heger");
countries.add(slovakia);

CountryDTO norway = new CountryDTO(117, "Norway", "Oslo", 5421241, true, LocalDate.of(1905, 6, 7), 18,
"Christianity", "Lion", "White-throated Dipper", "Cross-country Skiing", "Erna Solberg");
countries.add(norway);

CountryDTO oman = new CountryDTO(118, "Oman", "Muscat", 5106626, true, LocalDate.of(1970, 11, 18), 11, "Islam",
"Arabian Oryx", "White-collared Kingfisher", "Camel Racing", "Haitham bin Tariq");
countries.add(oman);

CountryDTO palestine = new CountryDTO(119, "State of Palestine", "East Jerusalem", 5101414, true,
LocalDate.of(1988, 11, 15), 2, "Islam", "Mountain Gazelle", "Palestinian Sunbird", "Football",
"Mohammad Shtayyeh");
countries.add(palestine);

CountryDTO costaRica = new CountryDTO(120, "Costa Rica", "San Jose", 5094118, true, LocalDate.of(1821, 9, 15),
7, "Christianity", "White-tailed Deer", "Clay-colored Thrush", "Football", "Carlos Alvarado Quesada");
countries.add(costaRica);

CountryDTO liberia = new CountryDTO(121, "Liberia", "Monrovia", 5057681, true, LocalDate.of(1847, 7, 26), 15,
"Christianity, Islam, Indigenous Beliefs", "Lion", "White-necked Picathartes", "Football",
"George Weah");
countries.add(liberia);

CountryDTO car = new CountryDTO(122, "Central African Republic", "Bangui", 4829767, true,
LocalDate.of(1960, 8, 13), 16, "Christianity, Islam", "African Elephant", "Bald Eagle", "Football",
"Faustin-Archange Touadéra");
countries.add(car);

CountryDTO newZealand = new CountryDTO(123, "New Zealand", "Wellington", 4822233, true,
LocalDate.of(1907, 9, 26), 16, "Christianity", "Kiwi", "Kiwi", "Rugby Union", "Jacinda Ardern");
countries.add(newZealand);

CountryDTO mauritania = new CountryDTO(124, "Mauritania", "Nouakchott", 4649658, true,
LocalDate.of(1960, 11, 28), 12, "Islam", "Arabian Camel", "Sociable Weaver", "Camel Racing",
"Mohamed Ould Ghazouani");
countries.add(mauritania);

CountryDTO panama = new CountryDTO(125, "Panama", "Panama City", 4314767, true, LocalDate.of(1903, 11, 3), 10,
"Christianity", "Harpy Eagle", "Harpy Eagle", "Baseball", "Laurentino Cortizo");
countries.add(panama);

CountryDTO kuwait = new CountryDTO(126, "Kuwait", "Kuwait City", 4270571, true, LocalDate.of(1961, 2, 25), 6,
"Islam", "Arabian Oryx", "Falcon", "Football", "Nawaf Al-Ahmad Al-Jaber Al-Sabah");
countries.add(kuwait);

CountryDTO croatia = new CountryDTO(127, "Croatia", "Zagreb", 4105493, true, LocalDate.of(1991, 6, 25), 21,
"Christianity", "Dalmatian Dog", "Common Nightingale", "Football", "Andrej Plenković");
countries.add(croatia);

CountryDTO moldova = new CountryDTO(128, "Moldova", "Chisinau", 4033963, true, LocalDate.of(1991, 8, 27), 32,
"Christianity", "Aurochs", "Common Nightingale", "Football", "Natalia Gavrilița");
countries.add(moldova);

CountryDTO georgia = new CountryDTO(129, "Georgia", "Tbilisi", 3989167, true, LocalDate.of(1991, 4, 9), 9,
"Christianity", "Persian Leopard", "Common Nightingale", "Rugby Union", "Irakli Garibashvili");
countries.add(georgia);

CountryDTO eritrea = new CountryDTO(130, "Eritrea", "Asmara", 3546421, true, LocalDate.of(1993, 5, 24), 6,
"Christianity, Islam", "Camel", "White-cheeked Turaco", "Cycling", "Isaias Afwerki");
countries.add(eritrea);

CountryDTO uruguay = new CountryDTO(131, "Uruguay", "Montevideo", 3473730, true, LocalDate.of(1828, 8, 25), 19,
"Christianity", "Southern Lapwing", "Southern Lapwing", "Football", "Luis Lacalle Pou");
countries.add(uruguay);

CountryDTO bosniaHerzegovina = new CountryDTO(132, "Bosnia and Herzegovina", "Sarajevo", 3301000, true,
LocalDate.of(1992, 3, 1), 3, "Islam", "Golden Jackal", "European Robin", "Football", "Milorad Dodik");
countries.add(bosniaHerzegovina);

CountryDTO mongolia = new CountryDTO(133, "Mongolia", "Ulaanbaatar", 3278290, true, LocalDate.of(1921, 7, 11),
21, "Buddhism, Shamanism", "Przewalski's Horse", "Saker Falcon", "Wrestling", "Ukhnaagiin Khürelsükh");
countries.add(mongolia);

CountryDTO armenia = new CountryDTO(134, "Armenia", "Yerevan", 2964219, true, LocalDate.of(1991, 9, 21), 11,
"Christianity", "Armenian Gampr Dog", "Common Nightingale", "Chess", "Vahagn Khachaturyan");
countries.add(armenia);

CountryDTO jamaica = new CountryDTO(135, "Jamaica", "Kingston", 2961161, true, LocalDate.of(1962, 8, 6), 14,
"Christianity", "Red-billed Streamertail", "Doctor Bird", "Cricket", "Andrew Holness");
countries.add(jamaica);

CountryDTO qatar = new CountryDTO(136, "Qatar", "Doha", 2889284, true, LocalDate.of(1971, 9, 3), 8, "Islam",
"Arabian Oryx", "Falcon", "Football", "Sheikh Khalid bin Khalifa Al Thani");
countries.add(qatar);

CountryDTO albania = new CountryDTO(137, "Albania", "Tirana", 2870324, true, LocalDate.of(1912, 11, 28), 12,
"Islam, Christianity", "Golden Eagle", "Golden Eagle", "Football", "Edi Rama");
countries.add(albania);

CountryDTO lithuania = new CountryDTO(138, "Lithuania", "Vilnius", 2722289, true, LocalDate.of(1918, 2, 16), 10,
"Christianity", "Lynx", "White Stork", "Basketball", "Ingrida Šimonytė");
countries.add(lithuania);

CountryDTO namibia = new CountryDTO(139, "Namibia", "Windhoek", 2540905, true, LocalDate.of(1990, 3, 21), 14,
"Christianity", "Oryx", "African Fish Eagle", "Rugby Union", "Hage Geingob");
countries.add(namibia);

CountryDTO gambia = new CountryDTO(140, "Gambia", "Banjul", 2416668, true, LocalDate.of(1965, 2, 18), 5,
"Islam", "African Leopard", "Red-chested Goshawk", "Wrestling", "Adama Barrow");
countries.add(gambia);

CountryDTO botswana = new CountryDTO(141, "Botswana", "Gaborone", 2351627, true, LocalDate.of(1966, 9, 30), 16,
"Christianity", "Zebra", "Kori Bustard", "Football", "Mokgweetsi Masisi");
countries.add(botswana);

CountryDTO gabon = new CountryDTO(142, "Gabon", "Libreville", 2225728, true, LocalDate.of(1960, 8, 16), 9,
"Christianity, Islam", "Black Panther", "Black-crowned Crane", "Football", "Ali Bongo Ondimba");
countries.add(gabon);

CountryDTO lesotho = new CountryDTO(143, "Lesotho", "Maseru", 2142249, true, LocalDate.of(1966, 10, 4), 10,
"Christianity", "Basotho Pony", "Bearded Vulture", "Football", "Moeketsi Majoro");
countries.add(lesotho);

CountryDTO northMacedonia = new CountryDTO(144, "North Macedonia", "Skopje", 2083374, true,
LocalDate.of(1991, 9, 8), 1, "Christianity, Islam", "Macedonian Lynx", "Macedonian Pelican", "Football",
"Dimitar Kovachevski");
countries.add(northMacedonia);

CountryDTO slovenia = new CountryDTO(145, "Slovenia", "Ljubljana", 2078938, true, LocalDate.of(1991, 6, 25), 12,
"Christianity", "Lipizzaner Horse", "European Goldfinch", "Alpine Skiing", "Janez Janša");
countries.add(slovenia);

CountryDTO guineaBissau = new CountryDTO(146, "Guinea-Bissau", "Bissau", 1968001, true,
LocalDate.of(1973, 9, 24), 9, "Islam, Christianity, Indigenous Beliefs", "Common Warthog",
"African Fish Eagle", "Football", "Umaro Sissoco Embaló");
countries.add(guineaBissau);

CountryDTO latvia = new CountryDTO(147, "Latvia", "Riga", 1886198, true, LocalDate.of(1918, 11, 18), 26,
"Christianity", "Brown Bear", "White Wagtail", "Ice Hockey", "Krišjānis Kariņš");
countries.add(latvia);

CountryDTO bahrain = new CountryDTO(148, "Bahrain", "Manama", 1701575, true, LocalDate.of(1971, 12, 16), 4,
"Islam", "Arabian Oryx", "White-eared Bulbul", "Football", "Salman bin Hamad Al Khalifa");
countries.add(bahrain);

CountryDTO equatorialGuinea = new CountryDTO(149, "Equatorial Guinea", "Malabo", 1402985, true,
LocalDate.of(1968, 10, 12), 8, "Christianity, Indigenous Beliefs", "Gorilla", "Grey Parrot", "Football",
"Teodoro Obiang Nguema Mbasogo");
countries.add(equatorialGuinea);

CountryDTO trinidadTobago = new CountryDTO(150, "Trinidad and Tobago", "Port of Spain", 1399491, true,
LocalDate.of(1962, 8, 31), 2, "Christianity, Hinduism, Islam", "Scarlet Ibis", "Cocrico", "Cricket",
"Keith Rowley");
countries.add(trinidadTobago);

CountryDTO estonia = new CountryDTO(151, "Estonia", "Tallinn", 1326535, true, LocalDate.of(1991, 8, 20), 15,
"Christianity", "European Wolf", "Barn Swallow", "Basketball", "Kaja Kallas");
countries.add(estonia);

CountryDTO timorLeste = new CountryDTO(152, "Timor-Leste", "Dili", 1318445, true, LocalDate.of(2002, 5, 20), 13,
"Christianity, Indigenous Beliefs", "Banded Krait", "Crocodylus porosus", "Football",
"Taur Matan Ruak");
countries.add(timorLeste);

CountryDTO mauritius = new CountryDTO(153, "Mauritius", "Port Louis", 1271768, true, LocalDate.of(1968, 3, 12),
12, "Hinduism, Christianity, Islam", "Dodo Bird", "Dodo Bird", "Horse Racing", "Pravind Jugnauth");
countries.add(mauritius);

CountryDTO cyprus = new CountryDTO(154, "Cyprus", "Nicosia", 1207359, true, LocalDate.of(1960, 10, 1), 6,
"Christianity, Islam", "Cypriot Mouflon", "European Roller", "Football", "Nicos Anastasiades");
countries.add(cyprus);

CountryDTO eswatini = new CountryDTO(155, "Eswatini", "Mbabane", 1160164, true, LocalDate.of(1968, 9, 6), 4,
"Christianity, Indigenous Beliefs", "Lion", "Purple-crested Turaco", "Football", "Ambrose Dlamini");
countries.add(eswatini);

CountryDTO djibouti = new CountryDTO(156, "Djibouti", "Djibouti", 988000, true, LocalDate.of(1977, 6, 27), 6,
"Islam", "African Lion", "Arabian Warbler", "Football", "Ismail Omar Guelleh");
countries.add(djibouti);

CountryDTO fiji = new CountryDTO(157, "Fiji", "Suva", 896445, true, LocalDate.of(1970, 10, 10), 14,
"Christianity, Hinduism, Islam", "Fijian Iguana", "Fiji Banded Iguana", "Rugby Union",
"Frank Bainimarama");
countries.add(fiji);

CountryDTO comoros = new CountryDTO(158, "Comoros", "Moroni", 869601, true, LocalDate.of(1975, 7, 6), 3,
"Islam", "Coelacanth", "Comoro Black Parrot", "Football", "Azali Assoumani");
countries.add(comoros);

CountryDTO guyana = new CountryDTO(159, "Guyana", "Georgetown", 786552, true, LocalDate.of(1966, 5, 26), 10,
"Christianity, Hinduism, Islam", "Jaguar", "Canje Pheasant", "Cricket", "Irfaan Ali");
countries.add(guyana);

CountryDTO bhutan = new CountryDTO(160, "Bhutan", "Thimphu", 771612, true, LocalDate.of(1947, 8, 8), 20,
"Buddhism, Hinduism", "Takin", "Raven", "Archery", "Lotay Tshering");
countries.add(bhutan);

CountryDTO solomonIslands = new CountryDTO(161, "Solomon Islands", "Honiara", 686884, true,
LocalDate.of(1978, 7, 7), 9, "Christianity", "Saltwater Crocodile", "Kagu", "Rugby",
"Manasseh Sogavare");
countries.add(solomonIslands);

CountryDTO montenegro = new CountryDTO(162, "Montenegro", "Podgorica", 620029, true, LocalDate.of(2006, 6, 3),
21, "Christianity", "Golden Eagle", "Cetinje Monastery's Owl", "Football", "Zdravko Krivokapić");
countries.add(montenegro);

CountryDTO luxembourg = new CountryDTO(163, "Luxembourg", "Luxembourg City", 625978, true,
LocalDate.of(1839, 10, 20), 3, "Christianity", "Lion", "Goldcrest", "Cycling", "Xavier Bettel");
countries.add(luxembourg);

CountryDTO suriname = new CountryDTO(164, "Suriname", "Paramaribo", 586632, true, LocalDate.of(1975, 11, 25),
10, "Christianity, Hinduism, Islam", "Royal Tortoise", "Scarlet Ibis", "Football", "Chan Santokhi");
countries.add(suriname);

CountryDTO caboVerde = new CountryDTO(165, "Cabo Verde", "Praia", 555987, true, LocalDate.of(1975, 7, 5), 10,
"Christianity", "Sperm Whale", "Red-billed Tropicbird", "Football", "José Maria Neves");
countries.add(caboVerde);

CountryDTO micronesia = new CountryDTO(166, "Micronesia", "Palikir", 115021, true, LocalDate.of(1986, 11, 3), 4,
"Christianity", "Dugong", "Micronesian Kingfisher", "Baseball", "David W. Panuelo");
countries.add(micronesia);

CountryDTO maldives = new CountryDTO(167, "Maldives", "Malé", 521000, true, LocalDate.of(1965, 7, 26), 26,
"Islam", "Whale Shark", "White-breasted Waterhen", "Football", "Ibrahim Mohamed Solih");
countries.add(maldives);

CountryDTO malta = new CountryDTO(168, "Malta", "Valletta", 514564, true, LocalDate.of(1964, 9, 21), 6,
"Roman Catholicism", "Maltese Cross", "Blue Rock Thrush", "Football", "Robert Abela");
countries.add(malta);

CountryDTO brunei = new CountryDTO(169, "Brunei", "Bandar Seri Begawan", 437479, true, LocalDate.of(1984, 1, 1),
4, "Islam", "Proboscis Monkey", "Crested Serpent Eagle", "Sepak Takraw", "Hassanal Bolkiah");
countries.add(brunei);

CountryDTO belize = new CountryDTO(170, "Belize", "Belmopan", 397628, true, LocalDate.of(1981, 9, 21), 6,
"Christianity", "Tapir", "Keel-billed Toucan", "Football", "John Briceño");
countries.add(belize);

CountryDTO bahamas = new CountryDTO(171, "Bahamas", "Nassau", 393244, true, LocalDate.of(1973, 7, 10), 31,
"Christianity", "Blue Marlin", "Flamingo", "Sailing", "Philip Davis");
countries.add(bahamas);

CountryDTO iceland = new CountryDTO(172, "Iceland", "Reykjavik", 356991, true, LocalDate.of(1944, 6, 17), 8,
"Lutheran Christianity", "Gyrfalcon", "Ptarmigan", "Handball", "Katrín Jakobsdóttir");
countries.add(iceland);

CountryDTO vanuatu = new CountryDTO(173, "Vanuatu", "Port Vila", 307145, true, LocalDate.of(1980, 7, 30), 6,
"Presbyterianism", "Tuskfish", "Vanuatu Megapode", "Beach Volleyball", "Bob Loughman");
countries.add(vanuatu);

CountryDTO barbados = new CountryDTO(174, "Barbados", "Bridgetown", 287375, true, LocalDate.of(1966, 11, 30),
11, "Christianity", "Dolphin", "Barbados Yellow Warbler", "Cricket", "Mia Mottley");
countries.add(barbados);

CountryDTO saoTomeAndPrincipe = new CountryDTO(175, "Sao Tome and Principe", "Sao Tome", 219159, true,
LocalDate.of(1975, 7, 12), 2, "Christianity", "Green Turtle", "Sao Tome Ibis", "Soccer",
"Carlos Vila Nova");
countries.add(saoTomeAndPrincipe);

CountryDTO samoa = new CountryDTO(176, "Samoa", "Apia", 198414, true, LocalDate.of(1962, 1, 1), 11,
"Christianity", "Manumea", "Samoa Flying Fox", "Rugby", "Fiamē Naomi Mataʻafa");
countries.add(samoa);

CountryDTO saintLucia = new CountryDTO(177, "Saint Lucia", "Castries", 183627, true, LocalDate.of(1979, 2, 22),
11, "Christianity", "Saint Lucia Parrot", "Saint Lucia Amazon", "Cricket", "Philip J. Pierre");
countries.add(saintLucia);

CountryDTO kiribati = new CountryDTO(178, "Kiribati", "South Tarawa", 119449, true, LocalDate.of(1979, 7, 12),
3, "Christianity", "Turtle", "Frigatebird", "Weightlifting", "Taneti Maamau");
countries.add(kiribati);

CountryDTO grenada = new CountryDTO(179, "Grenada", "St. George's", 112523, true, LocalDate.of(1974, 2, 7), 6,
"Christianity", "Dove", "Grenada Dove", "Cricket", "Keith Mitchell");
countries.add(grenada);

CountryDTO saintVincentGrenadines = new CountryDTO(180, "Saint Vincent and the Grenadines", "Kingstown", 110608,
true, LocalDate.of(1979, 10, 27), 6, "Christianity", "Saint Vincent Parrot", "Saint Vincent Amazon",
"Cricket", "Ralph Gonsalves");
countries.add(saintVincentGrenadines);

CountryDTO tonga = new CountryDTO(181, "Tonga", "Nuku'alofa", 105695, true, LocalDate.of(1970, 6, 4), 5,
"Christianity", "Sea Turtle", "Tonga Fruit Dove", "Rugby", "Pohiva Tu'i'onetoa");
countries.add(tonga);

CountryDTO seychelles = new CountryDTO(182, "Seychelles", "Victoria", 98347, true, LocalDate.of(1976, 6, 29),
26, "Christianity", "Aldabra Giant Tortoise", "Seychelles Black Parrot", "Sailing", "Wavel Ramkalawan");
countries.add(seychelles);

CountryDTO antiguaAndBarbuda = new CountryDTO(183, "Antigua and Barbuda", "St. John's", 97928, true,
LocalDate.of(1981, 11, 1), 6, "Christianity", "Hawksbill Turtle", "Frigate Bird", "Cricket",
"Gaston Browne");
countries.add(antiguaAndBarbuda);

CountryDTO andorra = new CountryDTO(184, "Andorra", "Andorra la Vella", 77281, true, LocalDate.of(1278, 8, 20),
7, "Roman Catholicism", "None", "None", "Skiing", "Xavier Espot Zamora");
countries.add(andorra);

CountryDTO dominica = new CountryDTO(185, "Dominica", "Roseau", 71986, true, LocalDate.of(1978, 11, 3), 10,
"Christianity", "Sisserou Parrot", "Brown Pelican", "Cricket", "Roosevelt Skerrit");
countries.add(dominica);

CountryDTO marshallIslands = new CountryDTO(186, "Marshall Islands", "Majuro", 59190, true,
LocalDate.of(1986, 10, 21), 29, "Christianity", "Marine Turtle", "N/A", "Basketball", "David Kabua");
countries.add(marshallIslands);

CountryDTO saintKittsNevis = new CountryDTO(187, "Saint Kitts and Nevis", "Basseterre", 53199, true,
LocalDate.of(1983, 9, 19), 2, "Christianity", "Brown Pelican", "Frigate Bird", "Cricket",
"Timothy Harris");
countries.add(saintKittsNevis);

CountryDTO monaco = new CountryDTO(188, "Monaco", "Monaco", 39242, true, LocalDate.of(1861, 1, 8), 1,
"Roman Catholicism", "None", "None", "None", "Albert II");
countries.add(monaco);

CountryDTO liechtenstein = new CountryDTO(189, "Liechtenstein", "Vaduz", 38128, true, LocalDate.of(1806, 7, 12),
11, "Roman Catholicism", "Golden Eagle", "None", "None", "Adrian Hasler");
countries.add(liechtenstein);

CountryDTO sanMarino = new CountryDTO(190, "San Marino", "San Marino", 33931, true, LocalDate.of(301, 9, 3), 9,
"Roman Catholicism", "None", "None", "None", "Gian Carlo Venturini");
countries.add(sanMarino);

CountryDTO palau = new CountryDTO(191, "Palau", "Ngerulmud", 18092, true, LocalDate.of(1994, 10, 1), 16,
"Christianity", "Saltwater Crocodile", "Micronesian Megapode", "Baseball", "Whipps Jr.");
countries.add(palau);

CountryDTO tuvalu = new CountryDTO(192, "Tuvalu", "Funafuti", 11792, true, LocalDate.of(1978, 10, 1), 8,
"Christianity", "Hawksbill Turtle", "Tuvalu Brown Sea Dove", "Volleyball", "Kausea Natano");
countries.add(tuvalu);

CountryDTO holySee = new CountryDTO(193, "Holy See (Vatican City)", "Vatican City", 800, true,
LocalDate.of(1929, 2, 11), 1, "Roman Catholicism", "None", "None", "None", "Pope Francis");
countries.add(holySee);

CountryDTO nauru = new CountryDTO(194, "Nauru", "Yaren", 10872, true, LocalDate.of(1968, 1, 31), 14,
"Christianity", "None", "Nauru Phosphate Seabird", "Weightlifting", "Lionel Aingimea");
countries.add(nauru);

CountryDTO pakistan = new CountryDTO(195, "Pakistan", "Islamabad", 225199937, true, LocalDate.of(1947, 8, 14),
4, "Islam", "Markhor", "Chukar partridge", "Cricket", "Imran Khan");
countries.add(pakistan);

System.out.println("Total Countries: " + countries.size());

Iterator<CountryDTO> itr = countries.iterator();
while (itr.hasNext()) {
CountryDTO countryDTO1 = itr.next();
System.out.println("Name: " + countryDTO1.getName());
}
CountryDTO nisargaa = new CountryDTO(196, "Nisargaa", "Earth", 100000, true, LocalDate.of(2023, 8, 28), 8,
"Hindu", "Tiger", "Peacock", "Football", "Prajwal");
countries.add(nisargaa);

boolean country = countries.contains(nisargaa);
System.out.println(country);

CountryDTO nisargaa1 = new CountryDTO(196, "Nisargaa", "Earth", 100000, true, LocalDate.of(2023, 8, 28), 8,
"Hindu", "Tiger", "Peacock", "Football", "Prajwal");

boolean country1 = countries.contains(nisargaa1);
System.out.println(country1);

System.out.println();
Iterator<CountryDTO> itr1 = countries.iterator();
while (itr1.hasNext()) {
CountryDTO countryDTO1 = itr1.next();
if (countryDTO1.getName().startsWith("I")) {
System.out.println("Name:" + countryDTO1.getName());
}
}
System.out.println();
Iterator<CountryDTO> itr2 = countries.iterator();
while (itr2.hasNext()) {
CountryDTO countryDTO2 = itr2.next();
if (countryDTO2.getName().contains("an")) {
System.out.println("Name:" + countryDTO2.getName());
}
}
System.out.println();
Iterator<CountryDTO> itr3 = countries.iterator();
int countCountry = 0;
while (itr3.hasNext()) {
CountryDTO countryDTO3 = itr3.next();
if (countryDTO3.getName().contains("ma")) {
System.out.println("Name:" + countryDTO3.getName());
countCountry++;
}
}
System.out.println("Total countries contains 'ma' in the name:" + countCountry);

System.out.println();
int count=0;
for (CountryDTO country2:countries) {
if(country2.getName().endsWith("a")) {
System.out.println(country2.getName());
count++;
}


}System.out.println("Total countries name endsWith 'a' are:" +count);
}
}