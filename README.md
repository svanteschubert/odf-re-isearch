# ODF Re-ISearch

## Purpose

Based on [ODFDOM of the ODF Toolkit](https://github.com/tdf/odftoolkit/tree/master/odfdom) the ODFDOM JAR was altered to an extractor of relevant data for [Re-ISearch](https://github.com/re-Isearch/re-Isearch) lead by Edward Zimmermann.

## Build

Build the ODFDOM module with `mvn clean install`

## Usage

### Test the JAR by command line without parameter

`java -jar odfdom/target/odfdom-search-1.0.0-jar-with-dependencies.jar`

will return something like:

```
Re-ISearch ODF extractor (build 2022-09-30T23:10:18)
from https://github.com/svanteschubert/odf-re-isearch supporting ODF 1.2
```

### Run the JAR by command line with an ODT as parameter

`java -jar odfdom/target/odfdom-search-1.0.0-jar-with-dependencies.jar <ODT_PATH>`

For example by using as ODT the URL to the OASIS ODF 1.3 specification
<https://docs.oasis-open.org/office/OpenDocument/v1.3/os/part3-schema/OpenDocument-v1.3-os-part3-schema.odt>
will return all relevant search data to standard out.
Piped into a file the data will be usable by the [re-ISearch engine](https://github.com/re-Isearch/re-Isearch/blob/master/docs/re-Isearch-Handbook.pdf).

## Support

This project was funded through the NGI0 Discovery Fund, a fund established by NLnet with financial support from the European Commission's Next Generation Internet programme, under the aegis of DG Communications Networks, Content and Technology under grant agreement No 825322.

<IMG SRC="https://nlnet.nl/image/logo_nlnet.svg" ALT="NLnet Foundation" height=100> <IMG SRC="https://nlnet.nl/logo/NGI/NGIZero-green.hex.svg" ALT="NGI0 Search" height=100> &nbsp; &nbsp; <IMG SRC="https://ngi.eu/wp-content/uploads/sites/77/2017/10/bandiera_stelle.png" ALT="EU" height=100>
