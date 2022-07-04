

# BusinessAddress

A postal address splitted in 6 lines ordered as defined in RNVP and french standard AFNOR NF Z 10-011 ([more information about the standards](http://www.rnvp-internationale.com/norme-postale/NF-Z-10-011.php)). All the lines are mandatory. Lines that are optional may be empty. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**line1** | **String** | Particular: CIVILITÉ - TITRE ou QUALITÉ - PRÉNOM - NOM Progessionnal: RAISON SOCIALE ou DÉNOMINATION  |  [optional] |
|**line2** | **String** | Particular: N°APP ou BAL - ÉTAGE - COULOIR - ESC Professionnal: IDENTITÉ DU DESTINATAIRE et ou SERVICE  |  [optional] |
|**line3** | **String** | ENTRÉE - BÂTIMENT - IMMEUBLE - RÉS - ZI |  [optional] |
|**line4** | **String** | NUMÉRO - LIBELLÉ DE LA VOIE |  [optional] |
|**line5** | **Object** | LIEU DIT ou SERVICE PARTICULIER DE DISTRIBUTION |  [optional] |
|**locality** | **String** | Name of the locality of the address |  [optional] |
|**countryCode** | **String** | Country code as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html)) |  [optional] |
|**countryName** | **String** | Country name as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html)) |  [optional] |



