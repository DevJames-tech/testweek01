# testweek01

Constraint, Linear, Grid and Relative, Coordinator

Constraint:
Large and complex  layout with a flat view hierarchy(means no nested view groups)

Linear:
aligns all children in a single direction, vertically or horizontally.

Relative:
Displays child views in relative positions. The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) or in positions relative to the parent 

GridLayout:
A layout that places its children in a rectangular grid.

View , View Group, View Hierachy 

View is anything can be view on android such as:
* Text View
* EditText
* Button
* ImageView
* ImageButton
* CheckBox
* Radio button
* RadioGroup
* ListView
* Spinner
* AutoCompleteTextView

A view group Holds and defines the properties of a view, View Group is the base class for layouts so their are interchangeable

View Hierarchy is the combination of view groups and their views. Resembles the tree data structure

￼Android Manifest:

Refers to the Android Manifest File

This is an xml file which must be named as AndroidManifest.xml and placed at application root. Every Android app must have AndroidManifest.xml file. AndroidManifest.xml allows us to define,
The packages, API, libraries needed for the application.
* Basic building blocks of application like activities, services and etc.
* Details about permissions.
* Set of classes needed before launch.


Measurements for View Work:

Screen size in Android is grouped into categories small, medium, large, extra large, double-extra and triple-extra. Screen density is the amount of pixels within an area (like inch) of the screen. Generally it is measured in dots-per-inch (dpi). Screen density is grouped as low, medium, high and extra high. Resolution is the total number of pixels in the screen.
* dp: Density Independent Pixel, it varies based on screen density . In 160 dpi screen, 1 dp = 1 pixel. Except for font size, use dp always.
* dip: dip == dp. In earlier Android versions dip was used and later changed to dp.
* sp: Scale Independent Pixel, scaled based on user’s font size preference. Fonts should use sp.
* px: our usual standard pixel which maps to the screen pixel.
* in: inches, with respect to the physical screen size.
* mm: millimeters, with respect to the physical screen size.
* pt: 1/72 of an inch, with respect to the physical screen size.
Always use dp and sp only. sp for font sizes and dp for everything else. It will make UI compatible for Android devices with different densities.
Formula for Conversion between Units
px = dp * (dpi / 160)

Dalvik:
Is a virtual machine that android runs on and also runs anything from applications to code written in the java language

Java code is transcoded into Byte code which then converted into a .dex file which the Dalvik VM can read and use

Duplicate data used in class files is included only once in the .dex output, which saves space and uses less overhead. The executable files can be modified again when you install an application to make things even more optimized for mobile. Things like byte order swapping and linking data structure and function libraries inline make the files smaller and run better on our devices.

Android Runtime (ART):

is the managed runtime used by applications and some system services on Android. Uses Ahead-of Time (AOT) compilation, I.e. translate high-level languages into machine code. So it can compile natively.

These allow much longer battery life for androids, along with better memory management and less memory usage. The biggest downside is that the first time you compile, it will be significantly longer the first time around

Principles of Software Design:

Inheritance -Allows a child to inherit member function and variables(In Java you do this with the extends keyword, you can only extend one parent at a time.

Encapsulation - (Allows access to the interworking of  class and structs, these are know as access modifiers. Such as
Public - anyone can see, private members are only visible to the class, protected- only those in the same directory can use member or variables, final - can no longer be access or modified 

Abstraction -Hides anything that isn’t nessacary for end users and other devs to see or interact with. Ex. Of this include Extended classes, defined methods

Polymorphism -Overloading and overriding methods (In java overriding uses @ Overriding)

SOLID 5 Software Design Principles intended to make software Designing easy.
Those principles are :

the Single Responsible principle: Ever object should have limited responsibility and should me 

Open/Closed principle: Entities like classes, modules and functions that can be extended, can be operated on without affecting their code

Liskov substitution principle - Should be able to refractor without changing the underlying structure 

Interface segration princple- breaking stuff up into parts and having it clear  is better than one gigantic program I

Dependancy inversion principle -Code should be based on abstract so main implementation is not affected

HashMap is non-synchronized it is not-thread safe  and hashtable is thread-safe

Principles of Software Design:

Inheritance -Allows a child to inherit member function and variables(In Java you do this with the extends keyword, you can only extend one parent at a time.

Encapsulation - (Allows access to the interworking of  class and structs, these are know as access modifiers. Such as
Public - anyone can see, private members are only visible to the class, protected- only those in the same directory can use member or variables, final - can no longer be access or modified 

Abstraction -Hides anything that isn’t nessacary for end users and other devs to see or interact with. Ex. Of this include Extended classes, defined methods

Polymorphism -Overloading and overriding methods (In java overriding uses @ Overriding)

SOLID 5 Software Design Principles intended to make software Designing easy.
Those principles are :

the Single Responsible principle: Ever object should have limited responsibility and should me 

Open/Closed principle: Entities like classes, modules and functions that can be extended, can be operated on without affecting their code

Liskov substitution principle - Should be able to refractor without changing the underlying structure 

Interface segration princple- breaking stuff up into parts and having it clear  is better than one gigantic program I

Dependancy inversion principle -Code should be based on abstract so main implementation is not affected

HashMap is non-synchronized it is not-thread safe  and hashtable is thread-safe
