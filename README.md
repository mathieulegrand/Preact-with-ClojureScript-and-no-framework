# Preact with ClojureScript and /no framework/
This project is to test direct interaction between [Preact](https://preactjs.com) and [ClojureScript](https://clojurescript.org) — specifically avoiding the use of any framework.

The intend is to create a single component and attach it to a test page with minimum code.

ClojureScript is compiled with the excellent Google [Closure Compiler](https://developers.google.com/closure/compiler). The build tool I am using is [Leiningen](https://leiningen.org). I integrated [Figwheel](https://github.com/bhauman/lein-figwheel) to make testing easy.

## Running
To run the example, execute:
```
$ lein figwheel
```
from a shell, wait for the code to compile, and point a browser to [localhost:3450/index.html](http://127.0.0.1:3450/index.html). The “Hello World!“ text should be displayed below the “Test root div“ showing that the Preact component loaded successfully.

## Pre-requisites
On macOS, assuming that [Homebrew](https://brew.sh) is installed; and Java has been installed as well (entering `java` in the Terminal gives a link on how to install the Oracle JDK): you should only need to run `brew install leiningen` to get the build script. The project will automatically downloads the various JARs it depends on.

## License
The example is released under the Apache License 2.0.
