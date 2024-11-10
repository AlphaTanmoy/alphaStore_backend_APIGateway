package com.alphaStore.APIGateway.seeder

import com.alphaStore.Core.contracts.CountryRepoAggregatorContract
import com.alphaStore.Core.entity.Country
import org.springframework.stereotype.Component

@Component
class CountrySeeder(
    private val countryRepoAggregatorContract: CountryRepoAggregatorContract,
)  {

    fun mayInsertCountryData(){

        val countries: ArrayList<Country> = arrayListOf(
            Country(
                knownName = "Afghanistan",
                officialName = "Afghanistan",
                alpha2 = "AF",
                alpha3 = "AFG",
                isdCode = "93",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Åland",
                officialName = "Åland Islands",
                alpha2 = "AX",
                alpha3 = "ALA",
                isdCode = "358",
                mobileNumberValidationRegex = "^[\\d]{7,8}\$|^[\\d]{10}\$"
            ),
            Country(
                knownName = "Albania",
                officialName = "Albania",
                alpha2 = "AL",
                alpha3 = "ALB",
                isdCode = "355",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Algeria",
                officialName = "Algeria",
                alpha2 = "DZ",
                alpha3 = "DZA",
                isdCode = "213",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "American Samoa",
                officialName = "American Samoa",
                alpha2 = "AS",
                alpha3 = "ASM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Andorra",
                officialName = "Andorra",
                alpha2 = "AD",
                alpha3 = "ASM",
                isdCode = "376",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Angola",
                officialName = "Angola",
                alpha2 = "AO",
                alpha3 = "AGO",
                isdCode = "244",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Anguilla",
                officialName = "Anguilla",
                alpha2 = "AI",
                alpha3 = "AIA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Antarctica",
                officialName = "Antarctica",
                alpha2 = "AQ",
                alpha3 = "ATA",
                isdCode = "672",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Antigua and Barbuda",
                officialName = "Antigua and Barbuda",
                alpha2 = "AG",
                alpha3 = "ATG",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Argentina",
                officialName = "Argentina",
                alpha2 = "AR",
                alpha3 = "ARG",
                isdCode = "54",
                mobileNumberValidationRegex = "^[\\d]{6,8}\$"
            ),
            Country(
                knownName = "Armenia",
                officialName = "Armenia",
                alpha2 = "AM",
                alpha3 = "ARM",
                isdCode = "374",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Aruba",
                officialName = "Aruba",
                alpha2 = "AW",
                alpha3 = "ABW",
                isdCode = "297",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Australia",
                officialName = "Australia",
                alpha2 = "AU",
                alpha3 = "AUS",
                isdCode = "61",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Austria",
                officialName = "Austria",
                alpha2 = "AT",
                alpha3 = "AUT",
                isdCode = "43",
                mobileNumberValidationRegex = "^[\\d]{10,11}\$"
            ),
            Country(
                knownName = "Azerbaijan",
                officialName = "Azerbaijan",
                alpha2 = "AZ",
                alpha3 = "AZE",
                isdCode = "994",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Bahamas",
                officialName = "Bahamas",
                alpha2 = "BS",
                alpha3 = "BHS",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Bahrain",
                officialName = "Bahrain",
                alpha2 = "BH",
                alpha3 = "BHR",
                isdCode = "973",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Belarus",
                officialName = "Belarus",
                alpha2 = "BY",
                alpha3 = "BLR",
                isdCode = "375",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Belgium",
                officialName = "Belgium",
                alpha2 = "BE",
                alpha3 = "BEL",
                isdCode = "32",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Belize",
                officialName = "Belize",
                alpha2 = "BZ",
                alpha3 = "BLZ",
                isdCode = "501",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Benin",
                officialName = "Benin",
                alpha2 = "BJ",
                alpha3 = "BEN",
                isdCode = "229",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Bermuda",
                officialName = "Bermuda",
                alpha2 = "BM",
                alpha3 = "BMU",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Bhutan",
                officialName = "Bhutan",
                alpha2 = "BT",
                alpha3 = "BTN",
                isdCode = "975",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Bolivia",
                officialName = "Bolivia",
                alpha2 = "BO",
                alpha3 = "BOL",
                isdCode = "591",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Bonaire",
                officialName = "Bonaire, Sint Eustatius and Saba",
                alpha2 = "BQ",
                alpha3 = "BES",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Bosnia and Herzegovina",
                officialName = "Bosnia and Herzegovina",
                alpha2 = "BA",
                alpha3 = "BIH",
                isdCode = "387",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Botswana",
                officialName = "Botswana",
                alpha2 = "BW",
                alpha3 = "BWA",
                isdCode = "267",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Bouvet Island",
                officialName = "Bouvet Island",
                alpha2 = "BV",
                alpha3 = "BVT",
                isdCode = "",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Brazil",
                officialName = "Brazil",
                alpha2 = "BR",
                alpha3 = "BRA",
                isdCode = "55",
                mobileNumberValidationRegex = "^[\\d]{11}\$"
            ),
            Country(
                knownName = "British Indian Ocean Territory",
                officialName = "British Indian Ocean Territory",
                alpha2 = "IO",
                alpha3 = "IOT",
                isdCode = "246",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "British Virgin Islands",
                officialName = "British Virgin Islands",
                alpha2 = "VG",
                alpha3 = "VGB",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Brunei",
                officialName = "Brunei Darussalam",
                alpha2 = "BN",
                alpha3 = "BRN",
                isdCode = "673",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Bulgaria",
                officialName = "Bulgaria",
                alpha2 = "BG",
                alpha3 = "BGN",
                isdCode = "359",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Burkina Faso",
                officialName = "Burkina Faso",
                alpha2 = "BF",
                alpha3 = "BFA",
                isdCode = "226",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Burundi",
                officialName = "Burundi",
                alpha2 = "BI",
                alpha3 = "BDI",
                isdCode = "257",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Cambodia",
                officialName = "Cambodia",
                alpha2 = "KH",
                alpha3 = "KHM",
                isdCode = "855",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Cameroon",
                officialName = "Cameroon",
                alpha2 = "CM",
                alpha3 = "CMR",
                isdCode = "237",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Canada",
                officialName = "Canada",
                alpha2 = "CA",
                alpha3 = "CAN",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Cape Verde",
                officialName = "Cape Verde",
                alpha2 = "CV",
                alpha3 = "CPV",
                isdCode = "238",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Cayman Islands",
                officialName = "Cayman Islands",
                alpha2 = "KY",
                alpha3 = "CYM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Central African Republic",
                officialName = "Central African Republic",
                alpha2 = "CF",
                alpha3 = "CAF",
                isdCode = "236",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Chad",
                officialName = "Chad",
                alpha2 = "TD",
                alpha3 = "TCD",
                isdCode = "235",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Chile",
                officialName = "Chile",
                alpha2 = "CL",
                alpha3 = "CHL",
                isdCode = "56",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "China",
                officialName = "China",
                alpha2 = "CN",
                alpha3 = "CHN",
                isdCode = "86",
                mobileNumberValidationRegex = "^[\\d]{11}\$"
            ),
            Country(
                knownName = "Christmas Island",
                officialName = "Christmas Island",
                alpha2 = "CX",
                alpha3 = "CXR",
                isdCode = "61",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Cocos [Keeling] Islands",
                officialName = "Cocos [Keeling] Islands",
                alpha2 = "CC",
                alpha3 = "CCK",
                isdCode = "61",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Colombia",
                officialName = "Colombia",
                alpha2 = "CO",
                alpha3 = "COL",
                isdCode = "57",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Comoros",
                officialName = "Comoros",
                alpha2 = "KM",
                alpha3 = "COM",
                isdCode = "269",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Cook Islands",
                officialName = "Cook Islands",
                alpha2 = "CK",
                alpha3 = "COK",
                isdCode = "682",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Costa Rica",
                officialName = "Costa Rica",
                alpha2 = "CR",
                alpha3 = "CRI",
                isdCode = "506",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Croatia",
                officialName = "Croatia",
                alpha2 = "HR",
                alpha3 = "HRV",
                isdCode = "385",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Cuba",
                officialName = "Cuba",
                alpha2 = "CU",
                alpha3 = "CUB",
                isdCode = "53",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Curacao",
                officialName = "Curacao",
                alpha2 = "CW",
                alpha3 = "CUW",
                isdCode = "599",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Cyprus",
                officialName = "Cyprus",
                alpha2 = "CY",
                alpha3 = "CYP",
                isdCode = "357",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Czechia",
                officialName = "Czech Republic",
                alpha2 = "CZ",
                alpha3 = "CZE",
                isdCode = "420",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Democratic Republic of the Congo",
                officialName = "Congo (Democratic Republic of the)",
                alpha2 = "CD",
                alpha3 = "COD",
                isdCode = "243",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Denmark",
                officialName = "Denmark",
                alpha2 = "DK",
                alpha3 = "DNK",
                isdCode = "45",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Djibouti",
                officialName = "Djibouti",
                alpha2 = "DJ",
                alpha3 = "DJI",
                isdCode = "253",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Dominica",
                officialName = "Dominica",
                alpha2 = "DM",
                alpha3 = "DMA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Dominican Republic",
                officialName = "Dominican Republic",
                alpha2 = "DO",
                alpha3 = "DOM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "East Timor",
                officialName = "Timor-Leste",
                alpha2 = "TL",
                alpha3 = "TLS",
                isdCode = "670",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Ecuador",
                officialName = "Ecuador",
                alpha2 = "EC",
                alpha3 = "ECU",
                isdCode = "593",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Egypt",
                officialName = "Egypt",
                alpha2 = "EG",
                alpha3 = "EGY",
                isdCode = "20",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "El Salvador",
                officialName = "El Salvador",
                alpha2 = "SV",
                alpha3 = "SLV",
                isdCode = "503",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Equatorial Guinea",
                officialName = "Equatorial Guinea",
                alpha2 = "GQ",
                alpha3 = "GNQ",
                isdCode = "240",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Eritrea",
                officialName = "Eritrea",
                alpha2 = "ER",
                alpha3 = "ERI",
                isdCode = "291",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Estonia",
                officialName = "Estonia",
                alpha2 = "EE",
                alpha3 = "EST",
                isdCode = "372",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Ethiopia",
                officialName = "Ethiopia",
                alpha2 = "ET",
                alpha3 = "ETH",
                isdCode = "251",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Falkland Islands",
                officialName = "Falkland Islands (Malvinas)",
                alpha2 = "FK",
                alpha3 = "FLK",
                isdCode = "500",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Faroe Islands",
                officialName = "Faroe Islands",
                alpha2 = "FO",
                alpha3 = "FRO",
                isdCode = "298",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Fiji",
                officialName = "Fiji",
                alpha2 = "FJ",
                alpha3 = "FJI",
                isdCode = "679",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Finland",
                officialName = "Finland",
                alpha2 = "FI",
                alpha3 = "FIN",
                isdCode = "358",
                mobileNumberValidationRegex = "^[\\d]{9,11}\$"
            ),
            Country(
                knownName = "France",
                officialName = "France",
                alpha2 = "FR",
                alpha3 = "FRA",
                isdCode = "33",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "French Guiana",
                officialName = "French Guiana",
                alpha2 = "GF",
                alpha3 = "GUF",
                isdCode = "594",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "French Polynesia",
                officialName = "French Polynesia",
                alpha2 = "PF",
                alpha3 = "PYF",
                isdCode = "689",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "French Southern Territories",
                officialName = "French Southern Territories",
                alpha2 = "TF",
                alpha3 = "ATF",
                isdCode = "",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Gabon",
                officialName = "Gabon",
                alpha2 = "GA",
                alpha3 = "GAB",
                isdCode = "241",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Gambia",
                officialName = "Gambia",
                alpha2 = "GM",
                alpha3 = "GMB",
                isdCode = "220",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Georgia",
                officialName = "Georgia",
                alpha2 = "GE",
                alpha3 = "GEO",
                isdCode = "995",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Germany",
                officialName = "Germany",
                alpha2 = "DE",
                alpha3 = "DEU",
                isdCode = "49",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Ghana",
                officialName = "Ghana",
                alpha2 = "GH",
                alpha3 = "GHA",
                isdCode = "233",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Gibraltar",
                officialName = "Gibraltar",
                alpha2 = "GI",
                alpha3 = "GIB",
                isdCode = "350",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Greece",
                officialName = "Greece",
                alpha2 = "GR",
                alpha3 = "GRC",
                isdCode = "30",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Greenland",
                officialName = "Greenland",
                alpha2 = "GL",
                alpha3 = "GRL",
                isdCode = "299",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Grenada",
                officialName = "Grenada",
                alpha2 = "GD",
                alpha3 = "GRD",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Guadeloupe",
                officialName = "Guadeloupe",
                alpha2 = "GP",
                alpha3 = "GLP",
                isdCode = "590",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Guam",
                officialName = "Guam",
                alpha2 = "GU",
                alpha3 = "GUM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Guatemala",
                officialName = "Guatemala",
                alpha2 = "GT",
                alpha3 = "GTM",
                isdCode = "502",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Guernsey",
                officialName = "Guernsey",
                alpha2 = "GG",
                alpha3 = "GGY",
                isdCode = "44",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Guinea",
                officialName = "Guinea",
                alpha2 = "GN",
                alpha3 = "GIN",
                isdCode = "224",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Guinea-Bissau",
                officialName = "Guinea-Bissau",
                alpha2 = "GW",
                alpha3 = "GNB",
                isdCode = "245",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Guyana",
                officialName = "Guyana",
                alpha2 = "GY",
                alpha3 = "GUY",
                isdCode = "592",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Haiti",
                officialName = "Haiti",
                alpha2 = "HT",
                alpha3 = "HTI",
                isdCode = "509",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Heard Island and McDonald Islands",
                officialName = "Heard Island and McDonald Islands",
                alpha2 = "HM",
                alpha3 = "HMD",
                isdCode = "",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Honduras",
                officialName = "Honduras",
                alpha2 = "HN",
                alpha3 = "HND",
                isdCode = "504",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Hong Kong",
                officialName = "Hong Kong",
                alpha2 = "HK",
                alpha3 = "HKG",
                isdCode = "852",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Hungary",
                officialName = "Hungary",
                alpha2 = "HU",
                alpha3 = "HUN",
                isdCode = "36",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Iceland",
                officialName = "Iceland",
                alpha2 = "IS",
                alpha3 = "ISL",
                isdCode = "354",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "India",
                officialName = "India",
                alpha2 = "IN",
                alpha3 = "IND",
                isdCode = "91",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Indonesia",
                officialName = "Indonesia",
                alpha2 = "ID",
                alpha3 = "IDN",
                isdCode = "62",
                mobileNumberValidationRegex = "^[\\d]{11}\$"
            ),
            Country(
                knownName = "Iran",
                officialName = "Iran",
                alpha2 = "IR",
                alpha3 = "IRN",
                isdCode = "98",
                mobileNumberValidationRegex = "^[\\d]{11}\$"
            ),
            Country(
                knownName = "Iraq",
                officialName = "Iraq",
                alpha2 = "IQ",
                alpha3 = "IRQ",
                isdCode = "964",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Ireland",
                officialName = "Ireland",
                alpha2 = "IE",
                alpha3 = "IRL",
                isdCode = "353",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Isle of Man",
                officialName = "Isle of Man",
                alpha2 = "IM",
                alpha3 = "IMN",
                isdCode = "44",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Italy",
                officialName = "Italy",
                alpha2 = "IT",
                alpha3 = "ITA",
                isdCode = "39",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Ivory Coast",
                officialName = "Côte d'Ivoire",
                alpha2 = "CI",
                alpha3 = "CIV",
                isdCode = "225",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Jamaica",
                officialName = "Jamaica",
                alpha2 = "JM",
                alpha3 = "JAM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Japan",
                officialName = "Japan",
                alpha2 = "JP",
                alpha3 = "JPN",
                isdCode = "81",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Jersey",
                officialName = "Jersey",
                alpha2 = "JE",
                alpha3 = "JEY",
                isdCode = "44",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Jordan",
                officialName = "Jordan",
                alpha2 = "JO",
                alpha3 = "JOR",
                isdCode = "962",
                mobileNumberValidationRegex = "^[\\d]{8,9}\$"
            ),
            Country(
                knownName = "Kazakhstan",
                officialName = "Kazakhstan",
                alpha2 = "KZ",
                alpha3 = "KAZ",
                isdCode = "7",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Kenya",
                officialName = "Kenya",
                alpha2 = "KE",
                alpha3 = "KEN",
                isdCode = "254",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Kiribati",
                officialName = "Kiribati",
                alpha2 = "KI",
                alpha3 = "KIR",
                isdCode = "686",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Kosovo",
                officialName = "Republic of Kosovo",
                alpha2 = "XK",
                alpha3 = "KOS",
                isdCode = "383",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Kuwait",
                officialName = "Kuwait",
                alpha2 = "KW",
                alpha3 = "KWT",
                isdCode = "965",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Kyrgyzstan",
                officialName = "Kyrgyzstan",
                alpha2 = "KG",
                alpha3 = "KGZ",
                isdCode = "996",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Laos",
                officialName = "Lao People's Democratic Republic",
                alpha2 = "LA",
                alpha3 = "LAO",
                isdCode = "856",
                mobileNumberValidationRegex = "^[\\d]{8,9}\$"
            ),
            Country(
                knownName = "Latvia",
                officialName = "Latvia",
                alpha2 = "LV",
                alpha3 = "LVA",
                isdCode = "371",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Lesotho",
                officialName = "Lesotho",
                alpha2 = "LS",
                alpha3 = "LSO",
                isdCode = "266",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Liberia",
                officialName = "Liberia",
                alpha2 = "LR",
                alpha3 = "LBR",
                isdCode = "231",
                mobileNumberValidationRegex = "^[\\d]{8,9}\$"
            ),
            Country(
                knownName = "Libya",
                officialName = "Libya",
                alpha2 = "LY",
                alpha3 = "LBY",
                isdCode = "218",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Liechtenstein",
                officialName = "Liechtenstein",
                alpha2 = "LI",
                alpha3 = "LIE",
                isdCode = "423",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Lithuania",
                officialName = "Lithuania",
                alpha2 = "LT",
                alpha3 = "LTU",
                isdCode = "370",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Luxembourg",
                officialName = "Luxembourg",
                alpha2 = "LU",
                alpha3 = "LUX",
                isdCode = "352",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Macao",
                officialName = "Macao",
                alpha2 = "MO",
                alpha3 = "MAC",
                isdCode = "853",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Macedonia",
                officialName = "Macedonia (the former Yugoslav Republic of)",
                alpha2 = "MK",
                alpha3 = "MKD",
                isdCode = "389",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Madagascar",
                officialName = "Madagascar",
                alpha2 = "MK",
                alpha3 = "MKD",
                isdCode = "389",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Malawi",
                officialName = "Malawi",
                alpha2 = "MW",
                alpha3 = "MWI",
                isdCode = "265",
                mobileNumberValidationRegex = "^[\\d]{7,9}\$"
            ),
            Country(
                knownName = "Malaysia",
                officialName = "Malaysia",
                alpha2 = "MY",
                alpha3 = "MYS",
                isdCode = "60",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Maldives",
                officialName = "Maldives",
                alpha2 = "MV",
                alpha3 = "MDV",
                isdCode = "960",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Mali",
                officialName = "Mali",
                alpha2 = "ML",
                alpha3 = "MLI",
                isdCode = "223",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Malta",
                officialName = "Malta",
                alpha2 = "MT",
                alpha3 = "MLT",
                isdCode = "356",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Marshall Islands",
                officialName = "Marshall Islands",
                alpha2 = "MH",
                alpha3 = "MHL",
                isdCode = "692",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Martinique",
                officialName = "Martinique",
                alpha2 = "MQ",
                alpha3 = "MTQ",
                isdCode = "596",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Mauritania",
                officialName = "Mauritania",
                alpha2 = "MR",
                alpha3 = "MRT",
                isdCode = "222",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Mauritius",
                officialName = "Mauritius",
                alpha2 = "MU",
                alpha3 = "MUS",
                isdCode = "230",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Mayotte",
                officialName = "Mayotte",
                alpha2 = "YT",
                alpha3 = "MYT",
                isdCode = "262",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Mexico",
                officialName = "Mexico",
                alpha2 = "MX",
                alpha3 = "MEX",
                isdCode = "52",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Micronesia",
                officialName = "Micronesia",
                alpha2 = "FM",
                alpha3 = "FSM",
                isdCode = "691",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Monaco",
                officialName = "Monaco",
                alpha2 = "MC",
                alpha3 = "MCO",
                isdCode = "377",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Mongolia",
                officialName = "Mongolia",
                alpha2 = "MN",
                alpha3 = "MNG",
                isdCode = "976",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Montenegro",
                officialName = "Montenegro",
                alpha2 = "ME",
                alpha3 = "MNE",
                isdCode = "382",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Montserrat",
                officialName = "Montserrat",
                alpha2 = "MS",
                alpha3 = "MSR",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Morocco",
                officialName = "Morocco",
                alpha2 = "MA",
                alpha3 = "MAR",
                isdCode = "212",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Mozambique",
                officialName = "Mozambique",
                alpha2 = "MZ",
                alpha3 = "MOZ",
                isdCode = "258",
                mobileNumberValidationRegex = "^[\\d]{12}\$"
            ),
            Country(
                knownName = "Myanmar [Burma]",
                officialName = "Myanmar",
                alpha2 = "MM",
                alpha3 = "MMR",
                isdCode = "95",
                mobileNumberValidationRegex = "^[\\d]{7,10}\$"
            ),
            Country(
                knownName = "Namibia",
                officialName = "Namibia",
                alpha2 = "NA",
                alpha3 = "NAM",
                isdCode = "264",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Nauru",
                officialName = "Nauru",
                alpha2 = "NR",
                alpha3 = "NRU",
                isdCode = "674",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Nepal",
                officialName = "Nepal",
                alpha2 = "NP",
                alpha3 = "NPL",
                isdCode = "977",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Netherlands",
                officialName = "Netherlands",
                alpha2 = "NL",
                alpha3 = "NLD",
                isdCode = "31",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "New Caledonia",
                officialName = "New Caledonia",
                alpha2 = "NC",
                alpha3 = "NCL",
                isdCode = "687",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "New Zealand",
                officialName = "New Zealand",
                alpha2 = "NZ",
                alpha3 = "NZL",
                isdCode = "64",
                mobileNumberValidationRegex = "^[\\d]{8,9}\$"
            ),
            Country(
                knownName = "Nicaragua",
                officialName = "Nicaragua",
                alpha2 = "NI",
                alpha3 = "NIC",
                isdCode = "505",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Niger",
                officialName = "Niger",
                alpha2 = "NE",
                alpha3 = "NER",
                isdCode = "227",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Nigeria",
                officialName = "Nigeria",
                alpha2 = "NG",
                alpha3 = "NGA",
                isdCode = "234",
                mobileNumberValidationRegex = "^[\\d]{9,11}\$"
            ),
            Country(
                knownName = "Niue",
                officialName = "Niue",
                alpha2 = "NU",
                alpha3 = "NIU",
                isdCode = "683",
                mobileNumberValidationRegex = "^[\\d]{4}\$"
            ),
            Country(
                knownName = "Norfolk Island",
                officialName = "Norfolk Island",
                alpha2 = "NF",
                alpha3 = "NFK",
                isdCode = "672",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Northern Mariana Islands",
                officialName = "Northern Mariana Islands",
                alpha2 = "MP",
                alpha3 = "MNP",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "North Korea",
                officialName = "Korea (Democratic People's Republic of)",
                alpha2 = "KP",
                alpha3 = "PRK",
                isdCode = "850",
                mobileNumberValidationRegex = "^[\\d]{4}\$|^[\\d]{6}\$|^[\\d]{7}\$|^[\\d]{13}|\$"
            ),
            Country(
                knownName = "Norway",
                officialName = "Norway",
                alpha2 = "NO",
                alpha3 = "NOR",
                isdCode = "47",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Oman",
                officialName = "Oman",
                alpha2 = "OM",
                alpha3 = "OMN",
                isdCode = "968",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Pakistan",
                officialName = "Pakistan",
                alpha2 = "PK",
                alpha3 = "PAK",
                isdCode = "92",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Palau",
                officialName = "Palau",
                alpha2 = "PW",
                alpha3 = "PLW",
                isdCode = "680",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Palestine",
                officialName = "Palestine",
                alpha2 = "PS",
                alpha3 = "PSE",
                isdCode = "970",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Panama",
                officialName = "Panama",
                alpha2 = "PA",
                alpha3 = "PAN",
                isdCode = "507",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Papua New Guinea",
                officialName = "Papua New Guinea",
                alpha2 = "PG",
                alpha3 = "PNG",
                isdCode = "675",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Paraguay",
                officialName = "Paraguay",
                alpha2 = "PY",
                alpha3 = "PRY",
                isdCode = "595",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Peru",
                officialName = "Peru",
                alpha2 = "PE",
                alpha3 = "PER",
                isdCode = "51",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Philippines",
                officialName = "Philippines",
                alpha2 = "PH",
                alpha3 = "PHL",
                isdCode = "63",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Pitcairn Islands",
                officialName = "Pitcairn",
                alpha2 = "PN",
                alpha3 = "PCN",
                isdCode = "64",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Poland",
                officialName = "Poland",
                alpha2 = "PL",
                alpha3 = "POL",
                isdCode = "48",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Portugal",
                officialName = "Portugal",
                alpha2 = "PT",
                alpha3 = "PRT",
                isdCode = "351",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Puerto Rico",
                officialName = "Puerto Rico",
                alpha2 = "PR",
                alpha3 = "PRI",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Qatar",
                officialName = "Qatar",
                alpha2 = "QA",
                alpha3 = "QAT",
                isdCode = "974",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Republic of the Congo",
                officialName = "Congo",
                alpha2 = "CG",
                alpha3 = "COG",
                isdCode = "242",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Réunion",
                officialName = "Réunion",
                alpha2 = "RE",
                alpha3 = "REU",
                isdCode = "262",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Romania",
                officialName = "Romania",
                alpha2 = "RO",
                alpha3 = "ROU",
                isdCode = "40",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Russia",
                officialName = "Russian Federation",
                alpha2 = "RU",
                alpha3 = "RUS",
                isdCode = "7",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Rwanda",
                officialName = "Rwanda",
                alpha2 = "RW",
                alpha3 = "RWA",
                isdCode = "250",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Saint Barthélemy",
                officialName = "Saint Barthélemy",
                alpha2 = "BL",
                alpha3 = "BLM",
                isdCode = "590",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Saint Helena",
                officialName = "Saint Helena, Ascension and Tristan da Cunha",
                alpha2 = "SH",
                alpha3 = "SHN",
                isdCode = "290",
                mobileNumberValidationRegex = "^[\\d]{4}\$"
            ),
            Country(
                knownName = "Saint Kitts and Nevis",
                officialName = "Saint Kitts and Nevis",
                alpha2 = "KN",
                alpha3 = "KNA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Saint Lucia",
                officialName = "Saint Lucia",
                alpha2 = "LC",
                alpha3 = "LCA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Saint Martin",
                officialName = "Saint Martin (French part)",
                alpha2 = "MF",
                alpha3 = "MAF",
                isdCode = "590",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Saint Pierre and Miquelon",
                officialName = "Saint Pierre and Miquelon",
                alpha2 = "PM",
                alpha3 = "SPM",
                isdCode = "508",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Saint Vincent and the Grenadines",
                officialName = "Saint Vincent and the Grenadines",
                alpha2 = "VC",
                alpha3 = "VCT",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Samoa",
                officialName = "Samoa",
                alpha2 = "WS",
                alpha3 = "WSM",
                isdCode = "685",
                mobileNumberValidationRegex = "^[\\d]{5,7}\$"
            ),
            Country(
                knownName = "San Marino",
                officialName = "San Marino",
                alpha2 = "SM",
                alpha3 = "SMR",
                isdCode = "378",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "São Tomé and Príncipe",
                officialName = "São Tomé and Príncipe",
                alpha2 = "ST",
                alpha3 = "STP",
                isdCode = "239",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Saudi Arabia",
                officialName = "Saudi Arabia",
                alpha2 = "SA",
                alpha3 = "SAU",
                isdCode = "966",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Senegal",
                officialName = "Senegal",
                alpha2 = "SN",
                alpha3 = "SEN",
                isdCode = "221",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Serbia",
                officialName = "Serbia",
                alpha2 = "RS",
                alpha3 = "SRB",
                isdCode = "381",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Seychelles",
                officialName = "Seychelles",
                alpha2 = "SC",
                alpha3 = "SYC",
                isdCode = "248",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Sierra Leone",
                officialName = "Sierra Leone",
                alpha2 = "SL",
                alpha3 = "SLE",
                isdCode = "232",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Singapore",
                officialName = "Singapore",
                alpha2 = "SG",
                alpha3 = "SGP",
                isdCode = "65",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Sint Maarten",
                officialName = "Sint Maarten (Dutch part)",
                alpha2 = "SX",
                alpha3 = "SXM",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Slovakia",
                officialName = "Slovakia",
                alpha2 = "SK",
                alpha3 = "SVK",
                isdCode = "421",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Slovenia",
                officialName = "Slovenia",
                alpha2 = "SI",
                alpha3 = "SVN",
                isdCode = "386",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Solomon Islands",
                officialName = "Solomon Islands",
                alpha2 = "SB",
                alpha3 = "SLB",
                isdCode = "677",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Somalia",
                officialName = "Somalia",
                alpha2 = "SO",
                alpha3 = "SOM",
                isdCode = "252",
                mobileNumberValidationRegex = "^[\\d]{8,9}\$"
            ),
            Country(
                knownName = "South Africa",
                officialName = "South Africa",
                alpha2 = "ZA",
                alpha3 = "ZAF",
                isdCode = "27",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "South Georgia and the South Sandwich Islands",
                officialName = "South Georgia and the South Sandwich Islands",
                alpha2 = "GS",
                alpha3 = "SGSl",
                isdCode = "500",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "South Korea",
                officialName = "Korea (Republic of)",
                alpha2 = "KR",
                alpha3 = "KOR",
                isdCode = "82",
                mobileNumberValidationRegex = "^[\\d]{7,8}\$"
            ),
            Country(
                knownName = "South Sudan",
                officialName = "South Sudan",
                alpha2 = "SS",
                alpha3 = "SSD",
                isdCode = "211",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Spain",
                officialName = "Spain",
                alpha2 = "ES",
                alpha3 = "ESP",
                isdCode = "34",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Sri Lanka",
                officialName = "Sri Lanka",
                alpha2 = "LK",
                alpha3 = "LKA",
                isdCode = "94",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Sudan",
                officialName = "Sudan",
                alpha2 = "SD",
                alpha3 = "SDN",
                isdCode = "249",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Suriname",
                officialName = "Suriname",
                alpha2 = "SR",
                alpha3 = "SUR",
                isdCode = "597",
                mobileNumberValidationRegex = "^[\\d]{6,7}\$"
            ),
            Country(
                knownName = "Swaziland",
                officialName = "Swaziland",
                alpha2 = "SZ",
                alpha3 = "SWZ",
                isdCode = "268",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Sweden",
                officialName = "Sweden",
                alpha2 = "SE",
                alpha3 = "SWE",
                isdCode = "46",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Switzerland",
                officialName = "Switzerland",
                alpha2 = "CH",
                alpha3 = "CHE",
                isdCode = "41",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Syria",
                officialName = "Syrian Arab Republic",
                alpha2 = "SY",
                alpha3 = "SYR",
                isdCode = "963",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Taiwan",
                officialName = "Taiwan",
                alpha2 = "TW",
                alpha3 = "TWN",
                isdCode = "886",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Tajikistan",
                officialName = "Tajikistan",
                alpha2 = "TJ",
                alpha3 = "TJK",
                isdCode = "992",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Tanzania",
                officialName = "Tanzania",
                alpha2 = "TZ",
                alpha3 = "TZA",
                isdCode = "255",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Thailand",
                officialName = "Thailand",
                alpha2 = "TH",
                alpha3 = "THA",
                isdCode = "66",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Tokelau",
                officialName = "Tokelau",
                alpha2 = "TK",
                alpha3 = "TKL",
                isdCode = "690",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Tonga",
                officialName = "Tonga",
                alpha2 = "TO",
                alpha3 = "TON",
                isdCode = "676",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Trinidad and Tobago",
                officialName = "Trinidad and Tobago",
                alpha2 = "TT",
                alpha3 = "TTO",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Turkey",
                officialName = "Turkey",
                alpha2 = "TR",
                alpha3 = "TUR",
                isdCode = "90",
                mobileNumberValidationRegex = "^[\\d]{11}\$"
            ),
            Country(
                knownName = "Turkmenistan",
                officialName = "Turkmenistan",
                alpha2 = "TM",
                alpha3 = "TKM",
                isdCode = "993",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "Turks and Caicos Islands",
                officialName = "Turks and Caicos Islands",
                alpha2 = "TC",
                alpha3 = "TCA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Tuvalu",
                officialName = "Tuvalu",
                alpha2 = "TV",
                alpha3 = "TUV",
                isdCode = "688",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Uganda",
                officialName = "Uganda",
                alpha2 = "UG",
                alpha3 = "UGA",
                isdCode = "256",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Ukraine",
                officialName = "Ukraine",
                alpha2 = "UA",
                alpha3 = "UKR",
                isdCode = "380",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "United Arab Emirates",
                officialName = "United Arab Emirates",
                alpha2 = "AE",
                alpha3 = "ARE",
                isdCode = "971",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "United Kingdom",
                officialName = "United Kingdom of Great Britain and Northern Ireland",
                alpha2 = "GB",
                alpha3 = "GBR",
                isdCode = "44",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "United States",
                officialName = "United States of America",
                alpha2 = "US",
                alpha3 = "USA",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Uruguay",
                officialName = "Uruguay",
                alpha2 = "UY",
                alpha3 = "URY",
                isdCode = "598",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
            Country(
                knownName = "U.S. Minor Outlying Islands",
                officialName = "United States Minor Outlying Islands",
                alpha2 = "UM",
                alpha3 = "UMI",
                isdCode = "",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "U.S. Virgin Islands",
                officialName = "Virgin Islands (U.S.)",
                alpha2 = "VI",
                alpha3 = "VIR",
                isdCode = "1",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Uzbekistan",
                officialName = "Uzbekistan",
                alpha2 = "UZ",
                alpha3 = "UZB",
                isdCode = "998",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Vanuatu",
                officialName = "Vanuatu",
                alpha2 = "VU",
                alpha3 = "VUT",
                isdCode = "678",
                mobileNumberValidationRegex = "^[\\d]{5}\$"
            ),
            Country(
                knownName = "Vatican City",
                officialName = "Holy See",
                alpha2 = "VA",
                alpha3 = "VAT",
                isdCode = "379",
                mobileNumberValidationRegex = "^[\\d]{10}\$"
            ),
            Country(
                knownName = "Venezuela",
                officialName = "Venezuela (Bolivarian Republic of)",
                alpha2 = "VE",
                alpha3 = "VEN",
                isdCode = "58",
                mobileNumberValidationRegex = "^[\\d]{7}\$"
            ),
            Country(
                knownName = "Vietnam",
                officialName = "Viet Nam",
                alpha2 = "VN",
                alpha3 = "VNM",
                isdCode = "84",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Wallis and Futuna",
                officialName = "Wallis and Futuna",
                alpha2 = "WF",
                alpha3 = "WLF",
                isdCode = "681",
                mobileNumberValidationRegex = "^[\\d]{6}\$"
            ),
            Country(
                knownName = "Western Sahara",
                officialName = "Western Sahara",
                alpha2 = "EH",
                alpha3 = "ESH",
                isdCode = "212",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Yemen",
                officialName = "Yemen",
                alpha2 = "YE",
                alpha3 = "YEM",
                isdCode = "967",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Zambia",
                officialName = "Zambia",
                alpha2 = "ZM",
                alpha3 = "ZMB",
                isdCode = "260",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Zimbabwe",
                officialName = "Zimbabwe",
                alpha2 = "ZW",
                alpha3 = "ZWE",
                isdCode = "263",
                mobileNumberValidationRegex = "^[\\d]{9}\$"
            ),
            Country(
                knownName = "Togo",
                officialName = "Togolese Republic",
                alpha2 = "TG",
                alpha3 = "TGO",
                isdCode = "228",
                mobileNumberValidationRegex = "^[\\d]{8}\$"
            ),
        )
        val toInsert: ArrayList<Country> = ArrayList()
        countries.forEach { country ->
            var shouldInsert = false
            val resultFromDbWithKnownName = countryRepoAggregatorContract.findByKnownNameAndDataStatus(
                country.knownName,
                skipCache = true,
            )
            val foundCountriesByKnownName = ArrayList(
                resultFromDbWithKnownName.data
            )
            if (foundCountriesByKnownName.isEmpty()) {
                val resultFromDbWithOfficialName = countryRepoAggregatorContract.findByOfficialNameAndDataStatus(
                    country.officialName,
                    skipCache = true
                )
                val foundCountriesByOfficialName = ArrayList(
                    resultFromDbWithOfficialName.data
                )
                if (foundCountriesByOfficialName.isEmpty()) {
                    shouldInsert = true
                }
            }
            if (shouldInsert) {
                toInsert.add(country)
            }
        }
        countryRepoAggregatorContract.saveAll(toInsert)
    }
}