========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "Declaration.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

This a Java Swing based Form Application.
The Base Class is as follows:

public final class Declaration extends JFrame {

    private String AddressFrom;
    private String AddressTo;
    private boolean InternationalTransport;
    private String CountryFrom;
    private String CountryTo;
    private String CargoType;
    private Integer Quantity;
    private Double GrossWeight;
    private String TransportType;
    private boolean CapeGoodHope;
    private String Consignee;
................
................
................


with the above shown fields and their getters and setters.

The Application Front Page is a Java Swing Form as shown below




Key Elements of the Form are : 
Address FROM:, Address TO:, Local/International Transport Mode, 
if International then activate and set Country From:, Country To:, 

Cargo Type, Quantity, Gross Weight, Transport Type {Land, Air, Sea.
If Sea is selected check to see if Cape Good Hope(South of Africa route)}

Consignee (�buyer�), and the �Calculate Risk� button.
When button pressed all the Info gathered from Declarartion Form is Logged to Output. There is also a superficial, perfunctory, sketchy calculation executed just to keep with appearances. The result too is being logged in the output.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
