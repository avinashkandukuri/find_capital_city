package com.test.findcapitalcity.util;

import java.util.HashMap;
import java.util.Map;

public class Util {

	private Util() {
	}

	public static String getCoutNameByCode(String code) throws Exception {
		String name = countryname(countries, code.toUpperCase());
		if (null != name && !"".equals(name)) {
			return name;
		} else {
			throw new Exception("Invalid Code!!!");
		}
	}

	public static String countryname(Map<String, String> maps, String name) {
		String newname = null;
		for(Map.Entry entry: maps.entrySet()) {
			if (name.equals(entry.getValue())) {
				newname = entry.getKey().toString();
			}
		}
		return newname;
	}


	private static Map<String, String> countries = new HashMap<>();

	static {
		countries.put("AFGHANISTAN","AFG");
		countries.put("ALBANIA","ALB");
		countries.put("ALGERIA","DZA");
		countries.put("AMERICAN SAMOA","ASM");
		countries.put("ANDORRA","AND");
		countries.put("ANGOLA","AGO");
		countries.put("ANGUILLA","AIA");
		countries.put("ANTARCTICA","ATA");
		countries.put("ANTIGUA AND BARBUDA","ATG");
		countries.put("ARGENTINA","ARG");
		countries.put("ARMENIA","ARM");
		countries.put("ARUBA","ABW");
		countries.put("AUSTRALIA","AUS");
		countries.put("AUSTRIA","AUT");
		countries.put("AZERBAIJAN","AZE");
		countries.put("BAHAMAS (THE)","BHS");
		countries.put("BAHRAIN","BHR");
		countries.put("BANGLADESH","BGD");
		countries.put("BARBADOS","BRB");
		countries.put("BELARUS","BLR");
		countries.put("BELGIUM","BEL");
		countries.put("BELIZE","BLZ");
		countries.put("BENIN","BEN");
		countries.put("BERMUDA","BMU");
		countries.put("BHUTAN","BTN");
		countries.put("BOLIVIA (PLURINATIONAL STATE OF)","BOL");
		countries.put("BONAIRE","BES");
		countries.put("BOSNIA AND HERZEGOVINA","BIH");
		countries.put("BOTSWANA","BWA");
		countries.put("BOUVET ISLAND","BVT");
		countries.put("BRAZIL","BRA");
		countries.put("BRITISH INDIAN OCEAN TERRITORY (THE)","IOT");
		countries.put("BRUNEI DARUSSALAM","BRN");
		countries.put("BULGARIA","BGR");
		countries.put("BURKINA FASO","BFA");
		countries.put("BURUNDI","BDI");
		countries.put("CABO VERDE","CPV");
		countries.put("CAMBODIA","KHM");
		countries.put("CAMEROON","CMR");
		countries.put("CANADA","CAN");
		countries.put("CAYMAN ISLANDS (THE)","CYM");
		countries.put("CENTRAL AFRICAN REPUBLIC (THE)","CAF");
		countries.put("CHAD","TCD");
		countries.put("CHILE","CHL");
		countries.put("CHINA","CHN");
		countries.put("CHRISTMAS ISLAND","CXR");
		countries.put("COCOS (KEELING) ISLANDS (THE)","CCK");
		countries.put("COLOMBIA","COL");
		countries.put("COMOROS (THE)","COM");
		countries.put("CONGO (THE DEMOCRATIC REPUBLIC OF THE)","COD");
		countries.put("CONGO (THE)","COG");
		countries.put("COOK ISLANDS (THE)","COK");
		countries.put("COSTA RICA","CRI");
		countries.put("CROATIA","HRV");
		countries.put("CUBA","CUB");
		countries.put("CURAÇAO","CUW");
		countries.put("CYPRUS","CYP");
		countries.put("CZECHIA","CZE");
		countries.put("CÔTE D'IVOIRE","CIV");
		countries.put("DENMARK","DNK");
		countries.put("DJIBOUTI","DJI");
		countries.put("DOMINICA","DMA");
		countries.put("DOMINICAN REPUBLIC (THE)","DOM");
		countries.put("ECUADOR","ECU");
		countries.put("EGYPT","EGY");
		countries.put("EL SALVADOR","SLV");
		countries.put("EQUATORIAL GUINEA","GNQ");
		countries.put("ERITREA","ERI");
		countries.put("ESTONIA","EST");
		countries.put("ESWATINI","SWZ");
		countries.put("ETHIOPIA","ETH");
		countries.put("FALKLAND ISLANDS (THE) [MALVINAS]","FLK");
		countries.put("FAROE ISLANDS (THE)","FRO");
		countries.put("FIJI","FJI");
		countries.put("FINLAND","FIN");
		countries.put("FRANCE","FRA");
		countries.put("FRENCH GUIANA","GUF");
		countries.put("FRENCH POLYNESIA","PYF");
		countries.put("FRENCH SOUTHERN TERRITORIES (THE)","ATF");
		countries.put("GABON","GAB");
		countries.put("GAMBIA (THE)","GMB");
		countries.put("GEORGIA","GEO");
		countries.put("GERMANY","DEU");
		countries.put("GHANA","GHA");
		countries.put("GIBRALTAR","GIB");
		countries.put("GREECE","GRC");
		countries.put("GREENLAND","GRL");
		countries.put("GRENADA","GRD");
		countries.put("GUADELOUPE","GLP");
		countries.put("GUAM","GUM");
		countries.put("GUATEMALA","GTM");
		countries.put("GUERNSEY","GGY");
		countries.put("GUINEA","GIN");
		countries.put("GUINEA-BISSAU","GNB");
		countries.put("GUYANA","GUY");
		countries.put("HAITI","HTI");
		countries.put("HEARD ISLAND AND MCDONALD ISLANDS","HMD");
		countries.put("HOLY SEE (THE)","VAT");
		countries.put("HONDURAS","HND");
		countries.put("HONG KONG","HKG");
		countries.put("HUNGARY","HUN");
		countries.put("ICELAND","ISL");
		countries.put("INDIA","IND");
		countries.put("INDONESIA","IDN");
		countries.put("IRAN (ISLAMIC REPUBLIC OF)","IRN");
		countries.put("IRAQ","IRQ");
		countries.put("IRELAND","IRL");
		countries.put("ISLE OF MAN","IMN");
		countries.put("ISRAEL","ISR");
		countries.put("ITALY","ITA");
		countries.put("JAMAICA","JAM");
		countries.put("JAPAN","JPN");
		countries.put("JERSEY","JEY");
		countries.put("JORDAN","JOR");
		countries.put("KAZAKHSTAN","KAZ");
		countries.put("KENYA","KEN");
		countries.put("KIRIBATI","KIR");
		countries.put("KOREA (THE DEMOCRATIC PEOPLE'S REPUBLIC OF)","PRK");
		countries.put("KOREA (THE REPUBLIC OF)","KOR");
		countries.put("KUWAIT","KWT");
		countries.put("KYRGYZSTAN","KGZ");
		countries.put("LAO PEOPLE'S DEMOCRATIC REPUBLIC (THE)","LAO");
		countries.put("LATVIA","LVA");
		countries.put("LEBANON","LBN");
		countries.put("LESOTHO","LSO");
		countries.put("LIBERIA","LBR");
		countries.put("LIBYA","LBY");
		countries.put("LIECHTENSTEIN","LIE");
		countries.put("LITHUANIA","LTU");
		countries.put("LUXEMBOURG","LUX");
		countries.put("MACAO","MAC");
		countries.put("MADAGASCAR","MDG");
		countries.put("MALAWI","MWI");
		countries.put("MALAYSIA","MYS");
		countries.put("MALDIVES","MDV");
		countries.put("MALI","MLI");
		countries.put("MALTA","MLT");
		countries.put("MARSHALL ISLANDS (THE)","MHL");
		countries.put("MARTINIQUE","MTQ");
		countries.put("MAURITANIA","MRT");
		countries.put("MAURITIUS","MUS");
		countries.put("MAYOTTE","MYT");
		countries.put("MEXICO","MEX");
		countries.put("MICRONESIA (FEDERATED STATES OF)","FSM");
		countries.put("MOLDOVA (THE REPUBLIC OF)","MDA");
		countries.put("MONACO","MCO");
		countries.put("MONGOLIA","MNG");
		countries.put("MONTENEGRO","MNE");
		countries.put("MONTSERRAT","MSR");
		countries.put("MOROCCO","MAR");
		countries.put("MOZAMBIQUE","MOZ");
		countries.put("MYANMAR","MMR");
		countries.put("NAMIBIA","NAM");
		countries.put("NAURU","NRU");
		countries.put("NEPAL","NPL");
		countries.put("NETHERLANDS (THE)","NLD");
		countries.put("NEW CALEDONIA","NCL");
		countries.put("NEW ZEALAND","NZL");
		countries.put("NICARAGUA","NIC");
		countries.put("NIGER (THE)","NER");
		countries.put("NIGERIA","NGA");
		countries.put("NIUE","NIU");
		countries.put("NORFOLK ISLAND","NFK");
		countries.put("NORTHERN MARIANA ISLANDS (THE)","MNP");
		countries.put("NORWAY","NOR");
		countries.put("OMAN","OMN");
		countries.put("PAKISTAN","PAK");
		countries.put("PALAU","PLW");
		countries.put("PALESTINE","PSE");
		countries.put("PANAMA","PAN");
		countries.put("PAPUA NEW GUINEA","PNG");
		countries.put("PARAGUAY","PRY");
		countries.put("PERU","PER");
		countries.put("PHILIPPINES (THE)","PHL");
		countries.put("PITCAIRN","PCN");
		countries.put("POLAND","POL");
		countries.put("PORTUGAL","PRT");
		countries.put("PUERTO RICO","PRI");
		countries.put("QATAR","QAT");
		countries.put("REPUBLIC OF NORTH MACEDONIA","MKD");
		countries.put("ROMANIA","ROU");
		countries.put("RUSSIAN FEDERATION (THE)","RUS");
		countries.put("RWANDA","RWA");
		countries.put("RÉUNION","REU");
		countries.put("SAINT BARTHÉLEMY","BLM");
		countries.put("SAINT HELENA","SHN");
		countries.put("SAINT KITTS AND NEVIS","KNA");
		countries.put("SAINT LUCIA","LCA");
		countries.put("SAINT MARTIN (FRENCH PART)","MAF");
		countries.put("SAINT PIERRE AND MIQUELON","SPM");
		countries.put("SAINT VINCENT AND THE GRENADINES","VCT");
		countries.put("SAMOA","WSM");
		countries.put("SAN MARINO","SMR");
		countries.put("SAO TOME AND PRINCIPE","STP");
		countries.put("SAUDI ARABIA","SAU");
		countries.put("SENEGAL","SEN");
		countries.put("SERBIA","SRB");
		countries.put("SEYCHELLES","SYC");
		countries.put("SIERRA LEONE","SLE");
		countries.put("SINGAPORE","SGP");
		countries.put("SINT MAARTEN (DUTCH PART)","SXM");
		countries.put("SLOVAKIA","SVK");
		countries.put("SLOVENIA","SVN");
		countries.put("SOLOMON ISLANDS","SLB");
		countries.put("SOMALIA","SOM");
		countries.put("SOUTH AFRICA","ZAF");
		countries.put("SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS","SGS");
		countries.put("SOUTH SUDAN","SSD");
		countries.put("SPAIN","ESP");
		countries.put("SRI LANKA","LKA");
		countries.put("SUDAN (THE)","SDN");
		countries.put("SURINAME","SUR");
		countries.put("SVALBARD AND JAN MAYEN","SJM");
		countries.put("SWEDEN","SWE");
		countries.put("SWITZERLAND","CHE");
		countries.put("SYRIAN ARAB REPUBLIC","SYR");
		countries.put("TAIWAN (PROVINCE OF CHINA)","TWN");
		countries.put("TAJIKISTAN","TJK");
		countries.put("TANZANIA","TZA");
		countries.put("THAILAND","THA");
		countries.put("TIMOR-LESTE","TLS");
		countries.put("TOGO","TGO");
		countries.put("TOKELAU","TKL");
		countries.put("TONGA","TON");
		countries.put("TRINIDAD AND TOBAGO","TTO");
		countries.put("TUNISIA","TUN");
		countries.put("TURKEY","TUR");
		countries.put("TURKMENISTAN","TKM");
		countries.put("TURKS AND CAICOS ISLANDS (THE)","TCA");
		countries.put("TUVALU","TUV");
		countries.put("UGANDA","UGA");
		countries.put("UKRAINE","UKR");
		countries.put("UNITED ARAB EMIRATES (THE)","ARE");
		countries.put("UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND (THE)","GBR");
		countries.put("UNITED STATES MINOR OUTLYING ISLANDS (THE)","UMI");
		countries.put("UNITED STATES OF AMERICA (THE)","USA");
		countries.put("URUGUAY","URY");
		countries.put("UZBEKISTAN","UZB");
		countries.put("VANUATU","VUT");
		countries.put("VENEZUELA (BOLIVARIAN REPUBLIC OF)","VEN");
		countries.put("VIET NAM","VNM");
		countries.put("VIRGIN ISLANDS (BRITISH)","VGB");
		countries.put("VIRGIN ISLANDS (U.S.)","VIR");
		countries.put("WALLIS AND FUTUNA","WLF");
		countries.put("WESTERN SAHARA","ESH");
		countries.put("YEMEN","YEM");
		countries.put("ZAMBIA","ZMB");
		countries.put("ZIMBABWE","ZWE");
		countries.put("ÅLAND ISLANDS","ALA");
	}

}
