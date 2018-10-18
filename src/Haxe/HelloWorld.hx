/**
    Haxe is an open source toolkit based on a modern, high level, strictly typed 
    programming languange, a cross-compiler, a complete cross-platform standard 
    library and ways to access each platform's native capabilities.

    This hello world application can be run by executing the following commands:

    HAXE_STD_PATH=/path/to/haxe/std /path/to/haxe -main HelloWorld --interp

    Output:
      HelloWorld.hx:3: Hello World
**/

class HelloWorld {
  static public function main():Void {
    trace("Hello World");
  }
}
