*En el caso de este programa, tanto el consumo como la producción de cerveza se basan en la generaciòn de un valor RANDOM.
Por ende un sólo consumidor puede llegar a alcanzar para que el stock llegué a 0, pero en alguna ejecucióon puede que 
no llegue a consumir lo suficiente como para lograrlo. Ya con dos o más consumidores se agota facilmente el stock.

*Deben ser bloques sycronized para evitar que dos hilos accedan a la misma información en el mismo momento y evitar 
así la pérdida de información.


*El recurso compartido es aquella información, que como su nombre lo indica, es compartida por más de un hilo en un 
proceso determinado.
Se llama sección crítica a los segmentos de código dentro de un programa que acceden a zonas dememoria comunes desde 
distintos threads que se ejecutan concurrentemente.

*Formas de instanciar un Thread:
Pueden crearse threads de dos formas distintas: declarando una subclase de la clase Thread o declarandouna clase que 
implemente la interface Runnable y redefiniendo el método run() y start() de la interface.Se utilizará la primera forma,
más evidente y sencilla, cuando la clase declarada no tenga que sersubclase de ninguna otra superclase.Se utilizará la 
segunda forma cuando la clase declarada tenga que ser subclase de una superclase que noes subclase de Thread o implemente 
el interface Runnable.

- Si la clase declarada no tiene que ser subclase de otra superclase , se declara como subclase de Thread.

Ejemplo  :  class Productor extends Thread {...}

- Si la clase declarada es una subclase de otra superclase , se declara la interface Runnable.

Ejemplo :  class Student extends Person implements Runnable {...}

- Con la palabra clave "new" tambien se instancia un thread.

Ejemplo :  Threads thread1 = new ( new MyClass() );
