# ODF Re-ISearch

## Purpose

Based on [ODFDOM of the ODF Toolkit](https://github.com/tdf/odftoolkit/tree/master/odfdom) the ODFDOM JAR was altered to an extractor of relevant data for [Re-ISearch](https://github.com/re-Isearch/re-Isearch) lead by Edward Zimmermann.

## Build

Build the ODFDOM module via `mvn clean install` using [Maven](https://maven.apache.org/download.cgi) and JDK >=9 (JDK 8 build still shows problems with dependencies). Sucessfully tested with JDK LTS 11 and 17.
(You may also [compile of Java into a binary using GraalVM](https://www.graalvm.org/reference-manual/native-image/) on Linux.
This was successfully tested for Linux without any visible performance gain nor loss).

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

### Installing Re-ISearch for ODT (using this JAR as bundled Plugin) for Linux

 The search engine Re-ISearch is bundling the deliverable of this repository as a plugin to extract search information from OpenDocument Test documents.
 Here is a description how to install Re-ISearch on your Linux machine and use this ODT plugin to search within ODT documents.

 1. You need to copy the Re-Isearch sources via
 ```
 git clone https://github.com/re-Isearch/re-Isearch
 ```
There is a helpful [INSTALLATION help file](https://github.com/re-Isearch/re-Isearch/blob/master/INSTALLATION) for [Re-ISearch engine](https://github.com/re-Isearch/re-Isearch).
 2. It is suggested to add manual the directory for the plugin, which is assumed by default and make it write accessible: /opt/nonmonotonic/ib/lib/plugins/
 3. The script <RE_ISEARCH_ROOT>/bin/odt-search still needs to be added to the $PATH to be able to be found by ISearch (known usability issue)
 4. In the <RE_ISEARCH_ROOT>/build directory build the search-engine (for complication look [INSTALLATION cheat file](https://github.com/re-Isearch/re-Isearch/blob/master/INSTALLATION) or [full handbook](https://github.com/re-Isearch/re-Isearch/blob/master/docs/re-Isearch-Handbook.pdf), e.g.
 ```
 cd re-Isearch/build
 make -j4
 ```
 5. In the <RE_ISEARCH_ROOT>/build directory build the plugins:
 ```
 make plugins -j4
 ```
 6. As the plugin is new and not being taken by default yet - choose it explicitly for **indexing** via:
```
../bin/Iindex -d <INDEX_DIRECTORY> -recursive -t odt2: -include "*.odt"  <ODT_DIR_INPUT_PATH>
```
 7. The validness of the new index and the **index structure can be checked** via
```
../bin/Iutil -d <INDEX_DIRECTORY> -vf
```
 8. Finally, any **search can be executed**, for example returning all sentences containing the <SEARCH_STRING>
```
../bin/Isearch -show -d <INDEX_DIRECTORY> -P PAGE\PARAGRAPH\SENTENCE <SEARCH_STRING>
```
## Known Issue(s) of Re-ISearch

* The ./bin/odt-search script has to be add explicitly to the user's PATH variable (and there is still an error message if you do)

## Support

This project was funded through the NGI0 Discovery Fund, a fund established by NLnet with financial support from the European Commission's Next Generation Internet programme, under the aegis of DG Communications Networks, Content and Technology under grant agreement No 825322.

<IMG SRC="https://nlnet.nl/image/logo_nlnet.svg" ALT="NLnet Foundation" height=100> <IMG SRC="https://nlnet.nl/logo/NGI/NGIZero-green.hex.svg" ALT="NGI0 Search" height=100> &nbsp; &nbsp; <IMG SRC="https://ngi.eu/wp-content/uploads/sites/77/2017/10/bandiera_stelle.png" ALT="EU" height=100>
